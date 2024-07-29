public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(friend);
        frog = frog *10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var differenceWeight = boxer1 - boxer2;
        System.out.println("Общий вес боксеров равен "+ totalWeight + " кг!");
        System.out.println("Разница в весе боксеров равна "+ differenceWeight + " кг!");

        var weight1 = 125;
        var weight2 = 15;
        var a = weight1 % weight2;
        System.out.println(a);

        var totalHours = 640;
        var worksHours = 8;
        var numberWorkers = totalHours /  worksHours;
        System.out.println("Всего работников в компании - "+numberWorkers+" человек.");
        numberWorkers = numberWorkers + 94;
        totalHours =numberWorkers * worksHours;
        System.out.println("Если в компании работает "+numberWorkers+" человек, то всего "+totalHours+" часов работы может быть поделено между сотрудниками.");

    }
}