package Behavioral.TemplateMethod;

class Linux extends OS {

    @Override
    protected void installOS() {
        System.out.println("linux");
    }

    @Override
    protected void configureOS() {
        // something we need
    }

    @Override
    protected void startOS() {
        // something we need
    }

    @Override
    protected void workOS() {
        // something we need
    }

    @Override
    protected void shutDownOs() {
        // something we need
    }

}

class Windows extends OS {

    @Override
    protected void installOS() {
        System.out.println("windows");
        // something we need
    }

    @Override
    protected void configureOS() {
        // something we need
    }

    @Override
    protected void startOS() {
        // something we need
    }

    @Override
    protected void workOS() {
        // something we need
    }

    @Override
    protected void shutDownOs() {
        // something we need
    }

}

public class TemplateMethod {

    public static void main(String... args) {
        OS linux = new Linux();
        linux.OneFullSession();
        OS windows = new Windows();
        windows.OneFullSession();
    }

}