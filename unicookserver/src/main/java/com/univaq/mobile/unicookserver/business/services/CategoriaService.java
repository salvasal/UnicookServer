package com.univaq.mobile.unicookserver.business.services;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.domain.Categoria;

import java.util.List;

public interface CategoriaService {

    List<Categoria> findAllCategorie() throws BusinessException;

    void createCategoria(Categoria categoria) throws BusinessException;

    Categoria findCategoriaById(long idCategoria) throws BusinessException;

    void updateCategoria(Categoria categoria) throws BusinessException;

    void deleteCategoria(long idCategoria) throws BusinessException;

}
