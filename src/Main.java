public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        int ageMax = 21;
        int ageMin = 16;
        if (ageMax >= 18) {
            System.out.println("Если возраст человека равен " + ageMax + ", то он совершеннолетний.");
        }
        if (ageMin <= 18) {
            System.out.println("Если возраст человека равен " + ageMin + ", то он не достиг соверешеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача №2");

        int tempLowest = 0;
        int tempHighest = 20;
        if (tempLowest < 5) {
            System.out.println("На улице " + tempLowest + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + tempLowest + " градусов, можно идти без шапки.");
        }

        if (tempHighest < 5) {
            System.out.println("На улице " + tempHighest + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + tempHighest + " градусов, можно идти без шапки.");
        }

        System.out.println("Задача №3");

        int actualSpeedPerHour = 65;
        int permissibleSpeedPerHour = 60;
        if (actualSpeedPerHour > permissibleSpeedPerHour) {
            System.out.println("Если скорость " + actualSpeedPerHour + " , можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + actualSpeedPerHour + " , придется заплатить штраф.");
        }

        if (actualSpeedPerHour < permissibleSpeedPerHour) {
            System.out.println("Если скорость " + permissibleSpeedPerHour + " , можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + permissibleSpeedPerHour + " , придется заплатить штраф.");
        }

        System.out.println("Задача №4");

        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if ( age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else {
            System.out.println("Если возраст человека " + age + ", то ему пора ходить на работу.");
        }

        System.out.println("Задача №5");

        int childAge = 7;
        boolean oneAdultParent = true;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else if ((childAge > 5) || ((childAge < 14) && oneAdultParent)) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослых.");
        } else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослых.");
        }

        System.out.println("Задача №6");


        int wagonCapacity = 102;
        int seatingCapacity = 60;
        int standingCapacity = wagonCapacity % seatingCapacity;
        if (seatingCapacity < 60) {
            System.out.println("В вагоне есть " + (60 - seatingCapacity) +  " свободных сидячих мест.");
        }else if (standingCapacity > 0) {
            System.out.println("В вагоне есть " + standingCapacity + " свободных стоячих места.");
        } else {
            System.out.println("В вагоне нет свободных мест.");
        }


        System.out.println("Задача №7");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if(two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.printf("Наибольшее число: " + three);
        }





    }
}