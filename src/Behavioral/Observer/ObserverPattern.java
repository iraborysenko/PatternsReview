package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

    public static void main(String[] args) {

        Baby baby = new Baby();

        baby.attachObserver(new Mother());
        baby.attachObserver(new Dog());
        baby.attachObserver(new DogMaster());

        System.out.println("Baby play in sandbox.");
        baby.setState(State.STATE_BABY_PLAY);
        System.out.println("Baby noticed the dog. Baby does to a dog.");
        baby.setState(State.STATE_BABY_GO);
        System.out.println("Baby fell.");
        baby.setState(State.STATE_BABY_FALL);
        System.out.println("Baby starts to cry.");
        baby.setState(State.STATE_BABY_CRY);

//        baby.babyPlay();
//        baby.babyDog();
//        baby.babyFall();
//        baby.babyCry();

    }

    interface Observable {
        void attachObserver(Observer observer);

        void detachObsever(Observer observer);

        void notifyObservers();
    }

    interface Observer {
        void onNotify();
    }

    static class Baby implements Observable {

        final private List<Observer> mObservers = new ArrayList<Observer>();

        private static State mState;


        public static State getState() {
            return mState;
        }

        void setState(State mState) {
            Baby.mState = mState;
            notifyObservers();
        }

        @Override
        public void attachObserver(Observer observer) {
            mObservers.add(observer);
        }

        @Override
        public void detachObsever(Observer observer) {
            mObservers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            for (Observer o : mObservers) {
                o.onNotify();
            }
        }

//        void babyPlay() {
//            System.out.println("Baby play in sandbox.");
//            mState = State.STATE_BABY_PLAY;
//            notifyObservers(mState);
//        }
//
//        void babyDog() {
//            System.out.println("Baby noticed the dog. Baby does to a dog.");
//            mState = State.STATE_BABY_GO;
//            notifyObservers(mState);
//        }
//
//        void babyFall() {
//            System.out.println("Baby fell.");
//            mState = State.STATE_BABY_FALL;
//            notifyObservers(mState);
//        }
//
//        void babyCry()  {
//            System.out.println("Baby starts to cry.");
//            mState = State.STATE_BABY_CRY;
//            notifyObservers(mState);
//        }

    }

    static class Mother implements Observer {

        @Override
        public void onNotify() {

            switch (Baby.getState()) {
                case STATE_BABY_PLAY:
                    System.out.println("Mother talks to the other mothers.");
                    break;
                case STATE_BABY_GO:
                    System.out.println("Mother watching a baby.");
                    break;
                case STATE_BABY_FALL:
                    System.out.println("Mother runs to a baby.");
                    break;
                case STATE_BABY_CRY:
                    System.out.println("Mother seeking baby injury.");
                    break;
                default:
                    break;
            }
        }
    }

    static class Dog implements Observer {

        @Override
        public void onNotify() {

            switch (Baby.getState()) {
                case STATE_BABY_PLAY:
                    System.out.println("Dog is looking for a bone.");
                    break;
                case STATE_BABY_GO:
                    System.out.println("Dog begins to run.");
                    break;
                case STATE_BABY_FALL:
                    System.out.println("Dog stopped.");
                    break;
                case STATE_BABY_CRY:
                    System.out.println("Dog goes away.");
                    break;
                default:
                    break;
            }
        }
    }

    static class DogMaster implements Observer {

        @Override
        public void onNotify() {

            switch (Baby.getState()) {
                case STATE_BABY_PLAY:
                    System.out.println("Dog master is on the phone.");
                    break;
                case STATE_BABY_GO:
                    System.out.println("Dog master follow dog.");
                    break;
                case STATE_BABY_CRY:
                    System.out.println("Dog master doesn't hear voice from phone because of yell.");
                    break;
                default:
                    break;
            }
        }
    }

    enum State {
        STATE_BABY_PLAY, STATE_BABY_GO, STATE_BABY_FALL, STATE_BABY_CRY
    }

}
