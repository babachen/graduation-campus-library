package com.example.controller;

import com.example.common.Result;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Book query API — educational excerpt only.
 * Full CRUD, borrow/return, seat booking live in the complete delivery package.
 */
@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public Result<?> page(@RequestParam(defaultValue = "1") int pageNum,
                          @RequestParam(defaultValue = "10") int pageSize,
                          @RequestParam(required = false) String keyword,
                          @RequestParam(required = false) Long categoryId) {
        return Result.success(bookService.page(pageNum, pageSize, keyword, categoryId));
    }

    @GetMapping("/{id}")
    public Result<?> detail(@PathVariable Long id) {
        return Result.success(bookService.findById(id));
    }
}