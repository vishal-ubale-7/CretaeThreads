// Create a class that extends Thread.
// Override the run() method (write the task inside).
// Create object of the class.
// Call start() to run the thread.


public class ThreadClass extends Thread
{
       public void run()
       {
           System.out.println("Thread is running using thread class");
       }
}
  class MainClass
 {
      public static void main(String args[])
    {
      ThreadClass t1 = new ThreadClass();
      t1.start(); // start the thread

      // MyRunnable Class
      MyRunnable mytask = new  MyRunnable(); // create object but runnable itself not a thread that why create thread object

      Thread t2 = new Thread(mytask);

      t2.start(); // start the thread

    }
 }
