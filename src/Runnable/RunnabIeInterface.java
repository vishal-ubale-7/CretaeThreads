package Runnable;

     // Task One...
public class RunnabIeInterface implements Runnable
{
    public void run()
    {
        System.out.println(" Music is playing...");
    }
}

      // Task Two...
class DownloadTask implements Runnable
{
    public void run()
    {
        System.out.println(" File is Downloading...");
    }
}
    // Task Three
class UpdateTask implements Runnable
    {
        public void run()
        {
            System.out.println(" Apps is Updateting...");
        }
    }

