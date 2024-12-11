package CalculaTroco;
import java.util.ArrayList;
import java.util.List;

public class Troco {

    private double valor;

    public String calcularTroco(double valorCompra,double valorEntregre){
        this.valor =valorEntregre - valorCompra;
        List<String> listaDeNotas = new ArrayList<>();

        listaDeNotas.add("NOTAS:");
        calculo(100.00, listaDeNotas);
        calculo(50.00, listaDeNotas);
        calculo(20.00, listaDeNotas);
        calculo(10.00, listaDeNotas);
        calculo(5.00, listaDeNotas);
        calculo(2.00, listaDeNotas);
        listaDeNotas.add("MOEDAS:");
        calculo(1.00, listaDeNotas);
        calculo(0.50, listaDeNotas);
        calculo(0.25, listaDeNotas);
        calculo(0.10, listaDeNotas);
        calculo(0.05, listaDeNotas);
        calculo(0.01, listaDeNotas);
        return String.join("\n", listaDeNotas);
    }

    public void calculo(double valorDaNota,List<String> lista){
        if (this.valor >= valorDaNota) {
            for(int i = 1; this.valor >= valorDaNota; i++){
                this.valor = this.valor - valorDaNota;
                if (this.valor < valorDaNota) {
                lista.add(i + " notas de " + valorDaNota);
                }
            }
        }else{
            lista.add(0 + " notas de " + valorDaNota);
        }
    }

}
