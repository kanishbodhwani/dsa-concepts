
// Through extending thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Running!");
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}



// Through runnable
//class MyThread implements Runnable {
//    public void run() {
//        System.out.println("Running main thread");
//    }
//}
//
//public class Threads {
//    public static void main(String[] args) {
//        MyThread r = new MyThread();
//        Thread t = new Thread(r);
//        t.start();
//    }
//}