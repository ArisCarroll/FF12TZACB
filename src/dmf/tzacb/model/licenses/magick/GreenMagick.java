package dmf.tzacb.model.licenses.magick;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class GreenMagick {

	private License[] grnmLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[3];
	private static ImageIcon[]	 yesW = new ImageIcon[3];
	
	private static ImageIcon[]	 notB = new ImageIcon[3];
	private static ImageIcon[]	 yesB = new ImageIcon[3];
	
	public GreenMagick () {
		
		grnmLicenses = new License[3];
		
		getGrmMagIcons();
		
		// Green Magick
		grnmLicenses[0]   = new License("Green Magick  1",  40, LicenseType.Magick, "Allows character to cast Decoy and Oil.", 		notW[0], yesW[0], notB[0], notW[0]);
		grnmLicenses[1]   = new License("Green Magick  2",  50, LicenseType.Magick, "Allows character to cast Drain and Reverse.", 	notW[1], yesW[1], notB[1], notW[1]);
		grnmLicenses[2]   = new License("Green Magick  3",  90, LicenseType.Magick, "Allows character to cast Bubble and Syphon.", 	notW[2], yesW[2], notB[2], notW[2]);
		
	}
	
	public License getGreenMagickCopy(int index) {
		String		 	name 		= grnmLicenses[index].getName();
		int 			cost 		= grnmLicenses[index].getCost();
		LicenseType 	type		= grnmLicenses[index].getType();
		String 			description = grnmLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getGrmMagIcons() {
		
		// Empty Essentials Second Board
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/nGreenkMagick1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/yGreenkMagick1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/nGreenkMagick1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/yGreenkMagick1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/nGreenkMagick2W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/yGreenkMagick2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/nGreenkMagick2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/yGreenkMagick2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/nGreenkMagick3W.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/yGreenkMagick3W.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/nGreenkMagick3B.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/grmMag/yGreenkMagick3B.PNG"));
	}
}
