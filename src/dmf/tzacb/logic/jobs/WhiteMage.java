package dmf.tzacb.logic.jobs;

import dmf.tzacb.logic.main.PlayerCharacter;
import dmf.tzacb.model.licenses.LicenseBoard;
import dmf.tzacb.model.licenses.augments.BattleAugments;
import dmf.tzacb.model.licenses.augments.HealthAugments;
import dmf.tzacb.model.licenses.augments.ItemAugments;
import dmf.tzacb.model.licenses.augments.MagickAugments;
import dmf.tzacb.model.licenses.equipment.Accessories;
import dmf.tzacb.model.licenses.equipment.Armor;
import dmf.tzacb.model.licenses.equipment.Weapons1;
import dmf.tzacb.model.licenses.equipment.Weapons2;
import dmf.tzacb.model.licenses.equipment.Weapons3;
import dmf.tzacb.model.licenses.espersquickessentials.EspersQuickEssentials;
import dmf.tzacb.model.licenses.magick.GreenMagick;
import dmf.tzacb.model.licenses.magick.WhiteMagick;
import dmf.tzacb.model.licenses.technicks.Technicks;

public class WhiteMage extends LicenseBoard {

	public WhiteMage(PlayerCharacter holder, EspersQuickEssentials eqee, BattleAugments battleAug, HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug,
					 Accessories accessories, Armor armor, Weapons1 weapons1, Weapons2 weapons2, Weapons3 weapons3, Technicks technicks, WhiteMagick whm, GreenMagick grm) {

		setBoardHolder(holder);

		// ROW 1
		int column = 0;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);

