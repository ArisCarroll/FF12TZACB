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
import dmf.tzacb.model.licenses.magick.TimeMagick;
import dmf.tzacb.model.licenses.magick.WhiteMagick;
import dmf.tzacb.model.licenses.technicks.Technicks;

public class Machinist extends LicenseBoard {
	
	public Machinist(PlayerCharacter holder, EspersQuickEssentials eqee, BattleAugments battleAug, HealthAugments healthAug, ItemAugments itemAug, MagickAugments magAug,
			 Accessories accessories, Armor armor, Weapons1 weapons1, Weapons2 weapons2, Weapons3 weapons3, Technicks technicks, WhiteMagick whm, GreenMagick grm, TimeMagick tim) {

		setBoardHolder(holder);
		
		// ROW 1
		int column = 0;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		
		licenseGrid[1][column] = grm.getGreenMagick(0);
		
		licenseGrid[2][column] = eqee.getEQEE(0);
		
		licenseGrid[3][column] = eqee.getEQEE(4);
		
		licenseGrid[4][column] = eqee.getEQEE(0);		
		licenseGrid[5][column] = eqee.getEQEE(0);
		licenseGrid[6][column] = eqee.getEQEE(0);
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);
		licenseGrid[10][column] = eqee.getEQEE(0);
		licenseGrid[11][column] = eqee.getEQEE(0);
		licenseGrid[12][column] = eqee.getEQEE(0);
		
		licenseGrid[13][0] = healthAug.getHealthAugment(8);
		
		licenseGrid[14][column] = eqee.getEQEE(17);
		
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 2
		column = 1;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		
		licenseGrid[1][column] = eqee.getEQEE(15);
		
		licenseGrid[2][column] = technicks.getTechnickCopy(33);
		licenseGrid[3][column] = technicks.getTechnickCopy(30);
		
		licenseGrid[4][column] = eqee.getEQEE(0);
		
		licenseGrid[5][column] = eqee.getEQEE(7);
		
