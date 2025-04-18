package br.com.sampaioh.factory;

public class FabricaFiat implements FabricaDeCarro {
    @Override
    public Carro criarCarroPopular(String modelo) {
        return new CarroPopular(modelo);
    }

    @Override
    public Carro criarCarroLuxo(String modelo) {
        return new CarroLuxo(modelo);
    }
}