		licenseGrid[5][column] = technicks.getTechnickCopy(1);

		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);

		licenseGrid[11][0] = healthAug.getHealthAugmentCopy(5);

		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);

		// ROW 2
		column = 1;

		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);

		licenseGrid[5][column] = eqee.getEQEE(13);

		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);

		licenseGrid[11][column] = eqee.getEQEE(11);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);

		licenseGrid[13][column] = eqee.getEQEE(6);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 3
		column = 2;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(21);
		licenseGrid[3][column] = accessories.getAccessoryCopy(19);
		licenseGrid[4][column] = accessories.getAccessoryCopy(17);
		licenseGrid[5][column] = accessories.getAccessoryCopy(15);
		licenseGrid[6][column] = accessories.getAccessoryCopy(13);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		
		licenseGrid[8][column] = healthAug.getHealthAugmentCopy(4);
		
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = accessories.getAccessoryCopy(12);
		licenseGrid[11][column] = accessories.getAccessoryCopy(14);
		licenseGrid[12][column] = accessories.getAccessoryCopy(16);
		
		licenseGrid[13][column] = battleAug.getBattleLoreCopy(2);
		
		licenseGrid[14][column] = accessories.getAccessoryCopy(22);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// Row 4
		column = 3;
		
		licenseGrid[0][column] = battleAug.getBattleLoreCopy(6);
		
		licenseGrid[1][column] = eqee.getEQEE(14);
		
		licenseGrid[2][column] = armor.getArmorCopy(12);
		
		licenseGrid[3][column] = magAug.getMagickLoreCopy(12);
		
		licenseGrid[4][column] = technicks.getTechnickCopy(15);
		
		licenseGrid[5][column] = magAug.getMagickLoreCopy(21);
		
		licenseGrid[6][column] = accessories.getAccessoryCopy(11);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		
		licenseGrid[8][column] = eqee.getEQEE(4);
		
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = accessories.getAccessoryCopy(10);
		
		licenseGrid[11][column] = magAug.getMagickLoreCopy(20);
		
		licenseGrid[12][column] = accessories.getAccessoryCopy(18);
		licenseGrid[13][column] = accessories.getAccessoryCopy(20);
		
		licenseGrid[14][column] = weapons2.getWeapon2Copy(4);
		
		licenseGrid[15][column] = eqee.getEQEE(17);
		
		licenseGrid[16][column] = healthAug.getHealthAugmentCopy(7);
		
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// Row 5
		column = 4;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = armor.getArmorCopy(11);
		
		licenseGrid[3][column] = magAug.getMagickLoreCopy(19);
		
		licenseGrid[4][column] = itemAug.getItemAugmentCopy(4);
		
		licenseGrid[5][column] = magAug.getMagickLoreCopy(5);
		
		licenseGrid[6][column] = accessories.getAccessoryCopy(9);
		licenseGrid[7][column] = accessories.getAccessoryCopy(7);
		licenseGrid[8][column] = accessories.getAccessoryCopy(5);
		licenseGrid[9][column] = accessories.getAccessoryCopy(6);
		licenseGrid[10][column] = accessories.getAccessoryCopy(8);
		
		licenseGrid[11][column] = magAug.getMagickLoreCopy(6);
		
		licenseGrid[12][column] = magAug.getMagickLoreCopy(23);
		
		licenseGrid[14][column] = magAug.getMagickLoreCopy(8);
		
		licenseGrid[15][column] = healthAug.getHealthAugmentCopy(2);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		
		licenseGrid[17][column] = weapons2.getWeapon2Copy(18);
		
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 6
		column = 5;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = armor.getArmorCopy(10);
		licenseGrid[3][column] = armor.getArmorCopy(9);
		licenseGrid[4][column] = armor.getArmorCopy(8);
		licenseGrid[5][column] = armor.getArmorCopy(7);
		licenseGrid[6][column] = armor.getArmorCopy(6);
		licenseGrid[7][column] = armor.getArmorCopy(5);
		
		licenseGrid[8][column] = accessories.getAccessoryCopy(4);
		
		licenseGrid[9][column] = technicks.getTechnickCopy(10);
		
		licenseGrid[10][column] = weapons3.getWeapon3Copy(2);
		
		licenseGrid[11][column] = magAug.getMagickLoreCopy(17);
		
		licenseGrid[12][column] = weapons3.getWeapon3Copy(3);
		
		licenseGrid[13][column] = magAug.getMagickLoreCopy(18);
		
		licenseGrid[14][column] = magAug.getMagickLoreCopy(2);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 7
		column = 6;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = magAug.getMagickLoreCopy(12);
		
		licenseGrid[3][column] = battleAug.getBattleLoreCopy(17);
		
		licenseGrid[4][column] = magAug.getMagickLoreCopy(9);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = armor.getArmorCopy(4);
		
		licenseGrid[8][column] = accessories.getAccessoryCopy(3);
		
		licenseGrid[9][column] = itemAug.getItemAugmentCopy(3);
		
		licenseGrid[10][column] = eqee.getEQEECopy(2);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		
		licenseGrid[12][column] = battleAug.getBattleLoreCopy(1);
		
		licenseGrid[13][column] = magAug.getMagickLoreCopy(10);
		
		licenseGrid[14][column] = magAug.getMagickLoreCopy(13);
		
		licenseGrid[15][column] = eqee.getEQEE(18);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 8
		column = 7;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = eqee.getEQEE(19);
		
		licenseGrid[2][column] = whm.getWhiteMagickCopy(12);
		
		licenseGrid[3][column] = magAug.getMagickLoreCopy(10);
		
		licenseGrid[4][column] = healthAug.getHealthAugmentCopy(1);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = eqee.getEQEE(8);
		
		licenseGrid[7][column] = armor.getArmorCopy(3);
		
		licenseGrid[8][column] = accessories.getAccessoryCopy(2);
		
		licenseGrid[9][column] = weapons2.getWeapon2Copy(1);
		
		licenseGrid[10][column] = eqee.getEQEE(7);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		
		licenseGrid[12][column] = magAug.getMagickLoreCopy(22);
		
		licenseGrid[13][column] = battleAug.getBattleLoreCopy(16);
		
		licenseGrid[14][column] = technicks.getTechnickCopy(9);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 9
		column = 8;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = weapons1.getWeapon1Copy(17);
		
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		
		licenseGrid[4][column] = eqee.getEQEE(16);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = armor.getArmorCopy(2);
		
		licenseGrid[8][column] = accessories.getAccessoryCopy(1);
		
		licenseGrid[9][column] = battleAug.getBattleLoreCopy(2);
		
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		
		licenseGrid[12][column] = eqee.getEQEE(15);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 10
		column = 9;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = technicks.getTechnickCopy(5);
		
		licenseGrid[4][column] = weapons3.getWeapon3Copy(4);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = armor.getArmorCopy(1);
		
		licenseGrid[8][column] = accessories.getAccessoryCopy(0);
		
		licenseGrid[9][column] = weapons2.getWeapon2Copy(0);
		
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		
		licenseGrid[12][column] = battleAug.getBattleLoreCopy(7);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 11
		column = 10;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = armor.getArmorCopy(0);
		
		licenseGrid[8][column] = eqee.getEQEECopy(1);
		
		licenseGrid[9][column] = technicks.getTechnickCopy(24);
		
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 12
		column = 11;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[9][column] = technicks.getTechnickCopy(25);
		
		licenseGrid[8][column] = whm.getWhiteMagickCopy(0);
		
		licenseGrid[9][column] = magAug.getMagickLoreCopy(0);
		
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 13
		column = 12;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		
		licenseGrid[4][column] = healthAug.getHealthAugmentCopy(3);
		
		licenseGrid[5][column] = eqee.getEQEE(3);
		
		licenseGrid[6][column] = technicks.getTechnickCopy(27);
		
		licenseGrid[7][column] = magAug.getMagickLoreCopy(24);
		
		licenseGrid[8][column] = whm.getWhiteMagickCopy(1);
		
		licenseGrid[9][column] = technicks.getTechnickCopy(26);
		
		licenseGrid[10][column] = magAug.getMagickLoreCopy(1);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);	
		
		// ROW 14
		column = 13;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = magAug.getMagickLoreCopy(3);
		
		licenseGrid[7][column] = healthAug.getHealthAugmentCopy(0);
		
		licenseGrid[8][column] = whm.getWhiteMagickCopy(2);
		
		licenseGrid[9][column] = magAug.getMagickLoreCopy(16);
		
		licenseGrid[10][column] = technicks.getTechnickCopy(29);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 15
		column = 14;
	
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = battleAug.getBattleLoreCopy(5);
		
		licenseGrid[4][column] = eqee.getEQEE(10);
		
		licenseGrid[5][column] = magAug.getMagickLoreCopy(7);
		
		licenseGrid[6][column] = technicks.getTechnickCopy(30);
		
		licenseGrid[7][column] = magAug.getMagickLoreCopy(3);
		
		licenseGrid[8][column] = whm.getWhiteMagickCopy(3);
		
		licenseGrid[9][column] = magAug.getMagickLoreCopy(6);
		
		licenseGrid[10][column] = grm.getGreenMagickCopy(2);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(29);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 16
		column = 15;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = technicks.getTechnickCopy(6);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		
		licenseGrid[5][column] = technicks.getTechnickCopy(33);
		licenseGrid[6][column] = technicks.getTechnickCopy(32);
		
		licenseGrid[7][column] = grm.getGreenMagickCopy(0);
		
		licenseGrid[8][column] = whm.getWhiteMagickCopy(4);
		
		licenseGrid[9][column] = grm.getGreenMagickCopy(1);
		
		licenseGrid[10][column] = technicks.getTechnickCopy(31);
		
		licenseGrid[11][column] = magAug.getMagickLoreCopy(25);
		
		licenseGrid[12][column] = eqee.getEQEE(9);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 17
		column = 16;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);

		licenseGrid[5][column] = whm.getWhiteMagickCopy(11);
		licenseGrid[6][column] = whm.getWhiteMagickCopy(9);
		licenseGrid[7][column] = whm.getWhiteMagickCopy(7);
		licenseGrid[8][column] = whm.getWhiteMagickCopy(5);
		licenseGrid[9][column] = whm.getWhiteMagickCopy(6);
		licenseGrid[10][column] = whm.getWhiteMagickCopy(8);
		licenseGrid[11][column] = whm.getWhiteMagickCopy(10);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 18
		column = 17;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = eqee.getEQEE(12);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = eqee.getEQEE(5);

		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 19
		column = 18;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = battleAug.getBattleLoreCopy(4);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		calculateTotalCost();
	}

}
