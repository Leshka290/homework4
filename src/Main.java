public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {

        int ageAdult = 20;
        int ageChild = 15;

        if(ageChild < 18)
            System.out.println("Если возраст человека равен " + ageChild + ", то " +
                    "он не достиг совершеннолетия, нужно немного подождать");
        if(ageAdult >= 18)
            System.out.println("Если возраст человека равен " + ageAdult + ", то " +
                    "он совершеннолетний\n");
    }

    public static void task2() {

        int tempOutside1 = 20;
        int tempOutside2 = 3;

        if(tempOutside2 < 5) {
            System.out.println("На улице " + tempOutside2 + " градуса, нужно надеть шапку");
        }
        if (tempOutside1 > 5) {
            System.out.println("На улице " + tempOutside1 + " градусов, можно идти без шапки\n");
        }
    }

    public static void task3() {

        int vehicleSpeed1 = 100;
        int vehicleSpeed2 = 40;

        if(vehicleSpeed1 > 60) {
            System.out.println("Если скорость " + vehicleSpeed1 + ", то придется заплатить штраф");
        }
        if(vehicleSpeed2 < 60) {
            System.out.println("Если скорость " + vehicleSpeed2 + ", то можно ездить спокойно\n");
        }
    }

    public static void task4() {

        int ageChild = 5;
        int ageBoy = 10;
        int ageYoungMan = 20;
        int ageGrownMan = 30;

        int age = ageChild;
        if(age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if(age > 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if(age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        else if(age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

         age = ageBoy;
        if(age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if(age > 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if(age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        else if(age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

         age = ageYoungMan;
        if(age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if(age > 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if(age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        else if(age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

        age = ageGrownMan;
        if(age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if(age > 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if(age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        else if(age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу\n");
        }
    }

    public static void task5() {

        int ageChildIvan = 3;
        int ageChildMax = 6;
        int ageChildAlex = 15;

        int age = ageChildIvan;
        if(age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if(age > 5 && age <=14) {
            System.out.println("Если возраст ребенка равен " + age
                    + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else if(age > 14) {
            System.out.println("Если возраст ребенка равен " + age
                    + ", то ему можно кататься без сопровождения взрослого");
        }

        age = ageChildMax;
        if(age <=5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if(age > 5 && age <=14) {
            System.out.println("Если возраст ребенка равен " + age
                    + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else if(age > 14) {
            System.out.println("Если возраст ребенка равен " + age
                    + ", то ему можно кататься без сопровождения взрослого");
        }

        age = ageChildAlex;
        if(age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе\n");
        }
        else if(age > 5 && age <=14) {
            System.out.println("Если возраст ребенка равен " + age
                    + ", то ему можно кататься на аттракционе в сопровождении\n");
        }
        else if(age > 14) {
            System.out.println("Если возраст ребенка равен " + age
                    + ", то ему можно кататься без сопровождения взрослого\n");
        }
    }

    public static void task6() {

        int wagonCapacity = 102;
        int wagonSeating = 60;
        int wagonStandingPlaces = wagonCapacity - wagonSeating;
        int numOfOccupiedSeats = 50;
        int numOfOccupiedStandingPlaces = 42;

        if(numOfOccupiedSeats < wagonSeating && numOfOccupiedStandingPlaces < wagonStandingPlaces) {
            System.out.println("В вагоне есть место\n");
        } else if(numOfOccupiedSeats < wagonSeating && numOfOccupiedStandingPlaces == wagonStandingPlaces) {
            System.out.println("В вагоне остались сидячие\n");
        }
        else if(numOfOccupiedSeats == wagonSeating && numOfOccupiedStandingPlaces < wagonStandingPlaces) {
            System.out.println("В вагоне остались стоячие места\n");
        }
        else
            System.out.println("Мест в вагоне нет\n");
    }

    public static void task7() {

        int one = 1;
        int two = 2;
        int three = 3;

        if(one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (two > three) {
            System.out.println("Наибольшее число " + two);
        } else System.out.println("Наибольшее число " + three);
    }
}