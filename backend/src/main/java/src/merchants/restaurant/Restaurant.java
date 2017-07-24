package src.merchants.restaurant;

import src.merchants.Merchant;
import com.googlecode.objectify.annotation.Subclass;

/**
 * Created by Muhammad on 24/07/2017.
 */
@Subclass(index = true)
public class Restaurant extends Merchant {

    //default constructor for Entity initalization
    public Restaurant() {
    }

}
