package pro.sky.springhwork;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Component
@SessionScope
public class Cart{

    private final Set<Integer> foodItemIds;

    public Cart() {
        this.foodItemIds = new HashSet<>();
    }

    public Cart(Set<Integer> foodItemIds) {
        this.foodItemIds = foodItemIds;
    }

    public Set<Integer> getItems() {
        return Set.copyOf(foodItemIds);
    }

    public void addItemId(int foodItemId) {;
        foodItemIds.add(foodItemId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return foodItemIds.equals(cart.foodItemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodItemIds);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "foodItemIds=" + foodItemIds +
                '}';
    }

}
