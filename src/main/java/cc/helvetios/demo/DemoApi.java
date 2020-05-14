package cc.helvetios.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author u207329 (Simon Bergamin)
 * @since 1.164
 *
 */
@RestController
@RequestMapping(produces = {"text/xml;charset=ISO-8859-1", MediaType.APPLICATION_XML_VALUE})
public class DemoApi {

    @GetMapping
    public ResponseEntity<Book> umlaute() {
        final Book book = new Book();
        book.setName("ü");
        return ResponseEntity.ok(book);
    }
}
