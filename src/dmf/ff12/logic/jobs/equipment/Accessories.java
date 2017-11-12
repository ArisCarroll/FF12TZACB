package dmf.ff12.logic.jobs.equipment;

import dmf.ff12.logic.jobs.License;
import dmf.ff12.logic.jobs.LicenseType;

public class Accessories {
	
private License[] accessoriesLicenses;
	
	public Accessories () {
		
		accessoriesLicenses = new License[23];
		
		// Accessories
		accessoriesLicenses[0]  = new License("Accessories  1",   5, LicenseType.Accessory, "Allows character to equip Orrachea Armlet.");
		accessoriesLicenses[1]  = new License("Accessories  2",  20, LicenseType.Accessory, "Allows character to equip Bangle and Firefly.");
		accessoriesLicenses[2]  = new License("Accessories  3",  25, LicenseType.Accessory, "Allows character to equip Diamond Armlet and Argyle Armlet.");
		accessoriesLicenses[3]  = new License("Accessories  4",  35, LicenseType.Accessory, "Allows character to equip Battle Harness and Steel Gorget.");
		accessoriesLicenses[4]  = new License("Accessories  5",  35, LicenseType.Accessory, "Allows character to equip Tourmaline Ring and Embroidered Tippet.");
		accessoriesLicenses[5]  = new License("Accessories  6",  35, LicenseType.Accessory, "Allows character to equip Golden Amulet and Leather Gorget.");
		accessoriesLicenses[6]  = new License("Accessories  7",  40, LicenseType.Accessory, "Allows character to equip Rose Corsage and Turtleshell Choker.");
		accessoriesLicenses[7]  = new License("Accessories  8",  45, LicenseType.Accessory, "Allows character to equip Thief's Cuffs and Gauntlets.");
		accessoriesLicenses[8]  = new License("Accessories  9",  30, LicenseType.Accessory, "Allows character to equip Amber Armlet and Black Belt.");
		accessoriesLicenses[9]  = new License("Accessories 10",  40, LicenseType.Accessory, "Allows character to equip Jade Collar and Nishijin Belt.");
		accessoriesLicenses[10] = new License("Accessories 11",  45, LicenseType.Accessory, "Allows character to equip Pheasant Netsuke and Blazer Gloves.");
		accessoriesLicenses[11] = new License("Accessories 12",  60, LicenseType.Accessory, "Allows character to equip Gillie Boots and Steel Poleyns.");
		accessoriesLicenses[12] = new License("Accessories 13",  60, LicenseType.Accessory, "Allows character to equip Berserker Bracers and Magick Gloves.");
		accessoriesLicenses[13] = new License("Accessories 14",  70, LicenseType.Accessory, "Allows character to equip Sage's Ring and Agate Ring.");
		accessoriesLicenses[14] = new License("Accessories 15",  70, LicenseType.Accessory, "Allows character to equip Ruby Ring and Bowline Sash.");
		accessoriesLicenses[15] = new License("Accessories 16",  70, LicenseType.Accessory, "Allows character to equip Cameo Belt and Cat-ear Hood.");
		accessoriesLicenses[16] = new License("Accessories 17",  80, LicenseType.Accessory, "Allows character to equip Bubble Belt and Fuzzy Mitre.");
		accessoriesLicenses[17] = new License("Accessories 18",  80, LicenseType.Accessory, "Allows character to equip Sash and Power Armlet.");
		accessoriesLicenses[18] = new License("Accessories 19", 100, LicenseType.Accessory, "Allows character to equip Indigo Pendant and Winged Boots.");
		accessoriesLicenses[19] = new License("Accessories 20", 115, LicenseType.Accessory, "Allows character to equip Opal Ring and Hermes Sandals.");
		accessoriesLicenses[20] = new License("Accessories 21", 130, LicenseType.Accessory, "Allows character to equip Quasimodo Boots and Nihopalaoa.");
		accessoriesLicenses[21] = new License("Accessories 22", 160, LicenseType.Accessory, "Allows character to equip Germinas Boots and Ring of Renewal.");
		accessoriesLicenses[22] = new License("Ribbon",         215, LicenseType.Accessory, "Allows character to equip Ribbon.");
	}		

	public License getAccessory(int index) {
		return accessoriesLicenses[index];
	}
}
