public class Main {
    public static void main(String[] args) {
        System.out.println(faktorial(11));
    }

    public static int faktorial(int point) {
        if (point <= 1) {
            return 1;
        }
        return  point * faktorial(point - 1);
    }

}