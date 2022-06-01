package andrew.kononov;

public class Addressee {
    private static Addressee instance;
    private final String name;

    private Addressee(String name) {
        this.name = name;
    }

    public static Addressee getInstance(String name){
        if(instance == null)
            instance = new Addressee(name);
        return instance;
    }

    public String getName() {
        return name;
    }
}
