package strategy;

public class WaterTransport implements  TransportStrategy{
    @Override
    public String operate() {
        return "I'm in a boat";
    }
}
