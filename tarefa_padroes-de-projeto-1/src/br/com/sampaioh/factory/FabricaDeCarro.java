package br.com.sampaioh.factory;

public interface FabricaDeCarro {
    Carro criarCarroPopular(String modelo);
    Carro criarCarroLuxo(String modelo);
}
