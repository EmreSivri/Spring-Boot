package com.training.springbootonetomanyrelations.controller;

import com.training.springbootonetomanyrelations.model.Library;
import com.training.springbootonetomanyrelations.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/library")
@CrossOrigin
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping(value = "/save")
    public Library save(@RequestBody Library library) {
        return libraryService.saveLibrary(library);
    }

    @GetMapping(value = "/all")
    public List<Library> getAll() {
        return libraryService.listAll();
    }

    @GetMapping(value = "/get/{libraryId}")
    public Optional<Library> get(@PathVariable int libraryId) {
        return libraryService.getById(libraryId);
    }

    @PutMapping(value = "/update/{libraryId}")
    public Library update(@RequestBody Library library, @PathVariable int libraryId) {
        return libraryService.updateLibrary(library, libraryId);
    }

    @DeleteMapping(value = "/delete")
    public String delete(@RequestParam int libraryId) {
        libraryService.deleteLibrary(libraryId);
        return "Library Deleted !";
    }


    @GetMapping(value = "/get/bookAndLibrary/{bookId}")
    public List<Library> getNew(@PathVariable int bookId) {
        return libraryService.getBookAndLibrary(bookId);
    }

}
