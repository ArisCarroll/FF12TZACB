package dmf.tzacb.model.licenses.equipment;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class Armor {
	
	private static ImageIcon[]	 notW = new ImageIcon[49];
	private static ImageIcon[]	 yesW = new ImageIcon[49];
	
	private static ImageIcon[]	 notB = new ImageIcon[49];
	private static ImageIcon[]	 yesB = new ImageIcon[49];
	
private License[] armorLicenses;
	
	public Armor () {
		
		armorLicenses = new License[49];
		
		getArmorIcons();
		
		// Mystic Armor
		armorLicenses[0]  = new License("Mystic Armor  1", 	10, LicenseType.Armor, "Allows character to equip Cotton Cap, Magick Curch, Cotton Shirt, and Light Woven Shirt.", 				notW[0], yesW[0], notB[0], notW[0]);
		armorLicenses[1]  = new License("Mystic Armor  2", 	15, LicenseType.Armor, "Allows character to equip Pointy Hat, Topkapi Hat, Silken Shirt, Kilimweave Shirt.", 					notW[1], yesW[1], notB[1], notW[1]);
		armorLicenses[2]  = new License("Mystic Armor  3", 	20, LicenseType.Armor, "Allows character to equip Calot Hat, Wizard's Hat, Shepherd's Bolero, and Wizard's Robes.", 			notW[2], yesW[2], notB[2], notW[2]);
		armorLicenses[3]  = new License("Mystic Armor  4",  25, LicenseType.Armor, "Allows character to equip Lambent Hat, Feathered Cap, Chanter's Djellaba, and Traveler's Vestment.",	notW[3], yesW[3], notB[3], notW[3]);
		armorLicenses[4]  = new License("Mystic Armor  5",  30, LicenseType.Armor, "Allows character to equip Mage's Hat, Mage's Habit, Lamia's Tiara, and Enchanter's Habit.", 			notW[4], yesW[4], notB[4], notW[4]);
		armorLicenses[5]  = new License("Mystic Armor  6",  40, LicenseType.Armor, "Allows character to equip Black Cowl, Sorcerer's Hat, Sorcerer's Habit, and Black Garb.", 				notW[5], yesW[5], notB[5], notW[5]);
		armorLicenses[6]  = new License("Mystic Armor  7",  50, LicenseType.Armor, "Allows character to equip Astrakhan Hat, Gaia Hat, Carmagnole, and Maduin Gear.", 						notW[6], yesW[6], notB[6], notW[6]);
		armorLicenses[7]  = new License("Mystic Armor  8",  60, LicenseType.Armor, "Allows character to equip Hypnocrown, Gold Hairpin, Jade Gown, and Gaia Gear.", 						notW[7], yesW[7], notB[7], notW[7]);
		armorLicenses[8]  = new License("Mystic Armor  9",  70, LicenseType.Armor, "Allows character to equip Celebrant's Miter and Cleric's Robes.", 										notW[8], yesW[8], notB[8], notW[8]);
		armorLicenses[9]  = new License("Mystic Armor 10",  75, LicenseType.Armor, "Allows character to equip Black Mask and Black Robes.", 												notW[9], yesW[9], notB[9], notW[9]);
		armorLicenses[10] = new License("Mystic Armor 11",  80, LicenseType.Armor, "Allows character to equip White Mask and White Robes.", 												notW[10], yesW[10], notB[10], notW[10]);
		armorLicenses[11] = new License("Mystic Armor 12",  90, LicenseType.Armor, "Allows character to equip Golden Skullcap and Glimmering Robes.", 										notW[11], yesW[11], notB[11], notW[11]);
		armorLicenses[12] = new License("Mystic Armor 13", 110, LicenseType.Armor, "Allows character to equip Circlet and Lordly Robes.", 													notW[12], yesW[12], notB[12], notW[12]);
		                                                                                                                                                                                                                         
		// Heavy Armor                                                                                                                                                                                                           
		armorLicenses[13] = new License("Heavy Armor  1",  25, LicenseType.Armor, "Allows character to equip Cotton Cap, Magick Curch, Cotton Shirt, and Light Woven Shirt.", 				notW[13], yesW[13], notB[13], notW[13]);
		armorLicenses[14] = new License("Heavy Armor  2",  30, LicenseType.Armor, "Allows character to equip Pointy Hat, Topkapi Hat, Silken Shirt, Kilimweave Shirt.", 					notW[14], yesW[14], notB[14], notW[14]);
		armorLicenses[15] = new License("Heavy Armor  3",  35, LicenseType.Armor, "Allows character to equip Calot Hat, Wizard's Hat, Shepherd's Bolero, and Wizard's Robes.", 				notW[15], yesW[15], notB[15], notW[15]);
		armorLicenses[16] = new License("Heavy Armor  4",  40, LicenseType.Armor, "Allows character to equip Lambent Hat, Feathered Cap, Chanter's Djellaba, and Traveler's Vestment.", 	notW[16], yesW[16], notB[16], notW[16]);
		armorLicenses[17] = new License("Heavy Armor  5",  50, LicenseType.Armor, "Allows character to equip Mage's Hat, Mage's Habit, Lamia's Tiara, and Enchanter's Habit.", 				notW[17], yesW[17], notB[17], notW[17]);
		armorLicenses[18] = new License("Heavy Armor  6",  55, LicenseType.Armor, "Allows character to equip Black Cowl, Sorcerer's Hat, Sorcerer's Habit, and Black Garb.", 				notW[18], yesW[18], notB[18], notW[18]);
		armorLicenses[19] = new License("Heavy Armor  7",  60, LicenseType.Armor, "Allows character to equip Astrakhan Hat, Gaia Hat, Carmagnole, and Maduin Gear.", 						notW[19], yesW[19], notB[19], notW[19]);
		armorLicenses[20] = new License("Heavy Armor  8",  65, LicenseType.Armor, "Allows character to equip Hypnocrown, Gold Hairpin, Jade Gown, and Gaia Gear.", 							notW[20], yesW[20], notB[20], notW[20]);
		armorLicenses[21] = new License("Heavy Armor  9",  70, LicenseType.Armor, "Allows character to equip Celebrant's Miter and Cleric's Robes.", 										notW[21], yesW[21], notB[21], notW[21]);
		armorLicenses[22] = new License("Heavy Armor 10",  80, LicenseType.Armor, "Allows character to equip Black Mask and Black Robes.", 													notW[22], yesW[22], notB[22], notW[22]);
		armorLicenses[23] = new License("Heavy Armor 11",  90, LicenseType.Armor, "Allows character to equip White Mask and White Robes.", 													notW[23], yesW[23], notB[23], notW[23]);
		armorLicenses[24] = new License("Heavy Armor 12", 110, LicenseType.Armor, "Allows character to equip Golden Skullcap and Glimmering Robes.", 										notW[24], yesW[24], notB[24], notW[24]);
		armorLicenses[25] = new License("Genji Armor",    190, LicenseType.Armor, "Allows character to equip Genji Shield, Genji Helm, Genji Armor, and Genji Gloves.", 					notW[25], yesW[25], notB[25], notW[25]);
		                                                                                                                                                                                                                         
		// Light Armor                                                                                                                                                                                                           
		armorLicenses[26] = new License("Light Armor  1",  10, LicenseType.Armor, "Allows character to equip Leather Cap and Leather Clothing.", 											notW[26], yesW[26], notB[26], notW[26]);
		armorLicenses[27] = new License("Light Armor  2",  15, LicenseType.Armor, "Allows character to equip Headgear, Headguard, Chromed Leathers, and Leather Breastplate.", 				notW[27], yesW[27], notB[27], notW[27]);
		armorLicenses[28] = new License("Light Armor  3",  20, LicenseType.Armor, "Allows character to equip Leather Headgear, Horned Hat, Bronze Chestplate, and Ringmail.", 				notW[28], yesW[28], notB[28], notW[28]);
		armorLicenses[29] = new License("Light Armor  4",  25, LicenseType.Armor, "Allows character to equip Balaclava, Soldier's Cap, Windbreaker, and Heavy Coat.", 						notW[29], yesW[29], notB[29], notW[29]);
		armorLicenses[30] = new License("Light Armor  5",  30, LicenseType.Armor, "Allows character to equip Green Beret, Red Cap, Survival Vest, and Brigandine.", 						notW[30], yesW[30], notB[30], notW[30]);
		armorLicenses[31] = new License("Light Armor  6",  40, LicenseType.Armor, "Allows character to equip Headband, Pirate Hat, Jujitsu Gi, and Viking Coat.", 							notW[31], yesW[31], notB[31], notW[31]);
		armorLicenses[32] = new License("Light Armor  7",  50, LicenseType.Armor, "Allows character to equip Goggle Mask, Adamant Hat, Metal Jerkin, and Adamant Vest.", 					notW[32], yesW[32], notB[32], notW[32]);
		armorLicenses[33] = new License("Light Armor  8",  60, LicenseType.Armor, "Allows character to equip Officer's Hat, Chakra Band, Barrel Coat, and Power Vest.", 					notW[33], yesW[33], notB[33], notW[33]);
		armorLicenses[34] = new License("Light Armor  9",  70, LicenseType.Armor, "Allows character to equip Thief's Cap, Gigas Hat, Ninja Gear, and Gigas Chestplate.", 					notW[34], yesW[34], notB[34], notW[34]);
		armorLicenses[35] = new License("Light Armor 10",  75, LicenseType.Armor, "Allows character to equip Chaperon and Minerva Bustier.", 												notW[35], yesW[35], notB[35], notW[35]);
		armorLicenses[36] = new License("Light Armor 11",  80, LicenseType.Armor, "Allows character to equip Crown of Laurels, Rubber Suit.", 												notW[36], yesW[36], notB[36], notW[36]);
		armorLicenses[37] = new License("Light Armor 12",  90, LicenseType.Armor, "Allows character to equip Renewing Morion and Mirage Vest.", 											notW[37], yesW[37], notB[37], notW[37]);
		armorLicenses[38] = new License("Light Armor 13", 110, LicenseType.Armor, "Allows character to equip Dueling Mask and Brave Suit.", 												notW[38], yesW[38], notB[38], notW[38]);
		                                                                                                                                                                                                                         
		// Shields                                                                                                                                                                                                               
		armorLicenses[39] = new License("Shields 1",           15, LicenseType.Armor, "Allows character to equip Leather Shield and Buckler.", 												notW[39], yesW[39], notB[39], notW[39]);
		armorLicenses[40] = new License("Shields 2",           20, LicenseType.Armor, "Allows character to equip Bronze Shield and Round Shield.", 											notW[40], yesW[40], notB[40], notW[40]);
		armorLicenses[41] = new License("Shields 3",           25, LicenseType.Armor, "Allows character to equip Golden Shield, Ice Shield, and Flame Shield.", 							notW[41], yesW[41], notB[41], notW[41]);
		armorLicenses[42] = new License("Shields 4",           30, LicenseType.Armor, "Allows character to equip Diamond Shield, Platinum Shield, and Dragon Shield.", 						notW[42], yesW[42], notB[42], notW[42]);
		armorLicenses[43] = new License("Shields 5",           35, LicenseType.Armor, "Allows character to equip Crystal Shield and Kaiser Shield.", 										notW[43], yesW[43], notB[43], notW[43]);
		armorLicenses[44] = new License("Shields 6",           40, LicenseType.Armor, "Allows character to equip Aegis Shield and Demon Shield.", 											notW[44], yesW[44], notB[44], notW[44]);
		armorLicenses[45] = new License("Shields 7",           65, LicenseType.Armor, "Allows character to equip Venetian Shield.", 														notW[45], yesW[45], notB[45], notW[45]);
		armorLicenses[46] = new License("Shell Shield",        90, LicenseType.Armor, "Allows character to equip Shell Shield.", 															notW[46], yesW[46], notB[46], notW[46]);
		armorLicenses[47] = new License("Ensanguined Shield", 100, LicenseType.Armor, "Allows character to equip Ensanguined Shield.", 														notW[47], yesW[47], notB[47], notW[47]);
		armorLicenses[48] = new License("Zodiac Escutcheon",  235, LicenseType.Armor, "Allows character to equip Zodiac Escutcheon.", 														notW[48], yesW[48], notB[48], notW[48]);		
	}

	public License getArmorCopy(int index) {
		String		 	name 		= armorLicenses[index].getName();
		int 			cost 		= armorLicenses[index].getCost();
		LicenseType 	type		= armorLicenses[index].getType();
		String 			description = armorLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getArmorIcons() {
		
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/nMagLoreW.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/yMagLoreW.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/nMagLoreB.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/yMagLoreB.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/nMagLoreW.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/yMagLoreW.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/nMagLoreB.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/yMagLoreB.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/nMagLoreW.PNG")); 
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/yMagLoreW.PNG")); 
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/nMagLoreB.PNG")); 
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/yMagLoreB.PNG")); 
		                                                                                                              
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/nMagLoreW.PNG")); 
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/yMagLoreW.PNG")); 
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/nMagLoreB.PNG")); 
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/armor/yMagLoreB.PNG")); 
	}
}
