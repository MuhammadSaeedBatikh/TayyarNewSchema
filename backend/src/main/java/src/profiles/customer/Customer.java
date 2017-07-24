package src.profiles.customer;

import src.profiles.Profile;

import com.googlecode.objectify.annotation.Subclass;

/**
 * Created by Muhammad Saeed on 2/9/2017.
 */
@Subclass(index = true)
public class Customer extends Profile {
    public String mainAddress;

    //default constructor for Entity initialization
    public Customer (){}
    //============

}

