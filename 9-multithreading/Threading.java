import java.util.Vector;

class MyThread extends Thread {
    private int floor, ceiling;

    public MyThread(int floor, int ceiling) {
        this.floor = floor;
        this.ceiling = ceiling;
    }

    public void run() {
        try {
            System.out.println(
                    "Thread " + Thread.currentThread().getId() + " counting " + this.floor + " - " + this.ceiling);
            int num1, num2, num3, counter;
            for (int N = this.floor; N <= this.ceiling; N++) {
                num1 = 0;
                num2 = 1;
                counter = 0;
                while (counter < N) {
                    num3 = num2 + num1;
                    num1 = num2;
                    num2 = num3;
                    counter++;
                }
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " done.");
        } catch (Exception e) {
            System.out.println("An exception has occured:");
            e.printStackTrace();
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        Vector<MyThread> myVec = new Vector<MyThread>(5);
        for (int i = 0; i < 5; i++) {
            MyThread thread_obj = new MyThread(((i * 70000) + 1), ((i + 1) * 70000));
            myVec.add(thread_obj);
        }

        long time_start = System.nanoTime();
        for (MyThread thr : myVec) {
            thr.start();
        }
        for (MyThread thr : myVec) {
            try {
                thr.join();
            } catch (Exception e) {
                System.out.println("An exception has occured:");
                e.printStackTrace();
            }
        }
        long elapsed_time = System.nanoTime() - time_start;
        float elapsed_seconds = (float) elapsed_time / 1000000000;
        System.out.println("5-threaded operation finished in " + elapsed_seconds + " seconds.");

        MyThread thread_obj2 = new MyThread(1, 350000);
        time_start = System.nanoTime();
        thread_obj2.start();
        try {
            thread_obj2.join();
        } catch (Exception e) {
            System.out.println("An exception has occured:");
            e.printStackTrace();
        }
        elapsed_time = System.nanoTime() - time_start;
        elapsed_seconds = (float) elapsed_time / 1000000000;
        System.out.println("Single-threaded operation finished in " + elapsed_seconds + " seconds.");
    }
}