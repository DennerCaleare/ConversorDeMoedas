package br.com.conversor.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SalvaArquivoRequisicao {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private String data;
    private String hora;
    private String datahora;

    public void salvaJson(CriaArquivoRequisicao arquivo) throws IOException {
        this.data = arquivo.getData();
        this.hora = arquivo.getHora();
        datahora = data + "-" + hora .replace(":", "-");
        FileWriter escrita = new FileWriter(datahora+ ".json");
        escrita.write(gson.toJson(arquivo));
        escrita.close();
    }


    public void salvaLista(List<CriaArquivoRequisicao> consultas) {
    }
}
