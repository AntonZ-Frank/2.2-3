public class CreditPaymentService {
    public double calculate(double years) {
        double month = years * 12;  // Расчет количества месяцев
        double degree = Math.pow(1.008325, month); // Расчет степени для формулы
        double payment = 1_000_000 * ((0.008325 * degree) / (degree - 1)); // формула ануитетного платежа за месяц
        payment = Math.round(payment); // Округляем
        return payment;
    }
}
