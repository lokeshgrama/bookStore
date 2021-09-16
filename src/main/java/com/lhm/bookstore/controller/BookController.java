package com.lhm.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhm.bookstore.dto.BookDto;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

	@GetMapping
	public ResponseEntity<List<BookDto>> getBooks() {
		BookDto book = BookDto.builder()
				.title("My Book")
				.build();
		
		List<BookDto> books = new ArrayList<>();
		books.add(book);
		return ResponseEntity.ok(books);
	}
}
