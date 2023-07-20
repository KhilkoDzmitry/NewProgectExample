package CC;

public class MyMain {
    public static void main(String[] args) {
        CreditCard tbc = new CreditCard("2356563289654563", 658);
        CreditCard bog = new CreditCard("4562325645632569", 655);
        CreditCard paysera = new CreditCard("1233211231111111", 900);

        System.out.println(tbc.getCreditCardinfo());
        System.out.println();
        System.out.println(bog.getCreditCardinfo());
        System.out.println();
        System.out.println(paysera.getCreditCardinfo());
        System.out.println();

        tbc.addMoney(967);
        bog.addMoney(20);
        paysera.withdraw(52);

        System.out.println();

        System.out.println(tbc.getCreditCardinfo());
        System.out.println();
        System.out.println(bog.getCreditCardinfo());
        System.out.println();
        System.out.println(paysera.getCreditCardinfo());
        System.out.println();
        System.out.println("--------------------------------------------");

        tbc.addMoney(-1000);
        System.out.println("You balance is:" + tbc.getBalance());
        tbc.withdraw(2000);


    }




}






