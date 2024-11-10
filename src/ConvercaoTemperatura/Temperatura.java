package ConvercaoTemperatura;

public class Temperatura {

    private Double temperatura;

    public Temperatura(Double temperatura){
        this.temperatura = temperatura;
    }

    public String Convercao(String unidadeOrigem, String unidadeDestino){
        Double convercao;
        if (unidadeOrigem.equalsIgnoreCase("c")){
            if (unidadeDestino.equalsIgnoreCase("f")) {
             convercao = (this.temperatura * 9 / 5) + 32;
            return String.format("Temperatura convertida %.2f F", convercao);
        }else if (unidadeDestino.equalsIgnoreCase("k")) {
            convercao = this.temperatura + 273.15;
            return String.format("Temperatura convertida %.2f K", convercao);
        }else{
            return "Função invalida";
        }
        }else if(unidadeOrigem.equalsIgnoreCase("f")){
            convercao = (this.temperatura - 32) * 5/9;
            return String.format("Temperatura convertida %.2f C", convercao);
        }else if(unidadeOrigem.equalsIgnoreCase("k")){
            convercao = this.temperatura - 273.15;
            return String.format("Temperatura convertida %.2f C", convercao);
        }else{
            return "Função invalida";
        }

    }
}
