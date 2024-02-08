package Design_Pattern.Adapter;

import java.util.Random;

public class YesBank {

    Random balanceGenerator;

    public YesBank() {
        this.balanceGenerator = new Random();
    }

    public Long getBalance(String username, String password) throws InvalidCredentialException {
        if(username.startsWith("yesb_") && password.endsWith("_yesb")){
            return balanceGenerator.nextLong() * 1000;
        } else {
            throw new InvalidCredentialException("Invalid Username or Password!");
        }
    }

    public YesBankStatus sendMoney(String fromUserName, String toUserName, String fromPassword, Double amount){
        return YesBankStatus.getRandom();
    }

}
