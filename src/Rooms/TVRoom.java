package Rooms;

import Game.Runner;
import People.Person;

public class TVRoom extends Room
{

    public TVRoom(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the TV room! Your favorite show is playing, plus one point");
        Runner.gameOff();
    }


}
