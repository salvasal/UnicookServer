package com.univaq.mobile.unicookserver.business.services;

import com.univaq.mobile.unicookserver.business.BusinessException;
import com.univaq.mobile.unicookserver.domain.Photo;

import java.util.List;

public interface PhotoService {

    List<Photo> findAllPhotos() throws BusinessException;

    void createPhoto(Photo photo) throws BusinessException;

    Photo findPhotoById(long idPhoto) throws BusinessException;

    void updatePhoto(Photo photo) throws BusinessException;

    void deletePhoto(long idPhoto) throws BusinessException;
}
