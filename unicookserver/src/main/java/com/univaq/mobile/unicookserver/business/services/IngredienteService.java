package com.univaq.mobile.unicookserver.business.services;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.domain.Ingrediente;

import java.util.List;

public interface IngredienteService {

    List<Ingrediente> findAllIngredienti() throws BusinessException;

    void createIngrendiente(Ingrediente ingrediente) throws BusinessException;

    Ingrediente findIngredienteById(long idIngrediente) throws BusinessException;

    void updateIngrediente(Ingrediente ingrediente) throws BusinessException;

    void deleteIngrediente(long idIngrediente) throws BusinessException;
}
