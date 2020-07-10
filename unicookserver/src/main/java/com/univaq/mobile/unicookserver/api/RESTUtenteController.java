package com.univaq.mobile.unicookserver.api;

import com.univaq.mobile.unicookserver.business.services.UtenteService;
import com.univaq.mobile.unicookserver.common.spring.security.JWTTokenUtil;
import com.univaq.mobile.unicookserver.common.spring.security.UserDetailsImpl;
import com.univaq.mobile.unicookserver.domain.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTUtenteController {

    @Value("${jwt.token.header}")
    private String tokenHeader;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JWTTokenUtil jwtTokenUtil;

    @Autowired
    private UtenteService utenteService;

    @PostMapping("/login")
    public UtenteResponse login(@RequestBody AuthenticationRequest authenticationRequest, HttpServletResponse response) throws AuthenticationException {
        // Effettuo l'autenticazione
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Genero Token e lo inserisco nell'header di risposta
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String token = jwtTokenUtil.generateToken(userDetails);
        response.setHeader(tokenHeader, token);

        // Ritorno l'utente
        return new UtenteResponse(((UserDetailsImpl) userDetails).getUtente());
    }

    @GetMapping("/utenti")
    public List<Utente> getAll() {
        return utenteService.findAllUtenti();
    }

    @PostMapping("/utenti")
    public void insert(@RequestBody Utente utente) {
        utenteService.createUtente(utente);
    }
}
