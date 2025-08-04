package Runnable;

public class MainClass
{
    public static void main(String args [])
    {
       // create task
       RunnabIeInterface music = new RunnabIeInterface();
       DownloadTask download = new DownloadTask();
       UpdateTask update = new UpdateTask();

       // wrap task into Thread
        Thread t1 = new Thread(music);
        Thread t2 = new Thread(download);
        Thread t3 = new Thread(update);

        // start both thread
        t1.start();
        t2.start();
        t3.start();

    }
}
