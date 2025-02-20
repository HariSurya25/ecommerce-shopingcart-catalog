package org.example.ecommerceclothapp2k25.controllers;

import org.example.ecommerceclothapp2k25.models.Category;
import org.example.ecommerceclothapp2k25.models.Product;
import org.example.ecommerceclothapp2k25.models.State;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("e-commerce/fashion/category")
public class CategoryController {

        //http://localhost:8082/e-commerce/category/getcategories
        @GetMapping("getcategories")
        public Category getAllCategory() {
            List<Product> list= new ArrayList<>();
            list.add(new Product());
            list.add(new Product());

            Category category = new Category();
            category.setName("Electronics");
            category.setModified_at(new Date());
            category.setCreated_at(new Date());
            category.setDescription("all electronics gadgets.");
            category.setState(State.Active);

            category.setPrd(list);
            return category;
        }

        //http://localhost:8082/e-commerce/category/catg?Category=Electronics
        @GetMapping("catg")
        public Category getCategoryByName(@RequestParam String Category){
            Category cat= new Category();
            cat.setName(Category);
            return cat;
        }
    }


