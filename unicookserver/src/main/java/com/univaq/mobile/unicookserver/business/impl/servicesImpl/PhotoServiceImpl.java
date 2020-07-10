package com.univaq.mobile.unicookserver.business.impl.servicesImpl;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.business.impl.repositories.PhotoRepository;
import com.univaq.mobile.unicookserver.business.services.PhotoService;
import com.univaq.mobile.unicookserver.domain.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;

import java.util.List;

public class PhotoServiceImpl implements PhotoService {
    @Autowired
    private PhotoRepository photoRepository;

    @Override
    public List<Photo> findAllPhotos() throws BusinessException {
        return photoRepository.findAll(JpaSort.unsafe(Sort.Direction.ASC, "id"));
    }

    @Override
    public void createPhoto(Photo photo) throws BusinessException {
        photoRepository.save(photo);
    }

    @Override
    public Photo findPhotoById(long idPhoto) throws BusinessException {
        return photoRepository.findById(idPhoto).get();
    }

    @Override
    public void updatePhoto(Photo photo) throws BusinessException {
        photoRepository.save(photo);
    }

    @Override
    public void deletePhoto(long idPhoto) throws BusinessException {
        photoRepository.deleteById(idPhoto);
    }
}
