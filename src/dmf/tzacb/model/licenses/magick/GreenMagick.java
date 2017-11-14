package dmf.tzacb.model.licenses.magick;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class GreenMagick {

	private License[] grnmLicenses;
	
	public GreenMagick () {
		
		grnmLicenses = new License[3];
		
		// White Magick
		grnmLicenses[0]   = new License("Green Magick  1",  40, LicenseType.Magick, "Allows character to cast Decoy and Oil.");
		grnmLicenses[1]   = new License("Green Magick  2",  50, LicenseType.Magick, "Allows character to cast Drain and Reverse.");
		grnmLicenses[2]   = new License("Green Magick  3",  90, LicenseType.Magick, "Allows character to cast Bubble and Syphon.");;
		
	}
	
	public License getGreenMagick(int index) {
		return grnmLicenses[index];
	}

}
