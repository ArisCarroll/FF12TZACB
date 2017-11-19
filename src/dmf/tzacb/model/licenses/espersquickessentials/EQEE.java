package dmf.tzacb.model.licenses.espersquickessentials;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class EQEE {
	
	private License[] eqeeLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[20];
	private static ImageIcon[]	 yesW = new ImageIcon[20];
	
	private static ImageIcon[]	 notB = new ImageIcon[20];
	private static ImageIcon[]	 yesB = new ImageIcon[20];
	
	public EQEE () {
		
		eqeeLicenses = new License[20];
		
		getEQEEIcons();
		
		// Espers Quckenings Essentials and Empty
		eqeeLicenses[0]  = new License("Empty",          0, LicenseType.Empty,       "Empty.", 						notW[0], yesW[0], notB[0], notW[0]);
		eqeeLicenses[1]  = new License("Essentials",     0, LicenseType.Essentials,  "Unlocks Attack and Items.", 	notW[1], yesW[1], notB[1], notW[1]);
		eqeeLicenses[2]  = new License("Second Board",  30, LicenseType.SecondBoard, "Unlocks Second Board.", 		notW[2], yesW[2], notB[2], notW[2]);
		eqeeLicenses[3]  = new License("Quickening 1",  50, LicenseType.Quickening,  "Unlocks a Quickening.", 		notW[3], yesW[3], notB[3], notW[3]);
		eqeeLicenses[4]  = new License("Quickening 2",  75, LicenseType.Quickening,  "Unlocks a Quickening.", 		notW[4], yesW[4], notB[4], notW[4]);
		eqeeLicenses[5]  = new License("Quickening 3", 100, LicenseType.Quickening,  "Unlocks a Quickening.", 		notW[5], yesW[5], notB[5], notW[5]);
		eqeeLicenses[6]  = new License("Quickening 4", 125, LicenseType.Quickening,  "Unlocks a Quickening.", 		notW[6], yesW[6], notB[6], notW[6]);
		eqeeLicenses[7]  = new License("Belias",        20, LicenseType.Summon,      "Unlocks Belias.", 			notW[7], yesW[7], notB[7], notW[7]);
		eqeeLicenses[8]  = new License("Mateus",        30, LicenseType.Summon,      "Unlocks Mateus.", 			notW[8], yesW[8], notB[8], notW[8]);
		eqeeLicenses[9]  = new License("Zalera",        30, LicenseType.Summon,      "Unlocks Zalera.", 			notW[9], yesW[9], notB[9], notW[9]);
		eqeeLicenses[10] = new License("Adrammelech",   35, LicenseType.Summon,      "Unlocks Adrammelech.", 		notW[10], yesW[10], notB[10], notW[10]);
		eqeeLicenses[11] = new License("Shemhazai",     50, LicenseType.Summon,      "Unlocks Shemhazai.", 			notW[11], yesW[11], notB[11], notW[11]);
		eqeeLicenses[12] = new License("Hashmal",       50, LicenseType.Summon,      "Unlocks Hashmal.", 			notW[12], yesW[12], notB[12], notW[12]);
		eqeeLicenses[13] = new License("Cúchulainn",    50, LicenseType.Summon,      "Unlocks Cúchulainn.", 		notW[13], yesW[13], notB[13], notW[13]);
		eqeeLicenses[14] = new License("Zeromus",       65, LicenseType.Summon,      "Unlocks Zeromus.",			notW[14], yesW[14], notB[14], notW[14]);
		eqeeLicenses[15] = new License("Exodus",        65, LicenseType.Summon,      "Unlocks Exodus.", 			notW[15], yesW[15], notB[15], notW[15]);
		eqeeLicenses[16] = new License("Famfrit",      100, LicenseType.Summon,      "Unlocks Famfrit.", 			notW[16], yesW[16], notB[16], notW[16]);
		eqeeLicenses[17] = new License("Chaos",        100, LicenseType.Summon,      "Unlocks Chaos.", 				notW[17], yesW[17], notB[17], notW[17]);
		eqeeLicenses[18] = new License("Ultima",       115, LicenseType.Summon,      "Unlocks Ultima.", 			notW[18], yesW[18], notB[18], notW[18]);
		eqeeLicenses[19] = new License("Zodiark",      200, LicenseType.Summon,      "Unlocks Zodiark.", 			notW[19], yesW[19], notB[19], notW[19]);
	}
	
	public License getEQEE(int index) {
		
		return eqeeLicenses[index];
	}
		
	public License getEQEECopy(int index) {
		String		 	name 		= eqeeLicenses[index].getName();
		int 			cost 		= eqeeLicenses[index].getCost();
		LicenseType 	type		= eqeeLicenses[index].getType();
		String 			description = eqeeLicenses[index].getDescription();
		
		return new License(name, cost,type,description, notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getEQEEIcons() {
		
		// Empty Essentials Second Board
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nEmptyW.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yEmptyW.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nEmptyB.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yEmptyB.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nEssentialsW.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yEssentialsW.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nEssentialsB.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yEssentialsB.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nSecondBoardW.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/ySecondBoardW.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nSecondBoardB.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/ySecondBoardB.PNG"));
		
		// Quickenings
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nQuickening1W.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yQuickening1W.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nQuickening1B.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yQuickening1B.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nQuickening2W.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yQuickening2W.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nQuickening2B.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yQuickening2B.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nQuickening3W.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yQuickening3W.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nQuickening3B.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yQuickening3B.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nQuickening4W.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yQuickening4W.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nQuickening4B.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yQuickening4B.PNG"));
		  
		// Espers
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nBeliasW.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yBeliasW.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nBeliasB.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yBeliasB.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nMateusW.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yMateusW.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nMateusB.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yMateusB.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nZaleraW.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yZaleraW.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nZaleraB.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yZaleraB.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nAdrammelechW.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yAdrammelechW.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nAdrammelechB.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yAdrammelechB.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nShemhazaiW.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yShemhazaiW.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nShemhazaiB.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yShemhazaiB.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nHashmalW.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yHashmalW.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nHashmalB.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yHashmalB.PNG"));
		
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nCúchulainnW.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yCúchulainnW.PNG"));
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nCúchulainnB.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yCúchulainnB.PNG"));
		
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nZeromusW.PNG"));
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yZeromusW.PNG"));
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nZeromusB.PNG"));
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yZeromusB.PNG"));
		
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nExodusW.PNG"));
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yExodusW.PNG"));
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nExodusB.PNG"));
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yExodusB.PNG"));
		
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nFamfritW.PNG"));
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yFamfritW.PNG"));
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nFamfritB.PNG"));
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yFamfritB.PNG"));
		
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nChaosW.PNG"));
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yChaosW.PNG"));
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nChaosB.PNG"));
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yChaosB.PNG"));
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nUltimaW.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yUltimaW.PNG"));
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nUltimaB.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yUltimaB.PNG"));
		
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nZodiarkW.PNG"));
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yZodiarkW.PNG"));
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nZodiarkB.PNG"));
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yZodiarkB.PNG"));
	}
}
