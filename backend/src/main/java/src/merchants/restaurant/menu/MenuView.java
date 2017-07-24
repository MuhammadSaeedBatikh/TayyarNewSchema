package src.merchants.restaurant.menu;


import src.merchants.Category;
import src.merchants.restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad Saeed on 3/24/2017.
 */

public class MenuView {
    List<MenuElement> menuElements = new ArrayList<>();

    //internal uses
    public MenuView(Restaurant restaurant) {
        List<Category> categoryList = restaurant.getCategories();
        for (Category category : categoryList) {
            menuElements.add(new MenuElement(category.id, category.name,
                    category.imageURL));
        }
    }

    //for the endpoint
    public MenuView(long restaurantID) {
        Restaurant restaurant = (Restaurant) Restaurant.getMerchantbyID(restaurantID);
        List<Category> categoryList = restaurant.getCategories();
        for (Category category : categoryList) {
            menuElements.add(new MenuElement(category.id, category.name,
                    category.imageURL));
        }
    }


}
