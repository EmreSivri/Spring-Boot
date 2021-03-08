package com.training.springbootonetomanyrelations.service;

import com.training.springbootonetomanyrelations.model.Library;
import com.training.springbootonetomanyrelations.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    @Override
    public List<Library> listAll() {
        return libraryRepository.findAll();
    }

    @Override
    public Optional<Library> getById(int libraryId) {
        return libraryRepository.findById(libraryId);
    }

    @Override
    public Library saveLibrary(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public void deleteLibrary(int libraryId) {
        libraryRepository.deleteById(libraryId);
    }

    @Override
    public Library updateLibrary(Library library, int libraryId) {
        library.setLibraryId(libraryId);
        return libraryRepository.save(library);
    }

    @Override
    public List<Library> getBookAndLibrary(int bookId) {
        return libraryRepository.getBookAndLibrary(bookId);
    }
}
