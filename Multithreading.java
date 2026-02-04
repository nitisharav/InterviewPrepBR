
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //using anonymous class implementing runnable interface
        Runnable r= new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<5; i++){
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        };
        Thread t1= new Thread(r);
        t1.start();
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //using anonymous class extending Thread class
        Thread r= new Thread(){
            @Override
            public void run(){
                for(int i=0;i<5; i++){
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        };
       // Thread t1= new Thread(r);
        r.start();
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Thread t1 = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        });
        t1.start();
    }
}
/*
What’s happening (interview-friendly explanation)

Thread t1 = new Thread(...) → creates a new thread object

Lambda () → implements Runnable

start() → creates a new call stack and runs code in parallel

Never call run() directly (that runs on main thread)
*/
