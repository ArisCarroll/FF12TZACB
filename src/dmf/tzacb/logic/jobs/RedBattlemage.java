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
import dmf.tzacb.model.licenses.espersquickessentials.EQEE;
import dmf.tzacb.model.licenses.magick.ArcaneMagick;
import dmf.tzacb.model.licenses.magick.BlackMagick;
import dmf.tzacb.model.licenses.magick.GreenMagick;
import dmf.tzacb.model.licenses.magick.TimeMagick;
import dmf.tzacb.model.licenses.magick.WhiteMagick;
import dmf.tzacb.model.licenses.technicks.Technicks;

public class RedBattlemage extends LicenseBoard {

	public RedBattlemage(PlayerCharacter holder, Accessories accessories, ArcaneMagick arcm, Armor armor, BattleAugments battleAug, BlackMagick blm, EQEE eqee, 
			GreenMagick grm,HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug, Technicks technicks, TimeMagick tim, Weapons1 weapons1, Weapons2 weapons2,
			Weapons3 weapons3, WhiteMagick whm ) {
		
		setBoardHolder(holder);
		
		// ROW 1
		int row = 0;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		
		licenseGrid[4][row] = whm.getWhiteMagickCopy(1);
		
		licenseGrid[5][row] = whm.getWhiteMagickCopy(1);
		
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 2
		row = 1;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = eqee.getEQEE(12);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		
		licenseGrid[5][row] = eqee.getEQEE(3);
		
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		
		licenseGrid[7][row] = eqee.getEQEE(8);
		
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = whm.getWhiteMagickCopy(6);
		
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		
		licenseGrid[12][row] = healthAug.getHealthAugmentCopy(5);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = armor.getArmorCopy(21);
		licenseGrid[15][row] = armor.getArmorCopy(22);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 3
		row = 2;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = accessories.getAccessoryCopy(15);
		licenseGrid[3][row] = accessories.getAccessoryCopy(10);
		
		licenseGrid[4][row] = technicks.getTechnickCopy(29);
		licenseGrid[5][row] = technicks.getTechnickCopy(27);
		licenseGrid[6][row] = technicks.getTechnickCopy(26);
		
		licenseGrid[7][row] = tim.getTimeMagickCopy(1);
		
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = eqee.getEQEE(11);
		
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		
		licenseGrid[12][row] = eqee.getEQEE(4);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = armor.getArmorCopy(20);
		
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 4
		row = 3;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = accessories.getAccessoryCopy(13);
		licenseGrid[3][row] = accessories.getAccessoryCopy(9);
		
		licenseGrid[4][row] = technicks.getTechnickCopy(28);
		
		licenseGrid[5][row] = magAug.getMagickLoreCopy(24);
		
		licenseGrid[6][row] = technicks.getTechnickCopy(25);
		
		licenseGrid[7][row] = whm.getWhiteMagickCopy(2);
		licenseGrid[8][row] = blm.getBlackMagickCopy(2);
		licenseGrid[9][row] = grm.getGreenMagickCopy(1);
		licenseGrid[10][row] = blm.getBlackMagickCopy(3);
		licenseGrid[11][row] = blm.getBlackMagickCopy(4);
		licenseGrid[12][row] = blm.getBlackMagickCopy(5);
		licenseGrid[13][row] = tim.getTimeMagickCopy(2);
		
		licenseGrid[14][row] = eqee.getEQEE(15);
		
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 5
		row = 4;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = accessories.getAccessoryCopy(21);
		licenseGrid[3][row] = accessories.getAccessoryCopy(12);
		
		licenseGrid[4][row] = eqee.getEQEECopy(2);
		
		licenseGrid[5][row] = eqee.getEQEE(7);
		
		licenseGrid[6][row] = technicks.getTechnickCopy(24);
		
		licenseGrid[7][row] = grm.getGreenMagickCopy(0);
		licenseGrid[8][row] = whm.getWhiteMagickCopy(3);
		licenseGrid[9][row] = arcm.getArcaneMagickCopy(1);
		licenseGrid[10][row] = whm.getWhiteMagickCopy(4);
		licenseGrid[11][row] = grm.getGreenMagickCopy(2);
		licenseGrid[12][row] = whm.getWhiteMagickCopy(5);
		licenseGrid[13][row] = arcm.getArcaneMagickCopy(2);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 6
		row = 5;
		
		licenseGrid[0][row] = magAug.getMagickLoreCopy(18);
		
		licenseGrid[1][row] = eqee.getEQEE(14);
		
		licenseGrid[2][row] = accessories.getAccessoryCopy(22);
		licenseGrid[3][row] = accessories.getAccessoryCopy(19);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = arcm.getArcaneMagickCopy(0);
		licenseGrid[7][row] = tim.getTimeMagickCopy(0);
		
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		
		licenseGrid[11][row] = eqee.getEQEE(13);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 7
		row = 6;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = accessories.getAccessoryCopy(20);
		licenseGrid[3][row] = accessories.getAccessoryCopy(18);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = eqee.getEQEECopy(1);
		
		licenseGrid[7][row] = armor.getArmorCopy(0);
		
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		
		licenseGrid[11][row] = blm.getBlackMagickCopy(8);
		licenseGrid[12][row] = blm.getBlackMagickCopy(9);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = battleAug.getBattleLoreCopy(0);
		licenseGrid[15][row] = battleAug.getBattleLoreCopy(1);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 8
		row = 7;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = accessories.getAccessoryCopy(17);
		licenseGrid[3][row] = accessories.getAccessoryCopy(11);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = accessories.getAccessoryCopy(0);
		
		licenseGrid[7][row] = weapons2.getWeapon2Copy(5);
		
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = eqee.getEQEE(16);
		
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 9
		row = 8;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = accessories.getAccessoryCopy(14);
		licenseGrid[3][row] = accessories.getAccessoryCopy(7);
		licenseGrid[4][row] = accessories.getAccessoryCopy(5);
		licenseGrid[5][row] = accessories.getAccessoryCopy(3);
		licenseGrid[6][row] = accessories.getAccessoryCopy(1);
		
		licenseGrid[7][row] = armor.getArmorCopy(1);
		licenseGrid[8][row] = armor.getArmorCopy(2);
		licenseGrid[9][row] = armor.getArmorCopy(3);
		licenseGrid[10][row] = armor.getArmorCopy(40);
		
		licenseGrid[11][row] = technicks.getTechnickCopy(30);
		
		licenseGrid[12][row] = armor.getArmorCopy(41);
		
		licenseGrid[13][row] = technicks.getTechnickCopy(31);
		licenseGrid[14][row] = technicks.getTechnickCopy(32);
		licenseGrid[15][row] = technicks.getTechnickCopy(33);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 10
		row = 9;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = eqee.getEQEE(9);
		
		licenseGrid[2][row] = accessories.getAccessoryCopy(16);
		licenseGrid[3][row] = accessories.getAccessoryCopy(8);
		licenseGrid[4][row] = accessories.getAccessoryCopy(6);
		licenseGrid[5][row] = accessories.getAccessoryCopy(4);
		licenseGrid[6][row] = accessories.getAccessoryCopy(2);
		
		licenseGrid[7][row] = technicks.getTechnickCopy(10);
		
		licenseGrid[8][row] = armor.getArmorCopy(39);
		
		licenseGrid[9][row] = weapons2.getWeapon2Copy(6);
		
		licenseGrid[10][row] = magAug.getMagickLoreCopy(22);
		
		licenseGrid[11][row] = armor.getArmorCopy(4);
		licenseGrid[12][row] = armor.getArmorCopy(5);
		licenseGrid[13][row] = armor.getArmorCopy(6);
		licenseGrid[14][row] = armor.getArmorCopy(7);
		licenseGrid[15][row] = armor.getArmorCopy(42);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 11
		row = 10;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		
		licenseGrid[4][row] = eqee.getEQEE(10);
		
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = battleAug.getBattleLoreCopy(2);
		licenseGrid[11][row] = healthAug.getHealthAugmentCopy(2);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = armor.getArmorCopy(8);
		licenseGrid[15][row] = armor.getArmorCopy(43);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 12
		row = 11;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = eqee.getEQEECopy(20);
		
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = weapons2.getWeapon2Copy(7);
		
		licenseGrid[11][row] = itemAug.getItemAugmentCopy(3);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = armor.getArmorCopy(9);
		licenseGrid[15][row] = armor.getArmorCopy(44);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		
		licenseGrid[17][row] = weapons1.getWeapon1Copy(18);
		
		// ROW 13
		row = 12;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = healthAug.getHealthAugmentCopy(10);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = eqee.getEQEE(19);
		
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = magAug.getMagickLoreCopy(21);
		licenseGrid[11][row] = magAug.getMagickLoreCopy(20);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = armor.getArmorCopy(10);
		licenseGrid[15][row] = armor.getArmorCopy(45);
		
		licenseGrid[16][row] = eqee.getEQEE(18);
		
		licenseGrid[17][row] = weapons1.getWeapon1Copy(17);
		
		// ROW 14
		row = 13;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = eqee.getEQEE(6);
		
		licenseGrid[4][row] = armor.getArmorCopy(47);
		
		licenseGrid[5][row] = magAug.getMagickLoreCopy(9);
		licenseGrid[6][row] = magAug.getMagickLoreCopy(8);
		licenseGrid[7][row] = magAug.getMagickLoreCopy(5);
		licenseGrid[8][row] = magAug.getMagickLoreCopy(4);
		licenseGrid[9][row] = magAug.getMagickLoreCopy(0);
		
		licenseGrid[10][row] = weapons2.getWeapon2Copy(8);
		
		licenseGrid[11][row] = magAug.getMagickLoreCopy(16);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = armor.getArmorCopy(11);
		licenseGrid[15][row] = armor.getArmorCopy(46);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 15
		row = 14;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		
		licenseGrid[4][row] = armor.getArmorCopy(48);
		
		licenseGrid[5][row] = magAug.getMagickLoreCopy(11);
		licenseGrid[6][row] = magAug.getMagickLoreCopy(10);
		licenseGrid[7][row] = magAug.getMagickLoreCopy(7);
		licenseGrid[8][row] = magAug.getMagickLoreCopy(6);
		licenseGrid[9][row] = magAug.getMagickLoreCopy(2);
		licenseGrid[10][row] = magAug.getMagickLoreCopy(1);
		licenseGrid[11][row] = healthAug.getHealthAugmentCopy(4);
		licenseGrid[12][row] = battleAug.getBattleLoreCopy(16);
		licenseGrid[13][row] = magAug.getMagickLoreCopy(19);
		
		licenseGrid[14][row] = armor.getArmorCopy(12);
		
		licenseGrid[15][row] = technicks.getTechnickCopy(6);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 16
		row = 15;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		
		licenseGrid[8][row] = eqee.getEQEE(5);
		
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = magAug.getMagickLoreCopy(3);
		
		licenseGrid[11][row] = weapons2.getWeapon2Copy(9);
		
		licenseGrid[12][row] = magAug.getMagickLoreCopy(17);
		licenseGrid[13][row] = magAug.getMagickLoreCopy(23);
		licenseGrid[14][row] = healthAug.getHealthAugmentCopy(6);
		licenseGrid[15][row] = magAug.getMagickLoreCopy(25);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 17
		row = 16;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		
		licenseGrid[13][row] = eqee.getEQEE(17);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 18
		row = 17;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		
		licenseGrid[13][row] = weapons1.getWeapon1Copy(19);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 19
		row = 18;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		calculateTotalCost();
	}
}
