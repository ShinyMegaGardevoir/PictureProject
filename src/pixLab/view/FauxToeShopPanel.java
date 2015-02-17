package pixLab.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import pixLab.classes.ImageDisplay;
import pixLab.classes.Picture;
import pixLab.controller.FauxToeShopController;

public class FauxToeShopPanel extends JPanel
{
	
	private FauxToeShopController baseController;
	private JComboBox filterBox;
	private JScrollPane imagePane;
	private SpringLayout baseLayout;
	
	private Picture basePicture;
	
	public FauxToeShopPanel(FauxToeShopController baseController)
	{
		this.baseController = baseController;
		
		
		imagePane = new JScrollPane();
		basePicture = new Picture("beach.jpg");
		baseLayout = new SpringLayout();
		
		
		
		setupPicture();
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupComboBox()
	{
		String [] filterArray = {
				"Negate",
				"Only Blue",
				"Rotate Color"
		};
		filterBox = new JComboBox(filterArray);
		
//		filterBox.setModel(new DefaultComboBoxModel(baseController.getMyFauxToeShop().getFauxToeShopFilters()));
	}
	
	private void setupPicture()
	{
		BufferedImage bufferedPic = basePicture.getBufferedImage();
		ImageDisplay pictureDisplay = new ImageDisplay(bufferedPic);
		imagePane.setViewportView(pictureDisplay);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(imagePane);
		
		
		this.add(filterBox);
		
		
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, imagePane, 75, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, imagePane, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, filterBox, 22, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, filterBox, -168, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		filterBox.addItemListener(new ItemListener()
		{
			
			@Override
			public void itemStateChanged(ItemEvent selectedItem)
			{
				if(filterBox.getSelectedIndex() == 1)
				{
					basePicture.negate();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 2)
				{
					basePicture.zeroBlue();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 3)
				{
					basePicture.keepOnlyBlue();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 4)
				{
					basePicture.mirrorVertical();
					setupPicture();
				}
			}

			
		
	});
	}

}
