package dmf.ff12.logic.jobs.EspersQuickEssentials;

import dmf.ff12.logic.jobs.License;
import dmf.ff12.logic.jobs.LicenseType;

public class EspersQuickEssentials {
	
	private License[] eqeeLicenses;
	
	public EspersQuickEssentials () {
		
		eqeeLicenses = new License[19];
		
		// Espers Quckenings Essentials and Empty
		eqeeLicenses[0]   = new License("Quickening 1",  50, LicenseType.Quickening, "Unlocks Stuff.");
		eqeeLicenses[1]   = new License("Quickening 2",  70, LicenseType.Quickening, "Unlocks Stuff.");
		eqeeLicenses[2]   = new License("Quickening 3", 100, LicenseType.Quickening, "Unlocks Stuff.");
		eqeeLicenses[3]   = new License("Quickening 4", 125, LicenseType.Quickening, "Unlocks Stuff.");
		eqeeLicenses[4]   = new License("Belias",        20, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[5]   = new License("Mateus",        30, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[6]   = new License("Zalera",        30, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[7]   = new License("Adrammelech",   35, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[8]   = new License("Shemhazai",     50, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[9]   = new License("Hashmal",       50, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[10]  = new License("Cúchulainn",    50, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[11]  = new License("Zeromus",       65, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[12]  = new License("Exodus",        65, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[13]  = new License("Famfrit",      100, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[14]  = new License("Chaos",        100, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[15]  = new License("Ultima",       115, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[16]  = new License("Zodiark",      200, LicenseType.Summon,     "Unlocks Stuff.");
		eqeeLicenses[17]  = new License("Essentials",     0, LicenseType.Essentials, "Unlocks Stuff.");
		eqeeLicenses[18]  = new License("Empty",          0, LicenseType.Empty,      "Unlocks Stuff.");		
	}
	
	public License getEsQuickE(int index) {
		return eqeeLicenses[index];
	}
}
