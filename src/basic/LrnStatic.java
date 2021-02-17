package basic;

public class LrnStatic {

    public static String vegetable = "carrot"; // static global variable
    String color = "orange"; //nonstatic global variable


    public void Student(){
        String StFirstName ="Mostafa";
        String StLastName = "Mamun";
        String FullName = StFirstName +" "+StLastName;
        System.out.println(FullName);
    }

    public static void ZmaBusiness(){

        int weeklyProfit = 1000;
        int monthlyProfit = 4000;
        int TotalGrossProfit = weeklyProfit+monthlyProfit;
        System.out.println("Zma's Business gross profit "+TotalGrossProfit);






    }



    public static void main(String[] args){
        LrnStatic.vegetable = "carrot";
        System.out.println("My favourite Vegetable is "+ vegetable);

        LrnStatic lrn = new LrnStatic();
        lrn.color = "orange";
        System.out.println("Zma's favourite color is " +lrn.color);
        lrn.Student();
        LrnStatic.ZmaBusiness();




    }









}
