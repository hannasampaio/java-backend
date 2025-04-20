package modelos;

public class Toyota extends Carro {
    public Toyota(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro Toyota: " + getModelo());
    }
}