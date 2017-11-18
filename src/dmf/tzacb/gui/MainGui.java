package dmf.tzacb.gui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dmf.tzacb.logic.jobs.Archer;
import dmf.tzacb.logic.jobs.BlackMage;
import dmf.tzacb.logic.jobs.Bushi;
import dmf.tzacb.logic.jobs.Foebreaker;
import dmf.tzacb.logic.jobs.Knight;
import dmf.tzacb.logic.jobs.Machinist;
import dmf.tzacb.logic.jobs.Monk;
import dmf.tzacb.logic.jobs.RedBattlemage;
import dmf.tzacb.logic.jobs.Shikari;
import dmf.tzacb.logic.jobs.TimeBattlemage;
import dmf.tzacb.logic.jobs.Uhlan;
import dmf.tzacb.logic.jobs.WhiteMage;
import dmf.tzacb.logic.main.PlayerCharacter;
import dmf.tzacb.model.licenses.License;
import dmf.tzacb.model.licenses.LicenseBoard;
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

import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGui extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Characters	
	private static PlayerCharacter[] characters = new PlayerCharacter[6]; 
	
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
	
	private Image scaleImg = null;
	private Image newImg = null;
	
	// GUI Components
	JPanel[] panelBoard1 = new JPanel[6];
	JPanel[] panelBoard2 = new JPanel[6];
	
	// Empty Icons
	private ImageIcon blockedW		= new ImageIcon(MainGui.class.getResource("/dmf/tzacb/assets/icons/licenses/emptyWhite.PNG"));
	private ImageIcon blockedB 		= new ImageIcon("/dmf/tzacb/assets/icons/licenses/emptyBrown.PNG");
	private ImageIcon background	= new ImageIcon("/dmf/tzacb/assets/icons/licenses/background.PNG");
	
	
	
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
		tabbedPane.setBounds(10, 11, 1174, 888);
		getContentPane().add(tabbedPane);
		
		// Vaan Tab ///////////////////////////////////////////////////////////////////////////////////////////////////////
		JPanel pnVaan = new JPanel();
		tabbedPane.addTab(characters[0].getName(), null, pnVaan, null);
		pnVaan.setLayout(null);
		
		JLabel lbVaan = new JLabel(characters[0].getName());
		scaleImg = characters[0].getIcon().getImage();
		newImg = scaleImg.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
		lbVaan.setIcon(new ImageIcon(newImg));
		
		lbVaan.setBounds(10, 11, 160, 80);
		pnVaan.add(lbVaan);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		splitPane.setBounds(0, 102, 1169, 758);
		pnVaan.add(splitPane);
		
		panelBoard1[0] = new JPanel();
		panelBoard1[0].setBorder(new LineBorder(new Color(0, 0, 0)));
		splitPane.setLeftComponent(panelBoard1[0]);
		panelBoard1[0].setLayout(new GridLayout(19, 18, 0, 0));
		
		panelBoard2[0] = new BoardPanel(new LicenseBoard());
		panelBoard2[0] = new BoardPanel(new LicenseBoard());
		splitPane.setRightComponent(panelBoard2[0]);
		panelBoard2[0].setLayout(new GridLayout(19, 18, 0, 0));
		
		JButton btnAddBrd1Vaan = new JButton("Select Board 1");
		btnAddBrd1Vaan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// BoardSeclection
				characters[0].addBoard(selectNewBoard(characters[0]), false);
				updateGrid("Vaan", false);
				
				System.out.println("Vaan new job 1: " + characters[0].getBoardName(false));
			}
		});
		btnAddBrd1Vaan.setBounds(180, 11, 140, 30);
		pnVaan.add(btnAddBrd1Vaan);
		
		JButton btnAddBrd2Vaan = new JButton("Select Board 2");
		btnAddBrd2Vaan.setBounds(180, 61, 140, 30);
		pnVaan.add(btnAddBrd2Vaan);
		
		
		// Balthier Tab
		JPanel pnBalthier = new JPanel();
		tabbedPane.addTab(characters[1].getName(), null, pnBalthier, null);
		pnBalthier.setLayout(null);
		
		JLabel lbBalthier = new JLabel(characters[1].getName());
		scaleImg = characters[1].getIcon().getImage();
		newImg = scaleImg.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
		lbBalthier.setIcon(new ImageIcon(newImg));
		
		lbBalthier.setBounds(10, 11, 160, 80);
		pnBalthier.add(lbBalthier);
		
		
		// Fran Tab
		JPanel pnFran = new JPanel();
		tabbedPane.addTab(characters[2].getName(), null, pnFran, null);
		pnFran.setLayout(null);
		
		JLabel lbFran = new JLabel(characters[2].getName());
		scaleImg = characters[2].getIcon().getImage();
		newImg = scaleImg.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
		lbFran.setIcon(new ImageIcon(newImg));
		
		lbFran.setBounds(10, 11, 160, 80);
		pnFran.add(lbFran);
		
		// Basch Tab
		JPanel pnBasch = new JPanel();
		tabbedPane.addTab(characters[3].getName(), null, pnBasch, null);
		pnBasch.setLayout(null);
		
		JLabel lbBasch = new JLabel(characters[3].getName());
		scaleImg = characters[3].getIcon().getImage();
		newImg = scaleImg.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
		lbBasch.setIcon(new ImageIcon(newImg));
		
		lbBasch.setBounds(10, 11, 160, 80);
		pnBasch.add(lbBasch);
		
		// Ashe Tab
		JPanel pnAshe = new JPanel();
		tabbedPane.addTab(characters[4].getName(), null, pnAshe, null);
		pnAshe.setLayout(null);
		
		JLabel lbAshe = new JLabel(characters[4].getName());
		scaleImg = characters[4].getIcon().getImage();
		newImg = scaleImg.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
		lbAshe.setIcon(new ImageIcon(newImg));
		
		lbAshe.setBounds(10, 11, 160, 80);
		pnAshe.add(lbAshe);
		
		// Penelo Tab
		JPanel pnPenelo = new JPanel();
		tabbedPane.addTab(characters[5].getName(), null, pnPenelo, null);
		pnPenelo.setLayout(null);
		
		JLabel lbPenelo = new JLabel(characters[5].getName());
		scaleImg = characters[5].getIcon().getImage();
		newImg = scaleImg.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
		lbPenelo.setIcon(new ImageIcon(newImg));
		
		lbPenelo.setBounds(10, 11, 160, 80);
		pnPenelo.add(lbPenelo);

	}
	
	private void updateGrid(String chara, boolean board){
		 	
	        switch (chara) {
	            case "Vaan":
	            		if(!board) {
	            			for(int i = 0; i < 18; i++) {
	            				for(int j = 0; j < 19; j++) {
	            					
	            					JLabel tempLabel = new JLabel();
	            					scaleImg = blockedW.getImage();
	            					newImg = scaleImg.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	            					tempLabel.setIcon(new ImageIcon(newImg));
	            					
	            					panelBoard1[0].add(tempLabel);
	            				}
	            			}
	            		}
	            		else {
	            			
	            		}
	                     break;
	            case "Balthier":
	                     break;
	            case "Fran":  
	                     break;
	            case "Basch": 
	                     break;
	            case "Ashe":  
	                     break;
	            case "Penelo":
	                     break;
	                     }
	        System.out.println(chara);
	        updateGUI();
	}
	
	private void updateGUI(){
		System.out.println("GUI UPDATED\n");
		this.revalidate();
		this.repaint();
	}
	
	private LicenseBoard selectNewBoard(PlayerCharacter holder) {		
		String newJob = JOptionPane.showInputDialog(null, "Please choose a job", "Job Selection Board 1",
		        JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Archer",
		            "Black Mage", "Bushi", "Foebreaker", "Knight", "Machinist", "Monk",
		            "Red Battlemage", "Shikari", "Time Battlemage", "Uhlan", "White Mage"}, "Archer").toString();
		
		if(newJob == "Archer"){
			return new Archer("Archer", holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Black Mage") {
			return new BlackMage(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Bushi") {
			return new Bushi(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Foebreaker") {
			return new Foebreaker(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Knight") {
			return new Knight(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Machinist") {
			return new Machinist(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Monk") {
			return new Monk(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Red Battlemage") {
			return new RedBattlemage(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Shikari") {
			return new Shikari(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Time Battlemage") {
			return new TimeBattlemage(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "Uhlan") {
			return new Uhlan(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else if(newJob == "White Mage") {
			return new WhiteMage(holder, accessories, arcMagick, armor, battleAugments, blmMagick, eqee, grnMagick, healthAugments, itemAugments, magickAugments, technicks, timMagick, weapons1, weapons2, weapons3, whmMagick);
		}
		else {
			return null;
		}
    
	}
}
