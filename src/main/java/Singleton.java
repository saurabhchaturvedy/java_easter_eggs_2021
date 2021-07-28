public class Singleton {


    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("creating singleton...");
    }


    public static Singleton getInstance() {
        return singleton;
    }
}

class TestClass
{

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1.hashCode()+" "+instance2.hashCode());
    }
}
