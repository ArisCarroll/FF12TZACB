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
		
		// Mystic Armor
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor2W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor3W.PNG")); 
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor3W.PNG")); 
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor3B.PNG")); 
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor3B.PNG")); 
		                                                                                                              
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor4W.PNG")); 
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor4W.PNG")); 
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor4B.PNG")); 
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor4B.PNG")); 
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor5W.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor5W.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor5B.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor5B.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor6W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor6W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor6B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor6B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor7W.PNG")); 
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor7W.PNG")); 
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor7B.PNG")); 
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor7B.PNG")); 
		                                                                                                              
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor8W.PNG")); 
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor8W.PNG")); 
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor8B.PNG")); 
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor8B.PNG")); 
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor9W.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor9W.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor9B.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor9B.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor10W.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor10W.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor10B.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor10B.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor11W.PNG")); 
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor11W.PNG")); 
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor11B.PNG")); 
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor11B.PNG")); 
		                                                                                                              
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor12W.PNG")); 
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor12W.PNG")); 
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor12B.PNG")); 
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor12B.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor12W.PNG")); 
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor12W.PNG")); 
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/nMysticArmor12B.PNG")); 
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/mysticArmor/yMysticArmor12B.PNG")); 
		
		// Heavy Armor
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor1W.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor1W.PNG"));
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor1B.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor1B.PNG"));
		
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor2W.PNG"));
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor2W.PNG"));
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor2B.PNG"));
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor2B.PNG"));
		
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor3W.PNG")); 
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor3W.PNG")); 
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor3B.PNG")); 
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor3B.PNG")); 
		                                                                                                              
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor4W.PNG")); 
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor4W.PNG")); 
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor4B.PNG")); 
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor4B.PNG")); 
		
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor5W.PNG"));
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor5W.PNG"));
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor5B.PNG"));
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor5B.PNG"));
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor6W.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor6W.PNG"));
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor6B.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor6B.PNG"));
		
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor7W.PNG")); 
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor7W.PNG")); 
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor7B.PNG")); 
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor7B.PNG")); 
		                                                                                                              
		notW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor8W.PNG")); 
		yesW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor8W.PNG")); 
		notB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor8B.PNG")); 
		yesB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor8B.PNG")); 
		
		notW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor9W.PNG"));
		yesW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor9W.PNG"));
		notB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor9B.PNG"));
		yesB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor9B.PNG"));
		
		notW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor10W.PNG"));
		yesW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor10W.PNG"));
		notB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor10B.PNG"));
		yesB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor10B.PNG"));
		
		notW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor11W.PNG")); 
		yesW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor11W.PNG")); 
		notB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor11B.PNG")); 
		yesB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor11B.PNG")); 
		                                                                                                              
		notW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor12W.PNG")); 
		yesW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor12W.PNG")); 
		notB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor12B.PNG")); 
		yesB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor12B.PNG"));
		
		notW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor13W.PNG")); 
		yesW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor13W.PNG")); 
		notB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/nHeavyArmor13B.PNG")); 
		yesB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/heavyArmor/yHeavyArmor13B.PNG")); 
		
		// Light Armor
		notW[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor1W.PNG"));
		yesW[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor1W.PNG"));
		notB[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor1B.PNG"));
		yesB[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor1B.PNG"));
		
		notW[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor2W.PNG"));
		yesW[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor2W.PNG"));
		notB[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor2B.PNG"));
		yesB[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor2B.PNG"));
		
		notW[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor3W.PNG")); 
		yesW[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor3W.PNG")); 
		notB[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor3B.PNG")); 
		yesB[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor3B.PNG")); 
		                                                                                                              
		notW[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor4W.PNG")); 
		yesW[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor4W.PNG")); 
		notB[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor4B.PNG")); 
		yesB[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor4B.PNG")); 
		
		notW[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor5W.PNG"));
		yesW[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor5W.PNG"));
		notB[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor5B.PNG"));
		yesB[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor5B.PNG"));
		
		notW[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor6W.PNG"));
		yesW[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor6W.PNG"));
		notB[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor6B.PNG"));
		yesB[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor6B.PNG"));
		
		notW[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor7W.PNG")); 
		yesW[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor7W.PNG")); 
		notB[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor7B.PNG")); 
		yesB[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor7B.PNG")); 
		                                                                                                              
		notW[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor8W.PNG")); 
		yesW[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor8W.PNG")); 
		notB[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor8B.PNG")); 
		yesB[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor8B.PNG")); 
		
		notW[34] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor9W.PNG"));
		yesW[34] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor9W.PNG"));
		notB[34] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor9B.PNG"));
		yesB[34] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor9B.PNG"));
		
		notW[35] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor10W.PNG"));
		yesW[35] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor10W.PNG"));
		notB[35] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor10B.PNG"));
		yesB[35] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor10B.PNG"));
		
		notW[36] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor11W.PNG")); 
		yesW[36] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor11W.PNG")); 
		notB[36] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor11B.PNG")); 
		yesB[36] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor11B.PNG")); 
		                                                                                                              
		notW[37] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor12W.PNG")); 
		yesW[37] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor12W.PNG")); 
		notB[37] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor12B.PNG")); 
		yesB[37] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor12B.PNG"));
		
		notW[38] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor13W.PNG")); 
		yesW[38] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor13W.PNG")); 
		notB[38] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/nLightArmor13B.PNG")); 
		yesB[38] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/lightArmor/yLightArmor13B.PNG")); 
		
		// Shields
		notW[39] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields1W.PNG"));
		yesW[39] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields1W.PNG"));
		notB[39] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields1B.PNG"));
		yesB[39] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields1B.PNG"));
		
		notW[40] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields2W.PNG"));
		yesW[40] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields2W.PNG"));
		notB[40] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields2B.PNG"));
		yesB[40] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields2B.PNG"));
		
		notW[41] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields3W.PNG")); 
		yesW[41] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields3W.PNG")); 
		notB[41] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields3B.PNG")); 
		yesB[41] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields3B.PNG")); 
		                                                                                                              
		notW[42] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields4W.PNG")); 
		yesW[42] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields4W.PNG")); 
		notB[42] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields4B.PNG")); 
		yesB[42] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields4B.PNG")); 
		
		notW[43] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields5W.PNG"));
		yesW[43] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields5W.PNG"));
		notB[43] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields5B.PNG"));
		yesB[43] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields5B.PNG"));
		
		notW[44] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields6W.PNG"));
		yesW[44] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields6W.PNG"));
		notB[44] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields6B.PNG"));
		yesB[44] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields6B.PNG"));
		
		notW[45] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields7W.PNG")); 
		yesW[45] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields7W.PNG")); 
		notB[45] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields7B.PNG")); 
		yesB[45] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields7B.PNG")); 
		                                                                                                              
		notW[46] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields8W.PNG")); 
		yesW[46] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields8W.PNG")); 
		notB[46] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields8B.PNG")); 
		yesB[46] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields8B.PNG")); 
		
		notW[47] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields9W.PNG"));
		yesW[47] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields9W.PNG"));
		notB[47] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields9B.PNG"));
		yesB[47] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields9B.PNG"));
		
		notW[48] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields10W.PNG"));
		yesW[48] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields10W.PNG"));
		notB[48] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/nShields10B.PNG"));
		yesB[48] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/shields/yShields10B.PNG"));
	}
}
