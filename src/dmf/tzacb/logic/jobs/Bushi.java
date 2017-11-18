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

public class Bushi extends LicenseBoard {

	public Bushi(PlayerCharacter holder, Accessories accessories, ArcaneMagick arcm, Armor armor, BattleAugments battleAug, BlackMagick blm, EQEE eqee, 
					GreenMagick grm,HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug, Technicks technicks, TimeMagick tim, Weapons1 weapons1, Weapons2 weapons2,
					Weapons3 weapons3, WhiteMagick whm ) {
		
		setBoardHolder(holder);
		
		// ROW 1
		int row = 0;
		
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
		
		licenseGrid[10][row] = weapons1.getWeapon1Copy(25);
		
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		
		licenseGrid[12][row] = weapons1.getWeapon1Copy(48);
		licenseGrid[13][row] = weapons1.getWeapon1Copy(49);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 2
		row = 1;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		
		licenseGrid[8][row] = technicks.getTechnickCopy(6);
		
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = weapons1.getWeapon1Copy(24);
		
		licenseGrid[11][row] = eqee.getEQEE(9);
		
		licenseGrid[12][row] = magAug.getMagickLoreCopy(4);
		licenseGrid[13][row] = magAug.getMagickLoreCopy(19);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		
		licenseGrid[15][row] = battleAug.getBattleLoreCopy(4);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 3
		row = 2;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		
		licenseGrid[8][row] = eqee.getEQEE(10);
		
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		
		licenseGrid[12][row] = magAug.getMagickLoreCopy(0);
		
		licenseGrid[13][row] = weapons1.getWeapon1Copy(47);
		
		licenseGrid[14][row] = eqee.getEQEE(5);
		
		licenseGrid[15][row] = healthAug.getHealthAugmentCopy(9);
		
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 4
		row = 3;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		
		licenseGrid[7][row] = magAug.getMagickLoreCopy(0);
		licenseGrid[8][row] = healthAug.getHealthAugmentCopy(5);
		licenseGrid[9][row] = magAug.getMagickLoreCopy(1);
		licenseGrid[10][row] = healthAug.getHealthAugmentCopy(6);
		licenseGrid[11][row] = magAug.getMagickLoreCopy(20);
		licenseGrid[12][row] = magAug.getMagickLoreCopy(2);
		licenseGrid[13][row] = healthAug.getHealthAugmentCopy(7);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 5
		row = 4;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = eqee.getEQEECopy(2);
		
		licenseGrid[7][row] = healthAug.getHealthAugmentCopy(4);
		licenseGrid[8][row] = magAug.getMagickLoreCopy(21);
		
		licenseGrid[9][row] = weapons1.getWeapon1Copy(44);
		
		licenseGrid[10][row] = battleAug.getBattleLoreCopy(17);
		
		licenseGrid[11][row] = weapons1.getWeapon1Copy(45);
		
		licenseGrid[12][row] = magAug.getMagickLoreCopy(23);
		
		licenseGrid[13][row] = weapons1.getWeapon1Copy(46);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		
		licenseGrid[16][row] = technicks.getTechnickCopy(8);
		licenseGrid[17][row] = technicks.getTechnickCopy(9);
		
		// ROW 6
		row = 5;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = technicks.getTechnickCopy(1);
		
		licenseGrid[7][row] = magAug.getMagickLoreCopy(3);
		licenseGrid[8][row] = battleAug.getBattleLoreCopy(16);
		
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = eqee.getEQEE(8);
		
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		
		licenseGrid[12][row] = eqee.getEQEE(12);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		
		licenseGrid[16][row] = technicks.getTechnickCopy(7);
		licenseGrid[17][row] = technicks.getTechnickCopy(7);
		
		// ROW 7
		row = 6;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		
		licenseGrid[7][row] = healthAug.getHealthAugmentCopy(3);
		
		licenseGrid[8][row] = weapons1.getWeapon1Copy(43);
		
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		
		licenseGrid[16][row] = technicks.getTechnickCopy(6);
		
		licenseGrid[17][row] = technicks.getTechnickCopy(13);
		
		// ROW 8
		row = 7;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = battleAug.getBattleLoreCopy(19);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		
		licenseGrid[7][row] = healthAug.getHealthAugmentCopy(1);
		
		licenseGrid[8][row] = eqee.getEQEECopy(1);
		
		licenseGrid[9][row] = accessories.getAccessoryCopy(0);
		licenseGrid[10][row] = accessories.getAccessoryCopy(1);
		
		licenseGrid[11][row] = battleAug.getBattleLoreCopy(24);
		
		licenseGrid[12][row] = technicks.getTechnickCopy(0);
		licenseGrid[13][row] = technicks.getTechnickCopy(2);
		licenseGrid[14][row] = technicks.getTechnickCopy(3);
		licenseGrid[15][row] = technicks.getTechnickCopy(4);
		licenseGrid[16][row] = technicks.getTechnickCopy(5);
		
		licenseGrid[17][row] = technicks.getTechnickCopy(12);
		
		// ROW 9
		row = 8;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = eqee.getEQEE(11);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		
		licenseGrid[7][row] = healthAug.getHealthAugmentCopy(2);
		
		licenseGrid[8][row] = armor.getArmorCopy(0);
		
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		
		licenseGrid[11][row] = accessories.getAccessoryCopy(2);
		
		licenseGrid[12][row] = technicks.getTechnickCopy(1);
		
		licenseGrid[13][row] = technicks.getTechnickCopy(11);
		licenseGrid[14][row] = technicks.getTechnickCopy(19);
		
		licenseGrid[15][row] = itemAug.getItemAugmentCopy(7);
		
		licenseGrid[16][row] = technicks.getTechnickCopy(16);
		
		licenseGrid[17][row] = magAug.getMagickLoreCopy(25);
		
		// ROW 10
		row = 9;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = magAug.getMagickLoreCopy(4);
		licenseGrid[3][row] = magAug.getMagickLoreCopy(5);
		
		licenseGrid[4][row] = armor.getArmorCopy(8);
		licenseGrid[5][row] = armor.getArmorCopy(6);
		licenseGrid[6][row] = armor.getArmorCopy(4);
		licenseGrid[7][row] = armor.getArmorCopy(2);
		licenseGrid[8][row] = armor.getArmorCopy(1);
		
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		
		licenseGrid[11][row] = accessories.getAccessoryCopy(3);
		
		licenseGrid[12][row] = itemAug.getItemAugmentCopy(6);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = eqee.getEQEE(4);
		
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 11
		row = 10;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = magAug.getMagickLoreCopy(8);
		
		licenseGrid[3][row] = armor.getArmorCopy(10);
		licenseGrid[4][row] = armor.getArmorCopy(9);
		licenseGrid[5][row] = armor.getArmorCopy(7);
		licenseGrid[6][row] = armor.getArmorCopy(5);
		licenseGrid[7][row] = armor.getArmorCopy(3);
		
		licenseGrid[8][row] = magAug.getMagickLoreCopy(24);
		
		licenseGrid[9][row] = eqee.getEQEE(3);
		
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		
		licenseGrid[11][row] = accessories.getAccessoryCopy(4);
		licenseGrid[12][row] = accessories.getAccessoryCopy(5);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = healthAug.getHealthAugmentCopy(8);
		
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 12
		row = 11;
		
		licenseGrid[0][row] = healthAug.getHealthAugmentCopy(11);
		
		licenseGrid[1][row] = eqee.getEQEE(15);
		
		licenseGrid[2][row] = magAug.getMagickLoreCopy(9);
		
		licenseGrid[3][row] = armor.getArmorCopy(11);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		
		licenseGrid[11][row] = accessories.getAccessoryCopy(6);
		licenseGrid[12][row] = accessories.getAccessoryCopy(7);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = battleAug.getBattleLoreCopy(5);
		
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 13
		row = 12;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = magAug.getMagickLoreCopy(10);
		
		licenseGrid[3][row] = armor.getArmorCopy(12);
		
		licenseGrid[4][row] = eqee.getEQEE(13);
		
		licenseGrid[5][row] = technicks.getTechnickCopy(15);
		
		licenseGrid[6][row] = eqee.getEQEE(18);
		
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		
		licenseGrid[9][row] = eqee.getEQEE(16);
		
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		
		licenseGrid[11][row] = accessories.getAccessoryCopy(8);
		licenseGrid[12][row] = accessories.getAccessoryCopy(9);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 14
		row = 13;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = magAug.getMagickLoreCopy(11);
		
		licenseGrid[3][row] = armor.getArmorCopy(25);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = accessories.getAccessoryCopy(22);
		licenseGrid[7][row] = accessories.getAccessoryCopy(20);
		licenseGrid[8][row] = accessories.getAccessoryCopy(18);
		licenseGrid[9][row] = accessories.getAccessoryCopy(16);
		licenseGrid[10][row] = accessories.getAccessoryCopy(14);
		licenseGrid[11][row] = accessories.getAccessoryCopy(10);
		licenseGrid[12][row] = accessories.getAccessoryCopy(12);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 15
		row = 14;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = eqee.getEQEE(14);
		
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = battleAug.getBattleLoreCopy(0);
		
		licenseGrid[7][row] = accessories.getAccessoryCopy(21);
		licenseGrid[8][row] = accessories.getAccessoryCopy(19);
		licenseGrid[9][row] = accessories.getAccessoryCopy(17);
		licenseGrid[10][row] = accessories.getAccessoryCopy(15);
		licenseGrid[11][row] = accessories.getAccessoryCopy(14);
		licenseGrid[12][row] = accessories.getAccessoryCopy(11);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 16
		row = 15;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = magAug.getMagickLoreCopy(12);
		licenseGrid[2][row] = magAug.getMagickLoreCopy(13);
		
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		
		licenseGrid[4][row] = healthAug.getHealthAugmentCopy(10);
		
		licenseGrid[5][row] = eqee.getEQEE(6);
		
		licenseGrid[6][row] = battleAug.getBattleLoreCopy(1);
		licenseGrid[7][row] = battleAug.getBattleLoreCopy(2);
		
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
		
		// ROW 17
		row = 16;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = battleAug.getBattleLoreCopy(6);
		licenseGrid[7][row] = battleAug.getBattleLoreCopy(3);
		
		licenseGrid[8][row] = eqee.getEQEE(17);
		
		licenseGrid[9][row] = battleAug.getBattleLoreCopy(25);
		
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 18
		row = 17;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = armor.getArmorCopy(22);
		licenseGrid[4][row] = armor.getArmorCopy(21);
		
		licenseGrid[5][row] = eqee.getEQEE(19);
		
		licenseGrid[6][row] = battleAug.getBattleLoreCopy(18);
		licenseGrid[7][row] = battleAug.getBattleLoreCopy(7);
		
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
		
		// ROW 19
		row = 18;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = armor.getArmorCopy(23);
		
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
