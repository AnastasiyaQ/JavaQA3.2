public class Main {
    public static void main(String[] args) {
        BmiServise service = new BmiServise();
        double hight = 1.87;
        double weight = 98;
        double index = service.calculate(weight, hight);
        int bmi = (int)index;
        System.out.println("Индекс массы тела = "+ bmi);
    }
}