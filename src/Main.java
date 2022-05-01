public class Main {
    public static void main(String[] args) {

        float age = 19f ;
        float salary = 45_000f ;
        if (age >= 23) {
            if (salary >= 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*1.5*3 + " рублей");
            } else if (salary >= 50_000 && salary < 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*1.2*3 + " рублей");
            }} else  if (salary >= 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*1.5*2 + " рублей");
        } else if (salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*1.2*2 + " рублей");
        } else System.out.println("Мы не можем выдать Вам кредитную карту");
        }}
