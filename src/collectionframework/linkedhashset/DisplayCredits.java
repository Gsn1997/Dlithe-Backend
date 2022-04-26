package collectionframework.linkedhashset;

import java.util.LinkedHashSet;

public class DisplayCredits {

    public static void credits(){

        LinkedHashSet<Credits> creditsList =new LinkedHashSet<>();

        Credits credit1 = new Credits();
        credit1.setCustomerName("Goutham Naik");
        credit1.setAmount(500);
        credit1.setType("PhonePe");
        credit1.setStatus("Recived");
        creditsList.add(credit1);

        Credits credit2 = new Credits();
        credit2.setCustomerName("Nikhil Naik");
        credit2.setAmount(750);
        credit2.setType("AmazonPay");
        credit2.setStatus("Recived");
        creditsList.add(credit2);

        Credits credit3 = new Credits();
        credit3.setCustomerName("Ganga Naik");
        credit3.setAmount(900);
        credit3.setType("GooglePay");
        credit3.setStatus("Failed");
        creditsList.add(credit3);


        Credits credit4 = new Credits();
        credit4.setCustomerName("Nirmala Naik");
        credit4.setAmount(500);
        credit4.setType("MobiWiki");
        credit4.setStatus("Recived");
        creditsList.add(credit4);

        Credits credit5 = new Credits();
        credit5.setCustomerName("Nirmala Naik");
        credit5.setAmount(500);
        credit5.setType("MobiWiki");
        credit5.setStatus("Recived");
        creditsList.add(credit5);


        for (Credits credits: creditsList ){
            System.out.println(credits);
        }
    }

    public static void main(String[] args) {
        credits();
    }
}
