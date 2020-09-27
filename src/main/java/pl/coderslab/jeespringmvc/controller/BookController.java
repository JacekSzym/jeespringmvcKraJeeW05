package pl.coderslab.jeespringmvc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.jeespringmvc.model.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
// jackson jest bardzo sprytny - praktycznie wszystko potrafi
    // przekonwertować na jsona, także listę dowolnych obiektów
    // jak poniżej
//    @RequestMapping("/booklist")
//    public List<Book> bookList() {
//        return new ArrayList<>();
//    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "Thinking in Java", "Bruce Eckel");
    }

// jackson działa w obie strony, także json->javaObject, jak poniżej
//    @PostMapping("/addBook")
//    public String addBook(@RequestBody Book book) {
//        return book.toString();
//    }
}
