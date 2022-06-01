package patterns;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() { // только один экземпляр класса
        return INSTANCE;
    }
}
