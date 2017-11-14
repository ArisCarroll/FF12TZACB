package dmf.ff12.logic.jobs.EspersQuickEssentials;

import dmf.ff12.logic.jobs.License;
import dmf.ff12.logic.jobs.LicenseType;

public class EspersQuickEssentials {
	
	private License[] eqeeLicenses;
	
	public EspersQuickEssentials () {
		
		eqeeLicenses = new License[30];
		
		// Espers Quckenings Essentials and Empty
		eqeeLicenses[0]   = new License("Quickening 1",  50, LicenseType.Quickening,  "Unlocks a Quickening.");
		eqeeLicenses[1]   = new License("Quickening 2",  75, LicenseType.Quickening,  "Unlocks a Quickening.");
		eqeeLicenses[2]   = new License("Quickening 3", 100, LicenseType.Quickening,  "Unlocks a Quickening.");
		eqeeLicenses[3]   = new License("Quickening 4", 125, LicenseType.Quickening,  "Unlocks a Quickening.");
		eqeeLicenses[4]   = new License("Belias",        20, LicenseType.Summon,      "Unlocks Belias.");
		eqeeLicenses[5]   = new License("Mateus",        30, LicenseType.Summon,      "Unlocks Mateus.");
		eqeeLicenses[6]   = new License("Zalera",        30, LicenseType.Summon,      "Unlocks Zalera.");
		eqeeLicenses[7]   = new License("Adrammelech",   35, LicenseType.Summon,      "Unlocks Adrammelech.");
		eqeeLicenses[8]   = new License("Shemhazai",     50, LicenseType.Summon,      "Unlocks Shemhazai.");
		eqeeLicenses[9]   = new License("Hashmal",       50, LicenseType.Summon,      "Unlocks Hashmal.");
		eqeeLicenses[10]  = new License("Cúchulainn",    50, LicenseType.Summon,      "Unlocks Cúchulainn.");
		eqeeLicenses[11]  = new License("Zeromus",       65, LicenseType.Summon,      "Unlocks Zeromus.");
		eqeeLicenses[12]  = new License("Exodus",        65, LicenseType.Summon,      "Unlocks Exodus.");
		eqeeLicenses[13]  = new License("Famfrit",      100, LicenseType.Summon,      "Unlocks Famfrit.");
		eqeeLicenses[14]  = new License("Chaos",        100, LicenseType.Summon,      "Unlocks Chaos.");
		eqeeLicenses[15]  = new License("Ultima",       115, LicenseType.Summon,      "Unlocks Ultima.");
		eqeeLicenses[16]  = new License("Zodiark",      200, LicenseType.Summon,      "Unlocks Zodiark.");
		eqeeLicenses[17]  = new License("Essentials",     0, LicenseType.Essentials,  "Unlocks Attack and Items.");
		eqeeLicenses[18]  = new License("Empty",          0, LicenseType.Empty,       "Empty.");
		eqeeLicenses[19]  = new License("Second Board",  30, LicenseType.SecondBoard, "Unlocks Second Board.");
		eqeeLicenses[20]  = new License("Gambit  1",     15, LicenseType.Gambit, 	  "Unlocks an additional Gambit.");
		eqeeLicenses[21]  = new License("Gambit  2",     20, LicenseType.Gambit, 	  "Unlocks an additional Gambit.");
		eqeeLicenses[22]  = new License("Gambit  3",     25, LicenseType.Gambit,      "Unlocks an additional Gambit.");
		eqeeLicenses[23]  = new License("Gambit  4",     30, LicenseType.Gambit,      "Unlocks an additional Gambit.");
		eqeeLicenses[24]  = new License("Gambit  5",     35, LicenseType.Gambit,      "Unlocks an additional Gambit.");
		eqeeLicenses[25]  = new License("Gambit  6",     40, LicenseType.Gambit,      "Unlocks an additional Gambit.");
		eqeeLicenses[26]  = new License("Gambit  7",     45, LicenseType.Gambit,      "Unlocks an additional Gambit.");
		eqeeLicenses[27]  = new License("Gambit  8",     50, LicenseType.Gambit,      "Unlocks an additional Gambit.");
		eqeeLicenses[28]  = new License("Gambit  9",     70, LicenseType.Gambit,      "Unlocks an additional Gambit.");
		eqeeLicenses[29]  = new License("Gambit 10",    100, LicenseType.Gambit,      "Unlocks an additional Gambit.");
	}
		
	public License getEQEE(int index) {
		String		 	name 		= eqeeLicenses[index].getName();
		int 			cost 		= eqeeLicenses[index].getCost();
		LicenseType 	type		= eqeeLicenses[index].getType();
		String 			description = eqeeLicenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}
}
