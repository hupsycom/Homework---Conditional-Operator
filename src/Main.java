public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен" + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача №2");

        int temp = 20;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
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

        int ageAge = 7;
        if (ageAge >= 2 && ageAge <= 6) {
            System.out.println("Если возраст человека равен " + ageAge + ", то ему нужно ходить в детский сад.");
        } else if (ageAge >= 7 && ageAge <= 17) {
            System.out.println("Если возраст человека равен " + ageAge + ", то ему нужно ходить в школу.");
        } else if ( ageAge >= 18 && ageAge <= 24) {
            System.out.println("Если возраст человека равен " + ageAge + ", то его место в университете.");
        } else if (ageAge == 1)  {
            System.out.println("Если возраст человека равен " + ageAge + ", то ему нужно быть под присмотром.");
        } else {
            System.out.println("Если возраст человека равен " + ageAge + ", то ему пора ходить на работу");
        }


        System.out.println("Задача №5");

        int childAge = 7;

        boolean oneAdultParent = true;
        if (childAge  < 5 ) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему  нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge <= 14 && oneAdultParent ) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослых.");
        }else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без совпровождения взрослых.");
        }


        System.out.println("Задача №6");



        int occupiedSeats = 43;
        int occupiedStandingSeats = 12;
        if (occupiedSeats < 60) {
            System.out.println("В вагоне есть " + (60 - occupiedSeats) +  " свободных сидячих мест.");
        }else if (occupiedStandingSeats < 102) {
            System.out.println("В вагоне есть " + (102 - occupiedSeats) + " свободных стоячих места.");
        } else {
            System.out.println("В вагоне нет свободных мест.");
        }
        if (occupiedStandingSeats < 102) {
            System.out.println("В вагоне есть " + (102 - occupiedSeats) + " cвободных стоячих мест.");
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