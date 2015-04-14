package com.book.web;

import java.io.InputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.domain.Word;

@RestController
public class WordController {
    
    @RequestMapping("/")
    public Word getWord() {
        Word word = new Word("In the beginning", "NKJV");
        return word;
    }

    private void parseFile(String version) {
     // From ClassLoader, all paths are "absolute" already - there's no context
     // from which they could be relative. Therefore you don't need a leading slash.
     InputStream in = this.getClass().getClassLoader()
                                     .getResourceAsStream("files/NKJV.json");
     // From Class, the path is relative to the package of the class unless
     // you include a leading slash, so if you don't want to use the current
     // package, include a slash like this:
     //InputStream in = this.getClass().getResourceAsStream("/SomeTextFile.txt");
     System.out.println(in != null);   
    }
}
