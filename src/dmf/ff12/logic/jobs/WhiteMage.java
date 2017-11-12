package dmf.ff12.logic.jobs;

public class WhiteMage extends LicenseBoard {

	private Character boardHolder;

	public WhiteMage(Character holder) {

		int column = 0;

		setBoardHolder(holder);

		// ROW 1
		for (int i = 0; i < 6; i++) {
//			licenseGrid[i][column] = new License("Empty", 0, LicenseType.Empty);
		}

//		licenseGrid[6][column] = new License("Libra", 25, LicenseType.Technick);

		for (int i = 7; i < 12; i++) {
//			licenseGrid[i][column] = new License("Empty", 0, LicenseType.Empty);
		}

//		licenseGrid[12][0] = new License("+230 HP", 70, LicenseType.Augment);

		for (int i = 13; i < 19; i++) {
//			licenseGrid[i][column] = new License("Empty", 0, LicenseType.Empty);
		}

		// ROW 2
		column = 1;

		for (int i = 0; i < 6; i++) {
//			licenseGrid[i][column] = new License("Empty", 0, LicenseType.Empty);
		}

//		licenseGrid[6][column] = new License("Cúchulainn", 50, LicenseType.Summon);

		for (int i = 7; i < 12; i++) {
//			licenseGrid[i][column] = new License("Empty", 0, LicenseType.Empty);
		}

//		licenseGrid[12][0] = new License("+230 HP", 70, LicenseType.Augment);

		for (int i = 13; i < 19; i++) {
//			licenseGrid[i][column] = new License("Empty", 0, LicenseType.Empty);
		}
	}

	public Character getBoardHolder() {
		return boardHolder;
	}

	public void setBoardHolder(Character boardHolder) {
		this.boardHolder = boardHolder;
	}

}
