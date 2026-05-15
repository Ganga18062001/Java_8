package Java8.features;

interface Play{

    void kick();
    //void start();

}
//class p implements Play{
//    public void kick(){
//        System.out.println("Kick");
//    }
//    public void start(){
//        System.out.println("start");
//    }
//}
public class AnnonymousClass {
    public static void main(String[] args) {

        Play pp = ()->{
            System.out.println("PLay lambada expressio ");

        };
        pp.kick();

        Play p = new Play() {
            @Override
            public void kick() {
                System.out.println("annonymous kick");
            }

//            @Override
//            public void start() {
//
//                System.out.println("Annonymous start ");
//
//            }
        };

        p.kick();
        //p.start();


    }
}
