package strategy;

public class Flight implements TransportStrategy{
    @Override
    public String operate() {
        return "I am flying";
    }
}
