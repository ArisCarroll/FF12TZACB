package dmf.tzacb.logic.main;

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

public class PlayerCharacter {
	
	private BattleAugments battleAugments;
	private HealthAugments healthAugment;
	private ItemAugments   itemAugments;
	private MagickAugments magickAugment;
	
	// Equipment
	private Accessories    accessories;
	private Armor		   armor;
	private Weapons1	   weapons1;
	private Weapons2	   weapons2;
	private Weapons3	   weapons3;
	
	// Magicks
	private ArcaneMagick	arcMagick;
	private BlackMagick		blmMagick;
	private GreenMagick		grnMagick;
	private TimeMagick		timMagick;
	private WhiteMagick		whmMagick;
	
	// Technicks
	private Technicks	technicks;
	
	// Espers Quickenings Essentials and Empty
	private EQEE eqee;
	
	String name;
	int noOfBoards = 0;
	
	LicenseBoard board1 = null;
	LicenseBoard board2 = null;
	
	int totalBoardCost   = 0;
	int currentBoardCost = 0;
	
	public PlayerCharacter(String newName) {
		name = newName;
	}
	
	public String getName(){
		return name;
	}

	public String addBoard(LicenseBoard newBoard) {
		
		if(board1 == null) {
			board1 = newBoard;
			return "License Board 1 Selected.";
		}
		else if (board2 == null) {
			board2 = newBoard;
			return "License Board 2 Selected.";
		}
		else {
			return "Both Boards already selected, delete a Board to select new one.";
		}
	}
	
	public String removeBoard(int board) {
		if(board == 0) {
			board1 = null;
			return "Board 1 has been deleted";
		}
		else if(board == 1) {
			board2 = null;
			return "Board 2 has been deleted";
		}
		else {
			return "Invalid board number";
		}
	}
	
	private void calcTotalBoardCost() {
		totalBoardCost = 0;
		
		if(board1 != null) {
			totalBoardCost += board1.getTotalCost();
		}
		if(board2 != null) {
			totalBoardCost += board2.getTotalCost();
		}
	}
	
	public int calcCurrentBoardCost() {
		currentBoardCost = 0;
		
		if(board1 != null) {
			currentBoardCost += board1.getTotalCost();
		}
		if(board2 != null) {
			currentBoardCost += board2.getTotalCost();
		}
		
		return currentBoardCost;
	}
	
	public void updateCharacter() {
		calcTotalBoardCost();
		calcCurrentBoardCost();
	}
}
