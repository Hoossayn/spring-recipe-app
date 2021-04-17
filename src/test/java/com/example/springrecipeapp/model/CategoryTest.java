package com.example.springrecipeapp.model;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;
    Set<Recipe> recipe;

    @Before
    public  void setUp(){
        category = new Category();
        recipe = new HashSet<>();
    }

    @Test
    public void getId() {
        Long id = 4L;
        category.setId(id);
        assertEquals(id, category.getId());
    }

    @Test
    public void getDescription() {
        String desc = "I am a description of this category";
        category.setDescription(desc);
        assertEquals(desc,category.getDescription());
    }

    @Test
    public void getRecipe() {
        Set<Recipe> ss = new HashSet<>();
       // recipe = new Set<Recipe>;
        category.setRecipe(recipe);
        assertEquals(ss, category.getRecipe());
    }
}