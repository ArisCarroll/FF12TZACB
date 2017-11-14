package dmf.tzacb.model.licenses.magick;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class WhiteMagick {
	
	private License[] whmLicenses;
	
	public WhiteMagick () {
		
		whmLicenses = new License[13];
		
		// White Magick
		whmLicenses[0]   = new License("White Magick  1",  15, LicenseType.Magick, "Allows character to cast Cure and Blindna.");
		whmLicenses[1]   = new License("White Magick  2",  20, LicenseType.Magick, "Allows character to cast Vox and Poisona.");
		whmLicenses[2]   = new License("White Magick  3",  25, LicenseType.Magick, "Allows character to cast Protect and Shell.");
		whmLicenses[3]   = new License("White Magick  4",  30, LicenseType.Magick, "Allows character to cast Cura and Raise.");
		whmLicenses[4]   = new License("White Magick  5",  40, LicenseType.Magick, "Allows character to cast Dispel and Stona.");
		whmLicenses[5]   = new License("White Magick  6",  50, LicenseType.Magick, "Allows character to cast Curaga and Regen.");
		whmLicenses[6]   = new License("White Magick  7",  60, LicenseType.Magick, "Allows character to cast Cleanse and Esuna.");
		whmLicenses[7]   = new License("White Magick  8",  70, LicenseType.Magick, "Allows character to cast Confuse and Faith.");
		whmLicenses[8]   = new License("White Magick  9",  80, LicenseType.Magick, "Allows character to cast Bravery and Curaja.");
		whmLicenses[9]   = new License("White Magick 10",  90, LicenseType.Magick, "Allows character to cast Dispelga and Arise.");
		whmLicenses[10]  = new License("White Magick 11", 100, LicenseType.Magick, "Allows character to cast Holy and Esunaga.");
		whmLicenses[11]  = new License("White Magick 12", 110, LicenseType.Magick, "Allows character to cast Protectga and Shellga.");
		whmLicenses[12]  = new License("White Magick 13", 155, LicenseType.Magick, "Allows character to cast Renew.");
		
	}
	
	public License getWhiteMagick(int index) {
		return whmLicenses[index];
	}
}
