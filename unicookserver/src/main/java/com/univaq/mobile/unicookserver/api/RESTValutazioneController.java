package com.univaq.mobile.unicookserver.api;

import com.univaq.mobile.unicookserver.business.services.ValutazioneService;
import com.univaq.mobile.unicookserver.domain.Valutazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valutazioni")
public class RESTValutazioneController {
    @Autowired
    private ValutazioneService valutazioneService;

    @GetMapping
    public List<Valutazione> getAll() {
        return valutazioneService.findAllValutazioni();
    }

    @GetMapping("/{id}")
    public Valutazione getById(@PathVariable("id") long id) {
        return valutazioneService.findValutazioneById(id);
    }

    @PostMapping
    public void create(@RequestBody Valutazione valutazione) {
        valutazioneService.createValutazione(valutazione);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") long id, @RequestBody Valutazione valutazione) {
        valutazioneService.updateValutazione(valutazione);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        valutazioneService.deleteValutazione(id);
    }
}
