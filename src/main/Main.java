import strategy.Context;
import strategy.Flight;
import strategy.RoadTransport;
import strategy.WaterTransport;


public class Main {

    public static void main(String[] args) {
        //Flight Strategy
        Context context = new Context(new Flight());
        System.out.println("Transport Medium: "+ context.executeStrategy());

        //Road Transport Strategy
        context = new Context(new RoadTransport());
        System.out.println("\nTransport Medium: "+context.executeStrategy());

        //Water Transport Strategy
        context = new Context( new WaterTransport());
        System.out.println("\nTransport Medium: "+context.executeStrategy());
    }
}
