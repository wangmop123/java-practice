package thread;


    public class ScoreKeeper {
        int score = 5;
         synchronized void decrementScore() {
            if (score > 0) {
                try{
                    Thread.sleep(10);
                  
    
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                 score = score-1;
                 System.out.println("the score is " + score);
                
            }
}
    }
