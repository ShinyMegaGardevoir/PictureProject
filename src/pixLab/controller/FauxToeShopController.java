package pixLab.controller;

import pixLab.model.FauxToeShop;
import pixLab.view.FauxToeShopFrame;

public class FauxToeShopController
{
	private FauxToeShopFrame appFrame;
	private FauxToeShop myFauxToeShop;
	
	
	public FauxToeShop getMyFauxToeShop()
	{
		return myFauxToeShop;
	}
	
	public FauxToeShopController()
	{
		appFrame = new FauxToeShopFrame(this);
	}
	
	private void createAlbumArray()
	{
		String [] filters = myFauxToeShop.getFauxToeShopFilters();
		filters[0] = "Negate";
		filters[1] = "Rotate Color";
		filters[2] = "Zero Blue";
		myFauxToeShop.setFauxToeShopFilters(filters);
	}
	
	public void start()
	{
		
	}

}
