public class Main {
    public static void main(String[] args) {

        float age = 40f ;
        float salary = 90_000f ;
        float annualRate = 1.10f ;
        if (age < 23) {annualRate = annualRate + 0.01f ;}
            else if (age >= 23 && age < 30) {annualRate = annualRate + 0.007f ;}
        if (salary > 80_000) {annualRate = annualRate - 0.007f ;}
        float term = 12f ;
        float wantedSum = 300_000f ;
        float payment = wantedSum / term * annualRate ;
        float maxPayment = salary * 0.5f ;
        if (maxPayment > payment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment +
                    " рублей. Платеж по кредиту " + payment + " рублей"); }
                else {
            System.out.println("Вам отказано"); }
        }}

//        if (payment > maxPayment) {
//            System.out.println("Отказано");
//        } else

//        System.out.println(payment);
//        System.out.println(annualRate);




//        if (age >= 23) {
//            if (salary >= 80_000) {
//                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*1.5*3 + " рублей");
//            } else if (salary >= 50_000 && salary < 80_000) {
//                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*1.2*3 + " рублей");
//            }} else  if (salary >= 80_000) {
//                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*1.5*2 + " рублей");
//        } else if (salary >= 50_000 && salary < 80_000) {
//            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*1.2*2 + " рублей");
//        } else System.out.println("Мы не можем выдать Вам кредитную карту");
//        }}
