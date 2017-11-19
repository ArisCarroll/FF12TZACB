package dmf.tzacb.model.licenses.technicks;

import javax.swing.ImageIcon;

import dmf.tzacb.gui.MainGui;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseType;

public class Technicks {
	
	
	private License[] techLicenses;
	
	private static ImageIcon[]	 notW = new ImageIcon[34];
	private static ImageIcon[]	 yesW = new ImageIcon[34];
	
	private static ImageIcon[]	 notB = new ImageIcon[34];
	private static ImageIcon[]	 yesB = new ImageIcon[34];
	
	public Technicks () {
		
		techLicenses = new License[34];
		
		getTechnicksIcons();
		
		// White Magick
		techLicenses[0]   = new License("Steal",           20, LicenseType.Technick, "Steal from one foe.", 															notW[0], yesW[0], notB[0], notW[0]);
		techLicenses[1]   = new License("Libra",           25, LicenseType.Technick, "Reveal more detailed target information.", 										notW[1], yesW[1], notB[1], notW[1]);
		techLicenses[2]   = new License("Poach",           30, LicenseType.Technick, "Capture HP Critical foes to obtain loot.", 										notW[2], yesW[2], notB[2], notW[2]);
		techLicenses[3]   = new License("First Aid",       20, LicenseType.Technick, "Restore HP to one HP Critical ally.", 											notW[3], yesW[3], notB[3], notW[3]);
		techLicenses[4]   = new License("Telekenisis",     80, LicenseType.Technick, "Deal ranged damage with melee weapons.", 											notW[4], yesW[4], notB[4], notW[4]);
		techLicenses[5]   = new License("Numerology",      40, LicenseType.Technick, "Deal damage that increases with successive hits.", 								notW[5], yesW[5], notB[5], notW[5]);
		techLicenses[6]   = new License("Souleater",       35, LicenseType.Technick, "Consume HP to deal damage to one foe.", 											notW[6], yesW[6], notB[6], notW[6]);
		techLicenses[7]   = new License("Sight Unseeing",  40, LicenseType.Technick, "Unleash an attack only available when blind.", 									notW[7], yesW[7], notB[7], notW[7]);
		techLicenses[8]   = new License("Charm",           30, LicenseType.Technick, "Cause one foe to confuse friend with foe.", 										notW[8], yesW[8], notB[8], notW[8]);
		techLicenses[9]   = new License("Achilles",        40, LicenseType.Technick, "Render one foe vulnerable to an additional element.", 							notW[9], yesW[9], notB[9], notW[9]);
		techLicenses[10]  = new License("Charge",          30, LicenseType.Technick, "Restores user's MP and Mist Charges. If the technick fails, MP is reduced to 0.",	notW[10], yesW[10], notB[10], notW[10]);
		techLicenses[11]  = new License("Infuse",          30, LicenseType.Technick, "Fully consume user's MP, changing one ally's HP to 10 times that amount.", 		notW[11], yesW[11], notB[11], notW[11]);
		techLicenses[12]  = new License("Gil Toss",        30, LicenseType.Technick, "Throw gil, damaging all foes in range.", 											notW[12], yesW[12], notB[12], notW[12]);
		techLicenses[13]  = new License("1000 Needles",    40, LicenseType.Technick, "Deal 1,000 damage to one foe.", 													notW[13], yesW[13], notB[13], notW[13]);
		techLicenses[14]  = new License("Revive",          40, LicenseType.Technick, "Fully consume user's HP, reviving and fully restoring HP of one KO'd ally.", 		notW[14], yesW[14], notB[14], notW[14]);
		techLicenses[15]  = new License("Stamp",           40, LicenseType.Technick, "Inflict one foe with any harmful status effects on the user.", 					notW[15], yesW[15], notB[15], notW[15]);
		techLicenses[16]  = new License("Shades of Black", 70, LicenseType.Technick, "Cast a random black magick on one foe.", 											notW[16], yesW[16], notB[16], notW[16]);
		techLicenses[17]  = new License("Traveler",        50, LicenseType.Technick, "Deal damage based on total steps taken to all foes in range.", 					notW[17], yesW[17], notB[17], notW[17]);
		techLicenses[18]  = new License("Horology",        50, LicenseType.Technick, "Deal damage based on a factor of time to all foes in range.", 					notW[18], yesW[18], notB[18], notW[18]);
		techLicenses[19]  = new License("Bonecrusher",     30, LicenseType.Technick, "Consumes HP to reduce the HP of one foe to 0.", 									notW[19], yesW[19], notB[19], notW[19]);
		techLicenses[20]  = new License("Wither",          50, LicenseType.Technick, "Lower one foe's strength.", 														notW[20], yesW[20], notB[20], notW[20]);
		techLicenses[21]  = new License("Addle",           50, LicenseType.Technick, "Lower one foe's magick power.", 													notW[21], yesW[21], notB[21], notW[21]);
		techLicenses[22]  = new License("Expose",          50, LicenseType.Technick, "Lower one foe's defense.", 														notW[22], yesW[22], notB[22], notW[22]);
		techLicenses[23]  = new License("Shear",           50, LicenseType.Technick, "Lower one foe's magick resist.", 													notW[23], yesW[23], notB[23], notW[23]);
		techLicenses[24]  = new License("Gambit  1",       15, LicenseType.Gambit, 	 "Unlocks an additional Gambit.", 													notW[24], yesW[24], notB[24], notW[24]);
		techLicenses[25]  = new License("Gambit  2",       20, LicenseType.Gambit, 	 "Unlocks an additional Gambit.", 													notW[25], yesW[25], notB[25], notW[25]);
		techLicenses[26]  = new License("Gambit  3",       25, LicenseType.Gambit,   "Unlocks an additional Gambit.", 													notW[26], yesW[26], notB[26], notW[26]);
		techLicenses[27]  = new License("Gambit  4",       30, LicenseType.Gambit,   "Unlocks an additional Gambit.", 													notW[27], yesW[27], notB[27], notW[27]);
		techLicenses[28]  = new License("Gambit  5",       35, LicenseType.Gambit,   "Unlocks an additional Gambit.", 													notW[28], yesW[28], notB[28], notW[28]);
		techLicenses[29]  = new License("Gambit  6",       40, LicenseType.Gambit,   "Unlocks an additional Gambit.", 													notW[29], yesW[29], notB[29], notW[29]);
		techLicenses[30]  = new License("Gambit  7",       45, LicenseType.Gambit,   "Unlocks an additional Gambit.", 													notW[30], yesW[30], notB[30], notW[30]);
		techLicenses[31]  = new License("Gambit  8",       50, LicenseType.Gambit,   "Unlocks an additional Gambit.", 													notW[31], yesW[31], notB[31], notW[31]);
		techLicenses[32]  = new License("Gambit  9",       70, LicenseType.Gambit,   "Unlocks an additional Gambit.", 													notW[32], yesW[32], notB[32], notW[32]);
		techLicenses[33]  = new License("Gambit 10",      100, LicenseType.Gambit,   "Unlocks an additional Gambit.", 													notW[33], yesW[33], notB[33], notW[33]);
		
	}
	
