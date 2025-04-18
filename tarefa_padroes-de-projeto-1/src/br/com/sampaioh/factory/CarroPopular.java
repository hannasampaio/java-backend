package br.com.sampaioh.factory;

public class CarroPopular implements Carro {
    private String modelo;

    public CarroPopular(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro popular criado: " + modelo);
    }
}
