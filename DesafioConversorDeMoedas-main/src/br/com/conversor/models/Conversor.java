package br.com.conversor.models;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    Gson gson = new GsonBuilder().create();



    public String conversao(double valor, String moedaEntrada, String moedaSaida) throws IOException, InterruptedException {

        String valorConvertido = String.valueOf(valor);
        String key = "3558e857b5b3868016ebc99c";
        String url = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + moedaEntrada +"/" +moedaSaida +"/" + valorConvertido;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        ConversaoExchangeRate conversao = gson.fromJson(json, ConversaoExchangeRate.class);
        String resultado = conversao.conversion_result();


    return resultado;
    }
}
