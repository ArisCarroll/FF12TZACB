package dmf.tzacb.model.licenses.equipment;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class Accessories {
	
private License[] accessoriesLicenses;

	private static ImageIcon[]	 notW = new ImageIcon[23];
	private static ImageIcon[]	 yesW = new ImageIcon[23];
	
	private static ImageIcon[]	 notB = new ImageIcon[23];
	private static ImageIcon[]	 yesB = new ImageIcon[23];
	
	public Accessories () {
		
		accessoriesLicenses = new License[23];
		
		getAccessoryIcons();
		
		// Accessories
		accessoriesLicenses[0]  = new License("Accessories  1",   5, LicenseType.Accessory, "Allows character to equip Orrachea Armlet.", 							notW[0], yesW[0], notB[0], notW[0]);
		accessoriesLicenses[1]  = new License("Accessories  2",  20, LicenseType.Accessory, "Allows character to equip Bangle and Firefly.", 						notW[1], yesW[1], notB[1], notW[1]);
		accessoriesLicenses[2]  = new License("Accessories  3",  25, LicenseType.Accessory, "Allows character to equip Diamond Armlet and Argyle Armlet.", 			notW[2], yesW[2], notB[2], notW[2]);
		accessoriesLicenses[3]  = new License("Accessories  4",  35, LicenseType.Accessory, "Allows character to equip Battle Harness and Steel Gorget.", 			notW[3], yesW[3], notB[3], notW[3]);
		accessoriesLicenses[4]  = new License("Accessories  5",  35, LicenseType.Accessory, "Allows character to equip Tourmaline Ring and Embroidered Tippet.", 	notW[4], yesW[4], notB[4], notW[4]);
		accessoriesLicenses[5]  = new License("Accessories  6",  35, LicenseType.Accessory, "Allows character to equip Golden Amulet and Leather Gorget.", 			notW[5], yesW[5], notB[5], notW[5]);
		accessoriesLicenses[6]  = new License("Accessories  7",  40, LicenseType.Accessory, "Allows character to equip Rose Corsage and Turtleshell Choker.", 		notW[6], yesW[6], notB[6], notW[6]);
		accessoriesLicenses[7]  = new License("Accessories  8",  45, LicenseType.Accessory, "Allows character to equip Thief's Cuffs and Gauntlets.", 				notW[7], yesW[7], notB[7], notW[7]);
		accessoriesLicenses[8]  = new License("Accessories  9",  30, LicenseType.Accessory, "Allows character to equip Amber Armlet and Black Belt.", 				notW[8], yesW[8], notB[8], notW[8]);
		accessoriesLicenses[9]  = new License("Accessories 10",  40, LicenseType.Accessory, "Allows character to equip Jade Collar and Nishijin Belt.", 			notW[9], yesW[9], notB[9], notW[9]);
		accessoriesLicenses[10] = new License("Accessories 11",  45, LicenseType.Accessory, "Allows character to equip Pheasant Netsuke and Blazer Gloves.", 		notW[10], yesW[10], notB[10], notW[10]);
		accessoriesLicenses[11] = new License("Accessories 12",  60, LicenseType.Accessory, "Allows character to equip Gillie Boots and Steel Poleyns.", 			notW[11], yesW[11], notB[11], notW[11]);
		accessoriesLicenses[12] = new License("Accessories 13",  60, LicenseType.Accessory, "Allows character to equip Berserker Bracers and Magick Gloves.", 		notW[12], yesW[12], notB[12], notW[12]);
		accessoriesLicenses[13] = new License("Accessories 14",  70, LicenseType.Accessory, "Allows character to equip Sage's Ring and Agate Ring.", 				notW[13], yesW[13], notB[13], notW[13]);
		accessoriesLicenses[14] = new License("Accessories 15",  70, LicenseType.Accessory, "Allows character to equip Ruby Ring and Bowline Sash.", 				notW[14], yesW[14], notB[14], notW[14]);
		accessoriesLicenses[15] = new License("Accessories 16",  70, LicenseType.Accessory, "Allows character to equip Cameo Belt and Cat-ear Hood.", 				notW[15], yesW[15], notB[15], notW[15]);
		accessoriesLicenses[16] = new License("Accessories 17",  80, LicenseType.Accessory, "Allows character to equip Bubble Belt and Fuzzy Mitre.", 				notW[16], yesW[16], notB[16], notW[16]);
		accessoriesLicenses[17] = new License("Accessories 18",  80, LicenseType.Accessory, "Allows character to equip Sash and Power Armlet.", 					notW[17], yesW[17], notB[17], notW[17]);
		accessoriesLicenses[18] = new License("Accessories 19", 100, LicenseType.Accessory, "Allows character to equip Indigo Pendant and Winged Boots.", 			notW[18], yesW[18], notB[18], notW[18]);
		accessoriesLicenses[19] = new License("Accessories 20", 115, LicenseType.Accessory, "Allows character to equip Opal Ring and Hermes Sandals.", 				notW[19], yesW[19], notB[19], notW[19]);
		accessoriesLicenses[20] = new License("Accessories 21", 130, LicenseType.Accessory, "Allows character to equip Quasimodo Boots and Nihopalaoa.", 			notW[20], yesW[20], notB[20], notW[20]);
		accessoriesLicenses[21] = new License("Accessories 22", 160, LicenseType.Accessory, "Allows character to equip Germinas Boots and Ring of Renewal.", 		notW[21], yesW[21], notB[21], notW[21]);
		accessoriesLicenses[22] = new License("Ribbon",         215, LicenseType.Accessory, "Allows character to equip Ribbon.", 									notW[22], yesW[22], notB[22], notW[22]);
	}		
	
	public License getAccessoryCopy(int index) {
		String		 	name 		= accessoriesLicenses[index].getName();
		int 			cost 		= accessoriesLicenses[index].getCost();
		LicenseType 	type		= accessoriesLicenses[index].getType();
		String 			description = accessoriesLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getAccessoryIcons() {
		
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG")); 
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG")); 
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG")); 
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG")); 
		                                                                                                              
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG")); 
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG")); 
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG")); 
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG")); 
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		                                                                                                             
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		                                                                                                             
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		                                                                                                             
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreW.PNG"));
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreW.PNG"));
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nMagLoreB.PNG"));
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yMagLoreB.PNG"));
		
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nChanneling1W.PNG"));
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yChanneling1W.PNG"));
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nChanneling1B.PNG"));
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yChanneling1B.PNG"));
		
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nChanneling2W.PNG"));
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yChanneling2W.PNG"));
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nChanneling2B.PNG"));
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yChanneling2B.PNG"));
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nChanneling3W.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yChanneling3W.PNG"));
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nChanneling3B.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yChanneling3B.PNG"));
		
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nSerenityW.PNG"));
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/ySerenityW.PNG"));
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nSerenityB.PNG"));
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/ySerenityB.PNG"));
		
		notW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nSpellbreakerW.PNG"));
		yesW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/ySpellbreakerW.PNG"));
		notB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nSpellbreakerB.PNG"));
		yesB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/ySpellbreakerB.PNG"));
		
		notW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nInquisitorW.PNG"));
		yesW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yInquisitorW.PNG"));
		notB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nInquisitorB.PNG"));
		yesB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yInquisitorB.PNG"));
		
		notW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nWarmageW.PNG"));
		yesW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yWarmageW.PNG"));
		notB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/nWarmageB.PNG"));
		yesB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/accessories/yWarmageB.PNG"));
		
	}
}
