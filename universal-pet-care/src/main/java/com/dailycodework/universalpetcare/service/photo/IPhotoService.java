package com.dailycodework.universalpetcare.service.photo;

import com.dailycodework.universalpetcare.exception.ResourceNotFoundException;
import com.dailycodework.universalpetcare.model.Photo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;

public interface IPhotoService {
    Photo savePhoto(MultipartFile file, Long userId) throws IOException, SQLException;
    Photo getPhotoById(Long id) throws ResourceNotFoundException;
    void deletePhoto(Long id, Long userId) throws ResourceNotFoundException, SQLException;
    Photo updatePhoto(Long id, MultipartFile file) throws SQLException, IOException;
    byte[] getImageData(Long id) throws ResourceNotFoundException, SQLException;
}
