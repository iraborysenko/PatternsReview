package Structural.Decorator;

public interface Phone {
    void printData();
}
class BasicPhone implements Phone {
    @Override
    public void printData() {
        System.out.println("Basic Phone\n");
    }
}