package dmf.ff12.logic.jobs.Augments;

import dmf.ff12.logic.jobs.License;
import dmf.ff12.logic.jobs.LicenseType;

public class HealthAugments {
	
	private License[] heauLicenses;
	
	public HealthAugments () {
		
		heauLicenses = new License[12];
		
		// Espers Quckenings Essentials and Empty
		heauLicenses[0]   = new License("HP+  30",  20, LicenseType.Augment, "Increases HP by  30.");
		heauLicenses[1]   = new License("HP+  70",  30, LicenseType.Augment, "Increases HP by  70.");
		heauLicenses[2]   = new License("HP+ 110",  40, LicenseType.Augment, "Increases HP by 110.");
		heauLicenses[3]   = new License("HP+ 150",  55, LicenseType.Augment, "Increases HP by 150.");
		heauLicenses[4]   = new License("HP+ 190",  60, LicenseType.Augment, "Increases HP by 190.");
		heauLicenses[5]   = new License("HP+ 230",  70, LicenseType.Augment, "Increases HP by 230.");
		heauLicenses[6]   = new License("HP+ 270",  80, LicenseType.Augment, "Increases HP by 270.");
		heauLicenses[7]   = new License("HP+ 310",  90, LicenseType.Augment, "Increases HP by 310.");
		heauLicenses[8]   = new License("HP+ 350", 100, LicenseType.Augment, "Increases HP by 350.");
		heauLicenses[9]   = new License("HP+ 390", 115, LicenseType.Augment, "Increases HP by 390.");
		heauLicenses[10]  = new License("HP+ 435", 130, LicenseType.Augment, "Increases HP by 435.");
		heauLicenses[11]  = new License("HP+ 500", 220, LicenseType.Augment, "Increases HP by 500.");	
	}
	
	public License getHealthAugment(int index) {
		return heauLicenses[index];
	}
}
