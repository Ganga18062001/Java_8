package Java8.features.methodAndConstruReferences;

interface Car{
    Vehicle getCar();
}
class Vehicle{
    Vehicle(){
        System.out.println("vehicle object created");
    }
}
public class ReferenceConstructor {
    public static void main(String[] args) {

        //reference constructor
        Car car = Vehicle :: new;

        car.getCar();

    }
}
