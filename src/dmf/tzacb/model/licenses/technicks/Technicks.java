package dmf.tzacb.model.licenses.technicks;

import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class Technicks {
	
	
	private License[] techLicenses;
	
	public Technicks () {
		
		techLicenses = new License[34];
		
		// White Magick
		techLicenses[0]   = new License("Steal",           20, LicenseType.Technick, "Steal from one foe.");
		techLicenses[1]   = new License("Libra",           25, LicenseType.Technick, "Reveal more detailed target information.");
		techLicenses[2]   = new License("Poach",           30, LicenseType.Technick, "Capture HP Critical foes to obtain loot.");
		techLicenses[3]   = new License("First Aid",       20, LicenseType.Technick, "Restore HP to one HP Critical ally.");
		techLicenses[4]   = new License("Telekenisis",     80, LicenseType.Technick, "Deal ranged damage with melee weapons.");
		techLicenses[5]   = new License("Numerology",      40, LicenseType.Technick, "Deal damage that increases with successive hits.");
		techLicenses[6]   = new License("Souleater",       35, LicenseType.Technick, "Consume HP to deal damage to one foe.");
		techLicenses[7]   = new License("Sight Unseeing",  40, LicenseType.Technick, "Unleash an attack only available when blind.");
		techLicenses[8]   = new License("Charm",           30, LicenseType.Technick, "Cause one foe to confuse friend with foe.");
		techLicenses[9]   = new License("Achilles",        40, LicenseType.Technick, "Render one foe vulnerable to an additional element.");
		techLicenses[10]  = new License("Charge",          30, LicenseType.Technick, "Restores user's MP and Mist Charges. If the technick fails, MP is reduced to 0.");
		techLicenses[11]  = new License("Infuse",          30, LicenseType.Technick, "Fully consume user's MP, changing one ally's HP to 10 times that amount.");
		techLicenses[12]  = new License("Gil Toss",        30, LicenseType.Technick, "Throw gil, damaging all foes in range.");
		techLicenses[13]  = new License("1000 Needles",    40, LicenseType.Technick, "Deal 1,000 damage to one foe.");
		techLicenses[14]  = new License("Revive",          40, LicenseType.Technick, "Fully consume user's HP, reviving and fully restoring HP of one KO'd ally.");
		techLicenses[15]  = new License("Stamp",           40, LicenseType.Technick, "Inflict one foe with any harmful status effects on the user.");
		techLicenses[16]  = new License("Shades of Black", 70, LicenseType.Technick, "Cast a random black magick on one foe.");
		techLicenses[17]  = new License("Traveler",        50, LicenseType.Technick, "Deal damage based on total steps taken to all foes in range.");
		techLicenses[18]  = new License("Horology",        50, LicenseType.Technick, "Deal damage based on a factor of time to all foes in range.");
		techLicenses[19]  = new License("Bonecrusher",     30, LicenseType.Technick, "Consumes HP to reduce the HP of one foe to 0.");
		techLicenses[20]  = new License("Wither",          50, LicenseType.Technick, "Lower one foe's strength.");
		techLicenses[21]  = new License("Addle",           50, LicenseType.Technick, "Lower one foe's magick power.");
		techLicenses[22]  = new License("Expose",          50, LicenseType.Technick, "Lower one foe's defense.");
		techLicenses[23]  = new License("Shear",           50, LicenseType.Technick, "Lower one foe's magick resist.");
		techLicenses[24]  = new License("Gambit  1",       15, LicenseType.Gambit, 	 "Unlocks an additional Gambit.");
		techLicenses[25]  = new License("Gambit  2",       20, LicenseType.Gambit, 	 "Unlocks an additional Gambit.");
		techLicenses[26]  = new License("Gambit  3",       25, LicenseType.Gambit,   "Unlocks an additional Gambit.");
		techLicenses[27]  = new License("Gambit  4",       30, LicenseType.Gambit,   "Unlocks an additional Gambit.");
		techLicenses[28]  = new License("Gambit  5",       35, LicenseType.Gambit,   "Unlocks an additional Gambit.");
		techLicenses[29]  = new License("Gambit  6",       40, LicenseType.Gambit,   "Unlocks an additional Gambit.");
		techLicenses[30]  = new License("Gambit  7",       45, LicenseType.Gambit,   "Unlocks an additional Gambit.");
		techLicenses[31]  = new License("Gambit  8",       50, LicenseType.Gambit,   "Unlocks an additional Gambit.");
		techLicenses[32]  = new License("Gambit  9",       70, LicenseType.Gambit,   "Unlocks an additional Gambit.");
		techLicenses[33]  = new License("Gambit 10",      100, LicenseType.Gambit,   "Unlocks an additional Gambit.");
		
	}
	
	public License getTechnickCopy(int index) {
		String		 	name 		= techLicenses[index].getName();
		int 			cost 		= techLicenses[index].getCost();
		LicenseType 	type		= techLicenses[index].getType();
		String 			description = techLicenses[index].getDescription();
		
		return new License(name, cost,type,description);
	}
}
