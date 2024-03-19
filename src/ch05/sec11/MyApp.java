package ch05.sec11;

public class MyApp {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("인자 " + (i+1) + ": " + args[i]);
        }
    }
}