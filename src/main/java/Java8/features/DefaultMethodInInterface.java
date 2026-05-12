package Java8.features;

interface A{
   //void says();
    default void display(){
        System.out.println("Display method of parent");

    }
}

interface B {
    default void display(){
        System.out.println("Child default method");
    }

    default void says(){
        System.out.println("Says hello");
    }



}
public class DefaultMethodInInterface implements A,B {
    public static void main(String[] args) {

//        B b = new B();
//        b.display();
//        b.says();

//        A a = new B();
//        a.display();
       // a.says();

        DefaultMethodInInterface df = new DefaultMethodInInterface();
        df.display();


    }

    @Override
    public void display() {
//        A.super.display();
        B.super.display();

    }
}
