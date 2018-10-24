package Lesson_1.Marathon.Obstacles;

import Lesson_1.Marathon.Creature;
import Lesson_1.Marathon.Obstacle;
import Lesson_1.Marathon.Competitors.Team;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle...obstacles){
        this.obstacles = obstacles;
    }

    public  void doIt(Team team){

        for (Creature c : team.getCreatures()) {
            for (Obstacle o : obstacles) {
                o.doIt(c);

            }
        }
    }


}
