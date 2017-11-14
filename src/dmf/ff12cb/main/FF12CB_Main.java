package dmf.ff12cb.main;

import javax.swing.JFrame;

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
	
	// Augments
	BattleAugments battleAugments = new BattleAugments();
	HealthAugments healthAugments = new HealthAugments();
	ItemAugments   itemAugments   = new ItemAugments();
	MagickAugments magickAugments = new MagickAugments();
	
	// Equipment
	Accessories    accessories    = new Accessories();
	Armor		   armor		  = new Armor();
	Weapons1	   weapons1		  = new Weapons1();
	Weapons2	   weapons2		  = new Weapons2();
	Weapons3	   weapons3		  = new Weapons3();
	
	// Espers Quickenings Essentials and Empty
	EspersQuickEssentials eqee	  = new EspersQuickEssentials();
	
	public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        
        JFrame window = new MainGui();
        window.show();
    }

}
