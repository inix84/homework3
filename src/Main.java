public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int x1=1_000_000_000;
        byte x2=127;
        short x3=1_000;
        long x4=1_000_000_000_000_000_000L;
        float x5=7.7777777f;
        double x6=0.1616161616161616;

        System.out.println("Значение переменной x1 с типом int равно "+x1);
        System.out.println("Значение переменной x2 с типом byte равно "+x2);
        System.out.println("Значение переменной x3 с типом short равно "+x3);
        System.out.println("Значение переменной x4 с типом long равно "+x4);
        System.out.println("Значение переменной x5 с типом float равно "+x5);
        System.out.println("Значение переменной x6 с типом double равно "+x6);

        System.out.println();
        System.out.println("Задача 2");
        int x7=-159;
        byte x8=67;
        short x9=27_897;
        long x10=987_678_965_549L;
        float x11=27.12f;
        double x12=2.786;
        char x13 = 569;
        boolean x14 = false;

        System.out.println("Значение переменной x7 с типом int равно "+x7);
        System.out.println("Значение переменной x8 с типом byte равно "+x8);
        System.out.println("Значение переменной x9 с типом short равно "+x9);
        System.out.println("Значение переменной x10 с типом long равно "+x10);
        System.out.println("Значение переменной x11 с типом float равно "+x11);
        System.out.println("Значение переменной x12 с типом double равно "+x12);
        System.out.println("Значение переменной x13 с типом char равно "+x13);
        System.out.println("Значение переменной x14 с типом boolean равно "+x14);

        System.out.println();
        System.out.println("Задача 3");
        short studentsLP=23;
        short studentsAS=27;
        short studentsEA=30;
        int sumStudents = studentsLP+studentsAS+studentsEA;
        System.out.print("Всего в трёх классах учится "+ sumStudents + " учеников, ");
        short paperAll = 480;
        int paper1 = paperAll/sumStudents;
        System.out.println("на каждого ученика рассчитано по "+paper1+" листов бумаги.");

    }
}