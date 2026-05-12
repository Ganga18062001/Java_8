package Java8.features;
interface Aa{
    static void run(){
        System.out.println("run method of Aa");
    }
}
public class StaticMethodInInterface implements Aa {
    static void run(){
        System.out.println("run method of static method interface");
    }
   public static void main(String[] args) {
//
//        StaticMethodInInterface st = new StaticMethodInInterface();
////        st.run();
//
//        Aa.run();

       StaticMethodInInterface.run();


   }
}
