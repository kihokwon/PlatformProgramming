package uk.epl.player;

public class Defender extends Player{
    private int STRENGTH_POINT = 10;

    public Defender(String name, int jerseyNumber, int speed, int stamina, int passing){
        super.setName(name);
        super.setJerseyNumber(jerseyNumber);
        super.setAbilities(speed, stamina, passing);
        super.position = new Position(0 ,0);
    }
    @Override
    public String toString() {
        return String.format("Player Name='%s, JerseyNumber=%d Position (%d , %d) " +
                        "Defender SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f", getName(), getJerseyNumber(),
                getPosition().x, getPosition().y, getSpeed(), getStamina(), getPassing());
    }

    @Override
    protected float getStamina(){
        return super.getStamina() + STRENGTH_POINT;
    }
}
