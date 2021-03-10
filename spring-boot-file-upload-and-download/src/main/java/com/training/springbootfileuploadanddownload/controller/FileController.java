package com.training.springbootfileuploadanddownload.controller;

import com.training.springbootfileuploadanddownload.model.FileModel;
import com.training.springbootfileuploadanddownload.response.FileResponse;
import com.training.springbootfileuploadanddownload.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/File")
public class FileController {

    private final FileService fileService;

    @Autowired
    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @RequestMapping(value = "/Upload", method = RequestMethod.POST)
    public FileResponse uploadFile(@RequestParam("file") MultipartFile file) {
        FileModel model = fileService.saveFile(file);
        String fileUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/download/").
                path(model.getFileId()).toUriString();
        return new FileResponse(model.getFileName(), model.getFileType(), fileUri);
    }

    @RequestMapping(value = "/UploadMultipleFiles", method = RequestMethod.POST)
    public List<FileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files).
                stream().
                map(file -> uploadFile(file)).
                collect(Collectors.toList());
    }

    @RequestMapping(value = "/download/{fileName}", method = RequestMethod.GET)
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) throws FileNotFoundException {
        FileModel model = fileService.getFile(fileName);
        return ResponseEntity.ok().
                header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=\"" + model.getFileName() + "\"").
                body(new ByteArrayResource(model.getFileData()));
    }

    @RequestMapping(value = "/Allfiles", method = RequestMethod.GET)
    public List<FileModel> getListFiles(Model model) {
        List<FileModel> fileDetails = fileService.getListOfFiles();
        return fileDetails;
    }
}



