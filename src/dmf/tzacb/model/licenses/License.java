

package dmf.tzacb.model.licenses;

import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import dmf.tzacb.gui.MainGui;

public class License {

	private String licenseName;
	private int apCost;
	private LicenseType licenseType;
	private boolean aquired = false;
	private String licenseDescription;
	
	private JButton licenseButton = new JButton();
	
	// White Icons
	private ImageIcon imgNotW = null;
	private ImageIcon imgYesW = null;
	
	// Brown Icons
	private ImageIcon imgNotB = null;
	private ImageIcon imgYesB = null;	
	
	
	public License(String name, int cost, LicenseType type, String description, 
					ImageIcon newNotW, ImageIcon newYesW , ImageIcon newNotB, ImageIcon newYesB) {
		
		licenseName = name;
		apCost = cost;
		licenseType = type;
		licenseDescription = description;
		
		imgNotW = newNotW;
		imgYesW = newYesW;
		
		imgNotB = newNotB;
		imgYesB = newYesB;
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
