package com.example.cartridge.springdata.jdk17;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.tarantool.repository.Query;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, String> {

    @Query(function = "myfunc")
    void myfunc(Book[] books);
}
