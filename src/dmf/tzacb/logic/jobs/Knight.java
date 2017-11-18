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
import dmf.tzacb.model.licenses.espersquickessentials.EQEE;
import dmf.tzacb.model.licenses.magick.WhiteMagick;
import dmf.tzacb.model.licenses.technicks.Technicks;

public class Knight extends LicenseBoard {

	public Knight(PlayerCharacter holder, Accessories accessories, Armor armor, BattleAugments battleAug, EQEE eqee, 
					HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug, Technicks technicks, Weapons1 weapons1, WhiteMagick whm ) {
		
		setBoardHolder(holder);
		
		// ROW 1
		int column = 0;
		
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
		
		licenseGrid[10][column] = itemAug.getItemAugmentCopy(1);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
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
		
		licenseGrid[2][column] = technicks.getTechnickCopy(6);
		
		licenseGrid[3][column] = battleAug.getBattleLoreCopy(23);
		licenseGrid[4][column] = magAug.getMagickLoreCopy(23);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = eqee.getEQEE(4);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = eqee.getEQEE(11);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 3
		column = 2;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = healthAug.getHealthAugmentCopy(6);
		
		licenseGrid[3][column] = armor.getArmorCopy(16);
		
		licenseGrid[4][column] = battleAug.getBattleLoreCopy(19);
		
		licenseGrid[5][column] = armor.getArmorCopy(17);
		
		licenseGrid[6][column] = battleAug.getBattleLoreCopy(0);
		
		licenseGrid[7][column] = armor.getArmorCopy(18);
		
		licenseGrid[8][column] = battleAug.getBattleLoreCopy(1);
		
		licenseGrid[9][column] = armor.getArmorCopy(19);
		
		licenseGrid[10][column] = battleAug.getBattleLoreCopy(2);
		
		licenseGrid[11][column] = armor.getArmorCopy(20);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 4
		column = 3;
		
		licenseGrid[0][column] = whm.getWhiteMagickCopy(6);
		
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = technicks.getTechnickCopy(29);
		
		licenseGrid[3][column] = magAug.getMagickLoreCopy(24);
		
		licenseGrid[4][column] = weapons1.getWeapon1Copy(10);
		
		licenseGrid[5][column] = armor.getArmorCopy(41);
		
		licenseGrid[6][column] = weapons1.getWeapon1Copy(11);
		
		licenseGrid[7][column] = armor.getArmorCopy(42);
		
		licenseGrid[8][column] = weapons1.getWeapon1Copy(12);
		
		licenseGrid[9][column] = armor.getArmorCopy(43);
		
		licenseGrid[10][column] = weapons1.getWeapon1Copy(13);
		
		licenseGrid[11][column] = battleAug.getBattleLoreCopy(3);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 5
		column = 4;
		
		licenseGrid[0][column] = whm.getWhiteMagickCopy(5);
		
		licenseGrid[1][column] = eqee.getEQEE(8);
		
		licenseGrid[2][column] = technicks.getTechnickCopy(28);
		
		licenseGrid[3][column] = armor.getArmorCopy(15);
		licenseGrid[4][column] = armor.getArmorCopy(40);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = armor.getArmorCopy(44);
		licenseGrid[11][column] = armor.getArmorCopy(21);
		
		licenseGrid[12][column] = eqee.getEQEE(5);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 6
		column = 5;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = technicks.getTechnickCopy(27);
		
		licenseGrid[3][column] = healthAug.getHealthAugmentCopy(5);
		
		licenseGrid[4][column] = weapons1.getWeapon1Copy(9);
		
		licenseGrid[5][column] = eqee.getEQEE(7);
		
		licenseGrid[6][column] = itemAug.getItemAugmentCopy(0);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = weapons1.getWeapon1Copy(14);
		
		licenseGrid[11][column] = battleAug.getBattleLoreCopy(4);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 7
		column = 6;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = technicks.getTechnickCopy(26);
		
		licenseGrid[3][column] = armor.getArmorCopy(14);
		licenseGrid[4][column] = armor.getArmorCopy(39);
		
		licenseGrid[5][column] = eqee.getEQEECopy(2);
		
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		
		licenseGrid[8][column] = battleAug.getBattleLoreCopy(8);
		
		licenseGrid[9][column] = eqee.getEQEE(13);
		
		licenseGrid[10][column] = armor.getArmorCopy(45);
		
		licenseGrid[11][column] = weapons1.getWeapon1Copy(17);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 8
		column = 7;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = technicks.getTechnickCopy(25);
		
		licenseGrid[3][column] = magAug.getMagickLoreCopy(21);
		
		licenseGrid[4][column] = weapons1.getWeapon1Copy(8);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = weapons1.getWeapon1Copy(15);
		
		licenseGrid[11][column] = armor.getArmorCopy(22);
		
		licenseGrid[12][column] = eqee.getEQEE(15);
		
		licenseGrid[13][column] = healthAug.getHealthAugmentCopy(8);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 9
		column = 8;
		
		licenseGrid[0][column] = healthAug.getHealthAugmentCopy(4);
		licenseGrid[1][column] = healthAug.getHealthAugmentCopy(2);
		licenseGrid[2][column] = healthAug.getHealthAugmentCopy(1);
		
		licenseGrid[3][column] = armor.getArmorCopy(13);
		
		licenseGrid[4][column] = eqee.getEQEECopy(1);
		
		licenseGrid[5][column] = accessories.getAccessoryCopy(0);
		licenseGrid[6][column] = accessories.getAccessoryCopy(1);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = battleAug.getBattleLoreCopy(20);
		
		licenseGrid[11][column] = weapons1.getWeapon1Copy(18);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 10
		column = 9;
		
		licenseGrid[0][column] = technicks.getTechnickCopy(30);
		
		licenseGrid[1][column] = battleAug.getBattleLoreCopy(24);
		licenseGrid[2][column] = healthAug.getHealthAugmentCopy(0);
		
		licenseGrid[3][column] = technicks.getTechnickCopy(24);
		
		licenseGrid[4][column] = technicks.getTechnickCopy(3);
		
		licenseGrid[5][column] = accessories.getAccessoryCopy(2);
		licenseGrid[6][column] = accessories.getAccessoryCopy(3);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = weapons1.getWeapon1Copy(16);
		
		licenseGrid[11][column] = battleAug.getBattleLoreCopy(5);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		
		licenseGrid[13][column] = eqee.getEQEE(16);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 11
		column = 10;
		
		licenseGrid[0][column] = technicks.getTechnickCopy(31);
		
		licenseGrid[1][column] = healthAug.getHealthAugmentCopy(3);
		
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		
		licenseGrid[5][column] = accessories.getAccessoryCopy(4);
		licenseGrid[6][column] = accessories.getAccessoryCopy(5);
		
		licenseGrid[7][column] = eqee.getEQEE(3);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = healthAug.getHealthAugmentCopy(7);
		
		licenseGrid[11][column] = weapons1.getWeapon1Copy(19);
		
		licenseGrid[12][column] = armor.getArmorCopy(23);
		
		licenseGrid[13][column] = weapons1.getWeapon1Copy(20);
		
		licenseGrid[14][column] = armor.getArmorCopy(24);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 12
		column = 11;
		
		licenseGrid[0][column] = technicks.getTechnickCopy(32);
		
		licenseGrid[1][column] = technicks.getTechnickCopy(11);
		
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		
		licenseGrid[5][column] = accessories.getAccessoryCopy(6);
		licenseGrid[6][column] = accessories.getAccessoryCopy(7);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		
		licenseGrid[9][column] = eqee.getEQEE(14);
		
		licenseGrid[10][column] = magAug.getMagickLoreCopy(25);
		licenseGrid[11][column] = battleAug.getBattleLoreCopy(6);
		
		licenseGrid[12][column] = armor.getArmorCopy(46);
		
		licenseGrid[13][column] = battleAug.getBattleLoreCopy(9);
		
		licenseGrid[14][column] = weapons1.getWeapon1Copy(21);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		
		licenseGrid[16][column] = battleAug.getBattleLoreCopy(10);
		
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 13
		column = 12;
		
		licenseGrid[0][column] = technicks.getTechnickCopy(33);
		
		licenseGrid[1][column] = battleAug.getBattleLoreCopy(22);
		
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = eqee.getEQEE(9);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		
		licenseGrid[5][column] = accessories.getAccessoryCopy(8);
		licenseGrid[6][column] = accessories.getAccessoryCopy(9);
		
		licenseGrid[7][column] = eqee.getEQEE(10);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = battleAug.getBattleLoreCopy(21);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(7);
		
		licenseGrid[12][column] = battleAug.getBattleLoreCopy(7);
		licenseGrid[13][column] = battleAug.getBattleLoreCopy(11);
		
		licenseGrid[14][column] = armor.getArmorCopy(25);
		
		licenseGrid[15][column] = eqee.getEQEE(18);
		
		licenseGrid[16][column] = technicks.getTechnickCopy(4);
		
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 14
		column = 13;
		
		licenseGrid[0][column] = weapons1.getWeapon1Copy(24);
		
		licenseGrid[1][column] = accessories.getAccessoryCopy(20);
		licenseGrid[2][column] = accessories.getAccessoryCopy(18);
		licenseGrid[3][column] = accessories.getAccessoryCopy(16);
		licenseGrid[4][column] = accessories.getAccessoryCopy(12);
		licenseGrid[5][column] = accessories.getAccessoryCopy(10);
		licenseGrid[6][column] = accessories.getAccessoryCopy(11);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = weapons1.getWeapon1Copy(25);
		
		licenseGrid[11][column] = armor.getArmorCopy(47);
		
		licenseGrid[12][column] = battleAug.getBattleLoreCopy(16);
		
		licenseGrid[13][column] = armor.getArmorCopy(48);
		
		licenseGrid[14][column] = weapons1.getWeapon1Copy(23);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 15
		column = 14;
		
		licenseGrid[0][column] = accessories.getAccessoryCopy(22);
		licenseGrid[1][column] = accessories.getAccessoryCopy(21);
		licenseGrid[2][column] = accessories.getAccessoryCopy(19);
		licenseGrid[3][column] = accessories.getAccessoryCopy(17);
		licenseGrid[4][column] = accessories.getAccessoryCopy(15);
		licenseGrid[5][column] = accessories.getAccessoryCopy(13);
		licenseGrid[6][column] = accessories.getAccessoryCopy(14);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = eqee.getEQEE(17);
		
		licenseGrid[12][column] = eqee.getEQEE(6);
		
		licenseGrid[13][column] = eqee.getEQEE(19);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 16
		column = 15;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = eqee.getEQEE(12);
		
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = healthAug.getHealthAugmentCopy(9);
		
		licenseGrid[12][column] = technicks.getTechnickCopy(14);
		
		licenseGrid[13][column] = weapons1.getWeapon1Copy(22);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 17
		column = 16;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = whm.getWhiteMagickCopy(7);
		licenseGrid[2][column] = whm.getWhiteMagickCopy(8);
		
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		licenseGrid[11][column] = eqee.getEQEECopy(0);
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
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
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
		licenseGrid[10][column] = eqee.getEQEECopy(0);
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
