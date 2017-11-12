package dmf.ff12.logic.jobs.Augments;

import dmf.ff12.logic.jobs.License;
import dmf.ff12.logic.jobs.LicenseType;

public class MagickAugments {
	
	private License[] maloLicenses;
	
	public MagickAugments () {
		
		maloLicenses = new License[19];
		
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
	}
	
	public License getMagickLore(int index) {
		return maloLicenses[index];
	}

}
