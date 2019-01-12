package Creational.AbstractFactory;

import Creational.AbstractFactory.enums.Colors;
import Creational.AbstractFactory.enums.Menus;

public class TestAbstractFactory {
    public static void main(String... args) {

        AbstractFactory menuFactory = FactoryProducer.getFactory("MENU");
        assert menuFactory != null;

        WidgetMenu menu1 = menuFactory.getMenu(Menus.MAIN);
        menu1.setWidgetMenu();

        WidgetMenu menu2 = menuFactory.getMenu(Menus.POPUP);
        menu2.setWidgetMenu();

        WidgetMenu menu3 = menuFactory.getMenu(Menus.PULLDOWN);
        menu3.setWidgetMenu();

        WidgetMenu menu4 = menuFactory.getMenu(Menus.RADIAL);
        menu4.setWidgetMenu();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        assert colorFactory != null;

        FrameColor color1 = colorFactory.getColor(Colors.WHITE);
        color1.setColor();

        FrameColor color2 = colorFactory.getColor(Colors.FOGGY);
        color2.setColor();

        FrameColor color3 = colorFactory.getColor(Colors.BLUE);
        color3.setColor();

        FrameColor color4 = colorFactory.getColor(Colors.LILAC);
        color4.setColor();
    }
}