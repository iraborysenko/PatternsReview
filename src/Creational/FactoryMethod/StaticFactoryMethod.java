package Creational.FactoryMethod;

public class StaticFactoryMethod {
    public static void main(String... args) {

        System.out.println(Mail.letterFrom("Mr. President"));
        System.out.println(Mail.letterAnonim());
        System.out.println(Mail.letterFromPresident());
        System.out.println(Mail.letterFrom("Best Friend"));
    }
}

class Mail {

    private Mail(String nameSender) {

    }

    static Mail letterFrom(String name) {
        return new Mail(name);
    }

    static Mail letterAnonim() {
        return new Mail("Anonim");
    }

    static Mail letterFromPresident() {
        String namePresident = "I'm President";
        return new Mail(namePresident);
    }

}
