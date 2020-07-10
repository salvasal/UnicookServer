package com.univaq.mobile.unicookserver.business.impl.servicesImpl;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.business.impl.repositories.RicettaRepository;
import com.univaq.mobile.unicookserver.business.services.RicettaService;
import com.univaq.mobile.unicookserver.domain.Ricetta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;

import java.util.List;

public class RicettaServiceImpl implements RicettaService {
    @Autowired
    private RicettaRepository ricettaRepository;

    @Override
    public List<Ricetta> findAllRicette() throws BusinessException {
        return ricettaRepository.findAll(JpaSort.unsafe(Sort.Direction.ASC, "nomericetta"));
    }

    @Override
    public void createRicetta(Ricetta ricetta) throws BusinessException {
        ricettaRepository.save(ricetta);
    }

    @Override
    public Ricetta findRicettaById(long idRicetta) throws BusinessException {
        return ricettaRepository.findById(idRicetta).get();
    }

    @Override
    public void updateRicetta(Ricetta ricetta) throws BusinessException {
        ricettaRepository.save(ricetta);
    }

    @Override
    public void deleteRicetta(long idRicetta) throws BusinessException {
        ricettaRepository.deleteById(idRicetta);
    }
}
