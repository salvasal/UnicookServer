package com.univaq.mobile.unicookserver.business.impl.servicesImpl;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.business.impl.repositories.CategoriaRepository;
import com.univaq.mobile.unicookserver.business.services.CategoriaService;
import com.univaq.mobile.unicookserver.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;

import java.util.List;

public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAllCategorie() throws BusinessException {
        return categoriaRepository.findAll(JpaSort.unsafe(Sort.Direction.ASC, "IDcategoria"));
    }

    @Override
    public void createCategoria(Categoria categoria) throws BusinessException {
        categoriaRepository.save(categoria);
    }

    @Override
    public Categoria findCategoriaById(long idCategoria) throws BusinessException {
        return categoriaRepository.findById(idCategoria).get();
    }

    @Override
    public void updateCategoria(Categoria categoria) throws BusinessException {
        categoriaRepository.save(categoria);
    }

    @Override
    public void deleteCategoria(long idCategoria) throws BusinessException {
        categoriaRepository.deleteById(idCategoria);
    }
}
