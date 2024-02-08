package Design_Pattern.Adapter;

import java.util.*;

public class IciciBank {

    Random balanceGenerator;

    public IciciBank() {
        this.balanceGenerator = new Random();
    }

    public String getToken(String username, String password) throws InvalidCredentialException {
        if(username.startsWith("icicib_") && password.endsWith("_icicib")){
            return UUID.randomUUID().toString().replaceAll("_","");
        } else {
            throw new InvalidCredentialException("Invalid Username or Password!");
        }
    }

    public Double getBalance(String userToken) throws InvalidCredentialException {
        return balanceGenerator.nextDouble()*1000;
    }

    public ICICIBankStatus transaction(String fromUserToken, String toUserId, Double amount){
        return ICICIBankStatus.getRandom();
    }

}
