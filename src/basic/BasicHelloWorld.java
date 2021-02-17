package basic;

import java.sql.SQLOutput;

public class BasicHelloWorld {

    public static void hello() {

      int xAge = 24;
      int yAge = 30;
      int ageDifference = (yAge-xAge);
        System.out.println(ageDifference);

    }

    public void Zima() {

        int price = 100;
        int discountPrice = 69;
        int priceDifference = (price-discountPrice);
        System.out.println(priceDifference);


    }
   public void Display(){

    }

    public static void main(String[] args) {
        BasicHelloWorld pd = new BasicHelloWorld();
        pd.Zima();
        BasicHelloWorld.hello();











    }









}
