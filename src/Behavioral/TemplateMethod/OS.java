package Behavioral.TemplateMethod;

public abstract class OS {

    protected abstract void installOS();

    protected abstract void configureOS();

    protected abstract void startOS();

    protected abstract void workOS();

    protected abstract void shutDownOs();

    public final void OneFullSession() {

        installOS();
        configureOS();
        startOS();
        workOS();
        shutDownOs();
    }

}