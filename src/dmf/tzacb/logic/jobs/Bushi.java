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
import dmf.tzacb.model.licenses.magick.ArcaneMagick;
import dmf.tzacb.model.licenses.magick.BlackMagick;
import dmf.tzacb.model.licenses.magick.GreenMagick;
import dmf.tzacb.model.licenses.magick.TimeMagick;
import dmf.tzacb.model.licenses.magick.WhiteMagick;
import dmf.tzacb.model.licenses.technicks.Technicks;

public class Bushi extends LicenseBoard {

	public Bushi(PlayerCharacter holder, Accessories accessories, ArcaneMagick arcm, Armor armor, BattleAugments battleAug, BlackMagick blm, EspersQuickEssentials eqee, 
					GreenMagick grm,HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug, Technicks technicks, TimeMagick tim, Weapons1 weapons1, Weapons2 weapons2,
					Weapons3 weapons3, WhiteMagick whm ) {
		
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
		
		licenseGrid[10][column] = weapons1.getWeapon1Copy(25);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		
		licenseGrid[12][column] = weapons1.getWeapon1Copy(48);
		licenseGrid[13][column] = weapons1.getWeapon1Copy(49);
		
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
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		
		licenseGrid[8][column] = technicks.getTechnickCopy(6);
		
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = weapons1.getWeapon1Copy(24);
		
		licenseGrid[11][column] = eqee.getEQEECopy(9);
		
		licenseGrid[12][column] = magAug.getMagickLoreCopy(4);
		licenseGrid[13][column] = magAug.getMagickLoreCopy(19);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		
		licenseGrid[15][column] = battleAug.getBattleLoreCopy(4);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 3
		column = 2;
		
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
		
		licenseGrid[12][column] = magAug.getMagickLoreCopy(0);
		
		licenseGrid[13][column] = weapons1.getWeapon1Copy(47);
		
		licenseGrid[14][column] = eqee.getEQEECopy(5);
		
		licenseGrid[15][column] = healthAug.getHealthAugmentCopy(9);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 4
		column = 3;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = magAug.getMagickLoreCopy(0);
		licenseGrid[8][column] = healthAug.getHealthAugmentCopy(5);
		licenseGrid[9][column] = magAug.getMagickLoreCopy(1);
		licenseGrid[10][column] = healthAug.getHealthAugmentCopy(6);
		licenseGrid[11][column] = magAug.getMagickLoreCopy(20);
		licenseGrid[12][column] = magAug.getMagickLoreCopy(2);
		licenseGrid[13][column] = healthAug.getHealthAugmentCopy(7);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 5
		column = 4;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = eqee.getEQEECopy(5);
		
		licenseGrid[7][column] = healthAug.getHealthAugmentCopy(4);
		licenseGrid[8][column] = magAug.getMagickLoreCopy(21);
		
		licenseGrid[9][column] = weapons1.getWeapon1Copy(44);
		
		licenseGrid[10][column] = battleAug.getBattleLoreCopy(17);
		
		licenseGrid[11][column] = weapons1.getWeapon1Copy(45);
		
		licenseGrid[12][column] = magAug.getMagickLoreCopy(23);
		
		licenseGrid[13][column] = weapons1.getWeapon1Copy(46);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		
		licenseGrid[16][column] = technicks.getTechnickCopy(8);
		licenseGrid[17][column] = technicks.getTechnickCopy(9);
		
		// ROW 6
		column = 5;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = technicks.getTechnickCopy(1);
		
		licenseGrid[7][column] = magAug.getMagickLoreCopy(3);
		licenseGrid[8][column] = battleAug.getBattleLoreCopy(16);
		
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = eqee.getEQEECopy(8);
		
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		
		licenseGrid[12][column] = eqee.getEQEECopy(12);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		
		licenseGrid[16][column] = technicks.getTechnickCopy(7);
		licenseGrid[17][column] = technicks.getTechnickCopy(7);
		
		// ROW 7
		column = 6;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = healthAug.getHealthAugmentCopy(3);
		
		licenseGrid[8][column] = weapons1.getWeapon1Copy(43);
		
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		
		licenseGrid[16][column] = technicks.getTechnickCopy(6);
		
		licenseGrid[17][column] = technicks.getTechnickCopy(13);
		
		// ROW 8
		column = 7;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = battleAug.getBattleLoreCopy(19);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = healthAug.getHealthAugmentCopy(1);
		
		licenseGrid[8][column] = eqee.getEQEECopy(1);
		
		licenseGrid[9][column] = accessories.getAccessoryCopy(0);
		licenseGrid[10][column] = accessories.getAccessoryCopy(1);
		
		licenseGrid[11][column] = battleAug.getBattleLoreCopy(24);
		
		licenseGrid[12][column] = technicks.getTechnickCopy(0);
		licenseGrid[13][column] = technicks.getTechnickCopy(2);
		licenseGrid[14][column] = technicks.getTechnickCopy(3);
		licenseGrid[15][column] = technicks.getTechnickCopy(4);
		licenseGrid[16][column] = technicks.getTechnickCopy(5);
		
		licenseGrid[17][column] = technicks.getTechnickCopy(12);
		
		// ROW 9
		column = 8;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = eqee.getEQEECopy(11);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = healthAug.getHealthAugmentCopy(2);
		
		licenseGrid[8][column] = armor.getArmorCopy(0);
		
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = accessories.getAccessoryCopy(2);
		
		licenseGrid[12][column] = technicks.getTechnickCopy(1);
		
		licenseGrid[13][column] = technicks.getTechnickCopy(11);
		licenseGrid[14][column] = technicks.getTechnickCopy(19);
		
		licenseGrid[15][column] = itemAug.getItemAugmentCopy(7);
		
		licenseGrid[16][column] = technicks.getTechnickCopy(16);
		
		licenseGrid[17][column] = magAug.getMagickLoreCopy(25);
		
		// ROW 10
		column = 9;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = magAug.getMagickLoreCopy(4);
		licenseGrid[3][column] = magAug.getMagickLoreCopy(5);
		
		licenseGrid[4][column] = armor.getArmorCopy(8);
		licenseGrid[5][column] = armor.getArmorCopy(6);
		licenseGrid[6][column] = armor.getArmorCopy(4);
		licenseGrid[7][column] = armor.getArmorCopy(2);
		licenseGrid[8][column] = armor.getArmorCopy(1);
		
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = accessories.getAccessoryCopy(3);
		
		licenseGrid[12][column] = itemAug.getItemAugmentCopy(6);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = eqee.getEQEECopy(4);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 11
		column = 10;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = magAug.getMagickLoreCopy(8);
		
		licenseGrid[3][column] = armor.getArmorCopy(10);
		licenseGrid[4][column] = armor.getArmorCopy(9);
		licenseGrid[5][column] = armor.getArmorCopy(7);
		licenseGrid[6][column] = armor.getArmorCopy(5);
		licenseGrid[7][column] = armor.getArmorCopy(3);
		
		licenseGrid[8][column] = magAug.getMagickLoreCopy(24);
		
		licenseGrid[9][column] = eqee.getEQEECopy(3);
		
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = accessories.getAccessoryCopy(4);
		licenseGrid[12][column] = accessories.getAccessoryCopy(5);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = healthAug.getHealthAugmentCopy(8);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 12
		column = 11;
		
		licenseGrid[0][column] = healthAug.getHealthAugmentCopy(11);
		
		licenseGrid[1][column] = eqee.getEQEECopy(15);
		
		licenseGrid[2][column] = magAug.getMagickLoreCopy(9);
		
		licenseGrid[3][column] = armor.getArmorCopy(11);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = accessories.getAccessoryCopy(6);
		licenseGrid[12][column] = accessories.getAccessoryCopy(7);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		
		licenseGrid[14][column] = battleAug.getBattleLoreCopy(5);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 13
		column = 12;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = magAug.getMagickLoreCopy(10);
		
		licenseGrid[3][column] = armor.getArmorCopy(12);
		
		licenseGrid[4][column] = eqee.getEQEECopy(13);
		
		licenseGrid[5][column] = technicks.getTechnickCopy(15);
		
		licenseGrid[6][column] = eqee.getEQEECopy(18);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		
		licenseGrid[9][column] = eqee.getEQEECopy(16);
		
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = accessories.getAccessoryCopy(8);
		licenseGrid[12][column] = accessories.getAccessoryCopy(9);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 14
		column = 13;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = magAug.getMagickLoreCopy(11);
		
		licenseGrid[3][column] = armor.getArmorCopy(25);
		
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = accessories.getAccessoryCopy(22);
		licenseGrid[7][column] = accessories.getAccessoryCopy(20);
		licenseGrid[8][column] = accessories.getAccessoryCopy(18);
		licenseGrid[9][column] = accessories.getAccessoryCopy(16);
		licenseGrid[10][column] = accessories.getAccessoryCopy(14);
		licenseGrid[11][column] = accessories.getAccessoryCopy(10);
		licenseGrid[12][column] = accessories.getAccessoryCopy(12);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 15
		column = 14;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = eqee.getEQEECopy(14);
		
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = battleAug.getBattleLoreCopy(0);
		
		licenseGrid[7][column] = accessories.getAccessoryCopy(21);
		licenseGrid[8][column] = accessories.getAccessoryCopy(19);
		licenseGrid[9][column] = accessories.getAccessoryCopy(17);
		licenseGrid[10][column] = accessories.getAccessoryCopy(15);
		licenseGrid[11][column] = accessories.getAccessoryCopy(14);
		licenseGrid[12][column] = accessories.getAccessoryCopy(11);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 16
		column = 15;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = magAug.getMagickLoreCopy(12);
		licenseGrid[2][column] = magAug.getMagickLoreCopy(13);
		
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		
		licenseGrid[4][column] = healthAug.getHealthAugmentCopy(10);
		
		licenseGrid[5][column] = eqee.getEQEECopy(6);
		
		licenseGrid[6][column] = battleAug.getBattleLoreCopy(1);
		licenseGrid[7][column] = battleAug.getBattleLoreCopy(2);
		
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
		
		// ROW 17
		column = 16;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = battleAug.getBattleLoreCopy(6);
		licenseGrid[7][column] = battleAug.getBattleLoreCopy(3);
		
		licenseGrid[8][column] = eqee.getEQEECopy(17);
		
		licenseGrid[9][column] = battleAug.getBattleLoreCopy(25);
		
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
		
		licenseGrid[3][column] = armor.getArmorCopy(22);
		licenseGrid[4][column] = armor.getArmorCopy(21);
		
		licenseGrid[5][column] = eqee.getEQEECopy(19);
		
		licenseGrid[6][column] = battleAug.getBattleLoreCopy(18);
		licenseGrid[7][column] = battleAug.getBattleLoreCopy(7);
		
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
		
		licenseGrid[3][column] = armor.getArmorCopy(23);
		
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
