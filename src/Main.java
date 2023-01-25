public class Main {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Задача 1");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 35;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        var DifferenceBetweenBoxer = WeightBoxer2 - WeightBoxer1;
        System.out.println("Разница между боксерами равна " + DifferenceBetweenBoxer + " кг ");
        DifferenceBetweenBoxer = WeightBoxer2 % WeightBoxer1;
    }
    public static void task7() {
        System.out.println("Задача 7");
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        var DifferenceBetweenBoxer = WeightBoxer2 % WeightBoxer1;
        System.out.println("Разница между боксерами равна " + DifferenceBetweenBoxer + " кг ");
    }
    public static void task8() {
        System.out.println("Задача 8");
        System.out.println("#1");
        var HoursForWork=640;
        var HoursForOneWorker=8;
        var AmountOfWorkers= HoursForWork/HoursForOneWorker;
        System.out.println("Всего работников в компании - "+AmountOfWorkers+" человек ");
        System.out.println("#2");
AmountOfWorkers=AmountOfWorkers+94;
HoursForWork=AmountOfWorkers*HoursForOneWorker;
System.out.println("Если в компании работает "+AmountOfWorkers+" человека, то всего "+ HoursForWork+" часов работы может быть поделено между сотрудниками");

    }
}
