package src.general;

import src.merchants.Merchant;

/**
 * Created by Muhammad Saeed on 3/10/2017.
 */
public class MerchantView {
    public String name;
    public long merchantID;
    public String imageURL;
    public int pricing;
    public int rating;
    public boolean active;

    public MerchantView(String name, long merchantID, String imageURL) {
        this.name = name;
        this.merchantID = merchantID;
        this.imageURL = imageURL;
    }

    public MerchantView(Merchant merchant) {
        this.name = merchant.name;
        this.merchantID = merchant.id;
        this.imageURL = merchant.imageURL;
        this.active = merchant.active;
        this.pricing = merchant.pricing;
        this.rating = merchant.rating;
    }

}
