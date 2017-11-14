package dmf.tzacb.main;

import javax.swing.JFrame;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.logic.jobs.PlayerCharacter;
import dmf.tzacb.model.licenses.augments.BattleAugments;
import dmf.tzacb.model.licenses.augments.HealthAugments;
import dmf.tzacb.model.licenses.augments.ItemAugments;
import dmf.tzacb.model.licenses.augments.MagickAugments;
import dmf.tzacb.model.licenses.equipment.Accessories;
import dmf.tzacb.model.licenses.equipment.Armor;
import dmf.tzacb.model.licenses.equipment.Weapons1;
import dmf.tzacb.model.licenses.equipment.Weapons2;
import dmf.tzacb.model.licenses.equipment.Weapons3;
import dmf.tzacb.model.licenses.espersquickessentials.EspersQuickEssentials;

public class TZACB_Main {
	
	// Characters
	private static PlayerCharacter[] characters; 
	
	// Augments
	private BattleAugments battleAugments = new BattleAugments();
	private HealthAugments healthAugments = new HealthAugments();
	private ItemAugments   itemAugments   = new ItemAugments();
	private MagickAugments magickAugments = new MagickAugments();
	
	// Equipment
	private Accessories    accessories    = new Accessories();
	private Armor		   armor		  = new Armor();
	private Weapons1	   weapons1		  = new Weapons1();
	private Weapons2	   weapons2		  = new Weapons2();
	private Weapons3	   weapons3		  = new Weapons3();
	
	// Espers Quickenings Essentials and Empty
	private EspersQuickEssentials eqee	  = new EspersQuickEssentials();
	
	public static void main(String[] args) {
        
		characters = new PlayerCharacter[6];
        
        characters[0] = new PlayerCharacter("Vaan");
        characters[1] = new PlayerCharacter("Balthier");
        characters[2] = new PlayerCharacter("Fran");
        characters[3] = new PlayerCharacter("Basch");
        characters[4] = new PlayerCharacter("Ashe");
        characters[5] = new PlayerCharacter("Penelo");
        
        JFrame window = new MainGui();
        window.show();
    }

}
