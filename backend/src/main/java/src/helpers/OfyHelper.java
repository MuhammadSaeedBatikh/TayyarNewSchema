package src.helpers;

import src.merchants.Category;
import src.merchants.Item;
import src.merchants.Merchant;
import src.merchants.pharmacy.Pharmacy;
import src.merchants.restaurant.Restaurant;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Muhammad on 24/07/2017.
 */

public class OfyHelper implements ServletContextListener {
    static {
        System.out.println("aaaaaaaaaaaaaaaaaaaaawala walaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaaaaaaaaawala walaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaaaaaaaaawala walaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        ObjectifyService.register(Merchant.class);
        ObjectifyService.register(Pharmacy.class);
        ObjectifyService.register(Restaurant.class);
        ObjectifyService.register(Category.class);
        ObjectifyService.register(Item.class);
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
