package dmf.tzacb.model.licenses.augments;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class MagickAugments {
	
	private License[] maloLicenses;
	
	public MagickAugments () {
		
		maloLicenses = new License[26];
		
		// Espers Quckenings Essentials and Empty
		maloLicenses[0]   = new License("Magick Lore  1",  30, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[1]   = new License("Magick Lore  2",  30, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[2]   = new License("Magick Lore  3",  30, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[3]   = new License("Magick Lore  4",  30, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[4]   = new License("Magick Lore  5",  50, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[5]   = new License("Magick Lore  6",  50, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[6]   = new License("Magick Lore  7",  50, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[7]   = new License("Magick Lore  8",  50, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[8]   = new License("Magick Lore  9",  70, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[9]   = new License("Magick Lore 10",  70, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[10]  = new License("Magick Lore 11",  70, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[11]  = new License("Magick Lore 12",  70, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[12]  = new License("Magick Lore 13", 100, LicenseType.Augment, "Increases Magick potency.");	
		maloLicenses[13]  = new License("Magick Lore 14", 100, LicenseType.Augment, "Increases Magick potency.");	
		maloLicenses[14]  = new License("Magick Lore 15", 100, LicenseType.Augment, "Increases Magick potency.");	
		maloLicenses[15]  = new License("Magick Lore 16", 100, LicenseType.Augment, "Increases Magick potency.");
		maloLicenses[16]  = new License("Channeling 1",    30, LicenseType.Augment, "Reduces magick MP cost by 10%.");	
		maloLicenses[17]  = new License("Channeling 2",    50, LicenseType.Augment, "Reduces magick MP cost by 10%.");	
		maloLicenses[18]  = new License("Channeling 3",    80, LicenseType.Augment, "Reduces magick MP cost by 10%.");
		maloLicenses[19]  = new License("Serenity",        70, LicenseType.Augment, "Increases magick power when HP is full.");
		maloLicenses[20]  = new License("Spellbreaker",    65, LicenseType.Augment, "Increases magick power when HP critical.");
		maloLicenses[21]  = new License("Inquisitor",      30, LicenseType.Augment, "Gain MP after dealing damage.");
		maloLicenses[22]  = new License("Warmage",         30, LicenseType.Augment, "Gain MP after dealing magick damage.");
		maloLicenses[23]  = new License("Headsman",        30, LicenseType.Augment, "Gain MP after defeating a foe.");
		maloLicenses[24]  = new License("Martyr",          30, LicenseType.Augment, "Gain MP after taking damage.");
		maloLicenses[25]  = new License("Spellbound",      30, LicenseType.Augment, "Increases duration of status effects.");
	}

	public License getMagickLoreCopy(int index) {
		String		 	name 		= maloLicenses[index].getName();
		int 			cost 		= maloLicenses[index].getCost();
		LicenseType 	type		= maloLicenses[index].getType();
		String 			description = maloLicenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}
}
