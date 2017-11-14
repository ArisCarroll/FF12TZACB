package dmf.tzacb.model.licenses.augments;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class ItemAugments {

	private License[] itauLicenses;
	
	public ItemAugments () {
		
		itauLicenses = new License[12];
		
		// Espers Quckenings Essentials and Empty
		itauLicenses[0]   = new License("Potion Lore 1",  20, LicenseType.Augment, "Increases Potion effect by 20%.");
		itauLicenses[1]   = new License("Potion Lore 2",  35, LicenseType.Augment, "Increases Potion effect by 30%");
		itauLicenses[2]   = new License("Potion Lore 3",  70, LicenseType.Augment, "Increases Potion effect by 40%");
		itauLicenses[3]   = new License("Ether Lore 1",   20, LicenseType.Augment, "Increases Ether effect by 10%");
		itauLicenses[4]   = new License("Ether Lore 2",   35, LicenseType.Augment, "Increases Ether effect by 20%");
		itauLicenses[5]   = new License("Ether Lore 3",   70, LicenseType.Augment, "Increases Ether effect by 30%");
		itauLicenses[6]   = new License("Remedy Lore 1",  20, LicenseType.Augment, "Remedies remove Sleep, Sap, Immobilize, and Disable.");
		itauLicenses[7]   = new License("Remedy Lore 2",  30, LicenseType.Augment, "Remedies remove Petrify, Confuse, and Oil.");
		itauLicenses[8]   = new License("Remedy Lore 3",  70, LicenseType.Augment, "Remedies remove Stop, Doom, and Disease.");
		itauLicenses[9]   = new License("Phoenix Lore 1", 30, LicenseType.Augment, "Increases Phoenix Down effect.");
		itauLicenses[10]  = new License("Phoenix Lore 2", 40, LicenseType.Augment, "Increases Phoenix Down effect.");
		itauLicenses[11]  = new License("Phoenix Lore 3", 90, LicenseType.Augment, "Increases Phoenix Down effect.");
	}
	
	public License getItemAugment(int index) {
		return itauLicenses[index];
	}	
	
	public License getItemAugmentCopy(int index) {
		String		 	name 		= itauLicenses[index].getName();
		int 			cost 		= itauLicenses[index].getCost();
		LicenseType 	type		= itauLicenses[index].getType();
		String 			description = itauLicenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}
}
