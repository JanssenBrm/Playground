package be.playground;

import java.util.List;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {

    private final int POOL_SIZE = 5;

    private ScheduledThreadPoolExecutor scheduler;

    public TaskScheduler(){
        scheduler = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(POOL_SIZE);
    }
    public void schedule(Task task, int delay){
        scheduler.schedule(task, delay, TimeUnit.SECONDS);

    }
    public void stop(){
        scheduler.shutdown();
    }
}
