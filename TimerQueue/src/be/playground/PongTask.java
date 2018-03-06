package be.playground;

public class PongTask implements Task{

    String message;

    public PongTask(String message){
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(">> PONG: " + this.message);
    }

    @Override
    public void run() {
        execute();
    }
}
