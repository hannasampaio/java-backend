public class ConversaoWrapper {
    public static void main(String[] args) {
        int valor1 = 100;
        int valor2 = 200;

        Integer wrapper1 = valor1;
        Integer wrapper2 = valor1;

        Integer wrapper3 = valor2;
        Integer wrapper4 = valor2;

        System.out.println("---- Conversão entre Primitivo e Wrapper ----");
        System.out.println("Primitivo 1: " + valor1);
        System.out.println("Wrapper 1: " + wrapper1);
        System.out.println("Primitivo 2: " + valor2);
        System.out.println("Wrapper 3: " + wrapper3);

        System.out.println("\n---- Caching ----");
        System.out.println("wrapper1 == wrapper2: " + (wrapper1 == wrapper2));
        System.out.println("wrapper3 == wrapper4: " + (wrapper3 == wrapper4));
    }
}

