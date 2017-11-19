package dmf.tzacb.model.licenses.augments;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class MagickAugments {
	
	private License[] maloLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[26];
	private static ImageIcon[]	 yesW = new ImageIcon[26];
	
	private static ImageIcon[]	 notB = new ImageIcon[26];
	private static ImageIcon[]	 yesB = new ImageIcon[26];
	
	public MagickAugments () {
		
		maloLicenses = new License[26];
		
		getMagickIcons();
		
		// Espers Quckenings Essentials and Empty
		maloLicenses[0]   = new License("Magick Lore  1",  30, LicenseType.Augment, "Increases Magick potency.", notW[0], yesW[0], notB[0], notW[0]);
		maloLicenses[1]   = new License("Magick Lore  2",  30, LicenseType.Augment, "Increases Magick potency.", notW[1], yesW[1], notB[1], notW[1]);
		maloLicenses[2]   = new License("Magick Lore  3",  30, LicenseType.Augment, "Increases Magick potency.", notW[2], yesW[2], notB[2], notW[2]);
		maloLicenses[3]   = new License("Magick Lore  4",  30, LicenseType.Augment, "Increases Magick potency.", notW[3], yesW[3], notB[3], notW[3]);
		maloLicenses[4]   = new License("Magick Lore  5",  50, LicenseType.Augment, "Increases Magick potency.", notW[4], yesW[4], notB[4], notW[4]);
		maloLicenses[5]   = new License("Magick Lore  6",  50, LicenseType.Augment, "Increases Magick potency.", notW[5], yesW[5], notB[5], notW[5]);
		maloLicenses[6]   = new License("Magick Lore  7",  50, LicenseType.Augment, "Increases Magick potency.", notW[6], yesW[6], notB[6], notW[6]);
		maloLicenses[7]   = new License("Magick Lore  8",  50, LicenseType.Augment, "Increases Magick potency.", notW[7], yesW[7], notB[7], notW[7]);
		maloLicenses[8]   = new License("Magick Lore  9",  70, LicenseType.Augment, "Increases Magick potency.", notW[8], yesW[8], notB[8], notW[8]);
		maloLicenses[9]   = new License("Magick Lore 10",  70, LicenseType.Augment, "Increases Magick potency.", notW[9], yesW[9], notB[9], notW[9]);
		maloLicenses[10]  = new License("Magick Lore 11",  70, LicenseType.Augment, "Increases Magick potency.", notW[10], yesW[10], notB[10], notW[10]);
		maloLicenses[11]  = new License("Magick Lore 12",  70, LicenseType.Augment, "Increases Magick potency.", notW[11], yesW[11], notB[11], notW[11]);
		maloLicenses[12]  = new License("Magick Lore 13", 100, LicenseType.Augment, "Increases Magick potency.", notW[12], yesW[12], notB[12], notW[12]);	
		maloLicenses[13]  = new License("Magick Lore 14", 100, LicenseType.Augment, "Increases Magick potency.", notW[13], yesW[13], notB[13], notW[13]);	
		maloLicenses[14]  = new License("Magick Lore 15", 100, LicenseType.Augment, "Increases Magick potency.", notW[14], yesW[14], notB[14], notW[14]);	
		maloLicenses[15]  = new License("Magick Lore 16", 100, LicenseType.Augment, "Increases Magick potency.", notW[15], yesW[15], notB[15], notW[15]);
		maloLicenses[16]  = new License("Channeling 1",    30, LicenseType.Augment, "Reduces magick MP cost by 10%.", notW[16], yesW[16], notB[16], notW[16]);	
		maloLicenses[17]  = new License("Channeling 2",    50, LicenseType.Augment, "Reduces magick MP cost by 10%.", notW[17], yesW[17], notB[17], notW[17]);	
		maloLicenses[18]  = new License("Channeling 3",    80, LicenseType.Augment, "Reduces magick MP cost by 10%.", notW[18], yesW[18], notB[18], notW[18]);
		maloLicenses[19]  = new License("Serenity",        70, LicenseType.Augment, "Increases magick power when HP is full.",  notW[19], yesW[19], notB[19], notW[19]);
		maloLicenses[20]  = new License("Spellbreaker",    65, LicenseType.Augment, "Increases magick power when HP critical.", notW[20], yesW[20], notB[20], notW[20]);
		maloLicenses[21]  = new License("Inquisitor",      30, LicenseType.Augment, "Gain MP after dealing damage.",            notW[21], yesW[21], notB[21], notW[21]);
		maloLicenses[22]  = new License("Warmage",         30, LicenseType.Augment, "Gain MP after dealing magick damage.",     notW[22], yesW[22], notB[22], notW[22]);
		maloLicenses[23]  = new License("Headsman",        30, LicenseType.Augment, "Gain MP after defeating a foe.",           notW[23], yesW[23], notB[23], notW[23]);
		maloLicenses[24]  = new License("Martyr",          30, LicenseType.Augment, "Gain MP after taking damage.",             notW[24], yesW[24], notB[24], notW[24]);
		maloLicenses[25]  = new License("Spellbound",      30, LicenseType.Augment, "Increases duration of status effects.",    notW[25], yesW[25], notB[25], notW[25]);
	}

	public License getMagickLoreCopy(int index) {
		String		 	name 		= maloLicenses[index].getName();
		int 			cost 		= maloLicenses[index].getCost();
		LicenseType 	type		= maloLicenses[index].getType();
		String 			description = maloLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getMagickIcons() {
		
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG")); 
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG")); 
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG")); 
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG")); 
		                                                                                                              
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG")); 
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG")); 
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG")); 
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG")); 
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		                                                                                                             
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		                                                                                                             
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		                                                                                                             
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreW.PNG"));
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreW.PNG"));
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMagLoreB.PNG"));
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMagLoreB.PNG"));
		
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nChanneling1W.PNG"));
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yChanneling1W.PNG"));
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nChanneling1B.PNG"));
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yChanneling1B.PNG"));
		
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nChanneling2W.PNG"));
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yChanneling2W.PNG"));
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nChanneling2B.PNG"));
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yChanneling2B.PNG"));
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nChanneling3W.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yChanneling3W.PNG"));
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nChanneling3B.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yChanneling3B.PNG"));
		
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nSerenityW.PNG"));
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/ySerenityW.PNG"));
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nSerenityB.PNG"));
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/ySerenityB.PNG"));
		
		notW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nSpellbreakerW.PNG"));
		yesW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/ySpellbreakerW.PNG"));
		notB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nSpellbreakerB.PNG"));
		yesB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/ySpellbreakerB.PNG"));
		
		notW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nInquisitorW.PNG"));
		yesW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yInquisitorW.PNG"));
		notB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nInquisitorB.PNG"));
		yesB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yInquisitorB.PNG"));
		
		notW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nWarmageW.PNG"));
		yesW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yWarmageW.PNG"));
		notB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nWarmageB.PNG"));
		yesB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yWarmageB.PNG"));
		
		notW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nHeadsmanW.PNG"));
		yesW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yHeadsmanW.PNG"));
		notB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nHeadsmanB.PNG"));
		yesB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yHeadsmanB.PNG"));
		
		notW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMartyrW.PNG"));
		yesW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMartyrW.PNG"));
		notB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nMartyrB.PNG"));
		yesB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/yMartyrB.PNG"));
		
		notW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nSpellboundW.PNG"));
		yesW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/ySpellboundW.PNG"));
		notB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/nSpellboundB.PNG"));
		yesB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/magAug/ySpellboundB.PNG"));
		
	}
}
