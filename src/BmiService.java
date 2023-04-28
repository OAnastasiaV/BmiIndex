public class BmiService {

    public double calculate(double m, double h) {
 //     int bmiIndex = m / (h * h):
        double h2 = h * h;
        double bmiIndex = m / h2;
        return bmiIndex;
    }
}
