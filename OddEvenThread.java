// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        new Thread(()->{
            for(int i=1; i<=10;i+=2){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }).start();
        new Thread(()->{
            for(int i=0; i<=10;i+=2){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }).start();
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Ensure one thread finishes before another starts
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
      Thread t1=  new Thread(()->{
            for(int i=1; i<=10;i+=2){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        });
      Thread t2=  new Thread(()->{
            for(int i=0; i<=10;i+=2){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        });
        t1.start();
       
        
         
        
      
      try {
          t1.join();
         
      } catch(InterruptedException e){
           
      }
       
         t2.start();
        
    }
}
