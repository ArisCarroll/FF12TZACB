package dmf.ff12.logic.jobs;

import dmf.ff12.logic.jobs.Augments.BattleAugments;
import dmf.ff12.logic.jobs.Augments.HealthAugments;
import dmf.ff12.logic.jobs.Augments.ItemAugments;
import dmf.ff12.logic.jobs.Augments.MagickAugments;
import dmf.ff12.logic.jobs.EspersQuickEssentials.EspersQuickEssentials;
import dmf.ff12.logic.jobs.equipment.Accessories;
import dmf.ff12.logic.jobs.equipment.Armor;
import dmf.ff12.logic.jobs.equipment.Weapons1;
import dmf.ff12.logic.jobs.equipment.Weapons2;
import dmf.ff12.logic.jobs.equipment.Weapons3;
import dmf.ff12.logic.jobs.magick.GreenMagick;
import dmf.ff12.logic.jobs.magick.WhiteMagick;
import dmf.ff12.logic.jobs.technicks.Technicks;

public class WhiteMage extends LicenseBoard {

	public WhiteMage(PlayerCharacter holder, EspersQuickEssentials eqee, BattleAugments battleAug, HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug,
					 Accessories accessories, Armor armor, Weapons1 weapons1, Weapons2 weapons2, Weapons3 weapons3, Technicks technicks, WhiteMagick whm, GreenMagick grm) {

		setBoardHolder(holder);

		// ROW 1
		int column = 0;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		licenseGrid[4][column] = eqee.getEQEE(18);

		licenseGrid[5][column] = technicks.getTechnick(1);

		licenseGrid[6][column] = eqee.getEQEE(18);
		licenseGrid[7][column] = eqee.getEQEE(18);
		licenseGrid[8][column] = eqee.getEQEE(18);
		licenseGrid[9][column] = eqee.getEQEE(18);
		licenseGrid[10][column] = eqee.getEQEE(18);

		licenseGrid[11][0] = healthAug.getHealthAugment(5);

		licenseGrid[12][column] = eqee.getEQEE(18);
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);

		// ROW 2
		column = 1;

		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		licenseGrid[4][column] = eqee.getEQEE(18);

		licenseGrid[5][column] = eqee.getEQEE(10);

		licenseGrid[6][column] = eqee.getEQEE(18);
		licenseGrid[7][column] = eqee.getEQEE(18);
		licenseGrid[8][column] = eqee.getEQEE(18);
		licenseGrid[9][column] = eqee.getEQEE(18);
		licenseGrid[10][column] = eqee.getEQEE(18);

		licenseGrid[11][column] = eqee.getEQEE(8);
		
		licenseGrid[12][column] = eqee.getEQEE(18);

		licenseGrid[13][column] = eqee.getEQEE(3);
		
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 3
		column = 2;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		
		licenseGrid[2][column] = accessories.getAccessory(21);
		licenseGrid[3][column] = accessories.getAccessory(19);
		licenseGrid[4][column] = accessories.getAccessory(17);
		licenseGrid[5][column] = accessories.getAccessory(15);
		licenseGrid[6][column] = accessories.getAccessory(13);
		
		licenseGrid[7][column] = eqee.getEQEE(18);
		
		licenseGrid[8][column] = healthAug.getHealthAugment(4);
		
		licenseGrid[9][column] = eqee.getEQEE(18);
		
		licenseGrid[10][column] = accessories.getAccessory(12);
		licenseGrid[11][column] = accessories.getAccessory(14);
		licenseGrid[12][column] = accessories.getAccessory(16);
		
		licenseGrid[13][column] = battleAug.getBattleLore(2);
		
		licenseGrid[14][column] = accessories.getAccessory(22);
		
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// Row 4
		column = 3;
		
		licenseGrid[0][column] = battleAug.getBattleLore(6);
		
		licenseGrid[1][column] = eqee.getEQEE(11);
		
		licenseGrid[2][column] = armor.getArmor(12);
		
		licenseGrid[3][column] = magAug.getMagickLore(12);
		
		licenseGrid[4][column] = technicks.getTechnick(15);
		
		licenseGrid[5][column] = magAug.getMagickLore(21);
		
		licenseGrid[6][column] = accessories.getAccessory(11);
		
		licenseGrid[7][column] = eqee.getEQEE(18);
		
