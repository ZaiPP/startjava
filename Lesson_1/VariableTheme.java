public class VariableTheme {
    public static void main(String[] args) {

        //TODO: Создание переменных и вывод их значений на консоль

        byte yadro = 4;
        short hz = 1700;
        int ozu = 4096;
        long disk = 473_828_421;
        float speedlow = 1.754_685f;
        double speedup= 2.454_685_645_825_463d;
        char simbol = 'H';
        boolean result = true;

        System.out.println("Создание переменных и вывод их значений на консоль");
        System.out.println(yadro);
        System.out.println(hz);
        System.out.println(ozu);
        System.out.println(disk);
        System.out.println(speedlow);
        System.out.println(speedup);
        System.out.println(simbol);
        System.out.println(result);


        //TODO: Расчет стоимости товара со скидкой

        String s = "";
        int X = 100;
        int Y = 200;
        int sum = X + Y;

        System.out.println(s);
        System.out.println("Расчет стоимости товара со скидкой");
        System.out.println(sum - sum * 0.10);
        System.out.println(sum * 0.10);
    }
}