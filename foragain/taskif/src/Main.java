public class Main {
    public static void main(String[] args) {


        for (int j = 0; j < 3; j++){
            System.out.print("*");
            for (int i = 0; i < 5; i++) {
                if (i==2){
                    System.out.print("#");
                    continue;
                }
                    System.out.print(" ");
            }
            System.out.println("*");

        }
    }
}