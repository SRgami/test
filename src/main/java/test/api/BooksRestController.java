package test.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.api.Resource.Book;
import test.domain.service.BookService;


@RestController
@RequestMapping("books")
public class BooksRestController {

	@Autowired
	BookService bookService;
	
	@RequestMapping(path = "{bookId}", method = RequestMethod.GET)
	public Book getBook(@PathVariable String bookId) {
		
		Book book = bookService.find(bookId);
		
		Book resourceBook = new Book();
		resourceBook.setBookId(book.getBookId());
		resourceBook.setName(book.getName());
		resourceBook.setPublishDate(book.getPublishDate());
		
		return resourceBook;
	}
}
