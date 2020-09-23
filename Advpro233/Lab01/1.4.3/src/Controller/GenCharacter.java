package Controller;

import model.Character.BasedCharacter;
import model.Character.MagicalCharacter;
import model.Character.PhysicalCharacter;

import java.util.Random;

public class GenCharacter {
    public static BasedCharacter setUpCharacter() {
        BasedCharacter character;
        Random rand = new Random();
        int type = rand.nextInt(2) + 1;
        int basedDef = rand.nextInt(50) + 1;
        int basedRes = rand.nextInt(50) + 1;
        if (type == 1) {
            character = new MagicalCharacter("MagicChar1", "assets/wizard.png", basedDef,basedRes);
        }else {
            character = new PhysicalCharacter("PhysicalChar1","assets/knight.png", basedDef,basedRes);
        }
        return character;
    }
}
