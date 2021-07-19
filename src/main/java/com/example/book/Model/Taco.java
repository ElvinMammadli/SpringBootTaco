package com.example.book.Model;

import lombok.Data;

import java.awt.print.Book;
import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
