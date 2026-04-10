package thread;

public class SynchronizedDemo {
    public static void main(String[] args) {
        ScoreKeeper score = new ScoreKeeper();
        Thread[] t2Array = new Thread[20];
        for (int i = 0; i<20; i++){
            t2Array[i] = new Thread(() -> {
                score.decrementScore();

            });

        }
        System.out.println("hello world ");


    }
    
}
// public class ScoreKeeper {
//     int score = 5;
//      synchronized void decrementScore() {
//         if (score > 0) {
//             try{
//                 Thread.sleep(10);

//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//              score = score-1;
//              System.out.println("the score is " + score);
            
//         }
     

    


