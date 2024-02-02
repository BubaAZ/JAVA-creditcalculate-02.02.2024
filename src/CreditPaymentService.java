public class CreditPaymentService {
    // loan=сумма кредита, period=срок  кредита в месяцах, rate=процентная ставка
    public double calculate(int loan, int period, double rate) {
        double percent = rate / 100 / 12; /* расчет месячной ставки */
        double payment = loan * ((percent * Math.pow((1 + percent), period * 12)) / (Math.pow((1 + percent), period * 12) - 1));
        return (int) payment;
    }
}
