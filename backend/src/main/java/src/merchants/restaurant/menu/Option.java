package src.merchants.restaurant.menu;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Created by Muhammad Saeed on 2/11/2017.
 */
@Entity
public class Option {

    @Id
    public long id;
    public String name;//size , spicy etc
    public boolean required;
    public double price;
    public String description; //Extras
    public boolean available;

    //default constructor for Entity initialization
    public Option() {
    }
//============
}
