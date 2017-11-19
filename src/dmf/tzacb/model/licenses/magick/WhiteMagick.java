package dmf.tzacb.model.licenses.magick;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class WhiteMagick {
	
	private License[] whmLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[13];
	private static ImageIcon[]	 yesW = new ImageIcon[13];
	
	private static ImageIcon[]	 notB = new ImageIcon[13];
	private static ImageIcon[]	 yesB = new ImageIcon[13];
	
	public WhiteMagick () {
		
		whmLicenses = new License[13];
		
		getWhmMagIcons();
		
		// White Magick
		whmLicenses[0]   = new License("White Magick  1",  15, LicenseType.Magick, "Allows character to cast Cure and Blindna.",		notW[0], yesW[0], notB[0], notW[0]);
		whmLicenses[1]   = new License("White Magick  2",  20, LicenseType.Magick, "Allows character to cast Vox and Poisona.",			notW[1], yesW[1], notB[1], notW[1]);
		whmLicenses[2]   = new License("White Magick  3",  25, LicenseType.Magick, "Allows character to cast Protect and Shell.",		notW[2], yesW[2], notB[2], notW[2]);
		whmLicenses[3]   = new License("White Magick  4",  30, LicenseType.Magick, "Allows character to cast Cura and Raise.",			notW[3], yesW[3], notB[3], notW[3]);
		whmLicenses[4]   = new License("White Magick  5",  40, LicenseType.Magick, "Allows character to cast Dispel and Stona.",		notW[4], yesW[4], notB[4], notW[4]);
		whmLicenses[5]   = new License("White Magick  6",  50, LicenseType.Magick, "Allows character to cast Curaga and Regen.",		notW[5], yesW[5], notB[5], notW[5]);
		whmLicenses[6]   = new License("White Magick  7",  60, LicenseType.Magick, "Allows character to cast Cleanse and Esuna.",		notW[6], yesW[6], notB[6], notW[6]);
		whmLicenses[7]   = new License("White Magick  8",  70, LicenseType.Magick, "Allows character to cast Confuse and Faith.",		notW[7], yesW[7], notB[7], notW[7]);
		whmLicenses[8]   = new License("White Magick  9",  80, LicenseType.Magick, "Allows character to cast Bravery and Curaja.",		notW[8], yesW[8], notB[8], notW[8]);
		whmLicenses[9]   = new License("White Magick 10",  90, LicenseType.Magick, "Allows character to cast Dispelga and Arise.",		notW[9], yesW[9], notB[9], notW[9]);
		whmLicenses[10]  = new License("White Magick 11", 100, LicenseType.Magick, "Allows character to cast Holy and Esunaga.",		notW[10], yesW[10], notB[10], notW[10]);
		whmLicenses[11]  = new License("White Magick 12", 110, LicenseType.Magick, "Allows character to cast Protectga and Shellga.",	notW[11], yesW[11], notB[11], notW[11]);
		whmLicenses[12]  = new License("White Magick 13", 155, LicenseType.Magick, "Allows character to cast Renew.",					notW[12], yesW[12], notB[12], notW[12]);
		
	}
	
	public License getWhiteMagickCopy(int index) {
		String		 	name 		= whmLicenses[index].getName();
		int 			cost 		= whmLicenses[index].getCost();
		LicenseType 	type		= whmLicenses[index].getType();
		String 			description = whmLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getWhmMagIcons() {
		
		// Empty Essentials Second Board
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick2W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick3W.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick3W.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick3B.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick3B.PNG"));
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick4W.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick4W.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick4B.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick4B.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick5W.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick5W.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick5B.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick5B.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick6W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick6W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick6B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick6B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick7W.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick7W.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick7B.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick7B.PNG"));
		  
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick8W.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick8W.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick8B.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick8B.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick9W.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick9W.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick9B.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick9B.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick10W.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick10W.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick10B.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick10B.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick11W.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick11W.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick11B.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick11B.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick12W.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick12W.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick12B.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick12B.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick13W.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick13W.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/nWhitekMagick13B.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/whmMag/yWhitekMagick13B.PNG"));
	}
}
