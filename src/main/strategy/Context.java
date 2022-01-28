package strategy;

public class Context {
    TransportStrategy strategy;

    public Context(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(){
        return strategy.operate();
    }
}
