package dmf.ff12.logic.jobs.equipment;

import dmf.ff12.logic.jobs.License;
import dmf.ff12.logic.jobs.LicenseType;

public class Weapons2 {
	
	private License[] wpn2Licenses;
	
	public Weapons2() {
		wpn2Licenses = new License[20];
		
		// Rods
		wpn2Licenses[0] = new License("Rods 1", 20, LicenseType.Weapons2, "Allows character to equip Rod and Serpent Rod.");
		wpn2Licenses[1] = new License("Rods 2", 30, LicenseType.Weapons2, "Allows character to equip Healing Rod and Gaia Rod.");
		wpn2Licenses[2] = new License("Rods 3", 40, LicenseType.Weapons2, "Allows character to equip Power Rod and Empyrean Rod.");
		wpn2Licenses[3] = new License("Rods 4", 50, LicenseType.Weapons2, "Allows character to equip Holy Rod.");
		wpn2Licenses[4] = new License("Rod of Faith", 130, LicenseType.Weapons2, "Allows character to equip Rod of Faith.");
		
		// Maces
		wpn2Licenses[5] = new License("Maces 1",  30, LicenseType.Weapons2, "Allows character to equip Mace and Bronze Mace.");
		wpn2Licenses[6] = new License("Maces 2",  40, LicenseType.Weapons2, "Allows character to equip Bhuj and Miter.");
		wpn2Licenses[7] = new License("Maces 3",  60, LicenseType.Weapons2, "Allows character to equip Thorned Mace and Chaos Mace.");
		wpn2Licenses[8] = new License("Maces 4",  65, LicenseType.Weapons2, "Allows character to equip Doom Mace and Zeus Mace.");
		wpn2Licenses[9] = new License("Maces 5", 115, LicenseType.Weapons2, "Allows character to equip Grand Mace and Bone of Byblos.");
		
		// Maces
		wpn2Licenses[10] = new License("Measures 1",  40, LicenseType.Weapons2, "Allows character to equip Gilt Measure.");
		wpn2Licenses[11] = new License("Measures 2",  50, LicenseType.Weapons2, "Allows character to equip Arc Scale and Multiscale.");
		wpn2Licenses[12] = new License("Measures 3",  70, LicenseType.Weapons2, "Allows character to equip Cross Scale and Caliper.");
		wpn2Licenses[13] = new License("Measures 4",  100, LicenseType.Weapons2,"Allows character to equip Euclid's Sextant.");
		
		// Staves
		wpn2Licenses[14] = new License("Staves 1",  15, LicenseType.Weapons2, "Allows character to equip Oak Staff.");
		wpn2Licenses[15] = new License("Staves 2",  25, LicenseType.Weapons2, "Allows character to equip Cherry Staff and Wizard's Staff.");
		wpn2Licenses[16] = new License("Staves 3",  30, LicenseType.Weapons2, "Allows character to equip Flame Staff and Storm Staff.");
		wpn2Licenses[17] = new License("Staves 4",  40, LicenseType.Weapons2, "Allows character to equip Glacial Staff and Golden Staff.");
		wpn2Licenses[18] = new License("Staves 5",  65, LicenseType.Weapons2, "Allows character to equip Judicer's Staff and Cloud Staff.");
		wpn2Licenses[19] = new License("Staff of the Magi", 150, LicenseType.Weapons2,"Allows character to equip Staff of the Magi.");
	}
	
	public License getWeapon2(int index) {
		String		 	name 		= wpn2Licenses[index].getName();
		int 			cost 		= wpn2Licenses[index].getCost();
		LicenseType 	type		= wpn2Licenses[index].getType();
		String 			description = wpn2Licenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}

}
