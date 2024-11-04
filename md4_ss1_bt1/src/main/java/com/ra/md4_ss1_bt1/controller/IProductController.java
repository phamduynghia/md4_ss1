package com.ra.md4_ss1_bt1.controller;

import com.ra.md4_ss1_bt1.model.entity.Product;
import com.ra.md4_ss1_bt1.model.service.IProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/index")
public class IProductController {
    private final IProductService productService;

    @Autowired
    public IProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
        public String index(Model model){
            List<Product> products = productService.findAll();
            model.addAttribute("products",products);
            return "/index";
        }

        @GetMapping("/add")
    public String add(Product product, Model model){
        model.addAttribute("product",product);
        return "/addProduct";
        }

        @PostMapping("/add")
    public String save(@Valid @ModelAttribute Product product, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/addProduct";
        }
        productService.save(product);
        return "redirect:/product";
        }
}
