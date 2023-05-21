public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98; // вводим вес в кг
        int height = 187; // вводим рост в см
        int index = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + index);
    }
}