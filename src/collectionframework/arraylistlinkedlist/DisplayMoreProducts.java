package collectionframework.arraylistlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class DisplayMoreProducts {
    public static  void coldDrinks(){
        ArrayList<MoreProducts> coldDrinksList = new ArrayList<>();

        MoreProducts coldDrinks1=new MoreProducts();
        coldDrinks1.setName("Fanta");
        coldDrinks1.setQuantity("2 Liter");
        coldDrinks1.setRate(100);
        coldDrinksList.add(coldDrinks1);

        MoreProducts coldDrinks2=new MoreProducts();
        coldDrinks2.setName("mirrinda");
        coldDrinks2.setQuantity("1.2 Liter");
        coldDrinks2.setRate(89);
        coldDrinksList.add(coldDrinks2);

        MoreProducts coldDrinks3=new MoreProducts();
        coldDrinks3.setName("Sprite");
        coldDrinks3.setQuantity("1.5 Liter");
        coldDrinks3.setRate(95);
        coldDrinksList.add(coldDrinks3);

        MoreProducts coldDrinks4=new MoreProducts();
        coldDrinks4.setName("Frooti");
        coldDrinks4.setQuantity("2 Liter");
        coldDrinks4.setRate(95);
        coldDrinksList.add(coldDrinks4);


        for (MoreProducts coldDrinks : coldDrinksList) {
            System.out.println(coldDrinks);
        }
    }

    public static  void vegetables(){
        LinkedList<MoreProducts> vegetablesList = new LinkedList<>();

        MoreProducts vegetable1=new MoreProducts();
        vegetable1.setName("Tomato");
        vegetable1.setQuantity("100 Grams");
        vegetable1.setRate(30);
        vegetablesList.add(vegetable1);

        MoreProducts vegetable2=new MoreProducts();
        vegetable2.setName("Cabbage");
        vegetable2.setQuantity("250 Grams");
        vegetable2.setRate(35);
        vegetablesList.add(vegetable2);

        MoreProducts vegetable3=new MoreProducts();
        vegetable3.setName("Onion");
        vegetable3.setQuantity("1 KG");
        vegetable3.setRate(30);
        vegetablesList.add(vegetable3);

        MoreProducts vegetable4=new MoreProducts();
        vegetable4.setName("Potato");
        vegetable4.setQuantity("1 KG");
        vegetable4.setRate(25);
        vegetablesList.add(vegetable4);

        for (MoreProducts vegetables : vegetablesList) {
            System.out.println(vegetables);
        }
    }

    public static void main(String[] args) {
        coldDrinks();
        vegetables();
    }
}
