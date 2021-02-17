package basic;

public class LrnConcatenation {

    String carBrand = "BMW";
    String carColor = "Cherry Red";
    String CarDetail= carBrand +"  "+ carColor;




    public static void main(String [] args){
        LrnConcatenation Car = new LrnConcatenation();
        Car.CarDetail = Car.carBrand +" "+ Car.carColor;
        System.out.println("Zma's favourite is " + Car.CarDetail );

        int stId = 89;
        int stPh = 1112223334;
        String StudentDetail = (stId + "," + " "+ stPh);
        System.out.println("I would like to have studentId and StudentPh"+" "+StudentDetail);

        String Country = "Nepal";
        String Capital = "Ktm";
        String VisitedCountry = (Capital+"," + " "+Country);
        System.out.println("Mostafa visited"+" "+VisitedCountry+" "+"5 times already.");


    }







}
