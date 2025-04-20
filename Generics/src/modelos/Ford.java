package modelos;

public class Ford extends Carro {
    public Ford(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro Ford: " + getModelo());
    }
}
