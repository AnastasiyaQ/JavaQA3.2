public class Main {
    public static void main(String[] args) {
        BmiServise service = new BmiServise();
        double hight = 1.87;
        double weight = 98;
        double Bmi = service.calculate(weight, hight);
        int bmi = (int)Bmi;
        System.out.println("Индекс массы тела = "+ bmi);
    }
}
