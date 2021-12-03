package uk.epl.player;

public class Forward extends Player{
    private int ACCELERATION_POINT = 10;

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing){
        super.setName(name);
        super.setJerseyNumber(jerseyNumber);
        super.setAbilities(speed, stamina, passing);
        super.position = new Position(0 ,0);
    }

    @Override
    public String toString() {
        return String.format("Player Name='%s, JerseyNumber=%d Position (%d , %d) " +
                        "Forward SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f", getName(), getJerseyNumber(),
                getPosition().x, getPosition().y, getSpeed(), getStamina(), getPassing());
    }

    @Override
    protected float getSpeed(){
        return super.getSpeed() + ACCELERATION_POINT;
    }
}
