package dmf.tzacb.model.licenses.magick;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class TimeMagick {
	
	private License[] timmLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[10];
	private static ImageIcon[]	 yesW = new ImageIcon[10];
	
	private static ImageIcon[]	 notB = new ImageIcon[10];
	private static ImageIcon[]	 yesB = new ImageIcon[10];
	
	public TimeMagick () {
		
		timmLicenses = new License[13];
		
		getTimMagIcons();
		
		// Time Magick
		timmLicenses[0]   = new License("Time Magick  1",  20, LicenseType.Magick, "Allows character to cast Slow and Immobilize.", 	notW[0], yesW[0], notB[0], notW[0]);
		timmLicenses[1]   = new License("Time Magick  2",  30, LicenseType.Magick, "Allows character to cast Reflect and Disable.", 	notW[1], yesW[1], notB[1], notW[1]);
		timmLicenses[2]   = new License("Time Magick  3",  40, LicenseType.Magick, "Allows character to cast Vanish and Balance.",		notW[2], yesW[2], notB[2], notW[2]);
		timmLicenses[3]   = new License("Time Magick  4",  50, LicenseType.Magick, "Allows character to cast Gravity and Haste.", 		notW[3], yesW[3], notB[3], notW[3]);
		timmLicenses[4]   = new License("Time Magick  5",  60, LicenseType.Magick, "Allows character to cast Stop and Bleed.", 			notW[4], yesW[4], notB[4], notW[4]);
		timmLicenses[5]   = new License("Time Magick  6",  70, LicenseType.Magick, "Allows character to cast Break and Countdown.", 	notW[5], yesW[5], notB[5], notW[5]);
		timmLicenses[6]   = new License("Time Magick  7",  80, LicenseType.Magick, "Allows character to cast Float and Berserk.", 		notW[6], yesW[6], notB[6], notW[6]);
		timmLicenses[7]   = new License("Time Magick  8",  90, LicenseType.Magick, "Allows character to cast Vanishga and Warp.", 		notW[7], yesW[7], notB[7], notW[7]);
		timmLicenses[8]   = new License("Time Magick  9", 100, LicenseType.Magick, "Allows character to cast Reflectga and Slowga.", 	notW[8], yesW[8], notB[8], notW[8]);
		timmLicenses[9]   = new License("Time Magick 10", 125, LicenseType.Magick, "Allows character to cast Graviga and Hastega.", 	notW[9], yesW[9], notB[9], notW[9]);
		
	}
	
	public License getTimeMagickCopy(int index) {
		String		 	name 		= timmLicenses[index].getName();
		int 			cost 		= timmLicenses[index].getCost();
		LicenseType 	type		= timmLicenses[index].getType();
		String 			description = timmLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}

	private void getTimMagIcons() {
		
		// Empty Essentials Second Board
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick2W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick3W.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick3W.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick3B.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick3B.PNG"));
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick4W.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick4W.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick4B.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick4B.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick5W.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick5W.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick5B.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick5B.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick6W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick6W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick6B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick6B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick7W.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick7W.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick7B.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick7B.PNG"));
		
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick8W.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick8W.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick8B.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick8B.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick9W.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick9W.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick9B.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick9B.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick10W.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick10W.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/nTimekMagick10B.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/timMag/yTimekMagick10B.PNG"));
	}
}
