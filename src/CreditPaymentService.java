public class CreditPaymentService {
    public double calculate(double years, double amounthCredit, double percentCredit) {
        double monthinYear = 12;                                        //месяце в году.
        double month = years * monthinYear;                             // Расчет количества месяцев, в течении которых выплачивается кредит.
        double percentRatio = percentCredit / 100 / monthinYear;        // месячная % ставка по кредиту.
        double degree = Math.pow(1 + percentRatio, month);              // Расчет степени в формуле коэф. аннуитета
        double annuityRatio = ((percentRatio * degree) / (degree - 1)); // коэф. аннуитета
        double payment = amounthCredit * annuityRatio;                  // ежемесячный платеж
        payment = Math.round(payment);                                  // Округляем
        return payment;
    }
}
