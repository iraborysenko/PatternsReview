package Structural.Decorator;

public class BlackberryPhone extends PhoneDecorator {
    BlackberryPhone(Phone phone) {
        super(phone);
    }
    @Override
    public void printData() {
        super.printData();
        System.out.println("Blackberry features");
    }
}