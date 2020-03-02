public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double years = 1; // выбираем количество лет.
        double payment = service.calculate(years);
        System.out.println(payment);

        years = 2; // выбираем количество лет.
        payment = service.calculate(years);
        System.out.println(payment);

        years = 3; // выбираем количество лет.
        payment = service.calculate(years);
        System.out.println(payment);
    }
}
