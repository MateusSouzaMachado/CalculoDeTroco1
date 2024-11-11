package ConvercaoTemperatura;

public class Temperatura {

    private Double temperatura;

    public Temperatura(Double temperatura){
        this.temperatura = temperatura;
    }

    public String Conversao(String unidadeOrigem, String unidadeDestino){
        Double conversao;
        if (unidadeOrigem.equalsIgnoreCase("c")){
            if (unidadeDestino.equalsIgnoreCase("f")) {
             conversao = (this.temperatura * 9 / 5) + 32;
            return String.format("Temperatura convertida %.2f F", conversao);
        }else if (unidadeDestino.equalsIgnoreCase("k")) {
            conversao = this.temperatura + 273.15;
            return String.format("Temperatura convertida %.2f K", conversao);
        }else{
            return "Função invalida";
        }
        }else if(unidadeOrigem.equalsIgnoreCase("f")){
            conversao = (this.temperatura - 32) * 5/9;
            return String.format("Temperatura convertida %.2f C", conversao);
        }else if(unidadeOrigem.equalsIgnoreCase("k")){
            conversao = this.temperatura - 273.15;
            return String.format("Temperatura convertida %.2f C", conversao);
        }else{
            return "Função invalida";
        }

    }
}
