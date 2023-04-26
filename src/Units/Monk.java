package Units;

import java.util.ArrayList;

public class Monk extends Magian{
    public Monk(ArrayList<Hero> team, String name, int x, int y) {

        super(x, y, 5, team,name, 10, new int [] {2,6}, 2, 8,1);
    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d  accuracy: %d",
                super.getInfo(), this.mana, this.accuracy);
    }


}
