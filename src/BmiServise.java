public class BmiServise {
    public int calculate(int weight, double hight) {
        double index = weight / (hight * hight);
        return (int) index;
    }
}
