package dmf.tzacb.logic.main;

import javax.swing.ImageIcon;

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
	
	private String name;
	private ImageIcon icon;
	
	private int noOfBoards = 0;
	
	private LicenseBoard board1 = null;
	private LicenseBoard board2 = null;
	
	private int totalBoardCost   = 0;
	private int currentBoardCost = 0;
	
	public PlayerCharacter(String newName, ImageIcon newIcon) {
		name = newName;
		icon = newIcon;
	}
	
	public String getName(){
		return name;
	}
	
	public ImageIcon getIcon(){
		return icon;
	}

	public String getBoardName(boolean board){
		if(!board) {
			return board1.getBoardName();
		} 
		else {
			return board2.getBoardName();
		}
		
	}
	
	public LicenseBoard getBoard(boolean board){
		if(!board) {
			return board1;
		} 
		else {
			return board2;
		}
	}
	
	public String addBoard(LicenseBoard newBoard, boolean boardOne) {
		
		if(!boardOne) {
			board1 = newBoard;
			return "License Board 1 Selected.";
		}
		else {
			board2 = newBoard;
			return "License Board 2 Selected.";
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
