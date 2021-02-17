package LrnEncapsulation;

public class Mobile {

    public Mobile() {
        System.out.println("Mobile is default constructor");
    }

    String carrier = "T-Mobile";
        private double price = 50;
        private String owner = "Alex";
        private int serialNum  = 11369;
        private String homAddress = "Elmhurst";

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }


    public String getHomAddress() {
        return homAddress;
    }

    public void setHomAddress(String homAddress) {
        this.homAddress = homAddress;
    }
}

