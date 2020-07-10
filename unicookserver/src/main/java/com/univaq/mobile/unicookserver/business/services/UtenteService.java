package com.univaq.mobile.unicookserver.business.services;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.domain.Utente;

import java.util.List;

public interface UtenteService {

    Utente findUtenteByUsername(String username) throws BusinessException;

    List<Utente> findAllUtenti() throws BusinessException;

    void createUtente(Utente utente) throws BusinessException;
}
