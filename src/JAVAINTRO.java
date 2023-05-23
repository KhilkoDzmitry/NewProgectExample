

import java.util.Scanner;
  public class JAVAINTRO
{
    public static void main(String[] args){//Entry point-точка входа
        Scanner scanner = new Scanner(System.in);//пакеты класса сканнер не импортирются java.util., нужно вручную

        System.out.print("Введите name:");
        String name = scanner.nextLine();

        System.out.print("Введите surname:");
        String surname = scanner.nextLine();

        System.out.print("Введите age: ");
        int age = scanner.nextInt();

        System.out.print("Введите height: ");
        int height = scanner.nextInt();

        System.out.print("Введите weight: ");
        int weight = scanner.nextInt();

        System.out.println("Name:" + name);
        System.out.println("Surname:" + surname);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
    }

}


class Zadacha3 {
    public static void main(String[] args) {

        getBodyMassIndex();
    }

    public static void  getBodyMassIndex(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height: ");
        int height = scanner.nextInt();
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();
        double bmi = weight/((Math.pow(height * 0.01, 2)));
        System.out.println("Your BMI - " + bmi);
    }
}


class JAVADZ2 {
    public static void main(String[] args) {
        getSymbol();
    }
    public static void getSymbol(){
        char symbol = 'X';
        System.out.println(symbol + " - " + (int)symbol);
    }
}
