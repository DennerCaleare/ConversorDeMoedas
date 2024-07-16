package br.com.conversor.models;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CriaArquivoRequisicao {
    private String moedaEntrada;
    private String moedaSaida;
    private String valor;
    private String data;
    private String hora;
    private String valorConvertido;


    public void define(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatterDataInvertida = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        data = agora.format(formatterDataInvertida);
        hora = agora.format(formatterHora);
    }

    public String getMoedaEntrada() {
        return moedaEntrada;
    }

    public String getMoedaSaida() {
        return moedaSaida;
    }

    public String getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public CriaArquivoRequisicao(String moedaEntrada, String moedaSaida, String valor, String valorConvertido) {
        this.moedaEntrada = moedaEntrada;
        this.moedaSaida = moedaSaida;
        this.valor = valor;
        define();
        this.data = getData();
        this.hora = getHora();
        this.valorConvertido = valorConvertido;

    }



    @Override
    public String toString() {
        return "{Entrada: '" + moedaEntrada + '\'' +
                ", Saída: '" + moedaSaida + '\'' +
                ", valor: " + valor + '\'' +
                ", totalConvertido: " + valorConvertido + '}';
    }
}
