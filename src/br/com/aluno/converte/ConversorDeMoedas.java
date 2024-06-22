package br.com.aluno.converte;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoedas {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/aee5e6edf8a309bf244a7958/latest/";
    private String moedaOrigem;
    private String moedaDestino;
    private double quantia;

    public ConversorDeMoedas(String moedaOrigem, String moedaDestino, double quantia) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.quantia = quantia;
    }

    public double converte() throws IOException, InterruptedException {
        String url = API_URL + moedaOrigem;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Falha ao obter taxa de câmbio: " + response.statusCode());
        }

        Gson gson = new Gson();
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
        JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");

        if (!conversionRates.has(moedaDestino)) {
            throw new RuntimeException("Moeda de destino inválida: " + moedaDestino);
        }

        double cotacao = conversionRates.get(moedaDestino).getAsDouble();
        return quantia * cotacao;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public double getQuantia() {
        return quantia;
    }
}
