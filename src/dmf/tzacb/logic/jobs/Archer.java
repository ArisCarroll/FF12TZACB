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

public class Archer extends LicenseBoard {

	public Archer(String name, PlayerCharacter holder, Accessories accessories, ArcaneMagick arcm, Armor armor, BattleAugments battleAug, BlackMagick blm, EQEE eqee, 
					GreenMagick grm,HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug, Technicks technicks, TimeMagick tim, Weapons1 weapons1, Weapons2 weapons2,
					Weapons3 weapons3, WhiteMagick whm ) {
		
		setBoardHolder(holder);
		setBoardName(name);
		
		// ROW 1
		int row = 0;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		
		licenseGrid[7][row] = eqee.getEQEE(6);
		
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = eqee.getEQEE(12);
		
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
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		
		licenseGrid[7][row] = healthAug.getHealthAugmentCopy(5);
		
		licenseGrid[8][row] = technicks.getTechnickCopy(14);
		
		licenseGrid[9][row] = technicks.getTechnickCopy(33);
		licenseGrid[10][row] = technicks.getTechnickCopy(32);
		licenseGrid[11][row] = technicks.getTechnickCopy(31);
		
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
		
		licenseGrid[2][row] = healthAug.getHealthAugmentCopy(10);
		licenseGrid[3][row] = healthAug.getHealthAugmentCopy(9);
		
		licenseGrid[4][row] = eqee.getEQEE(16);
		
		licenseGrid[5][row] = healthAug.getHealthAugmentCopy(7);
		licenseGrid[6][row] = healthAug.getHealthAugmentCopy(6);
		licenseGrid[7][row] = battleAug.getBattleLoreCopy(22);
		
		licenseGrid[8][row] = technicks.getTechnickCopy(17);
		
		licenseGrid[9][row] = healthAug.getHealthAugmentCopy(2);
		
		licenseGrid[10][row] = technicks.getTechnickCopy(30);
		licenseGrid[11][row] = technicks.getTechnickCopy(29);
		
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
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = accessories.getAccessoryCopy(22);
		
		licenseGrid[7][row] = healthAug.getHealthAugmentCopy(4);
		licenseGrid[8][row] = healthAug.getHealthAugmentCopy(3);
		
		licenseGrid[9][row] = technicks.getTechnickCopy(8);
		
		licenseGrid[10][row] = healthAug.getHealthAugmentCopy(1);
		
		licenseGrid[11][row] = technicks.getTechnickCopy(28);
		
		licenseGrid[12][row] = eqee.getEQEE(9);
		
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
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = healthAug.getHealthAugmentCopy(0);
		
		licenseGrid[11][row] = technicks.getTechnickCopy(27);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
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
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		
		licenseGrid[5][row] = battleAug.getBattleLoreCopy(0);
		
		licenseGrid[6][row] = accessories.getAccessoryCopy(18);
		
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		
		licenseGrid[9][row] = eqee.getEQEE(8);
		
		licenseGrid[10][row] = technicks.getTechnickCopy(2);
		
		licenseGrid[11][row] = technicks.getTechnickCopy(26);
		
		licenseGrid[12][row] = eqee.getEQEE(3);
		
		licenseGrid[13][row] = whm.getWhiteMagickCopy(3);
		
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 7
		row = 6;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		
		licenseGrid[5][row] = accessories.getAccessoryCopy(20);
		licenseGrid[6][row] = accessories.getAccessoryCopy(12);
		
		licenseGrid[7][row] = eqee.getEQEE(14);
		
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = technicks.getTechnickCopy(1);
		
		licenseGrid[11][row] = technicks.getTechnickCopy(25);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 8
		row = 7;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		
		licenseGrid[2][row] = eqee.getEQEE(5);
		
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		
		licenseGrid[5][row] = accessories.getAccessoryCopy(15);
		licenseGrid[6][row] = accessories.getAccessoryCopy(8);
		
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = technicks.getTechnickCopy(3);
		
		licenseGrid[11][row] = technicks.getTechnickCopy(24);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		
		licenseGrid[16][row] = eqee.getEQEE(15);
		
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 9
		row = 8;
		
		licenseGrid[0][row] = technicks.getTechnickCopy(11);
		
		licenseGrid[1][row] = eqee.getEQEE(18);
		
		licenseGrid[2][row] = itemAug.getItemAugmentCopy(8);
		
		licenseGrid[3][row] = technicks.getTechnickCopy(23);
		
		licenseGrid[4][row] = accessories.getAccessoryCopy(14);
		licenseGrid[5][row] = accessories.getAccessoryCopy(10);
		licenseGrid[6][row] = accessories.getAccessoryCopy(6);
		licenseGrid[7][row] = accessories.getAccessoryCopy(4);
		licenseGrid[8][row] = accessories.getAccessoryCopy(2);
		licenseGrid[9][row] = accessories.getAccessoryCopy(0);
		
		licenseGrid[10][row] = eqee.getEQEECopy(1);
		
		licenseGrid[11][row] = weapons1.getWeapon1Copy(34);
		
		licenseGrid[12][row] = magAug.getMagickLoreCopy(24);
		licenseGrid[13][row] = magAug.getMagickLoreCopy(23);
		licenseGrid[14][row] = itemAug.getItemAugmentCopy(6);
		licenseGrid[15][row] = itemAug.getItemAugmentCopy(9);
		licenseGrid[16][row] = magAug.getMagickLoreCopy(25);
		licenseGrid[17][row] = itemAug.getItemAugmentCopy(1);
		
		// ROW 10
		row = 9;
		
		licenseGrid[0][row] = technicks.getTechnickCopy(13);
		
		licenseGrid[1][row] = eqee.getEQEE(19);
		
		licenseGrid[2][row] = itemAug.getItemAugmentCopy(11);
		
		licenseGrid[3][row] = technicks.getTechnickCopy(21);
		
		licenseGrid[4][row] = accessories.getAccessoryCopy(16);
		licenseGrid[5][row] = accessories.getAccessoryCopy(11);
		licenseGrid[6][row] = accessories.getAccessoryCopy(7);
		licenseGrid[7][row] = accessories.getAccessoryCopy(5);
		licenseGrid[8][row] = accessories.getAccessoryCopy(3);
		licenseGrid[9][row] = accessories.getAccessoryCopy(1);
		
		licenseGrid[10][row] = armor.getArmorCopy(26);
		
		licenseGrid[11][row] = weapons1.getWeapon1Copy(35);
		
		licenseGrid[12][row] = magAug.getMagickLoreCopy(21);
		licenseGrid[13][row] = battleAug.getBattleLoreCopy(16);
		licenseGrid[14][row] = itemAug.getItemAugmentCopy(0);
		licenseGrid[15][row] = itemAug.getItemAugmentCopy(7);
		licenseGrid[16][row] = battleAug.getBattleLoreCopy(1);
		licenseGrid[17][row] = itemAug.getItemAugmentCopy(2);
		
		// ROW 11
		row = 10;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		
		licenseGrid[5][row] = technicks.getTechnickCopy(16);
		
		licenseGrid[6][row] = accessories.getAccessoryCopy(9);
		
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = armor.getArmorCopy(27);
		
		licenseGrid[11][row] = technicks.getTechnickCopy(0);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		
		licenseGrid[14][row] = eqee.getEQEE(13);
		
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 12
		row = 11;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		
		licenseGrid[3][row] = magAug.getMagickLoreCopy(0);
		
		licenseGrid[4][row] = eqee.getEQEE(17);
		
		licenseGrid[5][row] = accessories.getAccessoryCopy(17);
		licenseGrid[6][row] = accessories.getAccessoryCopy(13);
		
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		
		licenseGrid[9][row] = eqee.getEQEE(7);
		
		licenseGrid[10][row] = armor.getArmorCopy(28);
		
		licenseGrid[11][row] = weapons1.getWeapon1Copy(36);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 13
		row = 12;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = magAug.getMagickLoreCopy(4);
		licenseGrid[2][row] = magAug.getMagickLoreCopy(2);
		licenseGrid[3][row] = magAug.getMagickLoreCopy(1);
		
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		
		licenseGrid[5][row] = accessories.getAccessoryCopy(21);
		licenseGrid[6][row] = accessories.getAccessoryCopy(19);
		
		licenseGrid[7][row] = eqee.getEQEE(4);
		
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		
		licenseGrid[9][row] = eqee.getEQEECopy(2);
		
		licenseGrid[10][row] = armor.getArmorCopy(29);
		
		licenseGrid[11][row] = battleAug.getBattleLoreCopy(24);
		
		licenseGrid[12][row] = eqee.getEQEECopy(0);
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 14
		row = 13;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		
		licenseGrid[1][row] = magAug.getMagickLoreCopy(5);
		
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		licenseGrid[9][row] = eqee.getEQEECopy(0);
		
		licenseGrid[10][row] = armor.getArmorCopy(30);
		
		licenseGrid[11][row] = weapons1.getWeapon1Copy(37);
		
		licenseGrid[12][row] = eqee.getEQEE(10);
		
		licenseGrid[13][row] = eqee.getEQEECopy(0);
		licenseGrid[14][row] = eqee.getEQEECopy(0);
		licenseGrid[15][row] = eqee.getEQEECopy(0);
		licenseGrid[16][row] = eqee.getEQEECopy(0);
		licenseGrid[17][row] = eqee.getEQEECopy(0);
		
		// ROW 15
		row = 14;
		
		licenseGrid[0][row] = eqee.getEQEECopy(0);
		licenseGrid[1][row] = eqee.getEQEECopy(0);
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		
		licenseGrid[6][row] = armor.getArmorCopy(35);
		licenseGrid[7][row] = armor.getArmorCopy(34);
		licenseGrid[8][row] = armor.getArmorCopy(33);
		licenseGrid[9][row] = armor.getArmorCopy(32);
		licenseGrid[10][row] = armor.getArmorCopy(31);
		
		licenseGrid[11][row] = technicks.getTechnickCopy(12);
		
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
		licenseGrid[2][row] = eqee.getEQEECopy(0);
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		
		licenseGrid[5][row] = armor.getArmorCopy(37);
		licenseGrid[6][row] = armor.getArmorCopy(36);
		
		licenseGrid[7][row] = battleAug.getBattleLoreCopy(18);
		
		licenseGrid[8][row] = weapons1.getWeapon1Copy(40);
		
		licenseGrid[9][row] = technicks.getTechnickCopy(9);
		
		licenseGrid[10][row] = weapons1.getWeapon1Copy(38);
		
		licenseGrid[11][row] = magAug.getMagickLoreCopy(3);
		
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
		
		licenseGrid[5][row] = armor.getArmorCopy(38);
		
		licenseGrid[6][row] = weapons1.getWeapon1Copy(42);
		licenseGrid[7][row] = weapons1.getWeapon1Copy(41);
		
		licenseGrid[8][row] = itemAug.getItemAugmentCopy(10);
		
		licenseGrid[9][row] = weapons1.getWeapon1Copy(39);
		
		licenseGrid[10][row] = battleAug.getBattleLoreCopy(17);
		
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
		licenseGrid[3][row] = eqee.getEQEECopy(0);
		licenseGrid[4][row] = eqee.getEQEECopy(0);
		licenseGrid[5][row] = eqee.getEQEECopy(0);
		licenseGrid[6][row] = eqee.getEQEECopy(0);
		licenseGrid[7][row] = eqee.getEQEECopy(0);
		licenseGrid[8][row] = eqee.getEQEECopy(0);
		
		licenseGrid[9][row] = eqee.getEQEE(11);
		
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
		
		licenseGrid[6][row] = armor.getArmorCopy(24);
		licenseGrid[7][row] = armor.getArmorCopy(23);
		licenseGrid[8][row] = armor.getArmorCopy(22);
		
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
