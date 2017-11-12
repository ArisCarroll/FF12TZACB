

package dmf.ff12.logic.jobs;


public class License {
	
	private String licenseName;
	private int apCost;
	private LicenseType licenseType;
	private boolean aquired = false;
	private String licenseDescription;
	
	
	public License(String name, int cost, LicenseType type, String description) {
		licenseName = name;
		apCost = cost;
		licenseType = type;
		licenseDescription = description;
	}
	
	public String getName() {
		return licenseName;
	}
	
	public int getCost() {
		return apCost;
	}
	
	public LicenseType getType() {
		return licenseType;
	}
	
	public String getDescription() {
		return licenseDescription;
	}
	
	public void aquireLicense() {
		aquired = true;
	}
	
	public boolean isAquired() {
		return aquired;
	}
}
