package com.example.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simplified book query service (in-memory demo data).
 * Production version uses MyBatis + MySQL.
 */
@Service
public class BookService {
    public Map<String, Object> page(int pageNum, int pageSize, String keyword, Long categoryId) {
        List<Map<String, Object>> records = List.of(
                Map.of("id", 1, "title", "Introduction to Algorithms", "stock", 3, "category", "CS"),
                Map.of("id", 2, "title", "Clean Code", "stock", 5, "category", "SE")
        );
        Map<String, Object> page = new HashMap<>();
        page.put("pageNum", pageNum);
        page.put("pageSize", pageSize);
        page.put("total", records.size());
        page.put("records", records);
        page.put("keyword", keyword);
        page.put("categoryId", categoryId);
        return page;
    }

    public Map<String, Object> findById(Long id) {
        return Map.of("id", id, "title", "Sample Book", "isbn", "978-0-000000-00-0", "stock", 1);
    }
}