package d3_single;

public class TaskManager {
    private static TaskManager t;
    private TaskManager(){

    }

    public static synchronized TaskManager getInstance(){
        if (t == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            t = new TaskManager();
        }
        return t;
    }
    public void show(){

    }
}
