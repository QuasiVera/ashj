package Units;

public abstract class Infantry extends Hero{ // пехота
    protected int tool; // оружие, возможна, потом, замена типа данных; пока число


    protected Infantry(String name, int health, int[] damage, int armor, int tool) {
        super(name, health, damage, armor);
        this.tool = tool;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
