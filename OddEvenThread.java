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
