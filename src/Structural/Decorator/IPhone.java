package Structural.Decorator;

public class IPhone extends PhoneDecorator {
    IPhone(Phone phone) {
        super(phone);
    }
    @Override
    public void printData() {
        super.printData();
        System.out.println("iPhone features");
    }
}