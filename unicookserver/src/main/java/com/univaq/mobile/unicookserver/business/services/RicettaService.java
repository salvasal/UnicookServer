package com.univaq.mobile.unicookserver.business.services;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.domain.Ricetta;

import java.util.List;

public interface RicettaService {

    List<Ricetta> findAllRicette() throws BusinessException;

    void createRicetta(Ricetta ricetta) throws BusinessException;

    Ricetta findRicettaById(long idRicetta) throws BusinessException;

    void updateRicetta(Ricetta ricetta) throws BusinessException;

    void deleteRicetta(long idRicetta) throws BusinessException;
}
