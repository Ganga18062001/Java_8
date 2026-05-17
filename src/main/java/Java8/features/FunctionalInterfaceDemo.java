package Java8.features;

//@FunctionalInterface
interface MyInterface{

     void sayHello();//only one abstract method allow
    default void sayBy(){
        System.out.println("default method");
    };

    static void say(){
        System.out.println("static method");
    };

    private void dd(){
        System.out.println("Private method");
    }




}

//@FunctionalInterface

interface ChildInt extends MyInterface{

    void sayHello();

}


public  class FunctionalInterfaceDemo{


    public static void main(String[] args) {

        MyInterface m = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("ncdnmidj okdo");
            }
        };
        m.sayHello();

        MyInterface mi = () -> {
            System.out.println("say hello");
        };

        mi.sayHello();

        mi.sayBy();


        //static method
        MyInterface.say();



    }
}
