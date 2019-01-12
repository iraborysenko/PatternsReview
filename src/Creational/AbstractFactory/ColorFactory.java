package Creational.AbstractFactory;

import Creational.AbstractFactory.enums.Colors;
import Creational.AbstractFactory.enums.Menus;

interface FrameColor {
    void setColor();
}

class ColorHolder{
    static final FrameColor whiteColor = new White();
    static final FrameColor foggyColor = new Foggy();
    static final FrameColor blueColor = new Blue();
    static final FrameColor lilacColor = new Lilac();
}

class White implements FrameColor {

    @Override
    public void setColor() {
        System.out.println("It's a white color.");
    }
}

class Foggy implements FrameColor {

    @Override
    public void setColor() {
        System.out.println("It's a foggy color.");
    }
}

class Blue implements FrameColor {

    @Override
    public void setColor() {
        System.out.println("It's a blue color.");
    }
}

class Lilac implements FrameColor {

    @Override
    public void setColor() {
        System.out.println("It's a lilac color.");
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    public WidgetMenu getMenu(Menus menu) {
        return null;
    }

    @Override
    FrameColor getColor(Colors color) {

        switch(color)
        {
            case WHITE:
                return ColorHolder.whiteColor;
            case FOGGY:
                return ColorHolder.foggyColor;
            case BLUE:
                return ColorHolder.blueColor;
            case LILAC:
                return ColorHolder.lilacColor;
            default:
                return null;
        }
    }

}
