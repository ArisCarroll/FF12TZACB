package dmf.tzacb.gui;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.Window.Type;

public class BoardSelection extends JOptionPane {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultListModel<String> listModel = new DefaultListModel<String>();
	
	private int selection = 0;
	
	
	public BoardSelection() {
		
		listModel.addElement("Archer");
		listModel.addElement("Black Mage");
		listModel.addElement("Bushi");
		
		listModel.addElement("Foebreaker");
		listModel.addElement("Knight");
		listModel.addElement("Machinist");
		
		listModel.addElement("Monk");
		listModel.addElement("Red Battlemage");
		listModel.addElement("Shikari");
		
		listModel.addElement("Time Battlemage");
		listModel.addElement("Uhlan");
		listModel.addElement("White Mage");
		
		JList<String> list = new JList<String>(listModel);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				selection = list.getSelectedIndex();
			}
		});
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(-1);
		
	}
	
	public int getSelection() {
		return selection;
	}

}
