package Lesson_1.Marathon;

import Lesson_1.Marathon.Competitors.*;
import Lesson_1.Marathon.Obstacles.Course;
import Lesson_1.Marathon.Obstacles.Cross;
import Lesson_1.Marathon.Obstacles.Wall;
import Lesson_1.Marathon.Obstacles.Water;

public class MainMarathon {
    public static void main(String[] args) {

        Team team = new Team("Покарители Марса", new Man("Первый участник", "Миша", 13, 9, 3),
                new Woman("Второй участник", "Мария", 12, 8, 3),
                new Cat("Третий участник", "Мурка", 14, 7, 3),
                new Dog("Четвертый участник", "Пес Барбос", 20, 5, 1)
                );
        Team team2 = new Team("Феникс",new Man("Первый участник", "Федя", 12, 10, 2),
                new Woman("Второй участник", "Фиона", 11, 9, 2),
                new Cat("Третий участник", "Белка", 13, 5, 3),
                new Dog("Четвертый участник", "Пес Рекс", 21, 4, 1)

        );
        Course courses = new Course(new Cross(80), new Wall(2), new Water(10));

        courses.doIt(team);
        team.showWinners();

        courses.doIt(team2);
        team2.showWinners();

        if (team.getTimeTeam()<team2.getTimeTeam()){
            System.out.println("Победила команда " + team.getTeamName() + "!!!");
        }else {
            System.out.println("Победила команда " + team2.getTeamName() + "!!!");
        }

    }
}

