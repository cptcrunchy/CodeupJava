package Java2;

public class Computer {
    public double screenSize;
    public String brand;
    public String OS;
    public String CPU;
    public double RAM;
    private double price;
    static String category;

    public boolean powerOn(){
        System.out.println("On");
        return true;
    }

    public double getTotalPrice(boolean discount){
        if(discount){
            return (price * .9);
        }
        return price;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double publicPrice){
        this.price = publicPrice;
    }
}