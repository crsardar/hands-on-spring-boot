package com.crsardar.springbootinitializer;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController
{
    @GetMapping("/books")
//    @RequestMapping(value = "books", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks()
    {
        return Arrays.asList(new Book(1L, "Mastering C"));
    }
}
