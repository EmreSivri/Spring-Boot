package com.training.springbootsimplefileupload.controller;

import com.training.springbootsimplefileupload.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileUploadController {

    @Autowired
    FileUploadService fileUploadService;

    @PostMapping
    public void uploadFile(@RequestParam(name = "file") MultipartFile multipartFile) throws IOException {
        fileUploadService.uploadFile(multipartFile);
    }
}
