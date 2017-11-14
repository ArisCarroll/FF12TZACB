package dmf.tzacb.model.licenses.magick;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class BlackMagick {
	
	private License[] blmLicenses;
	
	public BlackMagick () {
		
		blmLicenses = new License[13];
		
		// White Magick
		blmLicenses[0]   = new License("Black Magick  1",  15, LicenseType.Magick, "Allows character to cast Fire and Thunder.");
		blmLicenses[1]   = new License("Black Magick  2",  20, LicenseType.Magick, "Allows character to cast Blizzard and Blind.");
		blmLicenses[2]   = new License("Black Magick  3",  25, LicenseType.Magick, "Allows character to cast Aqua and Silence.");
		blmLicenses[3]   = new License("Black Magick  4",  30, LicenseType.Magick, "Allows character to cast Aero and Sleep.");
		blmLicenses[4]   = new License("Black Magick  5",  40, LicenseType.Magick, "Allows character to cast Fira and Poison.");
		blmLicenses[5]   = new License("Black Magick  6",  50, LicenseType.Magick, "Allows character to cast Thundara and Blizzara.");
		blmLicenses[6]   = new License("Black Magick  7",  60, LicenseType.Magick, "Allows character to cast Bio and Blindga.");
		blmLicenses[7]   = new License("Black Magick  8",  70, LicenseType.Magick, "Allows character to cast Aeroga and Silencega.");
		blmLicenses[8]   = new License("Black Magick  9",  90, LicenseType.Magick, "Allows character to cast Firaga and Thundaga.");
		blmLicenses[9]   = new License("Black Magick 10",  90, LicenseType.Magick, "Allows character to cast Blizzaga and Sleepga.");
		blmLicenses[10]  = new License("Black Magick 11", 100, LicenseType.Magick, "Allows character to cast Toxify and Shock.");
		blmLicenses[11]  = new License("Black Magick 12", 120, LicenseType.Magick, "Allows character to cast Scourge and Flare.");
		blmLicenses[12]  = new License("Black Magick 13", 165, LicenseType.Magick, "Allows character to cast Scathe.");
		
	}
	
	public License getBlackMagickCopy(int index) {
		String		 	name 		= blmLicenses[index].getName();
		int 			cost 		= blmLicenses[index].getCost();
		LicenseType 	type		= blmLicenses[index].getType();
		String 			description = blmLicenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}

}
