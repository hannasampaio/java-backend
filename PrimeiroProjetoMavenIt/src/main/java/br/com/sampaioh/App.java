package br.com.sampaioh;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        String json = "   {\"nome\":\"Hanna\",\"idade\":34}   ";

        json = StringUtils.trimToEmpty(json);

        Pessoa p = mapper.readValue(json, Pessoa.class);
        System.out.println(p.getNome());
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}
