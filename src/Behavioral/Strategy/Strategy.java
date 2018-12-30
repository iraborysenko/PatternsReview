package Behavioral.Strategy;

interface Algorithm {
    void execute(int[] arr);
}

class BubbleSort implements Algorithm {

    public void execute(int[] arr) {
        System.out.println("Executes babbleSort");
    }
}

class QuiqkSort implements Algorithm {

    public void execute(int[] arr) {
        System.out.println("Executes quickSort");
    }
}

class MergeSort implements Algorithm {

    public void execute(int[] arr) {
        System.out.println("Executes mergeSort");
    }
}

class Context {

    private Algorithm algorithm;

    public Context() {
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void executeAlgorithm(int[] arr) {
        algorithm.execute(arr);
    }
}

public class Strategy {

    public static void main(String... args) {

        int[] arr = {
                10, 20, 30,
                40, 50, 60,
                70, 80, 90, 100
        };

        Context context = new Context();

        context.setAlgorithm(new BubbleSort());
        context.executeAlgorithm(arr);

        context.setAlgorithm(new QuiqkSort());
        context.executeAlgorithm(arr);

        context.setAlgorithm(new MergeSort());
        context.executeAlgorithm(arr);
    }
}