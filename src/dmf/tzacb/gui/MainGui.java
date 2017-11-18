package dmf.tzacb.gui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import dmf.tzacb.logic.main.PlayerCharacter;
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
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Window.Type;
import javax.swing.JLabel;

public class MainGui extends JFrame{
	
	// Characters	
	private static PlayerCharacter[] characters; 
	
	// Augments
	private static BattleAugments battleAugments = new BattleAugments();
	private static HealthAugments healthAugments = new HealthAugments();
	private static ItemAugments   itemAugments   = new ItemAugments();
	private static MagickAugments magickAugments = new MagickAugments();
	
	// Equipment
	private static Accessories	accessories	= new Accessories();
	private static Armor		armor		= new Armor();
	private static Weapons1		weapons1	= new Weapons1();
	private static Weapons2		weapons2	= new Weapons2();
	private static Weapons3		weapons3	= new Weapons3();
	
	// Magicks
	private static ArcaneMagick		arcMagick	= new ArcaneMagick();
	private static BlackMagick		blmMagick	= new BlackMagick();
	private static GreenMagick		grnMagick	= new GreenMagick();
	private static TimeMagick		timMagick	= new TimeMagick();
	private static WhiteMagick		whmMagick	= new WhiteMagick();
	
	// Technicks
	private static Technicks	technicks	= new Technicks();
	
	// Espers Quickenings Essentials and Empty
	private static EQEE eqee	  = new EQEE();
	
	
	public MainGui(PlayerCharacter[] newCharacters) {
		setResizable(false);
		setType(Type.UTILITY);
		
		characters = newCharacters;
		
		setTitle("FF12 TZA Class Builder\r\n");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mnFile.add(mntmLoad);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As...");
		mnFile.add(mntmSaveAs);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnAbout = new JMenu("Help");
		menuBar.add(mnAbout);
		
		JMenuItem mntmInfo = new JMenuItem("Help");
		mnAbout.add(mntmInfo);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnAbout.add(mntmAbout);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 964, 714);
		getContentPane().add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab(characters[1].getName(), null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(characters[0].getName());
		lblNewLabel.setBounds(10, 11, 164, 60);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab(characters[2].getName(), null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab(characters[3].getName(), null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab(characters[4].getName(), null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab(characters[5].getName(), null, panel_5, null);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab(characters[0].getName(), null, panel, null);
	}
}
