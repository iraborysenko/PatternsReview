package Creational.AbstractFactory;

import Creational.AbstractFactory.enums.Colors;
import Creational.AbstractFactory.enums.Menus;

interface WidgetMenu {
    void setWidgetMenu();
}

class MenuHolder{
    static final WidgetMenu mainMenu = new MainMenu();
    static final WidgetMenu popUpMenu = new PopUpMenu();
    static final WidgetMenu pullDownMenu = new PullDownMenu();
    static final WidgetMenu radialMenu = new RadialMenu();
}

class MainMenu implements WidgetMenu {

    @Override
    public void setWidgetMenu() {
        System.out.println("It's a main menu.");
    }
}

class PopUpMenu implements WidgetMenu {

    @Override
    public void setWidgetMenu() {
        System.out.println("It's a popup menu.");
    }
}

class PullDownMenu implements WidgetMenu {

    @Override
    public void setWidgetMenu() {
        System.out.println("It's a pull down menu.");
    }
}

class RadialMenu implements WidgetMenu {

    @Override
    public void setWidgetMenu() {
        System.out.println("It's a radial menu.");
    }
}

class ShapeFactory extends AbstractFactory {

    @Override
    public WidgetMenu getMenu(Menus menu) {
        switch (menu)
        {
            case MAIN:
                return MenuHolder.mainMenu;
            case POPUP:
                return MenuHolder.popUpMenu;
            case PULLDOWN:
                return MenuHolder.pullDownMenu;
            case RADIAL:
                return MenuHolder.radialMenu;
            default:
                return null;
        }
    }

    @Override
    FrameColor getColor(Colors color) {
        return null;
    }
}