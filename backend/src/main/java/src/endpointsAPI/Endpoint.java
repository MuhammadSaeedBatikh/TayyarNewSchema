package src.endpointsAPI;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import src.helpers.Constants;
import src.merchants.Merchant;
@Api(name = "constructionAPI",
        version = "v1",
        scopes = {Constants.EMAIL_SCOPE},
        clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
        audiences = {Constants.ANDROID_AUDIENCE}
)
public class Endpoint {


    @ApiMethod(name = "createMerchant")
    public Merchant createMerchant(){
        Merchant merchant =null ;
        return merchant;
    }

}
