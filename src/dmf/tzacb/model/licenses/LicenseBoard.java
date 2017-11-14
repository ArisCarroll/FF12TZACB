package dmf.tzacb.model.licenses;

import dmf.tzacb.logic.main.PlayerCharacter;

public class LicenseBoard {
	
	public License[][] licenseGrid;
	public PlayerCharacter boardHolder;
	public int totalAPCost = 0;
	public int currentApSpent = 0;
	
	public LicenseBoard() {
		licenseGrid = new License[18][19];
	}
	
	public void addLicense(int row, int column, License license) {
		licenseGrid[row][column] = license;
	}
	
	public void calculateTotalCost() {
		
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 18; i++) {
				totalAPCost += licenseGrid[j][i].getCost();
			}
		}
	}
	
	public int calculateCurrentCost() {
		
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 18; i++) {
				if(licenseGrid[j][i].isAquired()) {
					currentApSpent += licenseGrid[j][i].getCost();
				}
			}
		}
		
		return currentApSpent;
	}
	
	public int getTotalCost() {
		return totalAPCost;
	}
	
	public int getCurrentCost() {
		return currentApSpent;
	}
	
	public void aquireLicense(int row, int column) {
		licenseGrid[row][column].aquireLicense();
	}
	
	public boolean wasLicenseAquired(int row, int column) {
		return licenseGrid[row][column].isAquired();
	}
	
	public PlayerCharacter getBoardHolder() {
		return boardHolder;
	}

	public void setBoardHolder(PlayerCharacter boardHolder) {
		this.boardHolder = boardHolder;
	}
	
}
