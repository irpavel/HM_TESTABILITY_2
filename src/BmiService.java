public class BmiService {
    public int calculate(int weight, int height) {
        int index = (weight * 10_000) / (height * height);
        return index;
    }
}
