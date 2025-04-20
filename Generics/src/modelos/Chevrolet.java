package modelos;

public class Chevrolet extends Carro {
    public Chevrolet(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro Chevrolet: " + getModelo());
    }
}
