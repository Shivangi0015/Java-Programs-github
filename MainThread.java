
class MyThread implements Runnable
{
    int i;

    public void run()
    {
        for (i = 0; i <= 100; i++)
        {
            System.out.println("MyThread " + i);
        }
    }
}

public class MainThread {
    public static void main(String[] args)
    {
        Thread ob = new Thread(new MyThread());
        ob.start();

        int i;
        for (i = 0; i <= 100; i++)
        {
            System.out.println("MainThread " + i);
        }
    }
}