		licenseGrid[8][column] = eqee.getEQEE(1);
		
		licenseGrid[9][column] = eqee.getEQEE(18);
		
		licenseGrid[10][column] = accessories.getAccessory(10);
		
		licenseGrid[11][column] = magAug.getMagickLore(20);
		
		licenseGrid[12][column] = accessories.getAccessory(18);
		licenseGrid[13][column] = accessories.getAccessory(20);
		
		licenseGrid[14][column] = weapons2.getWeapon2(4);
		
		licenseGrid[15][column] = eqee.getEQEE(14);
		
		licenseGrid[16][column] = healthAug.getHealthAugment(7);
		
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// Row 5
		column = 4;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		
		licenseGrid[2][column] = armor.getArmor(11);
		
		licenseGrid[3][column] = magAug.getMagickLore(19);
		
		licenseGrid[4][column] = itemAug.getItemAugment(4);
		
		licenseGrid[5][column] = magAug.getMagickLore(5);
		
		licenseGrid[6][column] = accessories.getAccessory(9);
		licenseGrid[7][column] = accessories.getAccessory(7);
		licenseGrid[8][column] = accessories.getAccessory(5);
		licenseGrid[9][column] = accessories.getAccessory(6);
		licenseGrid[10][column] = accessories.getAccessory(8);
		
		licenseGrid[11][column] = magAug.getMagickLore(6);
		
		licenseGrid[12][column] = magAug.getMagickLore(23);
		
		licenseGrid[14][column] = magAug.getMagickLore(8);
		
		licenseGrid[15][column] = healthAug.getHealthAugment(2);
		
		licenseGrid[16][column] = eqee.getEQEE(18);
		
		licenseGrid[17][column] = weapons2.getWeapon2(18);
		
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 6
		column = 5;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		
		licenseGrid[2][column] = armor.getArmor(10);
		licenseGrid[3][column] = armor.getArmor(9);
		licenseGrid[4][column] = armor.getArmor(8);
		licenseGrid[5][column] = armor.getArmor(7);
		licenseGrid[6][column] = armor.getArmor(6);
		licenseGrid[7][column] = armor.getArmor(5);
		
		licenseGrid[8][column] = accessories.getAccessory(4);
		
		licenseGrid[9][column] = technicks.getTechnick(10);
		
		licenseGrid[10][column] = weapons3.getWeapon3(2);
		
		licenseGrid[11][column] = magAug.getMagickLore(17);
		
		licenseGrid[12][column] = weapons3.getWeapon3(3);
		
		licenseGrid[13][column] = magAug.getMagickLore(18);
		
		licenseGrid[14][column] = magAug.getMagickLore(2);
		
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 7
		column = 6;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		
		licenseGrid[2][column] = magAug.getMagickLore(12);
		
		licenseGrid[3][column] = battleAug.getBattleLore(17);
		
		licenseGrid[4][column] = magAug.getMagickLore(9);
		
		licenseGrid[5][column] = eqee.getEQEE(18);
		licenseGrid[6][column] = eqee.getEQEE(18);
		
		licenseGrid[7][column] = armor.getArmor(4);
		
		licenseGrid[8][column] = accessories.getAccessory(3);
		
		licenseGrid[9][column] = itemAug.getItemAugment(3);
		
		licenseGrid[10][column] = eqee.getEQEE(19);
		
		licenseGrid[11][column] = eqee.getEQEE(18);
		
		licenseGrid[12][column] = battleAug.getBattleLore(1);
		
		licenseGrid[13][column] = magAug.getMagickLore(10);
		
		licenseGrid[14][column] = magAug.getMagickLore(13);
		
		licenseGrid[15][column] = eqee.getEQEE(15);
		
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 8
		column = 7;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		
		licenseGrid[1][column] = eqee.getEQEE(16);
		
		licenseGrid[2][column] = whm.getWhiteMagick(12);
		
		licenseGrid[3][column] = magAug.getMagickLore(10);
		
		licenseGrid[4][column] = healthAug.getHealthAugment(1);
		
		licenseGrid[5][column] = eqee.getEQEE(18);
		
		licenseGrid[6][column] = eqee.getEQEE(5);
		
		licenseGrid[7][column] = armor.getArmor(3);
		
		licenseGrid[8][column] = accessories.getAccessory(2);
		
