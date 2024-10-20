import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("menyunu daxil edin: ");
        int m = new Scanner(System.in).nextInt();

//        if (m == 1){
//            System.out.println("1-ci kanala baxirsiniz");
//        }
//        else if (m == 2){
//            System.out.println("2-ci kanala baxirsiniz");
//        }
//        else if (m == 0){
//            System.out.println("televizor sessizdedi");
//        } else if (m == -1) {
//            System.out.println("televizor sondu");
//        }
//         else {
//            System.out.println("yanlish duymeye basdiniz");
//        }
         switch (m){
             case 1:
                 System.out.println("1-ci kanala baxirsiniz");
                 break;
             case 2:
                 System.out.println("2-ci kanala baxirsiniz");
                 break;
             case 0:
                 System.out.println("televizor sessizdedi");
                 break;
             case-1:
                 System.out.println("televizor sondu");
                 break;
             default:
                 System.out.println("yanlish menyu");
         }
        }

    }
