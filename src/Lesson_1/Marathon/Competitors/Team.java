package Lesson_1.Marathon.Competitors;

import Lesson_1.Marathon.Creature;

public class Team {

    private int timeTeam=0;


    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    private  Creature[] creatures;

    public Creature[] getCreatures() {
        return creatures;
    }

    public Team(String teamName, Creature ...creatures){
        this.teamName = teamName;
        this.creatures = creatures;
    }
    public void showWinners() {
        for(Creature o: creatures) {

                o.info();

                timeTeam = timeTeam + o.getTime();
        }
        System.out.println("Общее время прохождения полосы припятсвия " + timeTeam + " минут");
        System.out.println();
    }

    public int getTimeTeam() {
        return timeTeam;
    }
}


