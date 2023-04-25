import java.util.Scanner;

class BMI{

    private double height;      // A double field to store the height of the person in meters.
    private double weight;      // A double field to store the weight of the person in kilograms.
    static Scanner sc = new Scanner(System.in);

    public void acceptHeight(){
        System.out.print("Enter height in cms : ");
        setHeight(sc.nextDouble()); 
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void acceptWeight(){
        System.out.print("Enter weight in kgs : ");
        setWeight(sc.nextDouble()); 
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }

    public double calculateBMI(){
        return (this.getWeight() / (Math.pow(this.getHeight() / 100, 2)));
    }

    void printBMI(){
        System.out.printf("BMI = %.2f", this.calculateBMI());
    }
}

class Q2{
    public static void main(String args[]){
        BMI bmi = new BMI();
        bmi.acceptHeight();
        bmi.acceptWeight();
        bmi.printBMI();
    }
}