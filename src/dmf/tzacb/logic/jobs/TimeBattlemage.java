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

public class TimeBattlemage extends LicenseBoard {

	public TimeBattlemage(PlayerCharacter holder, Accessories accessories, ArcaneMagick arcm, Armor armor, BattleAugments battleAug, BlackMagick blm, EspersQuickEssentials eqee, 
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
		
		licenseGrid[5][column] = magAug.getMagickLoreCopy(18);
		
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = healthAug.getHealthAugmentCopy(3);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		
		licenseGrid[9][column] = whm.getWhiteMagickCopy(3);
		
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
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		
		licenseGrid[5][column] = eqee.getEQEE(10);
		
		licenseGrid[6][column] = eqee.getEQEE(4);
		
		licenseGrid[7][column] = eqee.getEQEE(12);
		
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
		
		// ROW 3
		column = 2;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = technicks.getTechnickCopy(31);
		
		licenseGrid[4][column] = magAug.getMagickLoreCopy(16);
		licenseGrid[5][column] = magAug.getMagickLoreCopy(4);
		licenseGrid[6][column] = magAug.getMagickLoreCopy(22);
		licenseGrid[7][column] = magAug.getMagickLoreCopy(5);
		
		licenseGrid[8][column] = technicks.getTechnickCopy(10);
		
		licenseGrid[9][column] = magAug.getMagickLoreCopy(0);
		licenseGrid[10][column] = magAug.getMagickLoreCopy(1);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(2);
		
		licenseGrid[12][column] = magAug.getMagickLoreCopy(20);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 4
		column = 3;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = battleAug.getBattleLoreCopy(8);
		
		licenseGrid[2][column] = eqee.getEQEE(15);
		
		licenseGrid[3][column] = technicks.getTechnickCopy(32);
		
		licenseGrid[4][column] = magAug.getMagickLoreCopy(23);
		
		licenseGrid[5][column] = armor.getArmorCopy(18);
		
		licenseGrid[6][column] = tim.getTimeMagickCopy(5);
		
		licenseGrid[7][column] = battleAug.getBattleLoreCopy(16);
		
		licenseGrid[8][column] = armor.getArmorCopy(17);
		
		licenseGrid[9][column] = tim.getTimeMagickCopy(4);
		
		licenseGrid[10][column] = armor.getArmorCopy(16);
		
		licenseGrid[11][column] = itemAug.getItemAugmentCopy(4);
		
		licenseGrid[12][column] = technicks.getTechnickCopy(30);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 5
		column = 4;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = technicks.getTechnickCopy(33);
		
		licenseGrid[4][column] = magAug.getMagickLoreCopy(6);
		
		licenseGrid[5][column] = tim.getTimeMagickCopy(6);
		
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = eqee.getEQEE(9);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = magAug.getMagickLoreCopy(2);
		
		licenseGrid[11][column] = tim.getTimeMagickCopy(3);
		
		licenseGrid[12][column] = technicks.getTechnickCopy(29);
		
		licenseGrid[13][column] = eqee.getEQEE(8);
		
		licenseGrid[14][column] = healthAug.getHealthAugmentCopy(5);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 6
		column = 5;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = healthAug.getHealthAugmentCopy(4);
		licenseGrid[4][column] = itemAug.getItemAugmentCopy(7);
		
		licenseGrid[5][column] = armor.getArmorCopy(19);
		
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = itemAug.getItemAugmentCopy(5);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		
		licenseGrid[9][column] = eqee.getEQEECopy(2);
		
		licenseGrid[10][column] = armor.getArmorCopy(15);
		
		licenseGrid[11][column] = tim.getTimeMagickCopy(2);
		
		licenseGrid[12][column] = technicks.getTechnickCopy(28);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 7
		column = 6;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = eqee.getEQEE(5);
		
		licenseGrid[3][column] = technicks.getTechnickCopy(18);
		
		licenseGrid[4][column] = battleAug.getBattleLoreCopy(24);
		
		licenseGrid[5][column] = armor.getArmorCopy(20);
		
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		
		licenseGrid[9][column] = eqee.getEQEE(7);
		
		licenseGrid[10][column] = armor.getArmorCopy(14);
		
		licenseGrid[11][column] = tim.getTimeMagickCopy(1);
		
		licenseGrid[12][column] = technicks.getTechnickCopy(27);
		
		licenseGrid[13][column] = eqee.getEQEE(3);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 8
		column = 7;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = magAug.getMagickLoreCopy(25);
		licenseGrid[4][column] = magAug.getMagickLoreCopy(7);
		
		licenseGrid[5][column] = tim.getTimeMagickCopy(9);
		
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = magAug.getMagickLoreCopy(3);
		
		licenseGrid[11][column] = tim.getTimeMagickCopy(1);
		
		licenseGrid[12][column] = technicks.getTechnickCopy(25);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 9
		column = 8;
		
		licenseGrid[0][column] = battleAug.getBattleLoreCopy(9);
		
		licenseGrid[1][column] = eqee.getEQEE(16);
		
		licenseGrid[2][column] = eqee.getEQEECopy(0);
		
		licenseGrid[3][column] = itemAug.getItemAugmentCopy(3);
		licenseGrid[4][column] = magAug.getMagickLoreCopy(19);
		
		licenseGrid[5][column] = armor.getArmorCopy(21);
		
		licenseGrid[6][column] = eqee.getEQEE(14);
		
		licenseGrid[7][column] = technicks.getTechnickCopy(21);
		licenseGrid[8][column] = technicks.getTechnickCopy(23);
		
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = armor.getArmorCopy(13);
		
		licenseGrid[11][column] = eqee.getEQEECopy(1);
		
		licenseGrid[12][column] = technicks.getTechnickCopy(24);
		
		licenseGrid[13][column] = eqee.getEQEECopy(0);
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 10
		column = 9;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = magAug.getMagickLoreCopy(8);
		
		licenseGrid[2][column] = armor.getArmorCopy(24);
		
		licenseGrid[3][column] = technicks.getTechnickCopy(15);
		
		licenseGrid[4][column] = tim.getTimeMagickCopy(8);
		
		licenseGrid[5][column] = armor.getArmorCopy(22);
		
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = magAug.getMagickLoreCopy(24);
		
		licenseGrid[11][column] = accessories.getAccessoryCopy(0);
		licenseGrid[12][column] = accessories.getAccessoryCopy(1);
		
		licenseGrid[13][column] = magAug.getMagickLoreCopy(21);
		licenseGrid[14][column] = itemAug.getItemAugmentCopy(6);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 11
		column = 10;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = battleAug.getBattleLoreCopy(18);
		
		licenseGrid[2][column] = tim.getTimeMagickCopy(9);
		
		licenseGrid[3][column] = armor.getArmorCopy(23);
		
		licenseGrid[4][column] = magAug.getMagickLoreCopy(17);
		licenseGrid[5][column] = battleAug.getBattleLoreCopy(17);
		
		licenseGrid[6][column] = eqee.getEQEECopy(0);
		
		licenseGrid[7][column] = healthAug.getHealthAugmentCopy(6);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		
		licenseGrid[10][column] = technicks.getTechnickCopy(26);
		
		licenseGrid[11][column] = weapons3.getWeapon3Copy(15);
		
		licenseGrid[12][column] = accessories.getAccessoryCopy(2);
		licenseGrid[13][column] = accessories.getAccessoryCopy(3);
		
		licenseGrid[14][column] = weapons3.getWeapon3Copy(16);
		
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
		
		licenseGrid[7][column] = eqee.getEQEE(17);
		
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		licenseGrid[9][column] = eqee.getEQEECopy(0);
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		licenseGrid[11][column] = eqee.getEQEECopy(0);
		licenseGrid[12][column] = eqee.getEQEECopy(0);
		
		licenseGrid[13][column] = accessories.getAccessoryCopy(4);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 13
		column = 12;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = accessories.getAccessoryCopy(20);
		licenseGrid[3][column] = accessories.getAccessoryCopy(17);
		licenseGrid[4][column] = accessories.getAccessoryCopy(15);
		licenseGrid[5][column] = accessories.getAccessoryCopy(13);
		licenseGrid[6][column] = accessories.getAccessoryCopy(12);
		licenseGrid[7][column] = accessories.getAccessoryCopy(11);
		licenseGrid[8][column] = accessories.getAccessoryCopy(10);
		licenseGrid[9][column] = accessories.getAccessoryCopy(9);
		licenseGrid[10][column] = accessories.getAccessoryCopy(8);
		licenseGrid[11][column] = accessories.getAccessoryCopy(7);
		licenseGrid[12][column] = accessories.getAccessoryCopy(6);
		licenseGrid[13][column] = accessories.getAccessoryCopy(5);
		
		licenseGrid[14][column] = eqee.getEQEECopy(0);
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 14
		column = 13;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = accessories.getAccessoryCopy(21);
		licenseGrid[2][column] = accessories.getAccessoryCopy(20);
		licenseGrid[3][column] = accessories.getAccessoryCopy(18);
		licenseGrid[4][column] = accessories.getAccessoryCopy(16);
		licenseGrid[5][column] = accessories.getAccessoryCopy(14);
		
		licenseGrid[6][column] = weapons3.getWeapon3Copy(18);
		
		licenseGrid[7][column] = battleAug.getBattleLoreCopy(6);
		licenseGrid[8][column] = battleAug.getBattleLoreCopy(5);
		licenseGrid[9][column] = battleAug.getBattleLoreCopy(4);
		licenseGrid[10][column] = battleAug.getBattleLoreCopy(3);
		licenseGrid[11][column] = battleAug.getBattleLoreCopy(2);
		licenseGrid[12][column] = battleAug.getBattleLoreCopy(1);
		licenseGrid[13][column] = battleAug.getBattleLoreCopy(0);
		licenseGrid[14][column] = healthAug.getHealthAugmentCopy(2);
		
		licenseGrid[15][column] = eqee.getEQEECopy(0);
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 15
		column = 14;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		
		licenseGrid[1][column] = accessories.getAccessoryCopy(22);
		
		licenseGrid[2][column] = battleAug.getBattleLoreCopy(10);
		licenseGrid[3][column] = battleAug.getBattleLoreCopy(7);
		
		licenseGrid[4][column] = grm.getGreenMagickCopy(2);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = eqee.getEQEE(18);
		
		licenseGrid[7][column] = eqee.getEQEECopy(0);
		licenseGrid[8][column] = eqee.getEQEECopy(0);
		
		licenseGrid[9][column] = eqee.getEQEE(13);
		
		licenseGrid[10][column] = eqee.getEQEECopy(0);
		
		licenseGrid[11][column] = grm.getGreenMagickCopy(1);
		
		licenseGrid[12][column] = weapons3.getWeapon3Copy(17);
		
		licenseGrid[13][column] = grm.getGreenMagickCopy(0);
		
		licenseGrid[14][column] = technicks.getTechnickCopy(5);
		
		licenseGrid[15][column] = eqee.getEQEE(11);
		
		licenseGrid[16][column] = eqee.getEQEECopy(0);
		licenseGrid[17][column] = eqee.getEQEECopy(0);
		
		// ROW 16
		column = 15;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = eqee.getEQEE(19);
		
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		
		licenseGrid[4][column] = eqee.getEQEE(6);
		
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = weapons1.getWeapon1Copy(14);
		
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
		
		// ROW 17
		column = 16;
		
		licenseGrid[0][column] = eqee.getEQEECopy(0);
		licenseGrid[1][column] = eqee.getEQEECopy(0);
		
		licenseGrid[2][column] = weapons1.getWeapon1Copy(16);
		
		licenseGrid[3][column] = eqee.getEQEECopy(0);
		licenseGrid[4][column] = eqee.getEQEECopy(0);
		licenseGrid[5][column] = eqee.getEQEECopy(0);
		
		licenseGrid[6][column] = weapons1.getWeapon1Copy(15);
		
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
