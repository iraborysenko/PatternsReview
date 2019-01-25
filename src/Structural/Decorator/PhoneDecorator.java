package Structural.Decorator;

public class PhoneDecorator implements Phone {
    private Phone phone;
    PhoneDecorator(Phone phone) {
        this.phone = phone;
    }
    @Override
    public void printData() {
        this.phone.printData();
    }
}