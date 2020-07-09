package com.univaq.mobile.unicookserver.common;

import com.univaq.mobile.unicookserver.common.spring.security.UserDetailsImpl;
import com.univaq.mobile.unicookserver.domain.Utente;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class Utility {

    public static Utente getUtente() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            UserDetailsImpl userDetailsImpl = (UserDetailsImpl) authentication.getPrincipal();
            return userDetailsImpl.getUtente();

        } else {
            return null;
        }

    }
}