		licenseGrid[6][column] = eqee.getEQEE(2);
		
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);
		licenseGrid[10][column] = eqee.getEQEE(0);
		licenseGrid[11][column] = eqee.getEQEE(0);
		licenseGrid[12][column] = eqee.getEQEE(8);		
		licenseGrid[13][column] = eqee.getEQEE(0);
		
		licenseGrid[14][column] = battleAug.getBattleLore(0);
		
		licenseGrid[15][column] = weapons3.getWeapon3(33);
		
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 3
		column = 2;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		
		licenseGrid[2][column] = technicks.getTechnickCopy(32);
		licenseGrid[3][column] = technicks.getTechnickCopy(28);
		licenseGrid[4][column] = technicks.getTechnickCopy(27);
		licenseGrid[5][column] = technicks.getTechnickCopy(26);
		licenseGrid[6][column] = technicks.getTechnickCopy(25);
		
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		
		licenseGrid[9][column] = eqee.getEQEE(10);
		
		licenseGrid[10][column] = eqee.getEQEE(0);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(2);
		
		licenseGrid[12][column] = magAug.getMagickLore(0);
		licenseGrid[13][column] = magAug.getMagickLore(1);
		
		licenseGrid[14][column] = battleAug.getBattleLore(1);
		licenseGrid[15][column] = battleAug.getBattleLore(2);
		
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// Row 4
		column = 3;
		
		licenseGrid[0][column] = eqee.getEQEE(0);	
		licenseGrid[1][column] = eqee.getEQEE(0);
		
		licenseGrid[2][column] = technicks.getTechnickCopy(31);
		licenseGrid[3][column] = technicks.getTechnickCopy(29);
		
		licenseGrid[4][column] = magAug.getMagickLore(24);
		
		licenseGrid[5][column] = accessories.getAccessory(1);
		licenseGrid[6][column] = accessories.getAccessory(0);
		
		licenseGrid[7][column] = armor.getArmor(26);
		licenseGrid[8][column] = armor.getArmor(27);
		licenseGrid[9][column] = armor.getArmor(28);
		
		licenseGrid[10][column] = itemAug.getItemAugment(0);
		
		licenseGrid[11][column] = armor.getArmor(29);
		licenseGrid[12][column] = armor.getArmor(30);
		
		licenseGrid[13][column] = weapons3.getWeapon3(31);
		
		licenseGrid[14][column] = magAug.getMagickLore(2);
		
		licenseGrid[15][column] = weapons3.getWeapon3(32);
		
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// Row 5
		column = 4;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		
		licenseGrid[3][column] = eqee.getEQEE(8);
		
		licenseGrid[4][column] = eqee.getEQEE(0);
		
		licenseGrid[5][column] = accessories.getAccessory(2);
		
		licenseGrid[6][column] = eqee.getEQEE(1);
		
		licenseGrid[7][column] = weapons3.getWeapon3(27);
		licenseGrid[8][column] = weapons3.getWeapon3(28);
		
		licenseGrid[9][column] = magAug.getMagickLore(21);
		
		licenseGrid[10][column] = weapons3.getWeapon3(2);
		licenseGrid[11][column] = weapons3.getWeapon3(3);
		
		licenseGrid[12][column] = magAug.getMagickLore(23);
		
		licenseGrid[13][column] = eqee.getEQEE(0);
		licenseGrid[14][column] = eqee.getEQEE(0);
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 6
		column = 5;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);
		
		licenseGrid[5][column] = accessories.getAccessory(3);
		
		licenseGrid[6][column] = technicks.getTechnickCopy(24);
		
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		
		licenseGrid[9][column] = eqee.getEQEE(3);
		
		licenseGrid[10][column] = eqee.getEQEE(0);
		
		licenseGrid[11][column] = itemAug.getItemAugment(1);
		
		licenseGrid[12][column] = armor.getArmor(31);
		
		licenseGrid[13][column] = eqee.getEQEE(0);
		licenseGrid[14][column] = eqee.getEQEE(0);
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 7
		column = 6;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);
		
		licenseGrid[5][column] = accessories.getAccessory(4);
		
		licenseGrid[6][column] = weapons2.getWeapon2(10);
		
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);
		licenseGrid[10][column] = eqee.getEQEE(0);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(9);
		
		licenseGrid[12][column] = armor.getArmor(32);
		
		licenseGrid[13][column] = eqee.getEQEE(5);
		
		licenseGrid[14][column] = eqee.getEQEE(0);
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 8
		column = 7;
		
		licenseGrid[0][column] = eqee.getEQEE(0);	
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);	
		licenseGrid[3][column] = eqee.getEQEE(0);
		
		licenseGrid[4][column] = eqee.getEQEE(9);
		
		licenseGrid[5][column] = accessories.getAccessory(5);
		
		licenseGrid[6][column] = technicks.getTechnickCopy(1);
		
		licenseGrid[7][column] = eqee.getEQEE(0);	
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);	
		licenseGrid[10][column] = eqee.getEQEE(0);
		
		licenseGrid[11][column] = itemAug.getItemAugment(3);
		
		licenseGrid[12][column] = armor.getArmor(33);
		
		licenseGrid[13][column] = eqee.getEQEE(0);
		licenseGrid[14][column] = eqee.getEQEE(0);
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 9
		column = 8;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);
		
		licenseGrid[5][column] = accessories.getAccessory(6);
		
		licenseGrid[6][column] = weapons2.getWeapon2(11);
		
		licenseGrid[7][column] = eqee.getEQEE(0);	
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);	
		licenseGrid[10][column] = eqee.getEQEE(0);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(12);
		
		licenseGrid[12][column] = battleAug.getBattleLore(24);
		
		licenseGrid[13][column] = eqee.getEQEE(0);
		
		licenseGrid[14][column] = tim.getTimeMagick(8);
		licenseGrid[15][column] = tim.getTimeMagick(9);
		
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 10
		column = 9;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);

		licenseGrid[5][column] = accessories.getAccessory(7);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(0);
		
		licenseGrid[7][column] = eqee.getEQEE(12);
		
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);
		licenseGrid[10][column] = eqee.getEQEE(0);
		
		licenseGrid[11][column] = itemAug.getItemAugment(2);
		
		licenseGrid[12][column] = armor.getArmor(34);
		
		licenseGrid[13][column] = eqee.getEQEE(16);
		
		licenseGrid[14][column] = tim.getTimeMagick(7);
		
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 11
		column = 10;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);
		
		licenseGrid[5][column] = accessories.getAccessory(8);
		
		licenseGrid[6][column] = weapons2.getWeapon2(12);
		
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);
		licenseGrid[10][column] = eqee.getEQEE(0);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(5);
		
		licenseGrid[12][column] = armor.getArmor(35);
		
		licenseGrid[13][column] = eqee.getEQEE(0);
		licenseGrid[14][column] = eqee.getEQEE(0);
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 12
		column = 11;
		
		licenseGrid[0][column] = weapons3.getWeapon3(14);
		
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		
		licenseGrid[4][column] = itemAug.getItemAugment(9);
		
		licenseGrid[5][column] = accessories.getAccessory(9);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(8);
		
		licenseGrid[4][column] = itemAug.getItemAugment(6);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(17);
		
		licenseGrid[4][column] = itemAug.getItemAugment(7);
		
		licenseGrid[11][column] = technicks.getTechnickCopy(18);
		
		licenseGrid[4][column] = itemAug.getItemAugment(8);
		
		licenseGrid[12][column] = armor.getArmor(36);
		
		licenseGrid[13][column] = battleAug.getBattleLore(16);
		
		licenseGrid[14][column] = eqee.getEQEE(0);
		licenseGrid[15][column] = eqee.getEQEE(0);
		
		licenseGrid[16][column] = eqee.getEQEE(19);
		licenseGrid[17][column] = healthAug.getHealthAugment(9);
		
		// ROW 13
		column = 12;
		
		licenseGrid[0][column] = eqee.getEQEE(14);
		
		licenseGrid[1][column] = healthAug.getHealthAugment(7);
		licenseGrid[2][column] = healthAug.getHealthAugment(4);
		licenseGrid[3][column] = healthAug.getHealthAugment(3);
		licenseGrid[4][column] = healthAug.getHealthAugment(0);
		
		licenseGrid[5][column] = accessories.getAccessory(10);
		licenseGrid[6][column] = accessories.getAccessory(11);
		licenseGrid[7][column] = accessories.getAccessory(12);
		licenseGrid[8][column] = accessories.getAccessory(13);
		licenseGrid[9][column] = accessories.getAccessory(14);
		licenseGrid[10][column] = accessories.getAccessory(15);		
		licenseGrid[11][column] = accessories.getAccessory(16);
		
		licenseGrid[12][column] = armor.getArmor(37);
		licenseGrid[12][column] = armor.getArmor(38);
		
		licenseGrid[14][column] = battleAug.getBattleLore(17);
		
		licenseGrid[15][column] = technicks.getTechnickCopy(15);
		
		licenseGrid[14][column] = battleAug.getBattleLore(18);
		
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 14
		column = 13;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		
		licenseGrid[1][column] = healthAug.getHealthAugment(6);
		licenseGrid[2][column] = healthAug.getHealthAugment(5);
		licenseGrid[3][column] = healthAug.getHealthAugment(2);
		licenseGrid[4][column] = healthAug.getHealthAugment(1);
		
		licenseGrid[5][column] = magAug.getMagickLore(25);
		
		licenseGrid[6][column] = weapons2.getWeapon2(13);
		
		licenseGrid[12][column] = eqee.getEQEE(0);
		licenseGrid[13][column] = eqee.getEQEE(0);
		
		licenseGrid[10][column] = eqee.getEQEE(13);
		
		licenseGrid[11][column] = eqee.getEQEE(0);
		
		licenseGrid[12][column] = accessories.getAccessory(17);
		licenseGrid[13][column] = accessories.getAccessory(18);
		licenseGrid[14][column] = accessories.getAccessory(19);
		licenseGrid[15][column] = accessories.getAccessory(20);
		licenseGrid[16][column] = accessories.getAccessory(21);
		licenseGrid[17][column] = accessories.getAccessory(22);
		
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 15
		column = 14;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);
		
		licenseGrid[5][column] = eqee.getEQEE(11);
		
		licenseGrid[6][column] = eqee.getEQEE(0);
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		
		licenseGrid[9][column] = magAug.getMagickLore(3);
		
		licenseGrid[10][column] = eqee.getEQEE(0);
		licenseGrid[11][column] = eqee.getEQEE(0);
		licenseGrid[12][column] = eqee.getEQEE(0);
		
		licenseGrid[13][column] = eqee.getEQEE(18);
		
		licenseGrid[14][column] = eqee.getEQEE(0);
		
		licenseGrid[15][column] = eqee.getEQEE(6);
		
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 16
		column = 15;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);
		
		licenseGrid[5][column] = weapons3.getWeapon3(13);
		
		licenseGrid[6][column] = eqee.getEQEE(0);
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);
		licenseGrid[10][column] = eqee.getEQEE(0);
		licenseGrid[11][column] = eqee.getEQEE(0);
		licenseGrid[12][column] = eqee.getEQEE(0);
		
		licenseGrid[13][column] = magAug.getMagickLore(4);
		licenseGrid[14][column] = magAug.getMagickLore(5);
		licenseGrid[15][column] = magAug.getMagickLore(6);
		
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 17
		column = 16;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);
		licenseGrid[5][column] = eqee.getEQEE(0);
		licenseGrid[6][column] = eqee.getEQEE(0);
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);
		licenseGrid[10][column] = eqee.getEQEE(0);
		licenseGrid[11][column] = eqee.getEQEE(0);
		licenseGrid[12][column] = eqee.getEQEE(0);
		licenseGrid[13][column] = eqee.getEQEE(0);
		licenseGrid[14][column] = eqee.getEQEE(0);
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 18
		column = 17;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);
		licenseGrid[5][column] = eqee.getEQEE(0);
		licenseGrid[6][column] = eqee.getEQEE(0);
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);
		licenseGrid[10][column] = eqee.getEQEE(0);
		licenseGrid[11][column] = eqee.getEQEE(0);
		licenseGrid[12][column] = eqee.getEQEE(0);
		licenseGrid[13][column] = eqee.getEQEE(0);
		licenseGrid[14][column] = eqee.getEQEE(0);
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		// ROW 19
		column = 18;
		
		licenseGrid[0][column] = eqee.getEQEE(0);
		licenseGrid[1][column] = eqee.getEQEE(0);
		licenseGrid[2][column] = eqee.getEQEE(0);
		licenseGrid[3][column] = eqee.getEQEE(0);
		licenseGrid[4][column] = eqee.getEQEE(0);
		licenseGrid[5][column] = eqee.getEQEE(0);
		licenseGrid[6][column] = eqee.getEQEE(0);
		licenseGrid[7][column] = eqee.getEQEE(0);
		licenseGrid[8][column] = eqee.getEQEE(0);
		licenseGrid[9][column] = eqee.getEQEE(0);
		licenseGrid[10][column] = eqee.getEQEE(0);
		licenseGrid[11][column] = eqee.getEQEE(0);
		licenseGrid[12][column] = eqee.getEQEE(0);
		licenseGrid[13][column] = eqee.getEQEE(0);
		licenseGrid[14][column] = eqee.getEQEE(0);
		licenseGrid[15][column] = eqee.getEQEE(0);
		licenseGrid[16][column] = eqee.getEQEE(0);
		licenseGrid[17][column] = eqee.getEQEE(0);
		
		calculateTotalCost();
	}

}
