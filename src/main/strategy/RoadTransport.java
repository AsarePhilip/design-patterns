package strategy;

public class RoadTransport  implements  TransportStrategy{
    @Override
    public String operate() {
        return "I'm in a bus";
    }
}
