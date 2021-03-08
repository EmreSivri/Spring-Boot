package com.training.springbootonetomanyrelations.repository;

import com.training.springbootonetomanyrelations.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
