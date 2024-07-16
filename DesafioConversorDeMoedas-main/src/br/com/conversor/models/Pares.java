package br.com.conversor.models;

public class Pares {
    private String moedaEntrada;
    private String moedaSaida;

    public String getMoedaEntrada() {
        return moedaEntrada;
    }

    public String getMoedaSaida() {
        return moedaSaida;
    }

    private void setMoedaEntrada(String moedaEntrada) {
        this.moedaEntrada = moedaEntrada;
    }

    private void setMoedaSaida(String moedaSaida) {
        this.moedaSaida = moedaSaida;
    }

    public void conversorOpcao(int opcao){

        switch(opcao){
            case 1:
                setMoedaEntrada("USD");
                setMoedaSaida("BRL");
                break;
            case 2:
                setMoedaEntrada("USD");
                setMoedaSaida("CAD");
                break;
            case 3:
                setMoedaEntrada("CAD");
                setMoedaSaida("USD");
                break;
            case 4:
                setMoedaEntrada("CAD");
                setMoedaSaida("BRL");
                break;
            case 5:
                setMoedaEntrada("BRL");
                setMoedaSaida("USD");
                break;
            case 6:
                setMoedaEntrada("BRL");
                setMoedaSaida("CAD");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
