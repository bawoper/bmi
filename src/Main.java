public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
        double rost = 1.78;
        double wes = 78.8;
        int bmi = service.calculate (rost, wes);
        System.out.println(bmi + "_BMI");
    }
}