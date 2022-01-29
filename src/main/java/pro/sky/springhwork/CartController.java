package pro.sky.springhwork;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class CartController {

private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("add")
    public void add(@RequestParam Set<Integer> foodItemsId) {
        cartService.addItemIds(foodItemsId);
    }

    @GetMapping("get")
    public Set<Integer> get() {
        return cartService.getItemIds();
    }
}
