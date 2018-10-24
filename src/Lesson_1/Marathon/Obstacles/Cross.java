package Lesson_1.Marathon.Obstacles;

import Lesson_1.Marathon.Creature;
import Lesson_1.Marathon.Obstacle;

public class Cross extends Obstacle {
    int len;

    public Cross(int len) {
        this.len = len;
    }

    @Override
    public void doIt(Creature creature) {
        creature.run(len);
    }
}
