package com.univaq.mobile.unicookserver.api;

import com.univaq.mobile.unicookserver.business.services.IngredienteService;
import com.univaq.mobile.unicookserver.domain.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredienti")
public class RESTIngredienteController {
    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping
    public List<Ingrediente> getAll() {
        return ingredienteService.findAllIngredienti();
    }

    @GetMapping("/{id}")
    public Ingrediente getById(@PathVariable("id") long id) {
        return ingredienteService.findIngredienteById(id);
    }

    @PostMapping
    public void create(@RequestBody Ingrediente ingrediente) {
        ingredienteService.createIngrendiente(ingrediente);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") long id, @RequestBody Ingrediente ingrediente) {
        ingredienteService.updateIngrediente(ingrediente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        ingredienteService.deleteIngrediente(id);
    }
}
