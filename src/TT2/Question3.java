package TT2;

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        Thread ANtuda=new JoyBangla();
       // ANtuda.setDaemon(true);
        ANtuda.start();
        for(int i=0;i<5;i++){

            try {
                Thread.sleep(200);
                ANtuda.join();
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread 1 is end ");
    }
}
class JoyBangla extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread 2 is end");

    }

}
