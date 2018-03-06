package be.playground;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();
        String text;
        while (scanner.hasNext() && !(text = scanner.next()).toUpperCase().equals("STOP")) {
            scheduler.schedule(new PongTask(text), 5);
        }

        scheduler.stop();

    }
}
