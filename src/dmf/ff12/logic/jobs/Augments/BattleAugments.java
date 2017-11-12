package dmf.ff12.logic.jobs.Augments;

import dmf.ff12.logic.jobs.License;
import dmf.ff12.logic.jobs.LicenseType;

public class BattleAugments {
	
	private License[] baloLicenses;
	
	public BattleAugments () {
		
		baloLicenses = new License[19];
		
		// Espers Quckenings Essentials and Empty
		baloLicenses[0]   = new License("Battle Lore  1",  30, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[1]   = new License("Battle Lore  2",  30, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[2]   = new License("Battle Lore  3",  30, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[3]   = new License("Battle Lore  4",  30, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[4]   = new License("Battle Lore  5",  50, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[5]   = new License("Battle Lore  6",  50, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[6]   = new License("Battle Lore  7",  50, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[7]   = new License("Battle Lore  8",  50, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[8]   = new License("Battle Lore  9",  70, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[9]   = new License("Battle Lore 10",  70, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[10]  = new License("Battle Lore 11",  70, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[11]  = new License("Battle Lore 12",  70, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[12]  = new License("Battle Lore 13", 100, LicenseType.Augment, "Increases physical attack damage.");	
		baloLicenses[13]  = new License("Battle Lore 14", 100, LicenseType.Augment, "Increases physical attack damage.");	
		baloLicenses[14]  = new License("Battle Lore 15", 100, LicenseType.Augment, "Increases physical attack damage.");	
		baloLicenses[15]  = new License("Battle Lore 16", 100, LicenseType.Augment, "Increases physical attack damage.");
		baloLicenses[16]  = new License("Swiftness 1",     30, LicenseType.Augment, "Reduces action time by 10%.");
		baloLicenses[17]  = new License("Swiftness 2",     50, LicenseType.Augment, "Reduces action time by 10%.");
		baloLicenses[18]  = new License("Swiftness 3",     80, LicenseType.Augment, "Reduces action time by 10%.");
		baloLicenses[19]  = new License("Shield Block 1",  30, LicenseType.Augment, "Increases chance to block using shield.");
		baloLicenses[20]  = new License("Shield Block 2",  45, LicenseType.Augment, "Increases chance to block using shield.");
		baloLicenses[21]  = new License("Shield Block 3",  75, LicenseType.Augment, "Increases chance to block using shield.");
	}
	
	public License getBattleLore(int index) {
		return baloLicenses[index];
	}
}
