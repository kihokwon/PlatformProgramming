package uk.epl.player;

import java.util.Arrays;

public abstract class Player {
    private String name;
    private int jerseyNumber;

    private int[] abilities = new int[3];
    final int SPEED = 0; final int STAMINA = 1; final int PASSING = 2;

    Position position;

    public class Position{
        public int x;
        public int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }
    public int getJerseyNumber(){
        return this.jerseyNumber;
    }
    public void setAbilities(int speed, int stamina, int passing) {
        this.abilities[SPEED] = speed;
        this.abilities[STAMINA] = stamina;
        this.abilities[PASSING] = passing;
    }

    public Position getPosition(){
        return new Position(position.x, position.y);
    }

    public void setPosition(int x, int y){
        this.position.x = x;
        this.position.y = y;
    }

    public void moveUp(){
        float move_delta = getMoveDelta();
        position.y = (int)(position.y - move_delta);
        decreaseStamina();
    }

    public void moveDown(){
        float move_delta = getMoveDelta();
        position.y = (int)(position.y + move_delta);
        decreaseStamina();
    }

    public void moveLeft(){
        float move_delta = getMoveDelta();
        position.x = (int)(position.x + move_delta);
        decreaseStamina();
    }

    public void moveRight(){
        float move_delta = getMoveDelta();
        position.x = (int)(position.x - move_delta);
        decreaseStamina();
    }

    private void decreaseStamina(){
        abilities[STAMINA] = (int)(abilities[STAMINA]-2);
    }

    private float getMoveDelta(){
        return 1+getSpeed()/100*getStamina()/100;
    }

    protected float getStamina(){
        return (float)abilities[STAMINA];
    }
    // add code
    protected float getSpeed(){
        return (float)abilities[SPEED];
    }

    protected float getPassing(){
        return (float)abilities[PASSING];
    }


}
