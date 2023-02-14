package com.example.demo;


import com.example.demo.models.Product;
import com.example.demo.models.ProductTop;
import com.example.demo.repositories.ProductRepo;
import com.example.demo.repositories.ProductTopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;


@Controller
public class MainController  {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ProductTopRepo productTopRepo;


    @PostMapping("/product")
    public String product(@RequestParam String title, @RequestParam String description, @RequestParam String month, @RequestParam Long amount, @RequestParam Long price, @RequestParam Long data){
        Product products = new Product(title,description, month, amount, price, data);
        productRepo.save(products);

        return "redirect:/";
    }
    @PostMapping("/product/top")
    public String producttop(@RequestParam String title, @RequestParam String description, @RequestParam String month, @RequestParam Long amount, @RequestParam Long price, @RequestParam Long data){
        ProductTop product = new ProductTop(title,description, month, amount, price, data);
        productTopRepo.save(product);
        return "redirect:/";
    }


    @GetMapping("/")
    public String home(Model model) {
        Iterable<Product> products = productRepo.findAll();
        model.addAttribute("products", products);
        return "index";

    }




//    @GetMapping("/services/{id}")
//    public String getService(Model model, @RequestParam Long id ){
//        Optional<Product> product = productRepo.findById(id);
//        ArrayList<Product> result = new ArrayList<>();
//        product.ifPresent(result::add);
//        model.addAttribute("services", result);
//
//        return "services";
//    }



//    @GetMapping("/")
//    public String index(Model model){
//        return "index.html";
//    }

    @GetMapping("/shop.html")
    public String shop2(Model model){
        return "shop.html";
    }
    @GetMapping("/cart.html")
    public String blog(Model model){
        return "cart.html";
    }
    @GetMapping("/checkout.html")
    public String checkout(Model model){
        return "checkout.html";
    }
    @GetMapping("/wishlist.html")
    public String wishlist(Model model){
        return "wishlist.html";
    }
    @GetMapping("/sign-in.html")
    public String singin(Model model){
        return "sign-in.html";
    }
    @GetMapping("/sign-up.html")
    public String singup(Model model){
        return "sign-up.html";
    }
    @GetMapping("/contact.html")
    public String contact(Model model){
        return "contact.html";
    }
    @GetMapping("/product")
    public String contact2(Model model){
        return "product-details.html";
    }

    @GetMapping("/product/top")
    public String product(Model model){
        return "product.html";
    }




//    @PostMapping("/registration")
//    public String registration(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String username, @RequestParam String email, @RequestParam String password ) {
//        Post post = new Post(firstname, lastname, username, email, password);
//        postRepo.save(post);
//
//        return "redirect:/";
//
//    }
//
//    @PostMapping("/create")
//    public String create(@RequestParam String title, @RequestParam String description, @RequestParam String email, @RequestParam String mobile_number){
//        Users users = new Users(title,description,email,mobile_number);
//        usersRepo.save(users);
//
//        return "redirect:/";
//
//    }
//
//    @PostMapping("/")
//    public String home(Model model) {
//        Iterable<Users> users = usersRepo.findAll();
//
//        model.addAttribute("user", users );
//        return "index";
//    }
}
