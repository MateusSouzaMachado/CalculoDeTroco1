package ContadorDePalavras;

public class App {
    public static void main(String[] args) {
        Contador c1 = new Contador();

        System.out.println(c1.contarPalavras("Este é um exercício de contagem de palavras"));
        System.out.println(c1.contarPalavras("Programar é divertido"));
        System.out.println(c1.contarPalavras(" helllo   a s s"));
    }
}
