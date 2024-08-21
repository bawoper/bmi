public class BmiService {
    public int calculate(double height, double weight) {
        double amount = height * 2;
        double index = weight / amount;
        int bmi = (int) index;
        return bmi;
    }
}
