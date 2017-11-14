package dmf.tzacb.model.licenses.magick;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class ArcaneMagick {

	private License[] arcmLicenses;
	
	public ArcaneMagick () {
		
		arcmLicenses = new License[3];
		
		// White Magick
		arcmLicenses[0]   = new License("Green Magick  1",  40, LicenseType.Magick, "Allows character to cast Dark and Darkra.");
		arcmLicenses[1]   = new License("Green Magick  2",  50, LicenseType.Magick, "Allows character to cast Death and Darkga.");
		arcmLicenses[2]   = new License("Green Magick  3", 110, LicenseType.Magick, "Allows character to cast Ardor.");;
		
	}
	
	public License getGreenMagick(int index) {
		return arcmLicenses[index];
	}

}
