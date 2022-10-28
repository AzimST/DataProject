package java;
import java.util.Random;

public class Neuron {

    static double[] weightArray = new double[4];
    // static double[] inputArray = new double[4];

    public Neuron() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            weightArray[i] = random.nextDouble(1);
        }
    }

    public double calculate(double[] inputArray) {
        double sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i] + weightArray[i];
        }
        return sum;
    }

    public void increaseWeight(double landa) {
        for (int i = 0; i < weightArray.length; i++) {
            weightArray[i] += landa;
        }
    }

    public void decreaseWeight(double landa) {
        for (int i = 0; i < weightArray.length; i++) {
            weightArray[i] -= landa;
        }
    }

    public double[] getWeightArray() {
        return weightArray;
    }

    public void setWeightArray(double[] weightArray) {
        Neuron.weightArray = weightArray;
    }

}
