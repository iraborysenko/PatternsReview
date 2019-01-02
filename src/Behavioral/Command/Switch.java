package Behavioral.Command;

public class Switch {
    private Command closeDoorCommand;
    private Command openDoorCommand;
    private Command putFoodCommand;
    private Command takeFoodCommand;

    Switch(Command closeDoorCommand, Command openDoorCommand, Command putFoodCommand, Command takeFoodCommand) {
        this.closeDoorCommand = closeDoorCommand;
        this.openDoorCommand = openDoorCommand;
        this.putFoodCommand = putFoodCommand;
        this.takeFoodCommand = takeFoodCommand;
    }

    public void closeDoor() {
        closeDoorCommand.execute();
    }

    public void putFood() {
        putFoodCommand.execute();
    }

    public void takeFood() {
        takeFoodCommand.execute();
    }

    public void openDoor() {
        openDoorCommand.execute();
    }
}

