package Java8.features;

//class Animal implements Runnable{
//    public void run(){
//        System.out.println("run method of animal class");
//    }
//}

public class LambadaExpressionUsedInTreading {
    public static void main(String[] args) {

//        Animal animal = new Animal();
//        Thread th = new Thread(animal);
//        th.start();

        Runnable rr = () -> {
            System.out.println("Lambada expression");
        };

        Thread th = new Thread(rr);
        th.start();

    }
}
