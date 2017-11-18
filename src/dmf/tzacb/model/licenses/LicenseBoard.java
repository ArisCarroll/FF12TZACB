package dmf.tzacb.model.licenses;

import dmf.tzacb.logic.main.PlayerCharacter;

public class LicenseBoard {
	
	public License[][] licenseGrid;
	public PlayerCharacter boardHolder;
	public int totalAPCost = 0;
	public int currentApSpent = 0;
	public String boardName;
	
	public LicenseBoard() {
		licenseGrid = new License[18][19];
	}
	
	public void addLicense(int column, int row, License license) {
		licenseGrid[column][row] = license;
	}
	
	public void calculateTotalCost() {
		
		for(int i = 0; i < 18; i++) {
			for(int j = 0; j < 19; j++) {
				System.out.println("Column: " + i + "\n " + "Row " + j);
				totalAPCost += licenseGrid[i][j].getCost();
			}
		}
	}
	
	public int calculateCurrentCost() {
		
		for(int i = 0; i < 18; i++) {
			for(int j = 0; j < 19; j++) {
				if(licenseGrid[i][j].isAquired()) {
					currentApSpent += licenseGrid[i][j].getCost();
				}
			}
		}
		
		return currentApSpent;
	}
	
	public void setBoardName(String newName) {
		boardName = newName;		
	}
	
	public String getBoardName(){
		return boardName;
	}
	
	public int getTotalCost() {
		return totalAPCost;
	}
	
	public int getCurrentCost() {
		return currentApSpent;
	}
	
	public License getLicense(int column, int row){
		return licenseGrid[column][row];
	}
	
	public void aquireLicense(int column, int row) {
		licenseGrid[column][row].aquireLicense();
	}
	
	public boolean wasLicenseAquired(int column, int row) {
		return licenseGrid[column][row].isAquired();
	}
	
	public PlayerCharacter getBoardHolder() {
		return boardHolder;
	}

	public void setBoardHolder(PlayerCharacter boardHolder) {
		this.boardHolder = boardHolder;
	}
	
}
