public class Create extends Thread{
// Prepare a Logic to print Thread name  for 10 times using Thread Concept
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("child Thread");
        }
    }
    public static void main(String[] args) {
        Create c = new Create();
        c.start();
        for(int i=0;i<5;i++){
            System.out.println("main Thread");
        }
    }
}
