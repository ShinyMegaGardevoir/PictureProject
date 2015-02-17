package pixLab.model;

public class FauxToeShop
{
	private String[] FauxToeShopFilters;
	
	public FauxToeShop()
	{
		FauxToeShopFilters = new String[6];
	}
	
	public String[] getFauxToeShopFilters()
	{
		return FauxToeShopFilters;
	}
	public void setFauxToeShopFilters(String[] FauxToeShopFilters)
	{
		this.FauxToeShopFilters = FauxToeShopFilters;
	}

}
