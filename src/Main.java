public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void  task1(){
        System.out.println("Задача 1");
        byte b = 111;
        System.out.println(b);
        short s = 26235;
        System.out.println(s);
        int i = 1010101010;
        System.out.println(i);
        long j = 12365456983214564L;
        System.out.println(j);
        float f =  3.14f;
        System.out.println(f);
        double d = 52.15487;
        System.out.println(d);

    }
    public static void  task2(){
        System.out.println("Задача 2");
        float f = 27.12f;
        System.out.println(f);
        long l = 98767896544545223L;
        System.out.println(l);
        double d = 2.786;
        System.out.println(d);
        short s = 569;
        System.out.println(s);
        int i = 27897;
        System.out.println(i);
        byte b = 67;
        System.out.println(b);

    }
    public static void  task3(){
        System.out.println("Задача 3");
        int lp = 23;
        int as = 27;
        int ea = 30;
        int paper = 480;
        int learners = lp + as + ea ;
        System.out.println("учеников всего " + learners);
        int pages = paper/learners;
        System.out.println("На каждого ученика рассчитано " + pages + " листов бумаги");
    }
    public static void  task4(){
        System.out.println("Задача 4");
        int twoMinutes = 16;
        int oneMinutes = twoMinutes/2;
        System.out.println("за 1 минуту машина произвела " + oneMinutes + " штук бутылок");
        int twentyMinutes = oneMinutes * 20;
        System.out.println("за 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        int day = (24 * 60 ) * oneMinutes;
        System.out.println("за 1 день машина произвела " + day + " штук бутылок");
        int treeDays = day * 3 ;
        System.out.println("за 3 дня машина произвела " + treeDays + " штук бутылок");
        int month = (day * 30) * oneMinutes;
        System.out.println("за месяц машина произвела " + month + " штук бутылок");
    }
    public static void  task5(){
        System.out.println("Задача 5");
        int cans = 120;
        int whiteColor = 2;
        int brownColor = 4;
        int oneClass = whiteColor + brownColor;
        int scoolClass = cans / oneClass;
        int cansWhiteColor = scoolClass * whiteColor;
        int cansBrownColor = scoolClass * brownColor;
        System.out.println("В школе, где "+ scoolClass + " классов, нужно " + cansWhiteColor +
                " банок белой краски и " + cansBrownColor + " банок коричневой краски");

    }
    public static void  task6(){
        System.out.println("Задача 6");
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int weightGr =(banana*5)+(milk*2)+(iceCream*2)+(egg*4);
        int kgInGr = 1000;
        float wightKg = weightGr /(float) kgInGr;
        System.out.println(weightGr + " грамм");
        System.out.println(wightKg + " кг");
    }
    public static void  task7(){
        System.out.println("Задача 7");
        int weightKg = 7;
        int ration_a = 250;
        int ration_b = 500;
        int weightGr = weightKg * 1000;
        int daysLoseWeight_a = weightGr / ration_a;
        int daysLoseWeight_b = weightGr / ration_b;
        int avgDays = (daysLoseWeight_a + daysLoseWeight_b) / 2 ;
        System.out.println("уйдет дней при потере в весе 250 гр " + daysLoseWeight_a + " дней" );
        System.out.println("уйдет дней при потере в весе 500 гр " + daysLoseWeight_b + " дней");
        System.out.println("в среднем " + avgDays + " дней");
    }
    public static void  task8(){
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denSalary = 83690;
        int kristiSalary = 76230;
        int monthInYear = 12;
        double increaseSalary = 0.1;
        double mashaNewSalary = (mashaSalary * increaseSalary) + mashaSalary;
        double oldYearSalaryMasha = mashaSalary * monthInYear;
        double NewYearSalaryMasha = mashaNewSalary * monthInYear;
        double differenceSalaryMasha = NewYearSalaryMasha % oldYearSalaryMasha;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей." +
                " Годовой доход вырос на " + differenceSalaryMasha + " рублей");
        double denNewSalary = (denSalary * increaseSalary) + denSalary;
        double oldYearSalaryDen = denSalary * monthInYear;
        double NewYearSalaryDen = denNewSalary * monthInYear;
        double differenceSalaryDen = NewYearSalaryDen % oldYearSalaryDen;
        System.out.println("Денис теперь получает " + denNewSalary + " рублей." +
                " Годовой доход вырос на " + differenceSalaryDen + " рублей");

        double kristiNewSalary = (kristiSalary * increaseSalary) + kristiSalary;
        double oldYearSalaryKristi = kristiSalary * monthInYear;
        double NewYearSalaryKristi = kristiNewSalary * monthInYear;
        double differenceSalaryKristi = NewYearSalaryKristi % oldYearSalaryKristi;
        System.out.println("Кристина теперь получает " + kristiNewSalary + " рублей." +
                " Годовой доход вырос на " + differenceSalaryKristi + " рублей");
    }




}