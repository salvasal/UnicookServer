package com.univaq.mobile.unicookserver.business.services;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.domain.Valutazione;

import java.util.List;

public interface ValutazioneService {

    List<Valutazione> findAllValutazioni() throws BusinessException;

    void createValutazione(Valutazione valutazione) throws BusinessException;

    Valutazione findValutazioneById(long idValutazione) throws BusinessException;

    void updateValutazione(Valutazione valutazione) throws BusinessException;

    void deleteValutazione(long idValutazione) throws BusinessException;
}
