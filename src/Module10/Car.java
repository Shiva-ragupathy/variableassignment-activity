package Module10;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("The Car engine is Started");
    }

    @Override
    public void stop() {
        System.out.println("The car engine is Stopped");
    }
}
