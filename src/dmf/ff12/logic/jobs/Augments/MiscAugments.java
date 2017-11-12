package dmf.ff12.logic.jobs.Augments;

import dmf.ff12.logic.jobs.License;
import dmf.ff12.logic.jobs.LicenseType;

public class MiscAugments {
	
	private License[] miauLicenses;
	
	public MiscAugments () {
		
		miauLicenses = new License[16];
		
		// Espers Quckenings Essentials and Empty
		miauLicenses[0]   = new License("Focus",        30, LicenseType.Augment, "Increases strength when HP is full.");
		miauLicenses[1]   = new License("Serenity",     70, LicenseType.Augment, "Increases magick power when HP is full.");
		miauLicenses[2]   = new License("Adrenaline",   65, LicenseType.Augment, "Increases strength when HP critical.");
		miauLicenses[3]   = new License("Spellbreaker", 65, LicenseType.Augment, "Increases magick power when HP critical.");
		miauLicenses[4]   = new License("Last Stand",   70, LicenseType.Augment, "Increases defense when HP critical.");
		miauLicenses[5]   = new License("Brawler",      90, LicenseType.Augment, "Increases attack power when fighting empty-handed.");
		miauLicenses[6]   = new License("Inquisitor",   30, LicenseType.Augment, "Gain MP after dealing damage.");
		miauLicenses[7]   = new License("Warmage",      30, LicenseType.Augment, "Gain MP after dealing magick damage.");
		miauLicenses[8]   = new License("Headsman",     30, LicenseType.Augment, "Gain MP after defeating a foe.");
		miauLicenses[9]   = new License("Martyr",       30, LicenseType.Augment, "Gain MP after taking damage.");
		miauLicenses[10]  = new License("Spellbound",   30, LicenseType.Augment, "Increases duration of status effects.");
	}
	
	public License getMiscAugment(int index) {
		return miauLicenses[index];
	}
}
