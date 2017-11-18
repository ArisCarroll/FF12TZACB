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

public class Uhlan extends LicenseBoard {

	public Uhlan(PlayerCharacter holder, Accessories accessories, ArcaneMagick arcm, Armor armor, BattleAugments battleAug, BlackMagick blm, EQEE eqee, 
					GreenMagick grm,HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug, Technicks technicks, TimeMagick tim, Weapons1 weapons1, Weapons2 weapons2,
					Weapons3 weapons3, WhiteMagick whm ) {
		
		setBoardHolder(holder);
		
		// ROW 1
		int row = 0;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = eqee.getEQEE(14);
		
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		
		licenseGrid[9][row] = eqee.getEQEE(6);
		
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
		
		licenseGrid[2][row] = armor.getArmorCopy(24);
		
		licenseGrid[3][row] = technicks.getTechnickCopy(2);
		
		licenseGrid[4][row] = itemAug.getItemAugmentCopy(10);
		
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = blm.getBlackMagickCopy(5);
		
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		
		licenseGrid[8][row] = battleAug.getBattleLoreCopy(23);
		
		licenseGrid[9][row] = accessories.getAccessoryCopy(20);
		licenseGrid[10][row] = accessories.getAccessoryCopy(22);
		
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 3
		row = 2;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = armor.getArmorCopy(23);
		licenseGrid[3][row] = armor.getArmorCopy(22);
		
		licenseGrid[4][row] = battleAug.getBattleLoreCopy(16);
		
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = blm.getBlackMagickCopy(4);
		
		licenseGrid[7][row] = eqee.getEQEE(5);
		
		licenseGrid[8][row] = battleAug.getBattleLoreCopy(17);
		
		licenseGrid[9][row] = accessories.getAccessoryCopy(18);
		licenseGrid[10][row] = accessories.getAccessoryCopy(21);
		
		licenseGrid[11][row] = eqee.getEQEE(19);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 4
		row = 3;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = armor.getArmorCopy(21);
		
		licenseGrid[4][row] = technicks.getTechnickCopy(16);
		
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		
		licenseGrid[8][row] = healthAug.getHealthAugmentCopy(8);
		
		licenseGrid[9][row] = accessories.getAccessoryCopy(16);
		
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 5
		row = 4;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = armor.getArmorCopy(20);
		
		licenseGrid[4][row] = magAug.getMagickLoreCopy(0);
		
		licenseGrid[5][row] = eqee.getEQEE(11);
		
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		
		licenseGrid[8][row] = healthAug.getHealthAugmentCopy(7);
		
		licenseGrid[9][row] = accessories.getAccessoryCopy(14);
		
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		
		licenseGrid[11][row] = eqee.getEQEE(18);
		
		licenseGrid[12][row] = technicks.getTechnickCopy(22);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 6
		row = 5;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = armor.getArmorCopy(19);
		
		licenseGrid[4][row] = technicks.getTechnickCopy(11);
		
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		
		licenseGrid[7][row] = eqee.getEQEE(15);
		
		licenseGrid[8][row] = healthAug.getHealthAugmentCopy(6);
		
		licenseGrid[9][row] = accessories.getAccessoryCopy(12);
		
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 7
		row = 6;
		
		licenseGrid[0][row] = battleAug.getBattleLoreCopy(12);
		
		licenseGrid[1][row] = eqee.getEQEE(10);
		
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = armor.getArmorCopy(18);
		
		licenseGrid[4][row] = itemAug.getItemAugmentCopy(9);
		
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		
		licenseGrid[8][row] = healthAug.getHealthAugmentCopy(5);
		
		licenseGrid[9][row] = accessories.getAccessoryCopy(10);
		
		licenseGrid[10][row] = eqee.getEQEECopy(0);
		licenseGrid[11][row] = eqee.getEQEECopy(0);
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 8
		row = 7;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = technicks.getTechnickCopy(8);
		
		licenseGrid[2][row] = armor.getArmorCopy(16);
		licenseGrid[3][row] = armor.getArmorCopy(17);
		
		licenseGrid[4][row] = healthAug.getHealthAugmentCopy(0);
		licenseGrid[5][row] = healthAug.getHealthAugmentCopy(1);
		licenseGrid[6][row] = healthAug.getHealthAugmentCopy(2);
		licenseGrid[7][row] = healthAug.getHealthAugmentCopy(3);
		licenseGrid[8][row] = healthAug.getHealthAugmentCopy(4);
		licenseGrid[9][row] = battleAug.getBattleLoreCopy(22);
		
		licenseGrid[10][row] = accessories.getAccessoryCopy(11);
		licenseGrid[11][row] = accessories.getAccessoryCopy(13);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 9
		row = 8;
		
		licenseGrid[0][row] = eqee.getEQEE(3);
		
		licenseGrid[1][row] = itemAug.getItemAugmentCopy(6);
		
		licenseGrid[2][row] = armor.getArmorCopy(15);
		
		licenseGrid[3][row] = accessories.getAccessoryCopy(3);
		licenseGrid[4][row] = accessories.getAccessoryCopy(4);
		licenseGrid[5][row] = accessories.getAccessoryCopy(5);
		licenseGrid[6][row] = accessories.getAccessoryCopy(6);
		licenseGrid[7][row] = accessories.getAccessoryCopy(7);
		licenseGrid[8][row] = accessories.getAccessoryCopy(8);
		licenseGrid[9][row] = accessories.getAccessoryCopy(9);
		
		licenseGrid[10][row] = itemAug.getItemAugmentCopy(7);
		
		licenseGrid[11][row] = accessories.getAccessoryCopy(15);
		
		licenseGrid[12][row] = eqee.getEQEE(17);
		
		licenseGrid[13][row] = blm.getBlackMagickCopy(6);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 10
		row = 9;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = battleAug.getBattleLoreCopy(0);
		
		licenseGrid[2][row] = armor.getArmorCopy(14);
		
		licenseGrid[3][row] = accessories.getAccessoryCopy(2);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		
		licenseGrid[5][row] = eqee.getEQEE(7);
		
		licenseGrid[6][row] = eqee.getEQEECopy(2);
		
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		
		licenseGrid[9][row] = battleAug.getBattleLoreCopy(24);
		licenseGrid[10][row] = battleAug.getBattleLoreCopy(4);
		
		licenseGrid[11][row] = accessories.getAccessoryCopy(17);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		
		licenseGrid[13][row] = blm.getBlackMagickCopy(7);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 11
		row = 10;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = magAug.getMagickLoreCopy(24);
		
		licenseGrid[2][row] = armor.getArmorCopy(13);
		
		licenseGrid[3][row] = accessories.getAccessoryCopy(1);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		
		licenseGrid[9][row] = battleAug.getBattleLoreCopy(1);
		licenseGrid[10][row] = battleAug.getBattleLoreCopy(5);
		
		licenseGrid[11][row] = accessories.getAccessoryCopy(19);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 12
		row = 11;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = weapons1.getWeapon1Copy(0);
		
		licenseGrid[2][row] = eqee.getEQEECopy(1);
		
		licenseGrid[3][row] = accessories.getAccessoryCopy(0);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		
		licenseGrid[7][row] = technicks.getTechnickCopy(19);
		
		licenseGrid[8][row] = eqee.getEQEE(12);
		
		licenseGrid[9][row] = technicks.getTechnickCopy(9);
		
		licenseGrid[10][row] = battleAug.getBattleLoreCopy(8);
		licenseGrid[11][row] = magAug.getMagickLoreCopy(0);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 13
		row = 12;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = weapons1.getWeapon1Copy(1);
		
		licenseGrid[2][row] = battleAug.getBattleLoreCopy(2);
		
		licenseGrid[3][row] = technicks.getTechnickCopy(0);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		
		licenseGrid[9][row] = battleAug.getBattleLoreCopy(9);
		licenseGrid[10][row] = battleAug.getBattleLoreCopy(10);
		licenseGrid[11][row] = magAug.getMagickLoreCopy(1);
		
		licenseGrid[12][row] = eqee.getEQEE(16);
		
		licenseGrid[13][row] = itemAug.getItemAugmentCopy(2);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 14
		row = 13;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = weapons1.getWeapon1Copy(2);
		
		licenseGrid[2][row] = technicks.getTechnickCopy(3);
		
		licenseGrid[3][row] = technicks.getTechnickCopy(1);
		licenseGrid[4][row] = technicks.getTechnickCopy(2);
		licenseGrid[5][row] = technicks.getTechnickCopy(3);
		
		licenseGrid[6][row] = eqee.getEQEE(4);
		
		licenseGrid[7][row] = technicks.getTechnickCopy(31);
		licenseGrid[8][row] = technicks.getTechnickCopy(32);
		licenseGrid[9][row] = technicks.getTechnickCopy(33);
		
		licenseGrid[10][row] = battleAug.getBattleLoreCopy(11);
		licenseGrid[11][row] = magAug.getMagickLoreCopy(2);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 15
		row = 14;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = weapons1.getWeapon1Copy(3);
		licenseGrid[2][row] = weapons1.getWeapon1Copy(4);
		
		licenseGrid[3][row] = magAug.getMagickLoreCopy(21);
		licenseGrid[4][row] = itemAug.getItemAugmentCopy(0);
		
		licenseGrid[5][row] = technicks.getTechnickCopy(28);
		licenseGrid[6][row] = technicks.getTechnickCopy(29);
		licenseGrid[7][row] = technicks.getTechnickCopy(30);
		
		licenseGrid[8][row] = battleAug.getBattleLoreCopy(3);
		licenseGrid[9][row] = battleAug.getBattleLoreCopy(6);
		licenseGrid[10][row] = battleAug.getBattleLoreCopy(13);
		licenseGrid[11][row] = magAug.getMagickLoreCopy(3);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 16
		row = 15;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = weapons1.getWeapon1Copy(5);
		licenseGrid[3][row] = weapons1.getWeapon1Copy(6);
		licenseGrid[4][row] = weapons1.getWeapon1Copy(7);
		
		licenseGrid[5][row] = technicks.getTechnickCopy(14);
		
		licenseGrid[6][row] = eqee.getEQEE(9);
		
		licenseGrid[7][row] = itemAug.getItemAugmentCopy(1);
		licenseGrid[8][row] = battleAug.getBattleLoreCopy(7);
		licenseGrid[9][row] = magAug.getMagickLoreCopy(25);
		
		licenseGrid[10][row] = technicks.getTechnickCopy(6);
		
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
		
		licenseGrid[2][row] = eqee.getEQEE(8);
		
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = eqee.getEQEE(13);
		
		licenseGrid[11][row] = technicks.getTechnickCopy(20);
		
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
