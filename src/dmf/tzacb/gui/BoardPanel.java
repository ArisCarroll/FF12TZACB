package dmf.tzacb.gui;

import java.awt.Panel;

import javax.swing.JPanel;

import dmf.tzacb.model.licenses.LicenseBoard;

import java.awt.GridLayout;
import javax.swing.JLabel;

public class BoardPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BoardPanel(LicenseBoard board){
		setLayout(new GridLayout(19, 18, 0, 0));
		
	}

}
