package com.univaq.mobile.unicookserver.business.impl.servicesImpl;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.business.impl.repositories.IngredienteRepository;
import com.univaq.mobile.unicookserver.business.services.IngredienteService;
import com.univaq.mobile.unicookserver.domain.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;

import java.util.List;

public class IngredienteServiceImpl implements IngredienteService {
    @Autowired
    private IngredienteRepository ingredienteRepository;

    @Override
    public List<Ingrediente> findAllIngredienti() throws BusinessException {
        return ingredienteRepository.findAll(JpaSort.unsafe(Sort.Direction.ASC, "nome"));
    }

    @Override
    public void createIngrendiente(Ingrediente ingrediente) throws BusinessException {
        ingredienteRepository.save(ingrediente);
    }

    @Override
    public Ingrediente findIngredienteById(long idIngrediente) throws BusinessException {
        return ingredienteRepository.findById(idIngrediente).get();
    }

    @Override
    public void updateIngrediente(Ingrediente ingrediente) throws BusinessException {
        ingredienteRepository.save(ingrediente);
    }

    @Override
    public void deleteIngrediente(long idIngrediente) throws BusinessException {
        ingredienteRepository.deleteById(idIngrediente);
    }
}
