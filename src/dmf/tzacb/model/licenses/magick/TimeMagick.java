package dmf.tzacb.model.licenses.magick;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class TimeMagick {
	
	private License[] timmLicenses;
	
	public TimeMagick () {
		
		timmLicenses = new License[13];
		
		// White Magick
		timmLicenses[0]   = new License("Time Magick  1",  20, LicenseType.Magick, "Allows character to cast Slow and Immobilize.");
		timmLicenses[1]   = new License("Time Magick  2",  30, LicenseType.Magick, "Allows character to cast Reflect and Disable.");
		timmLicenses[2]   = new License("Time Magick  3",  40, LicenseType.Magick, "Allows character to cast Vanish and Balance.");
		timmLicenses[3]   = new License("Time Magick  4",  50, LicenseType.Magick, "Allows character to cast Gravity and Haste.");
		timmLicenses[4]   = new License("Time Magick  5",  60, LicenseType.Magick, "Allows character to cast Stop and Bleed.");
		timmLicenses[5]   = new License("Time Magick  6",  70, LicenseType.Magick, "Allows character to cast Break and Countdown.");
		timmLicenses[6]   = new License("Time Magick  7",  80, LicenseType.Magick, "Allows character to cast Float and Berserk.");
		timmLicenses[7]   = new License("Time Magick  8",  90, LicenseType.Magick, "Allows character to cast Vanishga and Warp.");
		timmLicenses[8]   = new License("Time Magick  9", 100, LicenseType.Magick, "Allows character to cast Reflectga and Slowga.");
		timmLicenses[9]   = new License("Time Magick 10", 125, LicenseType.Magick, "Allows character to cast Graviga and Hastega.");
		
	}
	
	public License getTimeMagick(int index) {
		return timmLicenses[index];
	}

}
