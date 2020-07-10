package com.univaq.mobile.unicookserver.business.impl.servicesImpl;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.business.impl.repositories.ValutazioneRepository;
import com.univaq.mobile.unicookserver.business.services.ValutazioneService;
import com.univaq.mobile.unicookserver.domain.Valutazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;

import java.util.List;

public class ValutazioneServiceImpl implements ValutazioneService {
    @Autowired
    private ValutazioneRepository valutazioneRepository;

    @Override
    public List<Valutazione> findAllValutazioni() throws BusinessException {
        return valutazioneRepository.findAll(JpaSort.unsafe(Sort.Direction.ASC, "IDvalutazione"));
    }

    @Override
    public void createValutazione(Valutazione valutazione) throws BusinessException {
        valutazioneRepository.save(valutazione);
    }

    @Override
    public Valutazione findValutazioneById(long idValutazione) throws BusinessException {
        return valutazioneRepository.findById(idValutazione).get();
    }

    @Override
    public void updateValutazione(Valutazione valutazione) throws BusinessException {
        valutazioneRepository.save(valutazione);
    }

    @Override
    public void deleteValutazione(long idValutazione) throws BusinessException {
        valutazioneRepository.deleteById(idValutazione);
    }
}
