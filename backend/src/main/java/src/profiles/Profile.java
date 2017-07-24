package src.profiles;

import src.general.Location;
import src.general.Review;
import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad on 25/07/2017.
 */
@Entity
public class Profile {
    @Id
    public long id;
    public String name;
    //  public String password; check for 3rd party authentication
    public String email;
    public List<String> regTokenList = new ArrayList<>();
    public String phone;
    public String imageURl;
    @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
    public List<Key<Review>> reviews = new ArrayList<>();
    public Location currentLocation;

    //default constructor for Entity initialization
    public Profile (){}
    //============
}
