package dmf.tzacb.model.licenses.augments;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class ItemAugments {

	private License[] itauLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[12];
	private static ImageIcon[]	 yesW = new ImageIcon[12];
	
	private static ImageIcon[]	 notB = new ImageIcon[12];
	private static ImageIcon[]	 yesB = new ImageIcon[12];
	
	public ItemAugments () {
		
		itauLicenses = new License[12];
		
		getItemIcons();
		
		// Espers Quckenings Essentials and Empty
		itauLicenses[0]   = new License("Potion Lore 1",  20, LicenseType.Augment, "Increases Potion effect by 20%.", notW[0], yesW[0], notB[0], notW[0]);
		itauLicenses[1]   = new License("Potion Lore 2",  35, LicenseType.Augment, "Increases Potion effect by 30%",  notW[1], yesW[1], notB[1], notW[1]);
		itauLicenses[2]   = new License("Potion Lore 3",  70, LicenseType.Augment, "Increases Potion effect by 40%",  notW[2], yesW[2], notB[2], notW[2]);
		itauLicenses[3]   = new License("Ether Lore 1",   20, LicenseType.Augment, "Increases Ether effect by 10%",   notW[3], yesW[3], notB[3], notW[3]);
		itauLicenses[4]   = new License("Ether Lore 2",   35, LicenseType.Augment, "Increases Ether effect by 20%",   notW[4], yesW[4], notB[4], notW[4]);
		itauLicenses[5]   = new License("Ether Lore 3",   70, LicenseType.Augment, "Increases Ether effect by 30%",   notW[5], yesW[5], notB[5], notW[5]);
		itauLicenses[6]   = new License("Remedy Lore 1",  20, LicenseType.Augment, "Remedies remove Sleep, Sap, Immobilize, and Disable.", notW[6], yesW[6], notB[6], notW[6]);
		itauLicenses[7]   = new License("Remedy Lore 2",  30, LicenseType.Augment, "Remedies remove Petrify, Confuse, and Oil.",           notW[7], yesW[7], notB[7], notW[7]);
		itauLicenses[8]   = new License("Remedy Lore 3",  70, LicenseType.Augment, "Remedies remove Stop, Doom, and Disease.",             notW[8], yesW[8], notB[8], notW[8]);
		itauLicenses[9]   = new License("Phoenix Lore 1", 30, LicenseType.Augment, "Increases Phoenix Down effect.", notW[9], yesW[9], notB[9], notW[9]);
		itauLicenses[10]  = new License("Phoenix Lore 2", 50, LicenseType.Augment, "Increases Phoenix Down effect.", notW[10], yesW[10], notB[10], notW[10]);
		itauLicenses[11]  = new License("Phoenix Lore 3", 90, LicenseType.Augment, "Increases Phoenix Down effect.", notW[11], yesW[11], notB[11], notW[11]);
	}
	
	public License getItemAugmentCopy(int index) {
		String		 	name 		= itauLicenses[index].getName();
		int 			cost 		= itauLicenses[index].getCost();
		LicenseType 	type		= itauLicenses[index].getType();
		String 			description = itauLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getItemIcons() {
		
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore1W.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore1W.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore1B.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore1B.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore2W.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore2W.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore2B.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore2B.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore3W.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore3W.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore3B.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore3B.PNG"));
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nEtherLore1W.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yEtherLore1W.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nEtherLore1B.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yEtherLore1B.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nEtherLore2W.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yEtherLore2W.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nEtherLore2B.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yEtherLore2B.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nEtherLore3W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yEtherLore3W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nEtherLore3B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yEtherLore3B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nRemedyLore1W.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yRemedyLore1W.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nRemedyLore1B.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yRemedyLore1B.PNG"));
		
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nRemedyLore2W.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yRemedyLore2W.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nRemedyLore2B.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yRemedyLore2B.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nRemedyLore3W.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yRemedyLore3W.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nRemedyLore3B.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yRemedyLore3B.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore1W.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore1W.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore1B.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore1B.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore2W.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore2W.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPotionLore2B.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPotionLore2B.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPhoenixLoreW.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPhoenixLoreW.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/nPhoenixLoreB.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/itemAug/yPhoenixLoreB.PNG"));
	}
}
