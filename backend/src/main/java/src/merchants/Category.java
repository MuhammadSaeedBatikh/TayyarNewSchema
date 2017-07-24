package src.merchants;

import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad Saeed on 2/11/2017.
 */
@Entity
public class Category {
    @Id
    public long id;
    @Index
    public String name;
    public String description;
    public String imageURL;
    @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
    // can't be used in the client side, to do so use Transformer
    public List<Key<Item>> items = new ArrayList<Key<Item>>();

    //default constructor for Entity initalization
    public Category() {
    }

    public Category(String name, String description, String imageURL) {
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
    }

    public void addItemToThisCategory(long itemID) {
        Key<Item> itemKey = Key.create(Item.class, itemID);
        this.items.add(itemKey);//add item key to this category
        ObjectifyService.ofy().save().entity(this).now();// save changes in this category
    }
}
