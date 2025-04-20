package modelos;

public class Honda extends Carro {

    public Honda(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro Honda: " + getModelo());
    }
}

