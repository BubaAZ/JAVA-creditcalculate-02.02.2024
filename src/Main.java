public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1000000;
        int loanPeriod = 1;
        double interestRate = 9.99; // процентная ставка по кредиту
        double loanPayment = service.calculate(loanAmount, loanPeriod, interestRate);
        System.out.println("Ежемесячный платеж: " + loanPayment + " ₽");

        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 2, 9.99) + " рублей");

        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 3, 9.99) + " рублей");
    }
}
