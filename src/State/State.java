package State;

import java.util.Random;

public interface State {
    void doAction(Context context);
}

class StateHolder {
    static final State startCleaner = new StartCleaner();
    static final State closeCleaner = new CloseCleaner();
    static final State defragDisk = new DefragDisk();
    static final State cleanRegister = new CleanRegister();
    static final State setAutoload = new SetAutoload();
}

class Context {
    private State state;

    Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void startDefrag() {

    }

    public void searchForDataToDel() {

    }

    public void chooseStatusOfProg() {

    }

    public void endAllProcess() {

    }

    public void doAction() {
        state.doAction(this);
    }

}

class RandomState {
    public static CleanerStateTypes getRandomState() {
        Random random = new Random();
        return CleanerStateTypes.values()[random.nextInt(CleanerStateTypes.values().length)];
    }
}

class StartCleaner implements State {

    @Override
    public void doAction(Context context) {

        switch (RandomState.getRandomState()) {
            case DEFRAG:
                context.startDefrag();
                context.setState(StateHolder.defragDisk);
                System.out.println("Defragmentation");
                break;
            case CLEANREG:
                context.searchForDataToDel();
                context.setState(StateHolder.cleanRegister);
                System.out.println("Cleaning");
                break;
            case AUTOLOAD:
                context.chooseStatusOfProg();
                context.setState(StateHolder.setAutoload);
                System.out.println("Autoloading");
                break;
            case CLOSE:
                context.endAllProcess();
                context.setState(StateHolder.closeCleaner);
                System.out.println("Closing");
                break;
        }
    }
}

class DefragDisk implements State {

    @Override
    public void doAction(Context context) {
        switch (RandomState.getRandomState()) {
            case CLEANREG:
                context.searchForDataToDel();
                context.setState(StateHolder.cleanRegister);
                System.out.println("CleanRegister");
                break;
            case AUTOLOAD:
                context.chooseStatusOfProg();
                context.setState(StateHolder.setAutoload);
                System.out.println("SetAutoload");
                break;
            case CLOSE:
                context.endAllProcess();
                context.setState(StateHolder.closeCleaner);
                System.out.println("CloseCleaner");
                break;
            default:
                context.setState(StateHolder.defragDisk);
                context.doAction();
                break;
        }
    }
}

class CleanRegister implements State {

    @Override
    public void doAction(Context context) {
        switch (RandomState.getRandomState()) {
            case DEFRAG:
                context.startDefrag();
                context.setState(StateHolder.defragDisk);
                System.out.println("DefragDisk");
                break;
            case AUTOLOAD:
                context.chooseStatusOfProg();
                context.setState(StateHolder.setAutoload);
                System.out.println("SetAutoload");
                break;
            case CLOSE:
                context.endAllProcess();
                context.setState(StateHolder.closeCleaner);
                System.out.println("CloseCleaner");
                break;
            default:
                context.setState(StateHolder.cleanRegister);
                context.doAction();
                break;
        }
    }
}

class SetAutoload implements State {

    @Override
    public void doAction(Context context) {
        switch (RandomState.getRandomState()) {
            case DEFRAG:
                context.startDefrag();
                context.setState(StateHolder.defragDisk);
                System.out.println("DefragDisk");
                break;
            case CLEANREG:
                context.searchForDataToDel();
                context.setState(StateHolder.cleanRegister);
                System.out.println("SetAutoload");
                break;
            case CLOSE:
                context.endAllProcess();
                context.setState(StateHolder.closeCleaner);
                System.out.println("CloseCleaner");
                break;
            default:
                context.setState(StateHolder.setAutoload);
                context.doAction();
                System.out.println("SetAutoload");
                break;
        }
    }
}

class CloseCleaner implements State {

    @Override
    public void doAction(Context context) {
        context.endAllProcess();
        context.setState(StateHolder.closeCleaner);
    }
}

class TestState {
    public static void main(String... args) {
        final Context context = new Context();

        context.setState(StateHolder.startCleaner);

        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
    }
}