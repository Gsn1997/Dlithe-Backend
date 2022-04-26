package collectionframework.hashset;

import java.util.HashSet;

public class DisplayOffers {

    public static void offers() {
        HashSet<Offers> offersList = new HashSet<>();

        Offers offer1 = new Offers();
        offer1.setName("Groceries on purchase above 500");
        offer1.setSave(100);
        offer1.setCategory("Fruits and Vegetables");
        offersList.add(offer1);

        Offers offer2 = new Offers();
        offer2.setName("Kitchenware on purchase above 1000");
        offer2.setSave(250);
        offer2.setCategory("Home and Kitchen");
        offersList.add(offer2);

        Offers offer3 = new Offers();
        offer3.setName("Cosmetics on purchase above 750");
        offer3.setSave(150);
        offer3.setCategory("Beauty");
        offersList.add(offer3);

        Offers offer4 = new Offers();
        offer4.setName("Cosmetics on purchase above 750");
        offer4.setSave(150);
        offer4.setCategory("Beauty");
        offersList.add(offer4);

        for (Offers offers : offersList){
            System.out.println(offers);
        }
    }

    public static void main(String[] args) {
        offers();
    }

}
