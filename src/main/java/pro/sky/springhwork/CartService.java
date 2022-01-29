package pro.sky.springhwork;


import java.util.Set;

public interface CartService {

    Cart addItemIds(Set<Integer> foodItemIds);

    Set<Integer> getItemIds();
}
