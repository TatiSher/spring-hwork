package pro.sky.springhwork;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CartServiceimpl implements CartService {

    private final Cart cart;

    public CartServiceimpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public Cart addItemIds(Set<Integer> foodItemIds) {
        for (Integer foodItemId : foodItemIds) {
            cart.addItemId(foodItemId);
        }
        return null;
    }

    @Override
    public Set<Integer> getItemIds() {
        return cart.getItems();
    }
}
