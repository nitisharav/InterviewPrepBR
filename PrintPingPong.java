// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        PingPong printer= new PingPong();
        Thread t1= new Thread(()->printer.printPing());
        Thread t2= new Thread(()->printer.printPong());
        
        t1.start();
        t2.start();
    }
}

class PingPong{
    private boolean pingTurn= true;
    
    public synchronized void printPing(){
        for(int i=0; i<5;i++){
            while(!pingTurn){
                try{
                    wait();
                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                
            }
            System.out.println(Thread.currentThread().getName()+" : Ping");
                pingTurn=false;
                notifyAll();
        }
    }
    public synchronized void printPong(){
        for(int i=0; i<5;i++){
            while(pingTurn){
                try{
                    wait();
                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
               
            }
             System.out.println(Thread.currentThread().getName()+" : Pong");
                pingTurn=true;
                notifyAll();
        }
    }
}
