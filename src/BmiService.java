public class BmiService {
    public int calculate(int WeightInKg, double HeightInMeters) {
        double Bmi = (WeightInKg / HeightInMeters) / HeightInMeters;
        return (int) Bmi;

    }

}
