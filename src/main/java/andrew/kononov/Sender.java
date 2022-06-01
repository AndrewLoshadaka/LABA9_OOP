package andrew.kononov;


public class Sender {
    private static Sender instance;
    private final String name;

    private Sender(String name) {
        this.name = name;
    }

    public static Sender getInstance(String name){
        if(instance == null)
            instance = new Sender(name);
        return instance;
    }

    public String getName() {
        return name;
    }
}
