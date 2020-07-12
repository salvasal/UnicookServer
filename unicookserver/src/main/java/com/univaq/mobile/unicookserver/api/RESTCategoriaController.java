package com.univaq.mobile.unicookserver.api;

import com.univaq.mobile.unicookserver.business.services.CategoriaService;
import com.univaq.mobile.unicookserver.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class RESTCategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getAll() {
        return categoriaService.findAllCategorie();
    }

    @GetMapping("/{id}")
    public Categoria getById(@PathVariable("id") long id) {
        return categoriaService.findCategoriaById(id);
    }

    @PostMapping
    public void create(@RequestBody Categoria categoria) {
        categoriaService.createCategoria(categoria);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") long id, @RequestBody Categoria categoria) {
        categoriaService.updateCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        categoriaService.deleteCategoria(id);
    }
}
