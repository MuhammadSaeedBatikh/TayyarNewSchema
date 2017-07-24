package src.general;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * User: YourPc
 * Date: 3/14/2017
 */

@Entity
public class Review {
    @Id
    public long id;
    public String customerID;
    public String body;
    public int rating;
    public String restraintID;
    
    //default constructor for Entity initalization
    public Review(){}
    
}
