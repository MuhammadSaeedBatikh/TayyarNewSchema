package src.merchants.restaurant.menu;

/**
 * Created by Muhammad Saeed on 4/5/2017.
 */

public class MenuElement {
    public String categoryName;
    public long categoryID;
    public String imageURL;

    public MenuElement(long categoryID, String categoryName, String imageURL) {
        this.categoryName = categoryName;
        this.categoryID = categoryID;
        this.imageURL =imageURL;
    }
}
