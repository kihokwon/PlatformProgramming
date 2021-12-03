package uk.epl.game;
import uk.epl.player.*;

import java.util.*;

public class Field {
    private List<Player> players = new ArrayList<>();

    public class Forward extends Player{
        private int ACCELERATION_POINT = 10;

        @Override
        protected float getSpeed(){
            return super.getSpeed() + ACCELERATION_POINT;
        }
        // add code
    }

    public class Midfielder extends Player{
        private int PASSING_POINT = 10;
        @Override
        protected float getPassing(){
            return super.getPassing() + PASSING_POINT;
        }
    }

    public class Defender extends Player{
        private int STRENGTH_POINT = 10;

        @Override
        protected float getStamina(){
            return super.getStamina() + STRENGTH_POINT;
        }
        // add code
    }

    public void add(Player newPlayer){
        players.add(newPlayer);
    }

    public void info(){
        for(int i = 0; i < players.size(); i++){
            System.out.println(players.get(i));
        }
    }

    public void start(){
        for(int i = 0; i < players.size(); i++){
            players.get(i).setPosition(34, 25*(i+1));
        }
    }

    public void moveUp(int jerseyNumber){
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getJerseyNumber() == jerseyNumber){
                players.get(i).moveUp();
                break;
            }
        }
    }

    public void moveDown(int jerseyNumber){
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getJerseyNumber() == jerseyNumber){
                players.get(i).moveDown();
                break;
            }
        }
    }
    public void moveLeft(int jerseyNumber){
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getJerseyNumber() == jerseyNumber){
                players.get(i).moveLeft();
                break;
            }
        }
    }
    public void moveRight(int jerseyNumber){
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getJerseyNumber() == jerseyNumber){
                players.get(i).moveRight();
                break;
            }
        }
    }
    //clear
    public void stop(){
        players.clear();
    }
}

