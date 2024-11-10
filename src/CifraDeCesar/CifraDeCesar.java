package CifraDeCesar;

public class CifraDeCesar {

   private int deslocamento;

   public CifraDeCesar(int deslocamento){
    this.deslocamento = deslocamento;
   }

   public String codificar(String mensagem){
        StringBuilder resultado = new StringBuilder();

        for(char letra : mensagem.toCharArray()){
            if (Character.isLetter(letra)){
               char base = Character.isUpperCase(letra) ? 'A' : 'a';
               letra = (char) ((letra + deslocamento - base) % 26 + base);
            }
            resultado.append(letra);
        }
        return resultado.toString();
   }
}
