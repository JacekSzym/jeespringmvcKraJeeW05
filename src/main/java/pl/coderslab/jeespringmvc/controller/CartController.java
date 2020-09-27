package pl.coderslab.jeespringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.jeespringmvc.model.Cart;
import pl.coderslab.jeespringmvc.model.CartItem;
import pl.coderslab.jeespringmvc.model.Product;

import java.util.Random;
import java.util.stream.Collectors;

@Controller
public class CartController {
    private Cart cart;

    @Autowired
    public CartController(Cart cart) {
        this.cart = cart;
    }

    @GetMapping("/addtocart")
    @ResponseBody
    public String addToCart(){
        Random rand = new Random();
        this.cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));

        return "addtocart";
    }

    @GetMapping(path = "/cart"
            , produces = "text/html;  charset=UTF-8"
    )
    @ResponseBody
    public String cart() {
        String html = "<ul>\r\n<li>";

        String lis = this.cart.getCartItems().stream()
                .map(CartItem::toString)
                .collect(Collectors.joining("</li>\r\n<li>"));

        return html+lis+"</li></ul>";
    }
}
