package dmf.tzacb.model.licenses.equipment;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class Weapons3 {
	
	private License[] wpn3Licenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[34];
	private static ImageIcon[]	 yesW = new ImageIcon[34];
	
	private static ImageIcon[]	 notB = new ImageIcon[34];
	private static ImageIcon[]	 yesB = new ImageIcon[34];
	
	public Weapons3 () {
		
		wpn3Licenses = new License[34];
		
		getWeapons3Icons();
		
		// Daggers
		wpn3Licenses[0] = new License("Daggers 1",               15, LicenseType.Weapons3, "Allows character to equip Dagger.", 										notW[0], yesW[0], notB[0], notW[0]);
		wpn3Licenses[1] = new License("Daggers 2",               20, LicenseType.Weapons3, "Allows character to equip Mage Masher and Assassin's Dagger.", 				notW[1], yesW[1], notB[1], notW[1]);
		wpn3Licenses[2] = new License("Daggers 3",               35, LicenseType.Weapons3, "Allows character to equip Chopper and Main Gauche.", 						notW[2], yesW[2], notB[2], notW[2]);
		wpn3Licenses[3] = new License("Daggers 4",               45, LicenseType.Weapons3, "Allows character to equip Gladius and Avenger.", 							notW[3], yesW[3], notB[3], notW[3]);
		wpn3Licenses[4] = new License("Daggers 5",               60, LicenseType.Weapons3, "Allows character to equip Orichalcum Dirk and Platinum Dagger.", 			notW[4], yesW[4], notB[4], notW[4]);
		wpn3Licenses[5] = new License("Daggers 6",               80, LicenseType.Weapons3, "Allows character to equip Zwill Crossblade.", 								notW[5], yesW[5], notB[5], notW[5]);
		wpn3Licenses[6] = new License("Shikari Nagasa & Minai", 220, LicenseType.Weapons3, "Allows character to equip Shikari Nagasa and Mina.", 						notW[6], yesW[6], notB[6], notW[6]);
		                                                                                                                                                                                                 
		// Ninja Swords                                                                                                                                                                                       
		wpn3Licenses[7]  = new License("Ninja Swords 1",         100, LicenseType.Weapons3, "Allows character to equip Ashura, Sakura-saezuri, Kagenui, and Orochi.",	notW[7], yesW[7], notB[7], notW[7]);
		wpn3Licenses[8]  = new License("Ninja Swords 2",         120, LicenseType.Weapons3, "Allows character to equip Iga Blade.", 									notW[8], yesW[8], notB[8], notW[8]);
		wpn3Licenses[9]  = new License("Ninja Swords 3",         120, LicenseType.Weapons3, "Allows character to equip Koga Blade.", 									notW[9], yesW[9], notB[9], notW[9]);
		wpn3Licenses[10] = new License("Yagyu Darkblade & Mesa", 180, LicenseType.Weapons3, "Allows character to equip Yagyu Darkblade and Mesa.", 						notW[10], yesW[10], notB[10], notW[10]);
		                                                                                                                                                                                                     
		// Hand Bombs                                                                                                                                                                                           
		wpn3Licenses[11] = new License("Hand-bombs 1",  35, LicenseType.Weapons3, "Allows character to equip Hornito.", 												notW[11], yesW[11], notB[11], notW[11]);
		wpn3Licenses[12] = new License("Hand-bombs 2",  55, LicenseType.Weapons3, "Allows character to equip Fumarole and Tumulus.", 									notW[12], yesW[12], notB[12], notW[12]);
		wpn3Licenses[13] = new License("Hand-bombs 3",  75, LicenseType.Weapons3, "Allows character to equip Caldera and Volcano.", 									notW[13], yesW[13], notB[13], notW[13]);
		wpn3Licenses[14] = new License("Makara",       105, LicenseType.Weapons3, "Allows character to equip Makara.", 													notW[14], yesW[14], notB[14], notW[14]);
		                                                                                                                                                                                                     
		// Crossbows                                                                                                                                                                                         
		wpn3Licenses[15] = new License("Crossbows 1",  25, LicenseType.Weapons3, "Allows character to equip Bowgun and Crossbow.", 										notW[15], yesW[15], notB[15], notW[15]);
		wpn3Licenses[16] = new License("Crossbows 2",  40, LicenseType.Weapons3, "Allows character to equip Paramina Crossbow and Recurve Crossbow.", 					notW[16], yesW[16], notB[16], notW[16]);
		wpn3Licenses[17] = new License("Crossbows 3",  60, LicenseType.Weapons3, "Allows character to equip Hunting Crossbow and Penetrator Crossbow.", 				notW[17], yesW[17], notB[17], notW[17]);
		wpn3Licenses[18] = new License("Crossbows 4", 115, LicenseType.Weapons3, "Allows character to equip Gastrophetes and Tula.", 									notW[18], yesW[18], notB[18], notW[18]);
		                                                                                                                                                                                                     
		// Poles                                                                                                                                                                                             
		wpn3Licenses[19] = new License("Poles 1",        20, LicenseType.Weapons3, "Allows character to equip Oaken Pole.", 											notW[19], yesW[19], notB[19], notW[19]);
		wpn3Licenses[20] = new License("Poles 2",        30, LicenseType.Weapons3, "Allows character to equip Cypress Pole and Battle Bamboo.", 						notW[20], yesW[20], notB[20], notW[20]);
		wpn3Licenses[21] = new License("Poles 3",        35, LicenseType.Weapons3, "Allows character to equip Musk Stick and Iron Pole.", 								notW[21], yesW[21], notB[21], notW[21]);
		wpn3Licenses[22] = new License("Poles 4",        40, LicenseType.Weapons3, "Allows character to equip Six-fluted Pole and Gokuu Pole.", 						notW[22], yesW[22], notB[22], notW[22]);
		wpn3Licenses[23] = new License("Poles 5",        50, LicenseType.Weapons3, "Allows character to equip Zephyr Pole and Ivory Pole.", 							notW[23], yesW[23], notB[23], notW[23]);
		wpn3Licenses[24] = new License("Poles 6",        60, LicenseType.Weapons3, "Allows character to equip Sweep and Eight-fluted Pole.", 							notW[24], yesW[24], notB[24], notW[24]);
		wpn3Licenses[25] = new License("Whale Whisker",  90, LicenseType.Weapons3, "Allows character to equip Whale Whisker.", 											notW[25], yesW[25], notB[25], notW[25]);
		wpn3Licenses[26] = new License("Kanya",         180, LicenseType.Weapons3, "Allows character to equip Kanya.", 													notW[26], yesW[26], notB[26], notW[26]);
		                                                                                                                                                                                                     
		// Guns                                                                                                                                                                                              
		wpn3Licenses[27] = new License("Guns 1",   30, LicenseType.Weapons3, "Allows character to equip Altair.", 														notW[27], yesW[27], notB[27], notW[27]);
		wpn3Licenses[28] = new License("Guns 2",   50, LicenseType.Weapons3, "Allows character to equip Capella and Vega.", 											notW[28], yesW[28], notB[28], notW[28]);
		wpn3Licenses[29] = new License("Guns 3",   60, LicenseType.Weapons3, "Allows character to equip Sirius and Betelgeuse.", 										notW[29], yesW[29], notB[29], notW[29]);
		wpn3Licenses[30] = new License("Guns 4",   70, LicenseType.Weapons3, "Allows character to equip Ras Algethi and Aldebaran.", 									notW[30], yesW[30], notB[30], notW[30]);
		wpn3Licenses[31] = new License("Guns 5",   90, LicenseType.Weapons3, "Allows character to equip Spica and Antares.", 											notW[31], yesW[31], notB[31], notW[31]);
		wpn3Licenses[32] = new License("Guns 6",  100, LicenseType.Weapons3, "Allows character to equip Arcturus and Fomalhaut.", 										notW[32], yesW[32], notB[32], notW[32]);
		wpn3Licenses[33] = new License("Mithuna", 190, LicenseType.Weapons3, "Allows character to equip Mithuna.", 														notW[33], yesW[33], notB[33], notW[33]);
		
	}
	
	public License getWeapon3Copy(int index) {
		String		 	name 		= wpn3Licenses[index].getName();
		int 			cost 		= wpn3Licenses[index].getCost();
		LicenseType 	type		= wpn3Licenses[index].getType();
		String 			description = wpn3Licenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getWeapons3Icons() {
		
		// Daggers
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers2W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers3W.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers3W.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers3B.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers3B.PNG"));
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers4W.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers4W.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers4B.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers4B.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers5W.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers5W.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers5B.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers5B.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers6W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers6W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers6B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers6B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers7W.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers7W.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nDaggers7B.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yDaggers7B.PNG"));
		  
		// Ninja Swords
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nNinjaSwords1W.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yNinjaSwords1W.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nNinjaSwords1B.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yNinjaSwords1B.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nNinjaSwords2W.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yNinjaSwords2W.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nNinjaSwords2B.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yNinjaSwords2B.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nNinjaSwords3W.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yNinjaSwords3W.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nNinjaSwords3B.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yNinjaSwords3B.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nNinjaSwords4W.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yNinjaSwords4W.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nNinjaSwords4B.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yNinjaSwords4B.PNG"));
		
		// Hand Bombs
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nHandBombs1W.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yHandBombs1W.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nHandBombs1B.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yHandBombs1B.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nHandBombs2W.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yHandBombs2W.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nHandBombs2B.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yHandBombs2B.PNG"));
		
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nHandBombs3W.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yHandBombs3W.PNG"));
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nHandBombs3B.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yHandBombs3B.PNG"));
		
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nHandBombs4W.PNG"));
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yHandBombs4W.PNG"));
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nHandBombs4B.PNG"));
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yHandBombs4B.PNG"));
		
		// Crossbows
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nCrossBows1W.PNG"));
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yCrossBows1W.PNG"));
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nCrossBows1B.PNG"));
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yCrossBows1B.PNG"));
		
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nCrossBows2W.PNG"));
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yCrossBows2W.PNG"));
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nCrossBows2B.PNG"));
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yCrossBows2B.PNG"));
		
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nCrossBows3W.PNG"));
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yCrossBows3W.PNG"));
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nCrossBows3B.PNG"));
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yCrossBows3B.PNG"));
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nCrossBows4W.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yCrossBows4W.PNG"));
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nCrossBows4B.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yCrossBows4B.PNG"));
		
		// Poles
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles1W.PNG"));
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles1W.PNG"));
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles1B.PNG"));
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles1B.PNG"));
		
		notW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles2W.PNG"));
		yesW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles2W.PNG"));
		notB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles2B.PNG"));
		yesB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles2B.PNG"));
		
		notW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles3W.PNG"));
		yesW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles3W.PNG"));
		notB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles3B.PNG"));
		yesB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles3B.PNG"));
		
		notW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles4W.PNG"));
		yesW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles4W.PNG"));
		notB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles4B.PNG"));
		yesB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles4B.PNG"));
		
		notW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles5W.PNG"));
		yesW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles5W.PNG"));
		notB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles5B.PNG"));
		yesB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles5B.PNG"));
		
		notW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles6W.PNG"));
		yesW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles6W.PNG"));
		notB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles6B.PNG"));
		yesB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles6B.PNG"));
		
		notW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles7W.PNG"));
		yesW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles7W.PNG"));
		notB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles7B.PNG"));
		yesB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles7B.PNG"));
		
		notW[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles8W.PNG"));
		yesW[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles8W.PNG"));
		notB[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nPoles8B.PNG"));
		yesB[26] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yPoles8B.PNG"));
		
		// Guns
		notW[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns1W.PNG"));
		yesW[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns1W.PNG"));
		notB[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns1B.PNG"));
		yesB[27] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns1B.PNG"));
		
		notW[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns2W.PNG"));
		yesW[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns2W.PNG"));
		notB[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns2B.PNG"));
		yesB[28] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns2B.PNG"));
		
		notW[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns3W.PNG"));
		yesW[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns3W.PNG"));
		notB[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns3B.PNG"));
		yesB[29] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns3B.PNG"));
		
		notW[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns4W.PNG"));
		yesW[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns4W.PNG"));
		notB[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns4B.PNG"));
		yesB[30] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns4B.PNG"));
		
		notW[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns5W.PNG"));
		yesW[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns5W.PNG"));
		notB[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns5B.PNG"));
		yesB[31] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns5B.PNG"));
		
		notW[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns6W.PNG"));
		yesW[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns6W.PNG"));
		notB[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns6B.PNG"));
		yesB[32] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns6B.PNG"));
		
		notW[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns7W.PNG"));
		yesW[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns7W.PNG"));
		notB[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/nGuns7B.PNG"));
		yesB[33] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons3/yGuns7B.PNG"));
	}

}
