package dmf.tzacb.model.licenses.magick;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class BlackMagick {
	
	private License[] blmLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[13];
	private static ImageIcon[]	 yesW = new ImageIcon[13];
	
	private static ImageIcon[]	 notB = new ImageIcon[13];
	private static ImageIcon[]	 yesB = new ImageIcon[13];
	
	public BlackMagick () {
		
		blmLicenses = new License[13];
		
		getBlmMagIcons();
		
		// White Magick
		blmLicenses[0]   = new License("Black Magick  1",  15, LicenseType.Magick, "Allows character to cast Fire and Thunder.",		notW[0], yesW[0], notB[0], notW[0]);
		blmLicenses[1]   = new License("Black Magick  2",  20, LicenseType.Magick, "Allows character to cast Blizzard and Blind.", 		notW[1], yesW[1], notB[1], notW[1]);
		blmLicenses[2]   = new License("Black Magick  3",  25, LicenseType.Magick, "Allows character to cast Aqua and Silence.",		notW[2], yesW[2], notB[2], notW[2]);
		blmLicenses[3]   = new License("Black Magick  4",  30, LicenseType.Magick, "Allows character to cast Aero and Sleep.", 			notW[3], yesW[3], notB[3], notW[3]);
		blmLicenses[4]   = new License("Black Magick  5",  40, LicenseType.Magick, "Allows character to cast Fira and Poison.", 		notW[4], yesW[4], notB[4], notW[4]);
		blmLicenses[5]   = new License("Black Magick  6",  50, LicenseType.Magick, "Allows character to cast Thundara and Blizzara.",	notW[5], yesW[5], notB[5], notW[5]);
		blmLicenses[6]   = new License("Black Magick  7",  60, LicenseType.Magick, "Allows character to cast Bio and Blindga.",			notW[6], yesW[6], notB[6], notW[6]);
		blmLicenses[7]   = new License("Black Magick  8",  70, LicenseType.Magick, "Allows character to cast Aeroga and Silencega.", 	notW[7], yesW[7], notB[7], notW[7]);
		blmLicenses[8]   = new License("Black Magick  9",  90, LicenseType.Magick, "Allows character to cast Firaga and Thundaga.", 	notW[8], yesW[8], notB[8], notW[8]);
		blmLicenses[9]   = new License("Black Magick 10",  90, LicenseType.Magick, "Allows character to cast Blizzaga and Sleepga.", 	notW[9], yesW[9], notB[9], notW[9]);
		blmLicenses[10]  = new License("Black Magick 11", 100, LicenseType.Magick, "Allows character to cast Toxify and Shock.", 		notW[10], yesW[10], notB[10], notW[10]);
		blmLicenses[11]  = new License("Black Magick 12", 120, LicenseType.Magick, "Allows character to cast Scourge and Flare.", 		notW[11], yesW[11], notB[11], notW[11]);
		blmLicenses[12]  = new License("Black Magick 13", 165, LicenseType.Magick, "Allows character to cast Scathe.", 					notW[12], yesW[12], notB[12], notW[12]);
		
	}
	
	public License getBlackMagickCopy(int index) {
		String		 	name 		= blmLicenses[index].getName();
		int 			cost 		= blmLicenses[index].getCost();
		LicenseType 	type		= blmLicenses[index].getType();
		String 			description = blmLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	private void getBlmMagIcons() {
		
		// Empty Essentials Second Board
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagickk1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick2W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick3W.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick3W.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick3B.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick3B.PNG"));
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick4W.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick4W.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick4B.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick4B.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick5W.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick5W.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick5B.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick5B.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick6W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick6W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick6B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick6B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick7W.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick7W.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick7B.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick7B.PNG"));
		  
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick8W.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick8W.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick8B.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick8B.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick9W.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick9W.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick9B.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick9B.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick10W.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick10W.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick10B.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick10B.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick11W.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick11W.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick11B.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick11B.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick12W.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick12W.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick12B.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick12B.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick13W.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick13W.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/nBlackMagick13B.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/blmMag/yBlackMagick13B.PNG"));
	}
	
}
