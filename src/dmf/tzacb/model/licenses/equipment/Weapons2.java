package dmf.tzacb.model.licenses.equipment;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class Weapons2 {
	
	private License[] wpn2Licenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[20];
	private static ImageIcon[]	 yesW = new ImageIcon[20];
	
	private static ImageIcon[]	 notB = new ImageIcon[20];
	private static ImageIcon[]	 yesB = new ImageIcon[20];
	
	public Weapons2() {
		
		wpn2Licenses = new License[20];
		
		getWeapons2Icons();
		
		// Rods
		wpn2Licenses[0] = new License("Rods 1", 20, LicenseType.Weapons2, "Allows character to equip Rod and Serpent Rod.", 				notW[0], yesW[0], notB[0], notW[0]);
		wpn2Licenses[1] = new License("Rods 2", 30, LicenseType.Weapons2, "Allows character to equip Healing Rod and Gaia Rod.", 			notW[1], yesW[1], notB[1], notW[1]);
		wpn2Licenses[2] = new License("Rods 3", 40, LicenseType.Weapons2, "Allows character to equip Power Rod and Empyrean Rod.", 			notW[2], yesW[2], notB[2], notW[2]);
		wpn2Licenses[3] = new License("Rods 4", 50, LicenseType.Weapons2, "Allows character to equip Holy Rod.", 							notW[3], yesW[3], notB[3], notW[3]);
		wpn2Licenses[4] = new License("Rod of Faith", 130, LicenseType.Weapons2, "Allows character to equip Rod of Faith.", 				notW[4], yesW[4], notB[4], notW[4]);
		                                                                                                                                                                     
		// Maces                                                                                                                                                             
		wpn2Licenses[5] = new License("Maces 1",  30, LicenseType.Weapons2, "Allows character to equip Mace and Bronze Mace.", 				notW[5], yesW[5], notB[5], notW[5]);
		wpn2Licenses[6] = new License("Maces 2",  40, LicenseType.Weapons2, "Allows character to equip Bhuj and Miter.", 					notW[6], yesW[6], notB[6], notW[6]);
		wpn2Licenses[7] = new License("Maces 3",  60, LicenseType.Weapons2, "Allows character to equip Thorned Mace and Chaos Mace.", 		notW[7], yesW[7], notB[7], notW[7]);
		wpn2Licenses[8] = new License("Maces 4",  65, LicenseType.Weapons2, "Allows character to equip Doom Mace and Zeus Mace.", 			notW[8], yesW[8], notB[8], notW[8]);
		wpn2Licenses[9] = new License("Maces 5", 115, LicenseType.Weapons2, "Allows character to equip Grand Mace and Bone of Byblos.", 	notW[9], yesW[9], notB[9], notW[9]);
		
		// Measures
		wpn2Licenses[10] = new License("Measures 1",  40, LicenseType.Weapons2, "Allows character to equip Gilt Measure.", 					notW[10], yesW[10], notB[10], notW[10]);
		wpn2Licenses[11] = new License("Measures 2",  50, LicenseType.Weapons2, "Allows character to equip Arc Scale and Multiscale.", 		notW[11], yesW[11], notB[11], notW[11]);
		wpn2Licenses[12] = new License("Measures 3",  70, LicenseType.Weapons2, "Allows character to equip Cross Scale and Caliper.", 		notW[12], yesW[12], notB[12], notW[12]);
		wpn2Licenses[13] = new License("Measures 4",  100, LicenseType.Weapons2,"Allows character to equip Euclid's Sextant.", 				notW[13], yesW[13], notB[13], notW[13]);
		                                                                                                                                                                         
		// Staves                                                                                                                                                                
		wpn2Licenses[14] = new License("Staves 1",  15, LicenseType.Weapons2, "Allows character to equip Oak Staff.", 						notW[14], yesW[14], notB[14], notW[14]);
		wpn2Licenses[15] = new License("Staves 2",  25, LicenseType.Weapons2, "Allows character to equip Cherry Staff and Wizard's Staff.",	notW[15], yesW[15], notB[15], notW[15]);
		wpn2Licenses[16] = new License("Staves 3",  30, LicenseType.Weapons2, "Allows character to equip Flame Staff and Storm Staff.", 	notW[16], yesW[16], notB[16], notW[16]);
		wpn2Licenses[17] = new License("Staves 4",  40, LicenseType.Weapons2, "Allows character to equip Glacial Staff and Golden Staff.", 	notW[17], yesW[17], notB[17], notW[17]);
		wpn2Licenses[18] = new License("Staves 5",  65, LicenseType.Weapons2, "Allows character to equip Judicer's Staff and Cloud Staff.", notW[18], yesW[18], notB[18], notW[18]);
		wpn2Licenses[19] = new License("Staff of the Magi", 150, LicenseType.Weapons2,"Allows character to equip Staff of the Magi.", 		notW[19], yesW[19], notB[19], notW[19]);
	}
	
	public License getWeapon2Copy(int index) {
		String		 	name 		= wpn2Licenses[index].getName();
		int 			cost 		= wpn2Licenses[index].getCost();
		LicenseType 	type		= wpn2Licenses[index].getType();
		String 			description = wpn2Licenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getWeapons2Icons() {
		
		// Rods
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods2W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods3W.PNG")); 
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods3W.PNG")); 
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods3B.PNG")); 
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods3B.PNG")); 
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods4W.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods4W.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods4B.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods4B.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods5W.PNG")); 
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods5W.PNG")); 
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nRods5B.PNG")); 
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yRods5B.PNG"));
		
		// Maces
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces1W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces1W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces1B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces1B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces2W.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces2W.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces2B.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces2B.PNG"));
		
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces3W.PNG")); 
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces3W.PNG")); 
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces3B.PNG")); 
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces3B.PNG")); 
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces4W.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces4W.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces4B.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces4B.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces5W.PNG")); 
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces5W.PNG")); 
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMaces5B.PNG")); 
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMaces5B.PNG"));
		
		// Measures
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMeasures1W.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMeasures1W.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMeasures1B.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMeasures1B.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMeasures2W.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMeasures2W.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMeasures2B.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMeasures2B.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMeasures3W.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMeasures3W.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMeasures3B.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMeasures3B.PNG"));
		
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMeasures4W.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMeasures4W.PNG"));
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nMeasures4B.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yMeasures4B.PNG"));
		
		// Staves
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves1W.PNG")); 
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves1W.PNG")); 
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves1B.PNG")); 
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves1B.PNG"));
		
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves2W.PNG"));
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves2W.PNG"));
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves2B.PNG"));
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves2B.PNG"));
		
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves3W.PNG"));
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves3W.PNG"));
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves3B.PNG"));
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves3B.PNG"));
		
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves4W.PNG")); 
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves4W.PNG")); 
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves4B.PNG")); 
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves4B.PNG")); 
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves5W.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves5W.PNG"));
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves5B.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves5B.PNG"));
		
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves6W.PNG")); 
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves6W.PNG")); 
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/nStaves6B.PNG")); 
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/weapons2/yStaves6B.PNG"));
	}

}
