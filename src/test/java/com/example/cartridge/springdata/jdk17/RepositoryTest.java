package com.example.cartridge.springdata.jdk17;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RepositoryTest {

    @Autowired
    private BookRepository repository;

    @Test
    void myfunc() {
        var book = new Book();
        book.setId(1);
        book.setName("BookName1");
        book.setYear(2024);
        repository.myfunc(List.of(book));
    }
}
