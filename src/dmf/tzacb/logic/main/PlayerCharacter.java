package dmf.tzacb.logic.main;

import dmf.tzacb.model.licenses.LicenseBoard;

public class PlayerCharacter {
	
	String name;
	int noOfBoards = 0;
	
	LicenseBoard board1 = null;
	LicenseBoard board2 = null;
	
	int totalBoardCost   = 0;
	int currentBoardCost = 0;
	
	public PlayerCharacter(String newName) {
		name = newName;
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
