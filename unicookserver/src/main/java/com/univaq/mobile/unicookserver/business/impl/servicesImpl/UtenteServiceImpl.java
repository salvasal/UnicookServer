package com.univaq.mobile.unicookserver.business.impl.servicesImpl;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.business.impl.repositories.UtenteRepository;
import com.univaq.mobile.unicookserver.business.services.UtenteService;
import com.univaq.mobile.unicookserver.domain.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UtenteServiceImpl implements UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    @Override
    public Utente findUtenteByUsername(String username) throws BusinessException {
        return utenteRepository.findByUsername(username);
    }

    @Override
    public List<Utente> findAllUtenti() throws BusinessException {
        return utenteRepository.findAll(JpaSort.unsafe(Sort.Direction.DESC, "username"));
    }

    @Override
    public void createUtente(Utente utente) throws BusinessException {
        utenteRepository.save(utente);
    }
}
