public class BmiServise {
    public double calculate(double weight, double hight) {
        double index = weight / (hight * hight);
        return index;
    }
}