		licenseGrid[9][column] = weapons2.getWeapon2(1);
		
		licenseGrid[10][column] = eqee.getEQEE(4);
		
		licenseGrid[11][column] = eqee.getEQEE(18);
		
		licenseGrid[12][column] = magAug.getMagickLore(22);
		
		licenseGrid[13][column] = battleAug.getBattleLore(16);
		
		licenseGrid[14][column] = technicks.getTechnick(9);
		
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 9
		column = 8;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		
		licenseGrid[1][column] = weapons1.getWeapon1(17);
		
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		
		licenseGrid[4][column] = eqee.getEQEE(13);
		
		licenseGrid[5][column] = eqee.getEQEE(18);
		licenseGrid[6][column] = eqee.getEQEE(18);
		
		licenseGrid[7][column] = armor.getArmor(2);
		
		licenseGrid[8][column] = accessories.getAccessory(1);
		
		licenseGrid[9][column] = battleAug.getBattleLore(2);
		
		licenseGrid[10][column] = eqee.getEQEE(18);
		licenseGrid[11][column] = eqee.getEQEE(18);
		
		licenseGrid[12][column] = eqee.getEQEE(12);
		
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 10
		column = 9;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		
		licenseGrid[3][column] = technicks.getTechnick(5);
		
		licenseGrid[4][column] = weapons3.getWeapon3(4);
		
		licenseGrid[5][column] = eqee.getEQEE(18);
		licenseGrid[6][column] = eqee.getEQEE(18);
		
		licenseGrid[7][column] = armor.getArmor(1);
		
		licenseGrid[8][column] = accessories.getAccessory(0);
		
		licenseGrid[9][column] = weapons2.getWeapon2(0);
		
		licenseGrid[10][column] = eqee.getEQEE(18);
		licenseGrid[11][column] = eqee.getEQEE(18);
		
		licenseGrid[12][column] = battleAug.getBattleLore(7);
		
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 11
		column = 10;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		licenseGrid[4][column] = eqee.getEQEE(18);
		licenseGrid[5][column] = eqee.getEQEE(18);
		licenseGrid[6][column] = eqee.getEQEE(18);
		
		licenseGrid[7][column] = armor.getArmor(0);
		
		licenseGrid[8][column] = eqee.getEQEE(17);
		
		licenseGrid[9][column] = eqee.getEQEE(20);
		
		licenseGrid[10][column] = eqee.getEQEE(18);
		licenseGrid[11][column] = eqee.getEQEE(18);
		licenseGrid[12][column] = eqee.getEQEE(18);
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 12
		column = 11;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		licenseGrid[4][column] = eqee.getEQEE(18);
		licenseGrid[5][column] = eqee.getEQEE(18);
		licenseGrid[6][column] = eqee.getEQEE(18);
		
		licenseGrid[9][column] = eqee.getEQEE(21);
		
		licenseGrid[8][column] = whm.getWhiteMagick(0);
		
		licenseGrid[9][column] = magAug.getMagickLore(0);
		
		licenseGrid[10][column] = eqee.getEQEE(18);
		licenseGrid[11][column] = eqee.getEQEE(18);
		licenseGrid[12][column] = eqee.getEQEE(18);
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 13
		column = 12;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		
		licenseGrid[4][column] = healthAug.getHealthAugment(3);
		
		licenseGrid[5][column] = eqee.getEQEE(0);
		
		licenseGrid[6][column] = eqee.getEQEE(23);
		
		licenseGrid[7][column] = magAug.getMagickLore(24);
		
		licenseGrid[8][column] = whm.getWhiteMagick(1);
		
		licenseGrid[9][column] = eqee.getEQEE(22);
		
		licenseGrid[10][column] = magAug.getMagickLore(1);
		
