package dmf.ff12.logic.jobs;

public class LicenseBoard {
	
	public License[][] licenseGrid;
	private int totalAPCost = 0;
	private int currentApSpent = 0;
	
	public LicenseBoard() {
		licenseGrid = new License[18][19];
	}
	
	public void addLicense(int row, int column, License license) {
		licenseGrid[row][column] = license;
	}
	
	public int getTotalCost() {
		return totalAPCost;
	}
	
	public int getCurrentCost() {
		return currentApSpent;
	}
	
}
