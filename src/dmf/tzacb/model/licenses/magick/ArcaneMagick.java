package dmf.tzacb.model.licenses.magick;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class ArcaneMagick {

	private License[] arcmLicenses;
	
	public ArcaneMagick () {
		
		arcmLicenses = new License[3];
		
		// White Magick
		arcmLicenses[0]   = new License("Arcane Magick  1",  40, LicenseType.Magick, "Allows character to cast Dark and Darkra.");
		arcmLicenses[1]   = new License("Arcane Magick  2",  50, LicenseType.Magick, "Allows character to cast Death and Darkga.");
		arcmLicenses[2]   = new License("Arcane Magick  3", 110, LicenseType.Magick, "Allows character to cast Ardor.");
		
	}
	
	public License getArcaneMagickCopy(int index) {
		String		 	name 		= arcmLicenses[index].getName();
		int 			cost 		= arcmLicenses[index].getCost();
		LicenseType 	type		= arcmLicenses[index].getType();
		String 			description = arcmLicenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}
}
