public class BmiService {
    public int calculate(double height, double weight) {
        double amount = height * height;
        double index = weight / amount;
        int bmi = (int) index;
        return bmi;
    }
}
