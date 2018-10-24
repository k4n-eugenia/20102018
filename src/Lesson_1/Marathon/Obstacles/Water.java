package Lesson_1.Marathon.Obstacles;

import Lesson_1.Marathon.Creature;
import Lesson_1.Marathon.Obstacle;

public class Water extends Obstacle {
    int len;

    public Water(int len) {
        this.len = len;
    }

    @Override
    public void doIt(Creature creature) {
        creature.swim(len);
    }
}
