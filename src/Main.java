public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.98;
        double weight = 76;
        int bmi = service.calculate(height, weight);
        System.out.println(bmi + "_BMI");
    }
}