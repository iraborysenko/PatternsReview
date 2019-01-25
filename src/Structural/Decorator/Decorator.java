package Structural.Decorator;

public class Decorator {

    public static void main(String[] args) {
        System.out.println("\nPhone number 1\n");
        Phone phone = new AndroidPhone(new BasicPhone());
        phone.printData();
        System.out.println("\nPhone number 2\n");
        Phone phone1 = new IPhone(phone);
        phone1.printData();
        System.out.println("\nPhone number 3\n");
        Phone phone2 = new WindowsPhone(phone);
        phone2.printData();
        System.out.println("\nPhone number 4\n");
        Phone phone3 = new BlackberryPhone(phone2);
        phone3.printData();
    }

}
