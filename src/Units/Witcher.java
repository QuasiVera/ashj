package Units;

import java.util.ArrayList;

public class Witcher extends Magian {
    public Witcher(ArrayList<Hero> team,String name) {

        super(5,team,name, 14, new int [] {1,4}, 3, 3,1);
    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d  accuracy: %d",
                super.getInfo(), this.mana, this.accuracy);
    }

}
