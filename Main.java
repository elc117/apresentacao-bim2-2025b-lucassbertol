abstract class Payment {
    public abstract void process();
}

class CreditCardPayment extends Payment {
    @Override
    public void process() {
	System.out.println("[CARTÃO DE CRÉDITO]");
        System.out.println("Processando transação...");
        System.out.println("Pagamento autorizado com sucesso!");
    }
}

class PayPalPayment extends Payment {
    @Override
    public void process() {
	System.out.println("[PAYPAL]");
        System.out.println("Pagamento realizado via saldo PayPal.");
        System.out.println("Enviando recibo para o email do cliente...");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();

        System.out.println("=== Iniciando pagamentos ===\n");
        p1.process();
        System.out.println();
        p2.process();
        System.out.println("\n=== Pagamentos finalizados ===");
    }
}
