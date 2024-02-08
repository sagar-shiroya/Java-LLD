package Design_Pattern.Adapter;

public class PhonepeCustomer {
    public static void main(String[] args) {
//        Phonepe phonepe = new Phonepe(new ICICIBankApiAdapter());
//        phonepe.setUsername("icicib_sagar");
//        phonepe.setPassword("sfsdfsdfsdf_icicib");

        Phonepe phonepe = new Phonepe(new YesBankAPIAdapter());
        phonepe.setUsername("yesb_sagar");
        phonepe.setPassword("sdfsdfsdfsd_yesb");
        System.out.println(phonepe.checkBalance());
        System.out.println(phonepe.sendMoney("yesbank_mitali", 5000.0));

    }
}
