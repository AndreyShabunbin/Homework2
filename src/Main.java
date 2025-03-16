public class Main {
    public static void main(String[] args) {
// Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Значение переменной dog: " + dog);
        System.out.println("Значение переменной cat: " + cat);
        System.out.println("Значение переменной paper: " + paper);
        // Задача 2
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("Новые значения");
        System.out.println("Значение переменной dog: " + dog);
        System.out.println("Значение переменной cat: " + cat);
        System.out.println("Значение переменной paper: " + paper);
        //Задача 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Новые значения");
        System.out.println("Значение переменной dog: " + dog);
        System.out.println("Значение переменной cat: " + cat);
        System.out.println("Значение переменной paper: " + paper);
        //Задача 4
        var friend = 19;

        System.out.println("Значение переменной friend: " + friend);

        friend += 2;

        System.out.println("Новые значения");
        System.out.println("Значение переменной friend: " + friend);

        friend /= 7;

        System.out.println("Новые значения");
        System.out.println("Значение переменной friend: " + friend);
        //Задача 5
        var frog = 3.5;

        System.out.println("Значение переменной frog: " + frog);

        frog *= 10;

        System.out.println("Новые значения");
        System.out.println("Значение переменной frog: " + frog);

        frog /= 3.5;

        System.out.println("Новые значения");
        System.out.println("Значение переменной frog: " + frog);

        frog += 4;

        System.out.println("Новые значения");
        System.out.println("Значение переменной frog: " + frog);
        //Задача 6
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;

        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общая масса двух бойцов: " + totalWeight + " кг");

        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница между массами бойцов: " + weightDifference + " кг");
        //Задача 7
        var ostatok = boxer2Weight % boxer1Weight;

        System.out.println("Остаток от деления между весами: " + ostatok);
        //Задача 8
        var totalHours = 640;
        var hoursPerWorker = 8;

        var numberOfWorkers = totalHours / hoursPerWorker;
        System.out.println("Всего работников в компании — " + numberOfWorkers + " человек");

        var newNumberOfWorkers = numberOfWorkers + 94;

        var newTotalHours = newNumberOfWorkers * hoursPerWorker;
        System.out.println("Если в компании работает " + newNumberOfWorkers + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");

    }
}


