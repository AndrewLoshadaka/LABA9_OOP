package andrew.kononov;

public class Letter {
    private RouteOfLetter routeOfLetter;
    private Sender sender;
    private Addressee addressee;

    public void setRouteOfLetter(String name) {
        routeOfLetter = RouteOfLetter.getInstance(name);
    }

    public void setSender(String name) {
        sender = Sender.getInstance(name);
    }

    public void setAddressee(String name){
        addressee = Addressee.getInstance(name);
    }

    public RouteOfLetter getRouteOfLetter() {
        return routeOfLetter;
    }

    public Sender getSender() {
        return sender;
    }

    public Addressee getAddressee() {
        return addressee;
    }
}
