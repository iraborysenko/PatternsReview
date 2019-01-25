package Structural.Decorator;

public class AndroidPhone extends PhoneDecorator {
    AndroidPhone(Phone phone) {
        super(phone);
    }
    @Override
    public void printData() {
        super.printData();
        System.out.println("Android features");
    }
}