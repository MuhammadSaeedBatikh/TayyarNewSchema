package src.merchants;

import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.*;

import java.util.ArrayList;
import java.util.List;

import src.general.Location;
import src.general.Review;

/**
 * Created by Muhammad on 24/07/2017.
 */
@Entity
public class Merchant {
    @Id
    public long id;
    public String name;
    public String email;
    public String phone;
    @Index
    public String city;
    @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
    public List<Key<Review>> reviews = new ArrayList<Key<Review>>();
    public Location location;
    @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
    public List<Key<Category>> categories = new ArrayList<Key<Category>>();
    public String imageURL;
    public List<String> regTokenList = new ArrayList<>();
    @Index
    public int pricing;
    @Index
    public int rating;
    @Index
    public boolean active;


    //default constructor for Entity initalization
    public Merchant() {
    }

    public static Merchant getMerchantbyID(long id) {
        return ObjectifyService.ofy().load().type(Merchant.class).id(id).now();
    }

    public void saveMerchant() {
        ObjectifyService.ofy().save().entity(this).now();
    }

    public void addCategoryToThisMerchant(long categoryID) {
        Key<Category> categoryKey = Key.create(Category.class, categoryID);
        this.categories.add(categoryKey);
        ObjectifyService.ofy().save().entity(this).now();// save changes in this Merchant
    }

    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        for (Key<Category> categoryKey : this.categories) {
            Category category = ObjectifyService.ofy().load().key(categoryKey).now();
            categories.add(category);
        }
        /*todo try another approach by passing all keys at once,
         notice that the query, isn't executed until .now()*/
        return categories;
    }
}
