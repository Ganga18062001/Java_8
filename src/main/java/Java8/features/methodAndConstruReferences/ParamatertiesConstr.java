package Java8.features.methodAndConstruReferences;

interface Animal{
    Anim weight(String nama);
}

class Anim{
    Anim(String name){
        System.out.println(name);
    }
}
public class ParamatertiesConstr {
    public static void main(String[] args) {

        Animal an = Anim :: new;

        an.weight("1kg");

    }
}
