package com.example.springrecipeapp.controllers;

import com.example.springrecipeapp.model.Category;
import com.example.springrecipeapp.model.UnitOfMeasure;
import com.example.springrecipeapp.repository.CategoryRepository;
import com.example.springrecipeapp.repository.UnitOfMeasureRepository;
import com.example.springrecipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class RecipeController {

    private final RecipeService recipeService;


    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        log.debug("Index is getting rendered");
        model.addAttribute("recipes", recipeService.getRecipe());

        return "index";
    }
}
