package Behavioral.Command;

interface Command {
    void execute();
}

class Fridge {
    Fridge() {
    }

    public void openDoor() {
        System.out.println("The fridge is open now");
    }

    public void takeFood() {
        System.out.println("The food has been taken of a fridge");
    }

    public void putFood() {
        System.out.println("The food has been put in a fridge");
    }

    public void closeDoor() {
        System.out.println("The fridge is close now");
    }
}

class OpenTheDoorCommand implements Command {
    private Fridge theFridge;

    OpenTheDoorCommand(Fridge fridge) {
        this.theFridge = fridge;
    }

    public void execute() {
        theFridge.openDoor();
    }
}

class CloseTheDoorCommand implements Command {
    private Fridge theFridge;

    CloseTheDoorCommand(Fridge fridge) {
        this.theFridge = fridge;
    }

    public void execute() {
        theFridge.closeDoor();
    }
}

class PutTheFoodCommand implements Command {
    private Fridge theFridge;

    PutTheFoodCommand(Fridge fridge) {
        this.theFridge = fridge;
    }

    public void execute() {
        theFridge.putFood();
    }
}

class TakeTheFoodCommand implements Command {
    private Fridge theFridge;

    TakeTheFoodCommand(Fridge fridge) {
        this.theFridge = fridge;
    }

    public void execute() {
        theFridge.takeFood();
    }
}

public class TestCommand {
    public static void main(String... args) {
        Fridge fridge = new Fridge();
        Command closeTheDoorAction = new CloseTheDoorCommand(fridge);
        Command openTheDoorAction = new OpenTheDoorCommand(fridge);
        Command putTheFoodActon = new PutTheFoodCommand(fridge);
        Command takeTheFoodAction = new TakeTheFoodCommand(fridge);

        Switch s = new Switch(closeTheDoorAction, openTheDoorAction, putTheFoodActon, takeTheFoodAction);

        s.openDoor();
        s.putFood();
        s.takeFood();
        s.closeDoor();
    }
}