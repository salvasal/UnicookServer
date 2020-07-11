package com.univaq.mobile.unicookserver.business.impl.servicesImpl;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.business.impl.repositories.PreferitoRepository;
import com.univaq.mobile.unicookserver.business.services.PreferitoService;
import com.univaq.mobile.unicookserver.domain.Preferito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PreferitoServiceImpl implements PreferitoService {
    @Autowired
    private PreferitoRepository preferitoRepository;

    @Override
    public List<Preferito> findAllPreferiti() throws BusinessException {
        return preferitoRepository.findAll(JpaSort.unsafe(Sort.Direction.ASC, "IDpreferito"));
    }

    @Override
    public void createPreferito(Preferito preferito) throws BusinessException {
        preferitoRepository.save(preferito);
    }

    @Override
    public Preferito findPreferitoById(long idPreferito) throws BusinessException {
        return preferitoRepository.findById(idPreferito).get();
    }

    @Override
    public void updatePreferito(Preferito preferito) throws BusinessException {
        preferitoRepository.save(preferito);
    }

    @Override
    public void deletePreferito(long idPreferito) throws BusinessException {
        preferitoRepository.deleteById(idPreferito);
    }
}
