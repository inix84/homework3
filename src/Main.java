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

        System.out.println();
        System.out.println("Задача 4");
        byte minute2=2;
        short bottle=16;
        int efficiency=bottle/minute2;

        short minute20=20;
        short minuteDay=24*60;
        short minute3Day=3*24*60;
        int minuteMounth = 30*24*60;

        int rezult20=minute20*efficiency;
        int rezultDay=minuteDay*efficiency;
        int rezult3Day=minute3Day*efficiency;
        int rezultMounth = minuteMounth*efficiency;

        System.out.println("За 20 минут машина произвела бутылок " + rezult20 + " штук ");
        System.out.println("За сутки машина произвела бутылок "+rezultDay + " штук ");
        System.out.println("За 3 дня машина произвела бутылок "+ rezult3Day+ " штук ");
        System.out.println("За месяц машина произвела бутылок "+ rezultMounth+ " штук ");

        System.out.println();
        System.out.println("Задача 5");

        short paintAll=120;
        int paintWhite;
        int paintBraun;

        short paintWhite1=2;
        short paintBraun1=4;
        int class1=paintWhite1+paintBraun1;

        int classCount = paintAll/class1;
        paintWhite = classCount*paintWhite1;
        paintBraun =classCount*paintBraun1;

        System.out.println("В школе, где " + classCount + " классов, нужно " +paintWhite+ " банок белой краски и " +paintBraun+ " банок коричневой краски.");

        System.out.println();
        System.out.println("Задача 6");

        short bananas=5;
        short Milk100ml=2;
        short plombir=2;
        short eggs=4;

        short bananaGrams=80;
        short Milk100mlGrams=105;
        short plombirGrams=100;
        short eggGrams=70;

        int bananasWeight;
        int Milk100mlWeight;
        int plombirWeight;
        int eggsWeight;

        bananasWeight=bananas*bananaGrams;
        Milk100mlWeight=Milk100ml*Milk100mlGrams;
        plombirWeight=plombir*plombirGrams;
        eggsWeight=eggs*eggGrams;

        float sumWeight=bananasWeight+Milk100mlWeight+plombirWeight+eggsWeight;
        System.out.print("Вес спорт-завтрака "+sumWeight+ " г.,");

        sumWeight = sumWeight/1000;
        System.out.println(" что составляет "+sumWeight+ " кг.");

        System.out.println();
        System.out.println("Задача 7");

        short lose=7;
        int loseGrams=lose*1000;

        short lose250=250;
        short lose500=500;

        int Day250 = loseGrams/lose250;
        int Day500 = loseGrams/lose500;
        System.out.print("Если спортсмен будет терять по "+lose250+ " грамм в день, то он похудеет через " +Day250+ " дней,");
        System.out.println("а если спортсмен будет терять по "+lose500+ " грамм в день, то он похудеет через " +Day500+ " дней.");

        int generalDay = (Day250+Day500)/2;
        System.out.println("В среднем спортсмен похудеет через " +generalDay+ " дней.");

    }
}