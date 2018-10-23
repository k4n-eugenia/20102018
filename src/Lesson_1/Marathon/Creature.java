package Lesson_1.Marathon;

public class Creature implements Competitor {

    String type;
    String name;

    int maxRunDistance;
    int runSpeed;
    int maxSwimDistance;
    int swimSpeed;
    int maxJumpHeight;

   int time;
   int time1;
   int time2;
   int time3;

    boolean onDistance;

    public Creature(String type, String name, int maxRunDistance, int runSpeed, int maxSwimDistance, int swimSpeed, int maxJumpHeight, boolean onDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.runSpeed = runSpeed;
        this.maxSwimDistance = maxSwimDistance;
        this.swimSpeed = swimSpeed;
        this.maxJumpHeight = maxJumpHeight;
       // this.time = time;
        this.onDistance = true;
    }


    @Override
    public void run(int dist) {
        time1 = dist/runSpeed;
        System.out.println(type + " " + name + " справился с кроссом за " + time1 + " минут");

    }

    @Override
    public void swim(int dist) {
        time2 = dist/swimSpeed;
        System.out.println(type + " " + name + " справился с заплывом " + time2 + " минут");

    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeight) {
            System.out.println(type + " " + name + " справился с прыжком");
            time3 = 0;
        } else {
            time3 = 3;
            System.out.println(type + " " + name + " не справился с прыжком. Штрафное время " + time3 + " минуты");
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        time = time1+time2+time3;
        System.out.println(type + " " + name + " " + onDistance);
        System.out.println(type + " справился с полосой препятсвия за " + time + " минут");
    }
}
