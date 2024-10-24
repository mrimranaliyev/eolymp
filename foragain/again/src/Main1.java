public class Main1 {

    public static String main; {

        double a = InputUtil.reqemiTelebEt("a-nı daxil edin");
        double b = InputUtil.reqemiTelebEt("b-ni daxil edin");
        char operation = InputUtil.simvoluTelebEt("əməliyyatı daxil edin");
        double netice = MathUtil.hesabla(a, b, operation);
        System.out.println("netice" + netice);
    }

}



