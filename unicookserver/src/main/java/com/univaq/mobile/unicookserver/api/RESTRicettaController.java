package com.univaq.mobile.unicookserver.api;

import com.univaq.mobile.unicookserver.business.services.RicettaService;
import com.univaq.mobile.unicookserver.domain.Ricetta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ricette")
public class RESTRicettaController {
    @Autowired
    private RicettaService ricettaService;

    @GetMapping
    public List<Ricetta> getAll() {
        return ricettaService.findAllRicette();
    }

    @GetMapping("/{id}")
    public Ricetta getById(@PathVariable("id") long id) {
        return ricettaService.findRicettaById(id);
    }

    @PostMapping
    public void create(@RequestBody Ricetta ricetta) {
        ricettaService.createRicetta(ricetta);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") long id, @RequestBody Ricetta ricetta) {
        ricettaService.updateRicetta(ricetta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        ricettaService.deleteRicetta(id);
    }
}
