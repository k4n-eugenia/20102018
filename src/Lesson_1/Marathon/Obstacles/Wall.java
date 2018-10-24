package Lesson_1.Marathon.Obstacles;

import Lesson_1.Marathon.Creature;
import Lesson_1.Marathon.Obstacle;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Creature creature) {
        creature.jump(height);
    }


}
