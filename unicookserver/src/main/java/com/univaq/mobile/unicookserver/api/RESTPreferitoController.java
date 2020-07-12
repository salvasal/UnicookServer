package com.univaq.mobile.unicookserver.api;

import com.univaq.mobile.unicookserver.business.services.PreferitoService;
import com.univaq.mobile.unicookserver.domain.Preferito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preferiti")
public class RESTPreferitoController {
    @Autowired
    private PreferitoService preferitoService;

    @GetMapping
    public List<Preferito> getAll() {
        return preferitoService.findAllPreferiti();
    }

    @GetMapping("/{id}")
    public Preferito getById(@PathVariable("id") long id) {
        return preferitoService.findPreferitoById(id);
    }

    @PostMapping
    public void create(@RequestBody Preferito preferito) {
        preferitoService.createPreferito(preferito);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") long id, @RequestBody Preferito preferito) {
        preferitoService.updatePreferito(preferito);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        preferitoService.deletePreferito(id);
    }
}
