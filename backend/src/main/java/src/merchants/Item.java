package src.merchants;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Created by Muhammad on 24/07/2017.
 */
@Entity
public class Item {
    @Id
    public long id;
    public String name;
    @Index
    public double basePrice;//without extras, or options etc
    public String description;
    @Index
    public boolean available = true;

    //default constructor for Entity initalization
    public Item(){}

}
