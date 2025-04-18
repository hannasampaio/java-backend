package br.com.sampaioh.factory;

public class CarroLuxo implements Carro {
    private String modelo;

    public CarroLuxo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro de luxo criado: " + modelo);
    }
}
