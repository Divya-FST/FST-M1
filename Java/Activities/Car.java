package Session1;

public class Car {
    //car calss variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    //constructor
    Car() {
        tyres = 4;
        doors = 4;
    }

    //class Methods
    public void displayCharacterstics(){
        System.out.println("Color of the car: " +color);
        System.out.println("Make of the car: " +make);
        System.out.println("Transmission of the car: " +transmission);
        System.out.println("No. of doors on the car: " +doors);
        System.out.println("No. of tyres on the car: " +tyres);
    }
    public void accelerate() {
        System.out.println("Car is moving forward.");
        }
        
        public void brake() {
        System.out.println("Car has stopped.");
        }
}
