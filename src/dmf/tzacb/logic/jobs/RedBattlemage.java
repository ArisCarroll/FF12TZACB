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
import dmf.tzacb.model.licenses.espersquickessentials.EQEE;
import dmf.tzacb.model.licenses.magick.ArcaneMagick;
import dmf.tzacb.model.licenses.magick.BlackMagick;
import dmf.tzacb.model.licenses.magick.GreenMagick;
import dmf.tzacb.model.licenses.magick.TimeMagick;
import dmf.tzacb.model.licenses.magick.WhiteMagick;
import dmf.tzacb.model.licenses.technicks.Technicks;

public class RedBattlemage extends LicenseBoard {

	public RedBattlemage(PlayerCharacter holder, Accessories accessories, ArcaneMagick arm, Armor armor, BattleAugments battleAug, BlackMagick blm, EQEE eqee, 
					GreenMagick grm,HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug, Technicks technicks, TimeMagick tim, Weapons1 weapons1, Weapons2 weapons2,
					WhiteMagick whm ) {
		
		setBoardHolder(holder);
		
		// ROW 1
		int column = 0;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		
		licenseGrid[4][column] = whm.getWhiteMagickCopy(1);
		
		licenseGrid[5][column] = whm.getWhiteMagickCopy(1);
		
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
		
		// ROW 2
		column = 1;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = eqee.getEQEE(12);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		
		licenseGrid[5][column] = eqee.getEQEE(3);
		
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = eqee.getEQEE(8);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = whm.getWhiteMagickCopy(6);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		
		licenseGrid[12][column] = healthAug.getHealthAugmentCopy(5);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = armor.getArmorCopy(21);
		licenseGrid[15][column] = armor.getArmorCopy(22);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 3
		column = 2;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(15);
		licenseGrid[3][column] = accessories.getAccessoryCopy(10);
		
		licenseGrid[4][column] = technicks.getTechnickCopy(29);
		licenseGrid[5][column] = technicks.getTechnickCopy(27);
		licenseGrid[6][column] = technicks.getTechnickCopy(26);
		
		licenseGrid[7][column] = tim.getTimeMagickCopy(1);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = eqee.getEQEE(11);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		
		licenseGrid[12][column] = eqee.getEQEE(4);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = armor.getArmorCopy(20);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 4
		column = 3;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(13);
		licenseGrid[3][column] = accessories.getAccessoryCopy(9);
		
		licenseGrid[4][column] = technicks.getTechnickCopy(28);
		
		licenseGrid[5][column] = magAug.getMagickLoreCopy(24);
		
		licenseGrid[6][column] = technicks.getTechnickCopy(25);
		
		licenseGrid[7][column] = whm.getWhiteMagickCopy(2);
		licenseGrid[8][column] = blm.getBlackMagickCopy(2);
		licenseGrid[9][column] = grm.getGreenMagickCopy(1);
		licenseGrid[10][column] = blm.getBlackMagickCopy(3);
		licenseGrid[11][column] = blm.getBlackMagickCopy(4);
		licenseGrid[12][column] = blm.getBlackMagickCopy(5);
		licenseGrid[13][column] = tim.getTimeMagickCopy(2);
		
		licenseGrid[14][column] = eqee.getEQEE(15);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 5
		column = 4;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(21);
		licenseGrid[3][column] = accessories.getAccessoryCopy(12);
		
		licenseGrid[4][column] = eqee.getEQEECopy(2);
		
		licenseGrid[5][column] = eqee.getEQEE(7);
		
		licenseGrid[6][column] = technicks.getTechnickCopy(24);
		
		licenseGrid[7][column] = grm.getGreenMagickCopy(0);
		licenseGrid[8][column] = whm.getWhiteMagickCopy(3);
		licenseGrid[9][column] = arm.getArcaneMagickCopy(1);
		licenseGrid[10][column] = whm.getWhiteMagickCopy(4);
		licenseGrid[11][column] = grm.getGreenMagickCopy(2);
		licenseGrid[12][column] = whm.getWhiteMagickCopy(5);
		licenseGrid[13][column] = arm.getArcaneMagickCopy(2);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 6
		column = 5;
		
		licenseGrid[0][column] = magAug.getMagickLoreCopy(18);
		
		licenseGrid[1][column] = eqee.getEQEE(14);
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(22);
		licenseGrid[3][column] = accessories.getAccessoryCopy(19);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = arm.getArcaneMagickCopy(0);
		licenseGrid[7][column] = tim.getTimeMagickCopy(0);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = eqee.getEQEE(13);
		
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
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(20);
		licenseGrid[3][column] = accessories.getAccessoryCopy(18);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = eqee.getEQEECopy(1);
		
		licenseGrid[7][column] = armor.getArmorCopy(0);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = blm.getBlackMagickCopy(8);
		licenseGrid[12][column] = blm.getBlackMagickCopy(9);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = battleAug.getBattleLoreCopy(0);
		licenseGrid[15][column] = battleAug.getBattleLoreCopy(1);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 8
		column = 7;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(17);
		licenseGrid[3][column] = accessories.getAccessoryCopy(11);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = accessories.getAccessoryCopy(0);
		
		licenseGrid[7][column] = weapons2.getWeapon2Copy(5);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = eqee.getEQEE(16);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 9
		column = 8;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(14);
		licenseGrid[3][column] = accessories.getAccessoryCopy(7);
		licenseGrid[4][column] = accessories.getAccessoryCopy(5);
		licenseGrid[5][column] = accessories.getAccessoryCopy(3);
		licenseGrid[6][column] = accessories.getAccessoryCopy(1);
		
		licenseGrid[7][column] = armor.getArmorCopy(1);
		licenseGrid[8][column] = armor.getArmorCopy(2);
		licenseGrid[9][column] = armor.getArmorCopy(3);
		licenseGrid[10][column] = armor.getArmorCopy(40);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(30);
		
		licenseGrid[12][column] = armor.getArmorCopy(41);
		
		licenseGrid[13][column] = technicks.getTechnickCopy(31);
		licenseGrid[14][column] = technicks.getTechnickCopy(32);
		licenseGrid[15][column] = technicks.getTechnickCopy(33);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 10
		column = 9;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = eqee.getEQEE(9);
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(16);
		licenseGrid[3][column] = accessories.getAccessoryCopy(8);
		licenseGrid[4][column] = accessories.getAccessoryCopy(6);
		licenseGrid[5][column] = accessories.getAccessoryCopy(4);
		licenseGrid[6][column] = accessories.getAccessoryCopy(2);
		
		licenseGrid[7][column] = technicks.getTechnickCopy(10);
		
		licenseGrid[8][column] = armor.getArmorCopy(39);
		
		licenseGrid[9][column] = weapons2.getWeapon2Copy(6);
		
		licenseGrid[10][column] = magAug.getMagickLoreCopy(22);
		
		licenseGrid[11][column] = armor.getArmorCopy(4);
		licenseGrid[12][column] = armor.getArmorCopy(5);
		licenseGrid[13][column] = armor.getArmorCopy(6);
		licenseGrid[14][column] = armor.getArmorCopy(7);
		licenseGrid[15][column] = armor.getArmorCopy(42);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 11
		column = 10;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		
		licenseGrid[4][column] = eqee.getEQEE(10);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = battleAug.getBattleLoreCopy(2);
		licenseGrid[11][column] = healthAug.getHealthAugmentCopy(2);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = armor.getArmorCopy(8);
		licenseGrid[15][column] = armor.getArmorCopy(43);
		
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
		
		licenseGrid[6][column] = eqee.getEQEECopy(20);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = weapons2.getWeapon2Copy(7);
		
		licenseGrid[11][column] = itemAug.getItemAugmentCopy(3);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = armor.getArmorCopy(9);
		licenseGrid[15][column] = armor.getArmorCopy(44);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		
		licenseGrid[17][column] = weapons1.getWeapon1Copy(18);
		
		// ROW 13
		column = 12;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = healthAug.getHealthAugmentCopy(10);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = eqee.getEQEE(19);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = magAug.getMagickLoreCopy(21);
		licenseGrid[11][column] = magAug.getMagickLoreCopy(20);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = armor.getArmorCopy(10);
		licenseGrid[15][column] = armor.getArmorCopy(45);
		
		licenseGrid[16][column] = eqee.getEQEE(18);
		
		licenseGrid[17][column] = weapons1.getWeapon1Copy(17);
		
		// ROW 14
		column = 13;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = eqee.getEQEE(6);
		
		licenseGrid[4][column] = armor.getArmorCopy(47);
		
		licenseGrid[5][column] = magAug.getMagickLoreCopy(9);
		licenseGrid[6][column] = magAug.getMagickLoreCopy(8);
		licenseGrid[7][column] = magAug.getMagickLoreCopy(5);
		licenseGrid[8][column] = magAug.getMagickLoreCopy(4);
		licenseGrid[9][column] = magAug.getMagickLoreCopy(0);
		
		licenseGrid[10][column] = weapons2.getWeapon2Copy(8);
		
		licenseGrid[11][column] = magAug.getMagickLoreCopy(16);
		
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = armor.getArmorCopy(11);
		licenseGrid[15][column] = armor.getArmorCopy(46);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 15
		column = 14;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		
		licenseGrid[4][column] = armor.getArmorCopy(48);
		
		licenseGrid[5][column] = magAug.getMagickLoreCopy(11);
		licenseGrid[6][column] = magAug.getMagickLoreCopy(10);
		licenseGrid[7][column] = magAug.getMagickLoreCopy(7);
		licenseGrid[8][column] = magAug.getMagickLoreCopy(6);
		licenseGrid[9][column] = magAug.getMagickLoreCopy(2);
		licenseGrid[10][column] = magAug.getMagickLoreCopy(1);
		licenseGrid[11][column] = healthAug.getHealthAugmentCopy(4);
		licenseGrid[12][column] = battleAug.getBattleLoreCopy(16);
		licenseGrid[13][column] = magAug.getMagickLoreCopy(19);
		
		licenseGrid[14][column] = armor.getArmorCopy(12);
		
		licenseGrid[15][column] = technicks.getTechnickCopy(6);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 16
		column = 15;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		
		licenseGrid[8][column] = eqee.getEQEE(5);
		
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = magAug.getMagickLoreCopy(3);
		
		licenseGrid[11][column] = weapons2.getWeapon2Copy(9);
		
		licenseGrid[12][column] = magAug.getMagickLoreCopy(17);
		licenseGrid[13][column] = magAug.getMagickLoreCopy(23);
		licenseGrid[14][column] = healthAug.getHealthAugmentCopy(6);
		licenseGrid[15][column] = magAug.getMagickLoreCopy(25);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 17
		column = 16;
		
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
		
		licenseGrid[13][column] = eqee.getEQEE(17);
		
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
		
		licenseGrid[13][column] = weapons1.getWeapon1Copy(19);
		
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
