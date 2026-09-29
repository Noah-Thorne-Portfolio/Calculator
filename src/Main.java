public class Main {
    public static void main(String[] args) {
        System.out.println(Logic.add(1,5));
        System.out.println(Logic.subtract(1,5));
        System.out.println(Logic.multiply(1,5));
        System.out.println(Logic.divide(1,5));
        System.out.println('\n');

        System.out.printf("%.2f%n", Logic.addf(1.0,5.0));
        System.out.println(Logic.subtractf(1.0,5.0));
        System.out.println(Logic.multiplyf(1.0,5.0));
        System.out.println(Logic.dividef(1.0,5.0));
}
}