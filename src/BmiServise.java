public class BmiServise {
    public double calculate(double weight, double hight) {
        double Bmi = weight / (hight * hight);
        return Bmi;
    }
}
