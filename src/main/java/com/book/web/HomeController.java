package com.book.web;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.domain.Book;

@RestController
@RequestMapping("/book")
public class HomeController {
    protected Logger log = LoggerFactory.getLogger(this.getClass());
    /* /{book}
    /{book}/{chapter-number}
     /{book}/{chapter-from}-{chapter-to}
      * John+3:16-18
     */
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book read(@PathVariable("id") Long id) {
        log.info("***** READ *****");
        Book book = new Book(1, "KJV");
        return book;
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Book> list() {
        log.info("***** GET ALL *****");
        return Collections.emptyList();
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Book Book) {
        log.info("***** CREATE *****");
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Book Book) {
        log.info("***** UPDATE-1 *****");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateById(@PathVariable("id") Long id, @RequestBody Book Book) {
        log.info("***** UPDATE-2 *****");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete() {
        log.info("***** DELETE *****");
    }
}
