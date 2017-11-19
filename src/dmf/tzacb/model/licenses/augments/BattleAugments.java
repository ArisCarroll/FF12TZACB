package dmf.tzacb.model.licenses.augments;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class BattleAugments {
	
	private License[] baloLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[26];
	private static ImageIcon[]	 yesW = new ImageIcon[26];
	
	private static ImageIcon[]	 notB = new ImageIcon[26];
	private static ImageIcon[]	 yesB = new ImageIcon[26];
	
	public BattleAugments () {
		
		baloLicenses = new License[26];
		
		getBattleIcons();
		
		// Battle Augmentations
		baloLicenses[0]   = new License("Battle Lore  1",  30, LicenseType.Augment, "Increases physical attack damage.", notW[0], yesW[0], notB[0], notW[0]);
		baloLicenses[1]   = new License("Battle Lore  2",  30, LicenseType.Augment, "Increases physical attack damage.", notW[1], yesW[1], notB[1], notW[1]);
		baloLicenses[2]   = new License("Battle Lore  3",  30, LicenseType.Augment, "Increases physical attack damage.", notW[2], yesW[2], notB[2], notW[2]);
		baloLicenses[3]   = new License("Battle Lore  4",  30, LicenseType.Augment, "Increases physical attack damage.", notW[3], yesW[3], notB[3], notW[3]);
		baloLicenses[4]   = new License("Battle Lore  5",  50, LicenseType.Augment, "Increases physical attack damage.", notW[4], yesW[4], notB[4], notW[4]);
		baloLicenses[5]   = new License("Battle Lore  6",  50, LicenseType.Augment, "Increases physical attack damage.", notW[5], yesW[5], notB[5], notW[5]);
		baloLicenses[6]   = new License("Battle Lore  7",  50, LicenseType.Augment, "Increases physical attack damage.", notW[6], yesW[6], notB[6], notW[6]);
		baloLicenses[7]   = new License("Battle Lore  8",  50, LicenseType.Augment, "Increases physical attack damage.", notW[7], yesW[7], notB[7], notW[7]);
		baloLicenses[8]   = new License("Battle Lore  9",  70, LicenseType.Augment, "Increases physical attack damage.", notW[8], yesW[8], notB[8], notW[8]);
		baloLicenses[9]   = new License("Battle Lore 10",  70, LicenseType.Augment, "Increases physical attack damage.", notW[9], yesW[9], notB[9], notW[9]);
		baloLicenses[10]  = new License("Battle Lore 11",  70, LicenseType.Augment, "Increases physical attack damage.", notW[10], yesW[10], notB[10], notW[10]);
		baloLicenses[11]  = new License("Battle Lore 12",  70, LicenseType.Augment, "Increases physical attack damage.", notW[11], yesW[11], notB[11], notW[11]);
		baloLicenses[12]  = new License("Battle Lore 13", 100, LicenseType.Augment, "Increases physical attack damage.", notW[12], yesW[12], notB[12], notW[12]);	
		baloLicenses[13]  = new License("Battle Lore 14", 100, LicenseType.Augment, "Increases physical attack damage.", notW[13], yesW[13], notB[13], notW[13]);	
		baloLicenses[14]  = new License("Battle Lore 15", 100, LicenseType.Augment, "Increases physical attack damage.", notW[14], yesW[14], notB[14], notW[14]);	
		baloLicenses[15]  = new License("Battle Lore 16", 100, LicenseType.Augment, "Increases physical attack damage.", notW[15], yesW[15], notB[15], notW[15]);
		baloLicenses[16]  = new License("Swiftness 1",     30, LicenseType.Augment, "Reduces action time by 10%.", notW[16], yesW[16], notB[16], notW[16]);
		baloLicenses[17]  = new License("Swiftness 2",     50, LicenseType.Augment, "Reduces action time by 10%.", notW[17], yesW[17], notB[17], notW[17]);
		baloLicenses[18]  = new License("Swiftness 3",     80, LicenseType.Augment, "Reduces action time by 10%.", notW[18], yesW[18], notB[18], notW[18]);
		baloLicenses[19]  = new License("Shield Block 1",  25, LicenseType.Augment, "Increases chance to block using shield.", notW[19], yesW[19], notB[19], notW[19]);
		baloLicenses[20]  = new License("Shield Block 2",  45, LicenseType.Augment, "Increases chance to block using shield.", notW[20], yesW[20], notB[20], notW[20]);
		baloLicenses[21]  = new License("Shield Block 3",  75, LicenseType.Augment, "Increases chance to block using shield.", notW[21], yesW[21], notB[21], notW[21]);
		baloLicenses[22]  = new License("Focus",           30, LicenseType.Augment, "Increases strength when HP is full.",  notW[22], yesW[22], notB[22], notW[22]);
		baloLicenses[23]  = new License("Adrenaline",      65, LicenseType.Augment, "Increases strength when HP critical.", notW[23], yesW[23], notB[23], notW[23]);
		baloLicenses[24]  = new License("Last Stand",      70, LicenseType.Augment, "Increases defense when HP critical.",  notW[24], yesW[24], notB[24], notW[24]);
		baloLicenses[25]  = new License("Brawler",         90, LicenseType.Augment, "Increases attack power when fighting empty-handed.", notW[25], yesW[25], notB[25], notW[25]);
	}
	
	public License getBattleLoreCopy(int index) {
		String		 	name 		= baloLicenses[index].getName();
		int 			cost 		= baloLicenses[index].getCost();
		LicenseType 	type		= baloLicenses[index].getType();
		String 			description = baloLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getBattleIcons() {
		
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG"));
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreW.PNG"));
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBattleLoreB.PNG"));
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBattleLoreW.PNG")); 
		
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nSwiftnessW.PNG"));
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/swiftnessW.PNG"));
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nSwiftnessB.PNG"));
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/swiftnessB.PNG"));
		
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nSwiftnessW.PNG"));
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/swiftnessW.PNG")); 
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nSwiftnessB.PNG"));
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/swiftnessB.PNG")); 
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nSwiftnessW.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/swiftnessW.PNG")); 
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nSwiftnessB.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/swiftnessB.PNG")); 
		
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nShieldBlockW.PNG"));
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/ShieldBlockW.PNG"));
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nShieldBlockB.PNG"));
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/ShieldBlockB.PNG"));
		
		notW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nShieldBlockW.PNG"));
		yesW[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/ShieldBlockW.PNG")); 
		notB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nShieldBlockB.PNG"));
		yesB[20] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/ShieldBlockB.PNG")); 
		
		notW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nShieldBlockW.PNG"));
		yesW[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/ShieldBlockW.PNG")); 
		notB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nShieldBlockB.PNG"));
		yesB[21] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/ShieldBlockB.PNG")); 
		
		notW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nFocusW.PNG"));
		yesW[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/focusW.PNG"));
		notB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nFocusB.PNG"));
		yesB[22] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/focusB.PNG"));
		
		notW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nAdrenalineW.PNG"));
		yesW[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/adrenalineW.PNG"));
		notB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nAdrenalineB.PNG"));
		yesB[23] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/adrenalineB.PNG"));
		
		notW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nLastStandW.PNG"));
		yesW[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yLastStandW.PNG"));
		notB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nLastStandB.PNG"));
		yesB[24] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yLastStandB.PNG"));
		
		notW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBrawlerW.PNG"));
		yesW[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBrawlerW.PNG"));
		notB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/nBrawlerB.PNG"));
		yesB[25] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/battleAug/yBrawlerB.PNG"));
	}
}
