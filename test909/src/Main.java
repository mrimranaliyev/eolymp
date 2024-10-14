public class Main {
    public static void main(String[] args) {

        String text = "hello world how are you ";
        String[] sözlər = text.trim().split("\\s+");
        int sözSayı = sözlər.length;
        System.out.println("Sözlərin sayı: " + sözSayı);
    }
}