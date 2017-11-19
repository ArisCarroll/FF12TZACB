package dmf.tzacb.model.licenses.augments;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class HealthAugments {
	
	private License[] heauLicenses;
	private static ImageIcon[]	 notW = new ImageIcon[12];
	private static ImageIcon[]	 yesW = new ImageIcon[12];
	
	private static ImageIcon[]	 notB = new ImageIcon[12];
	private static ImageIcon[]	 yesB = new ImageIcon[12];
	
	public HealthAugments () {
		
		heauLicenses = new License[12];
		
		getHealthIcons();
		
		
		// Espers Quckenings Essentials and Empty
		heauLicenses[0]   = new License("HP+  30",  20, LicenseType.Augment, "Increases HP by  30.", notW[0], yesW[0], notB[0], notW[0]);
		heauLicenses[1]   = new License("HP+  70",  30, LicenseType.Augment, "Increases HP by  70.", notW[1], yesW[1], notB[1], notW[1]);
		heauLicenses[2]   = new License("HP+ 110",  40, LicenseType.Augment, "Increases HP by 110.", notW[2], yesW[2], notB[2], notW[2]);
		heauLicenses[3]   = new License("HP+ 150",  55, LicenseType.Augment, "Increases HP by 150.", notW[3], yesW[3], notB[3], notW[3]);
		heauLicenses[4]   = new License("HP+ 190",  60, LicenseType.Augment, "Increases HP by 190.", notW[4], yesW[4], notB[4], notW[4]);
		heauLicenses[5]   = new License("HP+ 230",  70, LicenseType.Augment, "Increases HP by 230.", notW[5], yesW[5], notB[5], notW[5]);
		heauLicenses[6]   = new License("HP+ 270",  80, LicenseType.Augment, "Increases HP by 270.", notW[6], yesW[6], notB[6], notW[6]);
		heauLicenses[7]   = new License("HP+ 310",  90, LicenseType.Augment, "Increases HP by 310.", notW[7], yesW[7], notB[7], notW[7]);
		heauLicenses[8]   = new License("HP+ 350", 100, LicenseType.Augment, "Increases HP by 350.", notW[8], yesW[8], notB[8], notW[8]);
		heauLicenses[9]   = new License("HP+ 390", 115, LicenseType.Augment, "Increases HP by 390.", notW[9], yesW[9], notB[9], notW[9]);
		heauLicenses[10]  = new License("HP+ 435", 130, LicenseType.Augment, "Increases HP by 435.", notW[10], yesW[10], notB[10], notW[10]);
		heauLicenses[11]  = new License("HP+ 500", 220, LicenseType.Augment, "Increases HP by 500.", notW[11], yesW[11], notB[11], notW[11]);	
	}
	
	public License getHealthAugmentCopy(int index) {
		String		 	name 		= heauLicenses[index].getName();
		int 			cost 		= heauLicenses[index].getCost();
		LicenseType 	type		= heauLicenses[index].getType();
		String 			description = heauLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getHealthIcons() {
		
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealt21W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth3W.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth3W.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth3B.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth3B.PNG"));
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth4W.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth4W.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth4B.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth4B.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth5W.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth5W.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth5B.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth5B.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth6W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth6W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth6B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth6B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth7W.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth7W.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth7B.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth1B7PNG"));
		
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth8W.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth8W.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth8B.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth8B.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth9W.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth9W.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth9B.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth9B.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth10W.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth10W.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth10B.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth10B.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth11W.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth11W.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth11B.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth11B.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth12W.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth12W.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/nHealth12B.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/healthAug/yHealth12B.PNG"));
	}
}
