package pixLab.view;

import javax.swing.JFrame;

import pixLab.controller.FauxToeShopController;

public class FauxToeShopFrame extends JFrame
{
	private FauxToeShopPanel basePanel;
	private FauxToeShopMenu baseMenu;
	private FauxToeShopController baseController;
	
	public FauxToeShopFrame(FauxToeShopController baseController)
	{
		this.baseController = baseController;
		basePanel = new FauxToeShopPanel(baseController);
		
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(800,800);
		this.setVisible(true);
		
	}

}
