package dmf.ff12.logic.jobs.equipment;

import dmf.ff12.logic.jobs.License;
import dmf.ff12.logic.jobs.LicenseType;

public class Weapons3 {
	
	private License[] wpn3Licenses;
	
	public Weapons3 () {
		
		wpn3Licenses = new License[34];
		
		// Daggers
		wpn3Licenses[0] = new License("Daggers 1",               15, LicenseType.Weapons3, "Allows character to equip Dagger.");
		wpn3Licenses[1] = new License("Daggers 2",               20, LicenseType.Weapons3, "Allows character to equip Mage Masher and Assassin's Dagger.");
		wpn3Licenses[2] = new License("Daggers 3",               35, LicenseType.Weapons3, "Allows character to equip Chopper and Main Gauche.");
		wpn3Licenses[3] = new License("Daggers 4",               45, LicenseType.Weapons3, "Allows character to equip Gladius and Avenger.");
		wpn3Licenses[4] = new License("Daggers 5",               60, LicenseType.Weapons3, "Allows character to equip Orichalcum Dirk and Platinum Dagger.");
		wpn3Licenses[5] = new License("Daggers 6",               80, LicenseType.Weapons3, "Allows character to equip Zwill Crossblade.");
		wpn3Licenses[6] = new License("Shikari Nagasa & Minai", 220, LicenseType.Weapons3, "Allows character to equip Shikari Nagasa and Mina.");
		
		// Daggers
		wpn3Licenses[7]  = new License("Ninja Swords 1",         100, LicenseType.Weapons3, "Allows character to equip Ashura, Sakura-saezuri, Kagenui, and Orochi.");
		wpn3Licenses[8]  = new License("Ninja Swords 2",         120, LicenseType.Weapons3, "Allows character to equip Iga Blade.");
		wpn3Licenses[9] = new License("Ninja Swords 3",          120, LicenseType.Weapons3, "Allows character to equip Koga Blade.");
		wpn3Licenses[10] = new License("Yagyu Darkblade & Mesa", 180, LicenseType.Weapons3, "Allows character to equip Yagyu Darkblade and Mesa.");
		
		// Daggers
		wpn3Licenses[11] = new License("Hand-bombs 1",  35, LicenseType.Weapons3, "Allows character to equip Hornito.");
		wpn3Licenses[12] = new License("Hand-bombs 2",  55, LicenseType.Weapons3, "Allows character to equip Fumarole and Tumulus.");
		wpn3Licenses[13] = new License("Hand-bombs 3",  75, LicenseType.Weapons3, "Allows character to equip Caldera and Volcano.");
		wpn3Licenses[14] = new License("Makara",       105, LicenseType.Weapons3, "Allows character to equip Makara.");
		
		// Crossbows
		wpn3Licenses[15] = new License("Crossbows 1",  25, LicenseType.Weapons3, "Allows character to equip Bowgun and Crossbow.");
		wpn3Licenses[16] = new License("Crossbows 2",  40, LicenseType.Weapons3, "Allows character to equip Paramina Crossbow and Recurve Crossbow.");
		wpn3Licenses[17] = new License("Crossbows 3",  60, LicenseType.Weapons3, "Allows character to equip Hunting Crossbow and Penetrator Crossbow.");
		wpn3Licenses[18] = new License("Crossbows 4", 115, LicenseType.Weapons3, "Allows character to equip Gastrophetes and Tula.");
		
		// Poles
		wpn3Licenses[19] = new License("Poles 1",        20, LicenseType.Weapons3, "Allows character to equip Oaken Pole.");
		wpn3Licenses[20] = new License("Poles 2",        30, LicenseType.Weapons3, "Allows character to equip Cypress Pole and Battle Bamboo.");
		wpn3Licenses[21] = new License("Poles 3",        35, LicenseType.Weapons3, "Allows character to equip Musk Stick and Iron Pole.");
		wpn3Licenses[22] = new License("Poles 4",        40, LicenseType.Weapons3, "Allows character to equip Six-fluted Pole and Gokuu Pole.");
		wpn3Licenses[23] = new License("Poles 5",        50, LicenseType.Weapons3, "Allows character to equip Zephyr Pole and Ivory Pole.");
		wpn3Licenses[24] = new License("Poles 6",        60, LicenseType.Weapons3, "Allows character to equip Sweep and Eight-fluted Pole.");
		wpn3Licenses[25] = new License("Whale Whisker",  90, LicenseType.Weapons3, "Allows character to equip Whale Whisker.");
		wpn3Licenses[26] = new License("Kanya",         180, LicenseType.Weapons3, "Allows character to equip Kanya.");
		
		// Guns
		wpn3Licenses[27] = new License("Guns 1",   30, LicenseType.Weapons3, "Allows character to equip Altair.");
		wpn3Licenses[28] = new License("Guns 2",   50, LicenseType.Weapons3, "Allows character to equip Capella and Vega.");
		wpn3Licenses[29] = new License("Guns 3",   60, LicenseType.Weapons3, "Allows character to equip Sirius and Betelgeuse.");
		wpn3Licenses[30] = new License("Guns 4",   70, LicenseType.Weapons3, "Allows character to equip Ras Algethi and Aldebaran.");
		wpn3Licenses[31] = new License("Guns 5",   90, LicenseType.Weapons3, "Allows character to equip Spica and Antares.");
		wpn3Licenses[32] = new License("Guns 6",  100, LicenseType.Weapons3, "Allows character to equip Arcturus and Fomalhaut.");
		wpn3Licenses[33] = new License("Mithuna", 190, LicenseType.Weapons3, "Allows character to equip Mithuna.");
		
	}
	
	public License getWeapon3(int index) {
		return wpn3Licenses[index];
	}
	
	public License getWeapon3Copy(int index) {
		String		 	name 		= wpn3Licenses[index].getName();
		int 			cost 		= wpn3Licenses[index].getCost();
		LicenseType 	type		= wpn3Licenses[index].getType();
		String 			description = wpn3Licenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}

}
