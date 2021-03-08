package com.training.springbootonetomanyrelations.repository;

import com.training.springbootonetomanyrelations.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

    @Query(value = "select * from book left join library l on l.library_id = book.library_id where book_id = ?1", nativeQuery = true)
    List<Library> getBookAndLibrary(int bookId);
}
