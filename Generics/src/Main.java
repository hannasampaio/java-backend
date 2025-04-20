import modelos.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Honda("Honda Civic"));
        listaDeCarros.add(new Toyota("Toyota Yaris"));
        listaDeCarros.add(new Ford("Ford Ka"));
        listaDeCarros.add(new Chevrolet("Chevrolet Spin"));


        System.out.println("============= Lista de Carros =============\n");


        for (Carro carro : listaDeCarros) {
            carro.exibirInfo();
        }

    }
}
