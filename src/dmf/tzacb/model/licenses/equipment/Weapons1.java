package dmf.tzacb.model.licenses.equipment;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class Weapons1 {
	
private License[] wpn1Licenses;

	private static ImageIcon[]	 notW = new ImageIcon[50];
	private static ImageIcon[]	 yesW = new ImageIcon[50];
	
	private static ImageIcon[]	 notB = new ImageIcon[50];
	private static ImageIcon[]	 yesB = new ImageIcon[50];
	
	public Weapons1() {
		wpn1Licenses = new License[50];
		
		getWeapons1Icons();
		
		// Spears
		wpn1Licenses[0] = new License("Spears 1", 		 20, LicenseType.Weapons1, "Allows character to equip Javelin and Spear.", 				notW[0], yesW[0], notB[0], notW[0]);
		wpn1Licenses[1] = new License("Spears 2", 		 25, LicenseType.Weapons1, "Allows character to equip Partisan and Heavy Lance.", 		notW[1], yesW[1], notB[1], notW[1]);
		wpn1Licenses[2] = new License("Spears 3", 		 35, LicenseType.Weapons1, "Allows character to equip Storm Spear and Obelisk.", 		notW[2], yesW[2], notB[2], notW[2]);
		wpn1Licenses[3] = new License("Spears 4",        60, LicenseType.Weapons1, "Allows character to equip Halberd and Trident.", 			notW[3], yesW[3], notB[3], notW[3]);
		wpn1Licenses[4] = new License("Spears 5",        50, LicenseType.Weapons1, "Allows character to equip Holy Lance and Gungnir.", 		notW[4], yesW[4], notB[4], notW[4]);
		wpn1Licenses[5] = new License("Dragon Whisker",  70, LicenseType.Weapons1, "Allows character to equip Dragon Whisker.", 				notW[5], yesW[5], notB[5], notW[5]);
		wpn1Licenses[6] = new License("Vrsahba",        100, LicenseType.Weapons1, "Allows character to equip Vrsahba.", 						notW[6], yesW[6], notB[6], notW[6]);
		wpn1Licenses[7] = new License("Zodiac Spear",   240, LicenseType.Weapons1, "Allows character to equip Zodiac Spear.", 					notW[7], yesW[7], notB[7], notW[7]);
		                                                                                                                                                                         
		// Swords                                                                                                                                                                
		wpn1Licenses[8]  = new License("Swords 1",  15, LicenseType.Weapons1, "Allows character to equip Broadsword.", 							notW[8], yesW[8], notB[8], notW[8]);
		wpn1Licenses[9]  = new License("Swords 2",  25, LicenseType.Weapons1, "Allows character to equip Longsword and Iron Sword.", 			notW[9], yesW[9], notB[9], notW[9]);
		wpn1Licenses[10] = new License("Swords 3",  35, LicenseType.Weapons1, "Allows character to equip Zwill Blade and Ancient Sword.", 		notW[10], yesW[10], notB[10], notW[10]);
		wpn1Licenses[11] = new License("Swords 4",  50, LicenseType.Weapons1, "Allows character to equip Lohengrin and Flametongue.", 			notW[11], yesW[11], notB[11], notW[11]);
		wpn1Licenses[12] = new License("Swords 5",  55, LicenseType.Weapons1, "Allows character to equip Demonsbane and Icebrand.", 			notW[12], yesW[12], notB[12], notW[12]);
		wpn1Licenses[13] = new License("Swords 6",  60, LicenseType.Weapons1, "Allows character to equip Platinum Sword and Bastard Sword.", 	notW[13], yesW[13], notB[13], notW[13]);
		wpn1Licenses[14] = new License("Swords 7",  70, LicenseType.Weapons1, "Allows character to equip Diamond Sword and Runeblade.", 		notW[14], yesW[14], notB[14], notW[14]);
		wpn1Licenses[15] = new License("Swords 8",  80, LicenseType.Weapons1, "Allows character to equip Deathbringer and Stoneblade.", 		notW[15], yesW[15], notB[15], notW[15]);
		wpn1Licenses[16] = new License("Swords 9",  90, LicenseType.Weapons1, "Allows character to equip Durandal and Simha.", 					notW[16], yesW[16], notB[16], notW[16]);
		                                                                                                                                                                             
		// Greatswords                                                                                                                                                               
		wpn1Licenses[17] = new License("Greatswords 1",  50, LicenseType.Weapons1, "Allows character to equip Claymore.", 						notW[17], yesW[17], notB[17], notW[17]);
		wpn1Licenses[18] = new License("Greatswords 2",  70, LicenseType.Weapons1, "Allows character to equip Defender and Save the Queen.", 	notW[18], yesW[18], notB[18], notW[18]);
		wpn1Licenses[19] = new License("Greatswords 3",  80, LicenseType.Weapons1, "Allows character to equip Ultima Blade.", 					notW[19], yesW[19], notB[19], notW[19]);
		wpn1Licenses[20] = new License("Greatswords 4", 100, LicenseType.Weapons1, "Allows character to equip Ragnarok.", 						notW[20], yesW[20], notB[20], notW[20]);
		wpn1Licenses[21] = new License("Excalibur",     135, LicenseType.Weapons1, "Allows character to equip Excalibur.", 						notW[21], yesW[21], notB[21], notW[21]);
		wpn1Licenses[22] = new License("Excalipur",     150, LicenseType.Weapons1, "Allows character to equip Excalipur.", 						notW[22], yesW[22], notB[22], notW[22]);
		wpn1Licenses[23] = new License("Tournesol",     225, LicenseType.Weapons1, "Allows character to equip Tournesol.", 						notW[23], yesW[23], notB[23], notW[23]);
		wpn1Licenses[24] = new License("Bloodsword",     50, LicenseType.Weapons1, "Allows character to equip Bloodsword.", 					notW[24], yesW[24], notB[24], notW[24]);
		wpn1Licenses[25] = new License("Karkata",        80, LicenseType.Weapons1, "Allows character to equip Karkata.", 						notW[25], yesW[25], notB[25], notW[25]);
		                                                                                                                                                                             
		// Axes & Hammers                                                                                                                                                            
		wpn1Licenses[26] = new License("Axes & Hammers 1",  20, LicenseType.Weapons1, "Allows character to equip Handaxe.", 					notW[26], yesW[26], notB[26], notW[26]);
		wpn1Licenses[27] = new License("Axes & Hammers 2",  25, LicenseType.Weapons1, "Allows character to equip Iron Hammer and Broadaxe.", 	notW[27], yesW[27], notB[27], notW[27]);
		wpn1Licenses[28] = new License("Axes & Hammers 3",  35, LicenseType.Weapons1, "Allows character to equip War Hammer and Slasher.", 		notW[28], yesW[28], notB[28], notW[28]);
		wpn1Licenses[29] = new License("Axes & Hammers 4",  50, LicenseType.Weapons1, "Allows character to equip Sledgehammer and Hammerhead.", notW[29], yesW[29], notB[29], notW[29]);
		wpn1Licenses[30] = new License("Axes & Hammers 5",  60, LicenseType.Weapons1, "Allows character to equip Francisca and Morning Star.", 	notW[30], yesW[30], notB[30], notW[30]);
		wpn1Licenses[31] = new License("Axes & Hammers 6",  65, LicenseType.Weapons1, "Allows character to equip Greataxe and Golden Axe.", 	notW[31], yesW[31], notB[31], notW[31]);
		wpn1Licenses[32] = new License("Axes & Hammers 7",  85, LicenseType.Weapons1, "Allows character to equip Scorpion Tail.", 				notW[32], yesW[32], notB[32], notW[32]);
		wpn1Licenses[33] = new License("Vrscika",          175, LicenseType.Weapons1, "Allows character to equip Vrscika.", 					notW[33], yesW[33], notB[33], notW[33]);
		                                                                                                                                                                             
		// Bows                                                                                                                                                                      
		wpn1Licenses[34] = new License("Bows 1",       20, LicenseType.Weapons1, "Allows character to equip Shortbow.", 						notW[34], yesW[34], notB[34], notW[34]);
		wpn1Licenses[35] = new License("Bows 2",       30, LicenseType.Weapons1, "Allows character to equip Silver Bow and Aevis Killer.", 		notW[35], yesW[35], notB[35], notW[35]);
		wpn1Licenses[36] = new License("Bows 3",       35, LicenseType.Weapons1, "Allows character to equip Killer Bow and Longbow.", 			notW[36], yesW[36], notB[36], notW[36]);
		wpn1Licenses[37] = new License("Bows 4",       45, LicenseType.Weapons1, "Allows character equip Elfin Bow and Loxley Bow.", 			notW[37], yesW[37], notB[37], notW[37]);
		wpn1Licenses[38] = new License("Bows 5",       60, LicenseType.Weapons1, "Allows character equip Giant Stonebow and Burning Bow.", 		notW[38], yesW[38], notB[38], notW[38]);
		wpn1Licenses[39] = new License("Bows 6",       70, LicenseType.Weapons1, "Allows character to equip Traitor's Bow and Yoichi Bow.", 	notW[39], yesW[39], notB[39], notW[39]);
		wpn1Licenses[40] = new License("Bows 7",       90, LicenseType.Weapons1, "Allows character to equip Perseus Bow and Artemis Bow.", 		notW[40], yesW[40], notB[40], notW[40]);
		wpn1Licenses[41] = new License("Sagittarius", 130, LicenseType.Weapons1, "Allows character to equip Sagittarius.", 						notW[41], yesW[41], notB[41], notW[41]);
		wpn1Licenses[42] = new License("Dhanusha",    200, LicenseType.Weapons1, "Allows character to equip Dhanusha.", 						notW[42], yesW[42], notB[42], notW[42]);
		
		// Katanas
		wpn1Licenses[43] = new License("Katana 1",  35, LicenseType.Weapons1, "Allows character to equip Kotetsu and Osafune.", 				notW[43], yesW[43], notB[43], notW[43]);
		wpn1Licenses[44] = new License("Katana 2",  50, LicenseType.Weapons1, "Allows character to equip Kogarasumaru and Magoroku.", 			notW[44], yesW[44], notB[44], notW[44]);
		wpn1Licenses[45] = new License("Katana 3",  70, LicenseType.Weapons1, "Allows character to equip Murasame and Kiku-ichimonji.", 		notW[45], yesW[45], notB[45], notW[45]);
		wpn1Licenses[46] = new License("Katana 4",  90, LicenseType.Weapons1, "Allows character to equip Yakei and Ame-no-Murakumo.", 			notW[46], yesW[46], notB[46], notW[46]);
		wpn1Licenses[47] = new License("Katana 5", 100, LicenseType.Weapons1, "Allows character to equip Muramasa.", 							notW[47], yesW[47], notB[47], notW[47]);
		wpn1Licenses[48] = new License("Masamune", 130, LicenseType.Weapons1, "Allows character to equip Masamune.", 							notW[48], yesW[48], notB[48], notW[48]);
		wpn1Licenses[49] = new License("Kumbha",    80, LicenseType.Weapons1, "Allows character to equip Kumbha.", 								notW[49], yesW[49], notB[49], notW[49]);
	}
	
	public License getWeapon1Copy(int index) {
		String		 	name 		= wpn1Licenses[index].getName();
		int 			cost 		= wpn1Licenses[index].getCost();
		LicenseType 	type		= wpn1Licenses[index].getType();
		String 			description = wpn1Licenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[0], yesW[0], notB[0], notW[0]);
	}

	private void getWeapons1Icons() {
		
		// Spears
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears2W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears3W.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears3W.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears3B.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears3B.PNG"));
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears4W.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears4W.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears4B.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears4B.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears5W.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears5W.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears5B.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears5B.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears6W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears6W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears6B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears6B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears7W.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears7W.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears7B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears7B.PNG"));
		
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears8W.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears8W.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSpears8B.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySpears8B.PNG"));
		
		// Swords
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords1W.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords1W.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords1B.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords1B.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords2W.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords2W.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords2B.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords2B.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords3W.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords3W.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords3B.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords3B.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords4W.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords4W.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords4B.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords4B.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords5W.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords5W.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords5B.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords5B.PNG"));
		
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords6W.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords6W.PNG"));
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords6B.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords6B.PNG"));
		
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords7W.PNG"));
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords7W.PNG"));
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords7B.PNG"));
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords7B.PNG"));
		
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords8W.PNG"));
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords8W.PNG"));
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords8B.PNG"));
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords8B.PNG"));
		
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords9W.PNG"));
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords9W.PNG"));
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nSwords9B.PNG"));
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/ySwords9B.PNG"));
		
		// Greatswords
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords1W.PNG"));
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords1W.PNG"));
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords1B.PNG"));
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords1B.PNG"));
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords2W.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords2W.PNG"));
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords2B.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords2B.PNG"));
		
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords3W.PNG"));
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords3W.PNG"));
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords3B.PNG"));
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords3B.PNG"));
		
		notW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords4W.PNG"));
		yesW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords4W.PNG"));
		notB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords4B.PNG"));
		yesB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords4B.PNG"));
		
		notW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords5W.PNG"));
		yesW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords5W.PNG"));
		notB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords5B.PNG"));
		yesB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords5B.PNG"));
		
		notW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords6W.PNG"));
		yesW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords6W.PNG"));
		notB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords6B.PNG"));
		yesB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords6B.PNG"));
		
		notW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords7W.PNG"));
		yesW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords7W.PNG"));
		notB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords7B.PNG"));
		yesB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords7B.PNG"));
		
		notW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords8W.PNG"));
		yesW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords8W.PNG"));
		notB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords8B.PNG"));
		yesB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords8B.PNG"));
		
		notW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords9W.PNG"));
		yesW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords9W.PNG"));
		notB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nGreatswords9B.PNG"));
		yesB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yGreatswords9B.PNG"));
		
		// Axes and Hammers
		notW[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers1W.PNG"));
		yesW[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers1W.PNG"));
		notB[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers1B.PNG"));
		yesB[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers1B.PNG"));
		
		notW[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers2W.PNG"));
		yesW[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers2W.PNG"));
		notB[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers2B.PNG"));
		yesB[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers2B.PNG"));
		
		notW[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers3W.PNG"));
		yesW[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers3W.PNG"));
		notB[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers3B.PNG"));
		yesB[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers3B.PNG"));
		
		notW[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers4W.PNG"));
		yesW[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers4W.PNG"));
		notB[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers4B.PNG"));
		yesB[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers4B.PNG"));
		
		notW[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers5W.PNG"));
		yesW[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers5W.PNG"));
		notB[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers5B.PNG"));
		yesB[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers5B.PNG"));
		
		notW[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers6W.PNG"));
		yesW[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers6W.PNG"));
		notB[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers6B.PNG"));
		yesB[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers6B.PNG"));
		
		notW[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers7W.PNG"));
		yesW[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers7W.PNG"));
		notB[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers7B.PNG"));
		yesB[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers7B.PNG"));
		
		notW[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers8W.PNG"));
		yesW[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers8W.PNG"));
		notB[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nAxesHammers8B.PNG"));
		yesB[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yAxesHammers8B.PNG"));
		
		// Bows
		notW[34] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows1W.PNG"));
		yesW[34] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows1W.PNG"));
		notB[34] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows1B.PNG"));
		yesB[34] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows1B.PNG"));
		
		notW[35] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows2W.PNG"));
		yesW[35] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows2W.PNG"));
		notB[35] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows2B.PNG"));
		yesB[35] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows2B.PNG"));
		
		notW[36] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows3W.PNG"));
		yesW[36] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows3W.PNG"));
		notB[36] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows3B.PNG"));
		yesB[36] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows3B.PNG"));
		
		notW[37] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows4W.PNG"));
		yesW[37] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows4W.PNG"));
		notB[37] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows4B.PNG"));
		yesB[37] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows4B.PNG"));
		
		notW[38] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows5W.PNG"));
		yesW[38] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows5W.PNG"));
		notB[38] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows5B.PNG"));
		yesB[38] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows5B.PNG"));
		
		notW[39] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows6W.PNG"));
		yesW[39] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows6W.PNG"));
		notB[39] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows6B.PNG"));
		yesB[39] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows6B.PNG"));
		
		notW[40] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows7W.PNG"));
		yesW[40] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows7W.PNG"));
		notB[40] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows7B.PNG"));
		yesB[40] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows7B.PNG"));
		
		notW[41] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows8W.PNG"));
		yesW[41] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows8W.PNG"));
		notB[41] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows8B.PNG"));
		yesB[41] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows8B.PNG"));
		
		notW[42] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows9W.PNG"));
		yesW[42] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows9W.PNG"));
		notB[42] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nBows9B.PNG"));
		yesB[42] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yBows9B.PNG"));
		
		// Katanas
		notW[43] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas1W.PNG"));
		yesW[43] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas1W.PNG"));
		notB[43] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas1B.PNG"));
		yesB[43] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas1B.PNG"));
		
		notW[44] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas2W.PNG"));
		yesW[44] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas2W.PNG"));
		notB[44] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas2B.PNG"));
		yesB[44] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas2B.PNG"));
		
		notW[45] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas3W.PNG"));
		yesW[45] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas3W.PNG"));
		notB[45] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas3B.PNG"));
		yesB[45] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas3B.PNG"));
		
		notW[46] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas4W.PNG"));
		yesW[46] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas4W.PNG"));
		notB[46] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas4B.PNG"));
		yesB[46] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas4B.PNG"));
		
		notW[47] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas5W.PNG"));
		yesW[47] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas5W.PNG"));
		notB[47] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas5B.PNG"));
		yesB[47] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas5B.PNG"));
		
		notW[48] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas6W.PNG"));
		yesW[48] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas6W.PNG"));
		notB[48] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas6B.PNG"));
		yesB[48] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas6B.PNG"));
		
		notW[49] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas7W.PNG"));
		yesW[49] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas7W.PNG"));
		notB[49] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/nKatanas7B.PNG"));
		yesB[49] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons1/yKatanas7B.PNG"));
	}
}
