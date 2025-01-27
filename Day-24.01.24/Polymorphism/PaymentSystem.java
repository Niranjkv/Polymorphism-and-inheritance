package Polymorphism;
class Payment {
    public void makePayment() {
        System.out.println("Making a generic payment.");
    }
}


class CreditCardPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Making a credit card payment.");
    }
}

class PayPalPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Making a PayPal payment.");
    }
}

class BankTransferPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Making a bank transfer payment.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment;

        
        payment = new CreditCardPayment();
        payment.makePayment();

        payment = new PayPalPayment();
        payment.makePayment();

        payment = new BankTransferPayment();
        payment.makePayment();
    }
}
