package dmf.tzacb.model.licenses.equipment;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class Weapons1 {
	
private License[] wpn1Licenses;
	
	public Weapons1() {
		wpn1Licenses = new License[50];
		
		// Spears
		wpn1Licenses[0] = new License("Spears 1", 		 20, LicenseType.Weapons1, "Allows character to equip Javelin and Spear.");
		wpn1Licenses[1] = new License("Spears 2", 		 25, LicenseType.Weapons1, "Allows character to equip Partisan and Heavy Lance.");
		wpn1Licenses[2] = new License("Spears 3", 		 35, LicenseType.Weapons1, "Allows character to equip Storm Spear and Obelisk.");
		wpn1Licenses[3] = new License("Spears 4",        60, LicenseType.Weapons1, "Allows character to equip Halberd and Trident.");
		wpn1Licenses[4] = new License("Spears 5",        50, LicenseType.Weapons1, "Allows character to equip Holy Lance and Gungnir.");
		wpn1Licenses[5] = new License("Dragon Whisker",  70, LicenseType.Weapons1, "Allows character to equip Dragon Whisker.");
		wpn1Licenses[6] = new License("Vrsahba",        100, LicenseType.Weapons1, "Allows character to equip Vrsahba.");
		wpn1Licenses[7] = new License("Zodiac Spear",   240, LicenseType.Weapons1, "Allows character to equip Zodiac Spear.");
		
		// Swords
		wpn1Licenses[8]  = new License("Swords 1",  15, LicenseType.Weapons1, "Allows character to equip Broadsword.");
		wpn1Licenses[9]  = new License("Swords 2",  25, LicenseType.Weapons1, "Allows character to equip Longsword and Iron Sword.");
		wpn1Licenses[10] = new License("Swords 3",  35, LicenseType.Weapons1, "Allows character to equip Zwill Blade and Ancient Sword.");
		wpn1Licenses[11] = new License("Swords 4",  50, LicenseType.Weapons1, "Allows character to equip Lohengrin and Flametongue.");
		wpn1Licenses[12] = new License("Swords 5",  55, LicenseType.Weapons1, "Allows character to equip Demonsbane and Icebrand.");
		wpn1Licenses[13] = new License("Swords 6",  60, LicenseType.Weapons1, "Allows character to equip Platinum Sword and Bastard Sword.");
		wpn1Licenses[14] = new License("Swords 7",  70, LicenseType.Weapons1, "Allows character to equip Diamond Sword and Runeblade.");
		wpn1Licenses[15] = new License("Swords 8",  80, LicenseType.Weapons1, "Allows character to equip Deathbringer and Stoneblade.");
		wpn1Licenses[16] = new License("Swords 9",  90, LicenseType.Weapons1, "Allows character to equip Durandal and Simha.");
		
		// Greatswords
		wpn1Licenses[17] = new License("Greatswords 1",  50, LicenseType.Weapons1, "Allows character to equip Claymore.");
		wpn1Licenses[18] = new License("Greatswords 2",  70, LicenseType.Weapons1, "Allows character to equip Defender and Save the Queen.");
		wpn1Licenses[19] = new License("Greatswords 3",  80, LicenseType.Weapons1, "Allows character to equip Ultima Blade.");
		wpn1Licenses[20] = new License("Greatswords 4", 100, LicenseType.Weapons1, "Allows character to equip Ragnarok.");
		wpn1Licenses[21] = new License("Excalibur",     135, LicenseType.Weapons1, "Allows character to equip Excalibur.");
		wpn1Licenses[22] = new License("Excalipur",     150, LicenseType.Weapons1, "Allows character to equip Excalipur.");
		wpn1Licenses[23] = new License("Tournesol",     225, LicenseType.Weapons1, "Allows character to equip Tournesol.");
		wpn1Licenses[24] = new License("Bloodsword",     50, LicenseType.Weapons1, "Allows character to equip Bloodsword.");
		wpn1Licenses[25] = new License("Karkata",        80, LicenseType.Weapons1, "Allows character to equip Karkata.");
		
		// Axes & Hammers
		wpn1Licenses[26] = new License("Axes & Hammers 1",  20, LicenseType.Weapons1, "Allows character to equip Handaxe.");
		wpn1Licenses[27] = new License("Axes & Hammers 2",  25, LicenseType.Weapons1, "Allows character to equip Iron Hammer and Broadaxe.");
		wpn1Licenses[28] = new License("Axes & Hammers 3",  35, LicenseType.Weapons1, "Allows character to equip War Hammer and Slasher.");
		wpn1Licenses[29] = new License("Axes & Hammers 4",  50, LicenseType.Weapons1, "Allows character to equip Sledgehammer and Hammerhead.");
		wpn1Licenses[30] = new License("Axes & Hammers 5",  60, LicenseType.Weapons1, "Allows character to equip Francisca and Morning Star.");
		wpn1Licenses[31] = new License("Axes & Hammers 6",  65, LicenseType.Weapons1, "Allows character to equip Greataxe and Golden Axe.");
		wpn1Licenses[32] = new License("Axes & Hammers 7",  85, LicenseType.Weapons1, "Allows character to equip Scorpion Tail.");
		wpn1Licenses[33] = new License("Vrscika",          175, LicenseType.Weapons1, "Allows character to equip Vrscika.");
		
		// Bows
		wpn1Licenses[34] = new License("Bows 1",       20, LicenseType.Weapons1, "Allows character to equip Shortbow.");
		wpn1Licenses[35] = new License("Bows 2",       30, LicenseType.Weapons1, "Allows character to equip Silver Bow and Aevis Killer.");
		wpn1Licenses[36] = new License("Bows 3",       35, LicenseType.Weapons1, "Allows character to equip Killer Bow and Longbow.");
		wpn1Licenses[37] = new License("Bows 4",       45, LicenseType.Weapons1, "Allows character equip Elfin Bow and Loxley Bow.");
		wpn1Licenses[38] = new License("Bows 5",       60, LicenseType.Weapons1, "Allows character equip Giant Stonebow and Burning Bow.");
		wpn1Licenses[39] = new License("Bows 6",       70, LicenseType.Weapons1, "Allows character to equip Traitor's Bow and Yoichi Bow.");
		wpn1Licenses[40] = new License("Bows 7",       90, LicenseType.Weapons1, "Allows character to equip Perseus Bow and Artemis Bow.");
		wpn1Licenses[41] = new License("Sagittarius", 130, LicenseType.Weapons1, "Allows character to equip Sagittarius.");
		wpn1Licenses[42] = new License("Dhanusha",    200, LicenseType.Weapons1, "Allows character to equip Dhanusha.");
		
		// Greatswords
		wpn1Licenses[43] = new License("Katana 1",  35, LicenseType.Weapons1, "Allows character to equip Kotetsu and Osafune.");
		wpn1Licenses[44] = new License("Katana 2",  50, LicenseType.Weapons1, "Allows character to equip Kogarasumaru and Magoroku.");
		wpn1Licenses[45] = new License("Katana 3",  70, LicenseType.Weapons1, "Allows character to equip Murasame and Kiku-ichimonji.");
		wpn1Licenses[46] = new License("Katana 4",  90, LicenseType.Weapons1, "Allows character to equip Yakei and Ame-no-Murakumo.");
		wpn1Licenses[47] = new License("Katana 5", 100, LicenseType.Weapons1, "Allows character to equip Muramasa.");
		wpn1Licenses[48] = new License("Masamune", 130, LicenseType.Weapons1, "Allows character to equip Masamune.");
		wpn1Licenses[49] = new License("Kumbha",    80, LicenseType.Weapons1, "Allows character to equip Kumbha.");
	}
	
	public License getWeapon1(int index) {
		String		 	name 		= wpn1Licenses[index].getName();
		int 			cost 		= wpn1Licenses[index].getCost();
		LicenseType 	type		= wpn1Licenses[index].getType();
		String 			description = wpn1Licenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}

}
