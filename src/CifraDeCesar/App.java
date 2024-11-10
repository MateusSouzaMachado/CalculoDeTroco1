package CifraDeCesar;

public class App {
 public static void main(String[] args) {
    
 
    CifraDeCesar mensagem1  = new CifraDeCesar(3);
    System.out.println(mensagem1.codificar("Hello World"));
 }   
}
