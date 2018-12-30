package Creational.Builder;

public class Builder{
    public static void main(String... args){
        new JuiceMultiFruit.Builder(300, 90)
                .bananas(2)
                .apricots(5)
                .bunchOfGrapes(1)
                .apples(3)
                .build();
    }
}

class JuiceMultiFruit {
    private final int mililliters;
    private final int calories;
    private final int numberOfBananas;
    private final int numberOfApricots;
    private final int numberBunchOfGpapes;
    private final int numberOfApples;

    public static class Builder {
        private final int mililliters;
        private final int calories;

        private int numberOfBananas = 0;
        private int numberOfApricots = 0;
        private int numberBunchOfGrapes = 0;
        private int numberOfApples = 0;

        public Builder(int mililliters, int calories) {
            this.mililliters = mililliters;
            this.calories = calories;
        }

        public Builder bananas(int number) {
            numberOfBananas = number;
            return this;
        }

        public Builder apricots(int number) {
            numberOfApricots = number;
            return this;
        }

        public Builder bunchOfGrapes(int number) {
            numberBunchOfGrapes = number;
            return this;
        }

        public Builder apples(int number) {
            numberOfApples = number;
            return this;
        }

        public JuiceMultiFruit build() {
            return new JuiceMultiFruit(this);
        }
    }

    private JuiceMultiFruit(Builder builder) {
        mililliters = builder.mililliters;
        calories = builder.calories;
        numberOfBananas = builder.numberOfBananas;
        numberOfApricots = builder.numberOfApricots;
        numberBunchOfGpapes = builder.numberBunchOfGrapes;
        numberOfApples = builder.numberOfApples;
    }
}