package dmf.tzacb.logic.main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.augments.BattleAugments;
import dmf.tzacb.model.licenses.augments.HealthAugments;
import dmf.tzacb.model.licenses.augments.ItemAugments;
import dmf.tzacb.model.licenses.augments.MagickAugments;
import dmf.tzacb.model.licenses.equipment.Accessories;
import dmf.tzacb.model.licenses.equipment.Armor;
import dmf.tzacb.model.licenses.equipment.Weapons1;
import dmf.tzacb.model.licenses.equipment.Weapons2;
import dmf.tzacb.model.licenses.equipment.Weapons3;
import dmf.tzacb.model.licenses.espersquickessentials.EQEE;
import dmf.tzacb.model.licenses.magick.ArcaneMagick;
import dmf.tzacb.model.licenses.magick.BlackMagick;
import dmf.tzacb.model.licenses.magick.GreenMagick;
import dmf.tzacb.model.licenses.magick.TimeMagick;
import dmf.tzacb.model.licenses.magick.WhiteMagick;
import dmf.tzacb.model.licenses.technicks.Technicks;

public class TZACB_Main {
	
	// Characters
	private static PlayerCharacter[] characters; 
	
	public static void main(String[] args) {
        
		characters = new PlayerCharacter[6];
        
        characters[0] = new PlayerCharacter("Vaan", new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/characters/vaan.PNG")));
        characters[1] = new PlayerCharacter("Balthier", new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/characters/balthier.PNG")));
        characters[2] = new PlayerCharacter("Fran", new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/characters/fran.PNG")));
        characters[3] = new PlayerCharacter("Basch", new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/characters/basch.PNG")));
        characters[4] = new PlayerCharacter("Ashe", new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/characters/ashe.PNG")));
        characters[5] = new PlayerCharacter("Penelo", new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/characters/penelo.PNG")));
        
        JFrame window = new MainGui(characters);
        window.setSize(1200, 960);
        window.setVisible(true);
    }

}
