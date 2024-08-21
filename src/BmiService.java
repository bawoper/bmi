public class BmiService {
    public int calculate ( double rost, double wes) {
        double a = rost * 2;
        double x = wes / a;

        int bmi = (int) x;

        return bmi;


    }
}
