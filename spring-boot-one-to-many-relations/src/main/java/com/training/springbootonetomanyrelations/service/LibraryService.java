package com.training.springbootonetomanyrelations.service;

import com.training.springbootonetomanyrelations.model.Library;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    List<Library> listAll();

    Optional<Library> getById(int libraryId);

    Library saveLibrary(Library library);

    void deleteLibrary(int libraryId);

    Library updateLibrary(Library library, int libraryId);

    List<Library> getBookAndLibrary(int bookId);

}
