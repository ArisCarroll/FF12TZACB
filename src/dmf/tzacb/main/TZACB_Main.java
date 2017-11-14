package dmf.ff12cb.main;

import javax.swing.JFrame;

import dmf.ff12.logic.jobs.PlayerCharacter;
import dmf.ff12.logic.jobs.Augments.BattleAugments;
import dmf.ff12.logic.jobs.Augments.HealthAugments;
import dmf.ff12.logic.jobs.Augments.ItemAugments;
import dmf.ff12.logic.jobs.Augments.MagickAugments;
import dmf.ff12.logic.jobs.EspersQuickEssentials.EspersQuickEssentials;
import dmf.ff12.logic.jobs.equipment.Accessories;
import dmf.ff12.logic.jobs.equipment.Armor;
import dmf.ff12.logic.jobs.equipment.Weapons1;
import dmf.ff12.logic.jobs.equipment.Weapons2;
import dmf.ff12.logic.jobs.equipment.Weapons3;
import dmf.ff12cb.gui.MainGui;

public class FF12CB_Main {
	
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
