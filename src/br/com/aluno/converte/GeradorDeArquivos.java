package br.com.aluno.converte;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorDeArquivos {

    public void geraArquivo(List<ConversorDeMoedas> conversores) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("Historico.json");
        escrita.write(gson.toJson(conversores));
        escrita.close();
    }
}
