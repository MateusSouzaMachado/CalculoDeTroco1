package ConvercaoTemperatura;

public class App {
    public static void main(String[] args) {
        Temperatura t1 = new Temperatura(100.00);
        System.out.println(t1.Conversao("F", "C"));
    }
}
