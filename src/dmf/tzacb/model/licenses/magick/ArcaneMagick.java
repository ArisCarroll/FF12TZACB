package dmf.tzacb.model.licenses.magick;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class ArcaneMagick {

	private License[] arcmLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[3];
	private static ImageIcon[]	 yesW = new ImageIcon[3];
	
	private static ImageIcon[]	 notB = new ImageIcon[3];
	private static ImageIcon[]	 yesB = new ImageIcon[3];
	
	public ArcaneMagick () {
		
		arcmLicenses = new License[3];
		
		getArcMagIcons();
		
		// White Magick
		arcmLicenses[0]   = new License("Arcane Magick  1",  40, LicenseType.Magick, "Allows character to cast Dark and Darkra.",	notW[0], yesW[0], notB[0], notW[0]);
		arcmLicenses[1]   = new License("Arcane Magick  2",  50, LicenseType.Magick, "Allows character to cast Death and Darkga.",	notW[1], yesW[1], notB[1], notW[1]);
		arcmLicenses[2]   = new License("Arcane Magick  3", 110, LicenseType.Magick, "Allows character to cast Ardor.",				notW[2], yesW[2], notB[2], notW[2]);
		
	}
	
	public License getArcaneMagickCopy(int index) {
		String		 	name 		= arcmLicenses[index].getName();
		int 			cost 		= arcmLicenses[index].getCost();
		LicenseType 	type		= arcmLicenses[index].getType();
		String 			description = arcmLicenses[index].getDescription();
		
		return new License(name, cost,type,description,	notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getArcMagIcons() {
		
		// Empty Essentials Second Board
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/yArcaneMagick1B.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/yArcaneMagick1B.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/nArcaneMagick1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/yArcaneMagick1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/nArcaneMagick2B.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/yArcaneMagick2B.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/nArcaneMagick2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/yArcaneMagick2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/nArcaneMagick3B.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/yArcaneMagick3B.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/nArcaneMagick3B.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/arcMag/yArcaneMagick3B.PNG"));
	}
}
