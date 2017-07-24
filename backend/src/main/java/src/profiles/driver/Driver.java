package src.profiles.driver;


import src.general.Location;
import src.profiles.Profile;

import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Subclass;

/**
 * Created by Muhammad Saeed on 2/11/2017.
 */
@Subclass(index = true)
public class Driver extends Profile{

    public String vehicle;
    public double balance;
    public int rate;

     public String imageURL;
    @Index
    public boolean idle;

    //default constructor for Entity initialization
    public Driver (){}
    //============


}
