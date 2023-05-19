

import java.util.Scanner;//импортировали
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

        System.out.println("Name: " + name + "\n"
                + "Surname: " + surname + "\n"
                + "Age: " + age + "\n"
                + "Height: " + height + "\n"
                + "Weight: " + weight + "\n");






    }

}