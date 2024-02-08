package Design_Pattern.Adapter;

public class Phonepe {
    BankApiAdapter adapter;
    String username;
    String password;

    public Phonepe(BankApiAdapter adapter) {
        this.adapter = adapter;
    }

    public Phonepe(BankApiAdapter adapter, String username, String password) {
        this.adapter = adapter;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double checkBalance(){
        return adapter.fetchBalance(username, password);
    }

    public String sendMoney(String toUsername, Double amount){
        String status = "";
        try {
            PhonePeStatus st = adapter.doTransaction(username, password, toUsername,amount.longValue());

            switch (st){
                case ONE -> status = "Transaction Successful.";
                case TWO, INVALID -> status = "Transaction Failed! Try again after sometime.";
                case THREE -> status = "Transaction In Progress.";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return status;

    }
}
