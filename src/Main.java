public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int WeightInKg = 98;
        double HeightInMeters = (double) 1.87;
        int Bmi = service.calculate(WeightInKg, HeightInMeters); // Должно получиться 28
        System.out.println(Bmi);
    }
}