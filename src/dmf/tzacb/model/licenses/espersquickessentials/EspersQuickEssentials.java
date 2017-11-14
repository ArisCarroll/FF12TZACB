package dmf.tzacb.model.licenses.espersquickessentials;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class EspersQuickEssentials {
	
	private License[] eqeeLicenses;
	
	public EspersQuickEssentials () {
		
		eqeeLicenses = new License[30];
		
		// Espers Quckenings Essentials and Empty
		eqeeLicenses[0]  = new License("Empty",          0, LicenseType.Empty,       "Empty.");
		eqeeLicenses[1]  = new License("Essentials",     0, LicenseType.Essentials,  "Unlocks Attack and Items.");
		eqeeLicenses[2]  = new License("Second Board",  30, LicenseType.SecondBoard, "Unlocks Second Board.");
		eqeeLicenses[3]  = new License("Quickening 1",  50, LicenseType.Quickening,  "Unlocks a Quickening.");
		eqeeLicenses[4]  = new License("Quickening 2",  75, LicenseType.Quickening,  "Unlocks a Quickening.");
		eqeeLicenses[5]  = new License("Quickening 3", 100, LicenseType.Quickening,  "Unlocks a Quickening.");
		eqeeLicenses[6]  = new License("Quickening 4", 125, LicenseType.Quickening,  "Unlocks a Quickening.");
		eqeeLicenses[7]  = new License("Belias",        20, LicenseType.Summon,      "Unlocks Belias.");
		eqeeLicenses[8]  = new License("Mateus",        30, LicenseType.Summon,      "Unlocks Mateus.");
		eqeeLicenses[9]  = new License("Zalera",        30, LicenseType.Summon,      "Unlocks Zalera.");
		eqeeLicenses[10] = new License("Adrammelech",   35, LicenseType.Summon,      "Unlocks Adrammelech.");
		eqeeLicenses[11] = new License("Shemhazai",     50, LicenseType.Summon,      "Unlocks Shemhazai.");
		eqeeLicenses[12] = new License("Hashmal",       50, LicenseType.Summon,      "Unlocks Hashmal.");
		eqeeLicenses[13] = new License("Cúchulainn",    50, LicenseType.Summon,      "Unlocks Cúchulainn.");
		eqeeLicenses[14] = new License("Zeromus",       65, LicenseType.Summon,      "Unlocks Zeromus.");
		eqeeLicenses[15] = new License("Exodus",        65, LicenseType.Summon,      "Unlocks Exodus.");
		eqeeLicenses[16] = new License("Famfrit",      100, LicenseType.Summon,      "Unlocks Famfrit.");
		eqeeLicenses[17] = new License("Chaos",        100, LicenseType.Summon,      "Unlocks Chaos.");
		eqeeLicenses[18] = new License("Ultima",       115, LicenseType.Summon,      "Unlocks Ultima.");
		eqeeLicenses[19] = new License("Zodiark",      200, LicenseType.Summon,      "Unlocks Zodiark.");
	}
		
	public License getEQEE(int index) {
		String		 	name 		= eqeeLicenses[index].getName();
		int 			cost 		= eqeeLicenses[index].getCost();
		LicenseType 	type		= eqeeLicenses[index].getType();
		String 			description = eqeeLicenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}
}
