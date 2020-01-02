
package com.test.api2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("books")
    public String GetBooks() {
        logger.debug("Books Controller called");
        return "all books";
    }
}