		licenseGrid[11][column] = eqee.getEQEE(18);
		licenseGrid[12][column] = eqee.getEQEE(18);
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);	
		
		// ROW 14
		column = 13;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		licenseGrid[4][column] = eqee.getEQEE(18);
		licenseGrid[5][column] = eqee.getEQEE(18);
		
		licenseGrid[6][column] = magAug.getMagickLore(3);
		
		licenseGrid[7][column] = healthAug.getHealthAugment(0);
		
		licenseGrid[8][column] = whm.getWhiteMagick(2);
		
		licenseGrid[9][column] = magAug.getMagickLore(16);
		
		licenseGrid[10][column] = eqee.getEQEE(24);
		
		licenseGrid[11][column] = eqee.getEQEE(18);
		licenseGrid[12][column] = eqee.getEQEE(18);
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 15
		column = 14;
	
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		
		licenseGrid[3][column] = battleAug.getBattleLore(5);
		
		licenseGrid[4][column] = eqee.getEQEE(7);
		
		licenseGrid[5][column] = magAug.getMagickLore(7);
		
		licenseGrid[6][column] = eqee.getEQEE(26);
		
		licenseGrid[7][column] = magAug.getMagickLore(3);
		
		licenseGrid[8][column] = whm.getWhiteMagick(3);
		
		licenseGrid[9][column] = magAug.getMagickLore(6);
		
		licenseGrid[10][column] = grm.getGreenMagick(2);
		
		licenseGrid[11][column] = eqee.getEQEE(25);
		
		licenseGrid[12][column] = eqee.getEQEE(18);
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 16
		column = 15;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		
		licenseGrid[3][column] = technicks.getTechnick(6);
		
		licenseGrid[4][column] = eqee.getEQEE(18);
		
		licenseGrid[5][column] = eqee.getEQEE(29);
		licenseGrid[6][column] = eqee.getEQEE(28);
		
		licenseGrid[7][column] = grm.getGreenMagick(0);
		
		licenseGrid[8][column] = whm.getWhiteMagick(4);
		
		licenseGrid[9][column] = grm.getGreenMagick(1);
		
		licenseGrid[10][column] = eqee.getEQEE(27);
		
		licenseGrid[11][column] = magAug.getMagickLore(25);
		
		licenseGrid[12][column] = eqee.getEQEE(6);
		
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 17
		column = 16;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		licenseGrid[4][column] = eqee.getEQEE(18);

		licenseGrid[5][column] = whm.getWhiteMagick(11);
		licenseGrid[6][column] = whm.getWhiteMagick(9);
		licenseGrid[7][column] = whm.getWhiteMagick(7);
		licenseGrid[8][column] = whm.getWhiteMagick(5);
		licenseGrid[9][column] = whm.getWhiteMagick(6);
		licenseGrid[10][column] = whm.getWhiteMagick(8);
		licenseGrid[11][column] = whm.getWhiteMagick(10);
		
		licenseGrid[12][column] = eqee.getEQEE(18);
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 18
		column = 17;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		licenseGrid[4][column] = eqee.getEQEE(18);
		licenseGrid[5][column] = eqee.getEQEE(18);
		licenseGrid[6][column] = eqee.getEQEE(18);
		
		licenseGrid[7][column] = eqee.getEQEE(9);
		
		licenseGrid[8][column] = eqee.getEQEE(18);
		licenseGrid[9][column] = eqee.getEQEE(18);
		
		licenseGrid[10][column] = eqee.getEQEE(2);

		licenseGrid[11][column] = eqee.getEQEE(18);
		licenseGrid[12][column] = eqee.getEQEE(18);
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		// ROW 19
		column = 18;
		
		licenseGrid[0][column] = eqee.getEQEE(18);
		licenseGrid[1][column] = eqee.getEQEE(18);
		licenseGrid[2][column] = eqee.getEQEE(18);
		licenseGrid[3][column] = eqee.getEQEE(18);
		licenseGrid[4][column] = eqee.getEQEE(18);
		licenseGrid[5][column] = eqee.getEQEE(18);
		licenseGrid[6][column] = eqee.getEQEE(18);
		licenseGrid[7][column] = eqee.getEQEE(18);
		licenseGrid[8][column] = eqee.getEQEE(18);
		licenseGrid[9][column] = eqee.getEQEE(18);
		
		licenseGrid[10][column] = battleAug.getBattleLore(4);
		
		licenseGrid[11][column] = eqee.getEQEE(18);
		licenseGrid[12][column] = eqee.getEQEE(18);
		licenseGrid[13][column] = eqee.getEQEE(18);
		licenseGrid[14][column] = eqee.getEQEE(18);
		licenseGrid[15][column] = eqee.getEQEE(18);
		licenseGrid[16][column] = eqee.getEQEE(18);
		licenseGrid[17][column] = eqee.getEQEE(18);
		
		calculateTotalCost();
	}

}
