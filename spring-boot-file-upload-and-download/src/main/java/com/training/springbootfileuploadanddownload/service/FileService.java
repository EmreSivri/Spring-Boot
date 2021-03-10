package com.training.springbootfileuploadanddownload.service;

import com.training.springbootfileuploadanddownload.constant.FileErrors;
import com.training.springbootfileuploadanddownload.exception.FileSaveException;
import com.training.springbootfileuploadanddownload.model.FileModel;
import com.training.springbootfileuploadanddownload.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.util.List;


@Service
public class FileService {

    private final FileRepository fileRepository;

    @Autowired
    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public FileModel saveFile(MultipartFile file) {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if (filename.contains("...")) {
                throw new FileSaveException(FileErrors.INVALID_FILE + filename);
            }
            FileModel model = new FileModel(filename, file.getContentType(), file.getBytes());
            return fileRepository.save(model);
        } catch (Exception e) {
            throw new FileSaveException(FileErrors.FILE_NOT_STORED, e);
        }
    }

    public FileModel getFile(String fileId) throws FileNotFoundException {
        return fileRepository.findById(fileId).orElseThrow(() -> new FileNotFoundException(FileErrors.FILE_NOT_FOUND + fileId));
    }
    public List<FileModel> getListOfFiles() {
        return fileRepository.findAll();
    }
}
