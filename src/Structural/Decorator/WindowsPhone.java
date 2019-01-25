package Structural.Decorator;

public class WindowsPhone extends PhoneDecorator {
    WindowsPhone(Phone phone) {
        super(phone);
    }
    @Override
    public void printData() {
        super.printData();
        System.out.println("Windows features");
    }
}