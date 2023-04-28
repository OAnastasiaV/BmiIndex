public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 72;
        double h = 1.63;
        double index = service.calculate(m,h);

        System.out.println("Индекс массы тела равен: " + (int)index);

    }
}