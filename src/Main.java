public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double years = 1;                                 // выбираем количество лет.
        double amounthCredit = 1_000_000;                 // cумма кредита.
        double percentCredit = 9.99;                      // % ставка
        double payment = service.calculate(years, amounthCredit, percentCredit);
        System.out.println(Math.round(payment));
// 1й
        years = 2;
        amounthCredit = 1_000_000;
        percentCredit = 9.99;
        payment = service.calculate(years, amounthCredit, percentCredit);
        System.out.println(Math.round(payment));
// 2й
        years = 3;
        amounthCredit = 1_000_000;
        percentCredit = 9.99;
        payment = service.calculate(years, amounthCredit, percentCredit);
        System.out.println(Math.round(payment));
// 3й
    }
}








