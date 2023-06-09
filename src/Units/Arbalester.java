package Units;

import java.util.ArrayList;

public class Arbalester extends Shooter{
    public Arbalester(ArrayList<Hero> team, String name, int x, int y) {

        super(x, y, 6,team, name, 10, new int [] {2,4}, 2, 10,1,2);
    }

    @Override
    public String getInfo() {
        return String.format("%s  arrows: %d  accuracy: %d",
                super.getInfo(), this.arrows, this.accuracy);
    }

}
