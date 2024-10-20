public class Main {
    public static void main(String[] args) {

        for (int a = 0; a < 3; a++) {
            for (int i = 0; i < 1; i++) {
                System.out.print("*");
                for (int j = 0; j < 1; j++) {
                    System.out.print("   ");
                    System.out.println("*");
                    for (int k = 0; k < 2; k++) {
                        System.out.print("=====");
                        for (int n = 0; n < 1; n++) {
                            System.out.println("     ");
                        }
                    }
                }
            }
        }
    }
}
