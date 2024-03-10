class Vehicle{
    public String brand;
    public void display(){
        System.out.println("This is vehicle details");
    }
}

class Car extends Vehicle{
    public String model;

    @Override
    public void display(){
        System.out.println("Brand is " + brand + " model is " + model);
    }
}

public class Assignment1_course1 {
    public static void main(String[] args){
        Car obj = new Car();
        obj.brand="Maruti";
        obj.model="Fronex";
        obj.display();
    }
}
