package Model;

import Model.Glyphids.Glyphid;

public class Rock extends Glyphid {
    public Rock(String theName, double theX, double theY, int theHealth,
                double theWidth, double theHeight, double theMoveSpeed,
                Weapon theWeapon, int fireTimer) {
        super(theName, theX, theY, theHealth, theWidth, theHeight, theMoveSpeed, theWeapon, fireTimer);
    }

    @Override
    public void attack() {
        System.out.println("Rocks can't attack.");
    }

    @Override
    public void update() {
        // update for rock
        updateFireTimer();
    }
}
