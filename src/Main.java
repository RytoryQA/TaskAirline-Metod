public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        System.out.println();
        System.out.println("Для 20_000");
        System.out.println(service.calculate(20_000));

        System.out.println();
        System.out.println("Для 1000");
        System.out.println(service.calculate(1000));

        System.out.println();
        System.out.println("Для 30");
        System.out.println(service.calculate(30));
    }
}