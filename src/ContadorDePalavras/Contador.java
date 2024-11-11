package ContadorDePalavras;

public class Contador {
    public int contarPalavras(String frase) {
       
        if (frase == null || frase.isEmpty()) {
            return 0;
        }
        String[] palavras = frase.trim().split("\\s+");
        return palavras.length;
    }
}

