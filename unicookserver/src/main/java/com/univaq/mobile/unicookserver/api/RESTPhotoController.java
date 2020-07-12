package com.univaq.mobile.unicookserver.api;

import com.univaq.mobile.unicookserver.business.services.PhotoService;
import com.univaq.mobile.unicookserver.domain.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class RESTPhotoController {
    @Autowired
    private PhotoService photoService;

    @GetMapping
    public List<Photo> getAll() {
        return photoService.findAllPhotos();
    }

    @GetMapping("/{id}")
    public Photo getById(@PathVariable("id") long id) {
        return photoService.findPhotoById(id);
    }

    @PostMapping
    public void create(@RequestBody Photo photo) {
        photoService.createPhoto(photo);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") long id, @RequestBody Photo photo) {
        photoService.updatePhoto(photo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        photoService.deletePhoto(id);
    }
}
