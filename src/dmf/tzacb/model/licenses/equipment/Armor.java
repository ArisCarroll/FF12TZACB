package dmf.tzacb.model.licenses.equipment;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class Armor {
	
private License[] armorLicenses;
	
	public Armor () {
		
		armorLicenses = new License[49];
		
		// Mystic Armor
		armorLicenses[0]  = new License("Mystic Armor  1", 	10, LicenseType.Armor, "Allows character to equip Cotton Cap, Magick Curch, Cotton Shirt, and Light Woven Shirt.");
		armorLicenses[1]  = new License("Mystic Armor  2", 	15, LicenseType.Armor, "Allows character to equip Pointy Hat, Topkapi Hat, Silken Shirt, Kilimweave Shirt.");
		armorLicenses[2]  = new License("Mystic Armor  3", 	20, LicenseType.Armor, "Allows character to equip Calot Hat, Wizard's Hat, Shepherd's Bolero, and Wizard's Robes.");
		armorLicenses[3]  = new License("Mystic Armor  4",  25, LicenseType.Armor, "Allows character to equip Lambent Hat, Feathered Cap, Chanter's Djellaba, and Traveler's Vestment.");
		armorLicenses[4]  = new License("Mystic Armor  5",  30, LicenseType.Armor, "Allows character to equip Mage's Hat, Mage's Habit, Lamia's Tiara, and Enchanter's Habit.");
		armorLicenses[5]  = new License("Mystic Armor  6",  40, LicenseType.Armor, "Allows character to equip Black Cowl, Sorcerer's Hat, Sorcerer's Habit, and Black Garb.");
		armorLicenses[6]  = new License("Mystic Armor  7",  50, LicenseType.Armor, "Allows character to equip Astrakhan Hat, Gaia Hat, Carmagnole, and Maduin Gear.");
		armorLicenses[7]  = new License("Mystic Armor  8",  60, LicenseType.Armor, "Allows character to equip Hypnocrown, Gold Hairpin, Jade Gown, and Gaia Gear.");
		armorLicenses[8]  = new License("Mystic Armor  9",  70, LicenseType.Armor, "Allows character to equip Celebrant's Miter and Cleric's Robes.");
		armorLicenses[9]  = new License("Mystic Armor 10",  75, LicenseType.Armor, "Allows character to equip Black Mask and Black Robes.");
		armorLicenses[10] = new License("Mystic Armor 11",  80, LicenseType.Armor, "Allows character to equip White Mask and White Robes.");
		armorLicenses[11] = new License("Mystic Armor 12",  90, LicenseType.Armor, "Allows character to equip Golden Skullcap and Glimmering Robes.");
		armorLicenses[12] = new License("Mystic Armor 13", 110, LicenseType.Armor, "Allows character to equip Circlet and Lordly Robes.");
		
		// Heavy Armor
		armorLicenses[13] = new License("Heavy Armor  1",  25, LicenseType.Armor, "Allows character to equip Cotton Cap, Magick Curch, Cotton Shirt, and Light Woven Shirt.");
		armorLicenses[14] = new License("Heavy Armor  2",  30, LicenseType.Armor, "Allows character to equip Pointy Hat, Topkapi Hat, Silken Shirt, Kilimweave Shirt.");
		armorLicenses[15] = new License("Heavy Armor  3",  35, LicenseType.Armor, "Allows character to equip Calot Hat, Wizard's Hat, Shepherd's Bolero, and Wizard's Robes.");
		armorLicenses[16] = new License("Heavy Armor  4",  40, LicenseType.Armor, "Allows character to equip Lambent Hat, Feathered Cap, Chanter's Djellaba, and Traveler's Vestment.");
		armorLicenses[17] = new License("Heavy Armor  5",  50, LicenseType.Armor, "Allows character to equip Mage's Hat, Mage's Habit, Lamia's Tiara, and Enchanter's Habit.");
		armorLicenses[18] = new License("Heavy Armor  6",  55, LicenseType.Armor, "Allows character to equip Black Cowl, Sorcerer's Hat, Sorcerer's Habit, and Black Garb.");
		armorLicenses[19] = new License("Heavy Armor  7",  60, LicenseType.Armor, "Allows character to equip Astrakhan Hat, Gaia Hat, Carmagnole, and Maduin Gear.");
		armorLicenses[20] = new License("Heavy Armor  8",  65, LicenseType.Armor, "Allows character to equip Hypnocrown, Gold Hairpin, Jade Gown, and Gaia Gear.");
		armorLicenses[21] = new License("Heavy Armor  9",  70, LicenseType.Armor, "Allows character to equip Celebrant's Miter and Cleric's Robes.");
		armorLicenses[22] = new License("Heavy Armor 10",  80, LicenseType.Armor, "Allows character to equip Black Mask and Black Robes.");
		armorLicenses[23] = new License("Heavy Armor 11",  90, LicenseType.Armor, "Allows character to equip White Mask and White Robes.");
		armorLicenses[24] = new License("Heavy Armor 12", 110, LicenseType.Armor, "Allows character to equip Golden Skullcap and Glimmering Robes.");
		armorLicenses[25] = new License("Genji Armor",    190, LicenseType.Armor, "Allows character to equip Genji Shield, Genji Helm, Genji Armor, and Genji Gloves.");
		
		// Light Armor
		armorLicenses[26] = new License("Light Armor  1",  10, LicenseType.Armor, "Allows character to equip Leather Cap and Leather Clothing.");
		armorLicenses[27] = new License("Light Armor  2",  15, LicenseType.Armor, "Allows character to equip Headgear, Headguard, Chromed Leathers, and Leather Breastplate.");
		armorLicenses[28] = new License("Light Armor  3",  20, LicenseType.Armor, "Allows character to equip Leather Headgear, Horned Hat, Bronze Chestplate, and Ringmail.");
		armorLicenses[29] = new License("Light Armor  4",  25, LicenseType.Armor, "Allows character to equip Balaclava, Soldier's Cap, Windbreaker, and Heavy Coat.");
		armorLicenses[30] = new License("Light Armor  5",  30, LicenseType.Armor, "Allows character to equip Green Beret, Red Cap, Survival Vest, and Brigandine.");
		armorLicenses[31] = new License("Light Armor  6",  40, LicenseType.Armor, "Allows character to equip Headband, Pirate Hat, Jujitsu Gi, and Viking Coat.");
		armorLicenses[32] = new License("Light Armor  7",  50, LicenseType.Armor, "Allows character to equip Goggle Mask, Adamant Hat, Metal Jerkin, and Adamant Vest.");
		armorLicenses[33] = new License("Light Armor  8",  60, LicenseType.Armor, "Allows character to equip Officer's Hat, Chakra Band, Barrel Coat, and Power Vest.");
		armorLicenses[34] = new License("Light Armor  9",  70, LicenseType.Armor, "Allows character to equip Thief's Cap, Gigas Hat, Ninja Gear, and Gigas Chestplate.");
		armorLicenses[35] = new License("Light Armor 10",  75, LicenseType.Armor, "Allows character to equip Chaperon and Minerva Bustier.");
		armorLicenses[36] = new License("Light Armor 11",  80, LicenseType.Armor, "Allows character to equip Crown of Laurels, Rubber Suit.");
		armorLicenses[37] = new License("Light Armor 12",  90, LicenseType.Armor, "Allows character to equip Renewing Morion and Mirage Vest.");
		armorLicenses[38] = new License("Light Armor 13", 110, LicenseType.Armor, "Allows character to equip Dueling Mask and Brave Suit.");
		
		// Shields
		armorLicenses[39] = new License("Shields 1",           15, LicenseType.Armor, "Allows character to equip Leather Shield and Buckler.");
		armorLicenses[40] = new License("Shields 2",           20, LicenseType.Armor, "Allows character to equip Bronze Shield and Round Shield.");
		armorLicenses[41] = new License("Shields 3",           25, LicenseType.Armor, "Allows character to equip Golden Shield, Ice Shield, and Flame Shield.");
		armorLicenses[42] = new License("Shields 4",           30, LicenseType.Armor, "Allows character to equip Diamond Shield, Platinum Shield, and Dragon Shield.");
		armorLicenses[43] = new License("Shields 5",           35, LicenseType.Armor, "Allows character to equip Crystal Shield and Kaiser Shield.");
		armorLicenses[44] = new License("Shields 6",           40, LicenseType.Armor, "Allows character to equip Aegis Shield and Demon Shield.");
		armorLicenses[45] = new License("Shields 7",           65, LicenseType.Armor, "Allows character to equip Venetian Shield.");
		armorLicenses[46] = new License("Shell Shield",        90, LicenseType.Armor, "Allows character to equip Shell Shield.");
		armorLicenses[47] = new License("Ensanguined Shield", 100, LicenseType.Armor, "Allows character to equip Ensanguined Shield.");
		armorLicenses[48] = new License("Zodiac Escutcheon",  235, LicenseType.Armor, "Allows character to equip Zodiac Escutcheon.");		
	}

	public License getArmorCopy(int index) {
		String		 	name 		= armorLicenses[index].getName();
		int 			cost 		= armorLicenses[index].getCost();
		LicenseType 	type		= armorLicenses[index].getType();
		String 			description = armorLicenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}
}
