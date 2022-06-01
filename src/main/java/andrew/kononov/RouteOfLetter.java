package andrew.kononov;

public class RouteOfLetter {
    private static RouteOfLetter instance;
    private final String route;

    public String getRoute() {
        return route;
    }

    private RouteOfLetter(String route){
        this.route = route;
    }

    public static RouteOfLetter getInstance(String name){
        if(instance == null)
            instance = new RouteOfLetter(name);
        return instance;
    }
}

