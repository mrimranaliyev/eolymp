import java.util.Random;

public class Main {
    public static void main(String[] args) {
      int [] num=new int[30] ;
        Random random1 = new Random();
      for (int i = 0; i < 30; i++) {
          num[i] = random1.nextInt(-100,100);
          System.out.println(i);
      }



    }
}