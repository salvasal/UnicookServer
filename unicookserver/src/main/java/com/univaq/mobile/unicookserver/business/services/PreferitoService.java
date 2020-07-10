package com.univaq.mobile.unicookserver.business.services;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.domain.Preferito;

import java.util.List;

public interface PreferitoService {

    List<Preferito> findAllPreferiti() throws BusinessException;

    void createPreferito(Preferito preferito) throws BusinessException;

    Preferito findPreferitoById(long idPreferito) throws BusinessException;

    void updatePreferito(Preferito preferito) throws BusinessException;

    void deletePreferito(long idPreferito) throws BusinessException;
}