	public License getTechnickCopy(int index) {
		String		 	name 		= techLicenses[index].getName();
		int 			cost 		= techLicenses[index].getCost();
		LicenseType 	type		= techLicenses[index].getType();
		String 			description = techLicenses[index].getDescription();
		
		return new License(name, cost,type,description,	notW[index], yesW[index], notB[index], notW[index]);
	}
	
	private void getTechnicksIcons() {
		
		// Empty Essentials Second Board
		notW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nStealW.PNG"));
		yesW[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yStealW.PNG"));
		notB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nStealB.PNG"));
		yesB[0] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yStealB.PNG"));
		
		notW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nLibraW.PNG"));
		yesW[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yLibraW.PNG"));
		notB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nLibraB.PNG"));
		yesB[1] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yLibraB.PNG"));
		
		notW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nPoachW.PNG"));
		yesW[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yPoachW.PNG"));
		notB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nPoachB.PNG"));
		yesB[2] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yPoachB.PNG"));
		
		notW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nFirstAidW.PNG"));
		yesW[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yFirstAidW.PNG"));
		notB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nFirstAidB.PNG"));
		yesB[3] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yFirstAidB.PNG"));
		
		notW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nTelekenisisW.PNG"));
		yesW[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yTelekenisisW.PNG"));
		notB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nTelekenisisB.PNG"));
		yesB[4] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yTelekenisisB.PNG"));
		
		notW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nNumerologyW.PNG"));
		yesW[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yNumerologyW.PNG"));
		notB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nNumerologyB.PNG"));
		yesB[5] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yNumerologyB.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nSouleaterW.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/ySouleaterW.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nSouleaterB.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/ySouleaterB.PNG"));
		  
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nSightUnseeingW.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/ySightUnseeingW.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nSightUnseeingB.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/ySightUnseeingB.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nCharmW.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yCharmW.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nCharmB.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yCharmB.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nAchillesW.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yAchillesW.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nAchillesB.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yAchillesB.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nChargeW.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yChargeW.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nChargeB.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yChargeB.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nInfuseW.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yInfuseW.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nInfuseB.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yInfuseB.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGilTossW.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGilTossW.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGilTossB.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGilTossB.PNG"));
		
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/n1000NeedlesW.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/y1000NeedlesW.PNG"));
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/n1000NeedlesB.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/y1000NeedlesB.PNG"));
		
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nReviveW.PNG"));
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yReviveW.PNG"));
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nReviveB.PNG"));
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yReviveB.PNG"));
		
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nStampW.PNG"));
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yStampW.PNG"));
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nStampB.PNG"));
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yStampB.PNG"));
		
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nShadesOfBlackW.PNG"));
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yShadesOfBlackW.PNG"));
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nShadesOfBlackB.PNG"));
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yShadesOfBlackB.PNG"));
		
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nTravelerW.PNG"));
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yTravelerW.PNG"));
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nTravelerB.PNG"));
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yTravelerB.PNG"));
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nHorologyW.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yHorologyW.PNG"));
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nHorologyB.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yHorologyB.PNG"));
		
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nBonecrusherW.PNG"));
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yBonecrusherW.PNG"));
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nBonecrusherB.PNG"));
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yBonecrusherB.PNG"));
		
		notW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nWitherW.PNG"));
		yesW[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yWitherW.PNG"));
		notB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nWitherB.PNG"));
		yesB[6] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yWitherB.PNG"));
		  
		notW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nAddleW.PNG"));
		yesW[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yAddleW.PNG"));
		notB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nAddleB.PNG"));
		yesB[7] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yAddleB.PNG"));
		
		notW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nExposeW.PNG"));
		yesW[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yExposeW.PNG"));
		notB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nExposeB.PNG"));
		yesB[8] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yExposeB.PNG"));
		
		notW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nShearW.PNG"));
		yesW[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yShearW.PNG"));
		notB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nShearB.PNG"));
		yesB[9] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yShearB.PNG"));
		
		notW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[10] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
		
		notW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[11] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
		
		notW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[12] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
		
		notW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[13] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
		
		notW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[14] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
		
		notW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[15] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
		
		notW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[16] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
		
		notW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[17] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
		
		notW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[18] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
		
		notW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitW.PNG"));
		yesW[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitW.PNG"));
		notB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/nGambitB.PNG"));
		yesB[19] = new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/eqee/yGambitB.PNG"));
	}
}
