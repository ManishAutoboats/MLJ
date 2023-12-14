package stepDefination;

import io.cucumber.java.en.And;
import page.BasketPage;

public class BasketPageSteps {
	
	BasketPage basket = new BasketPage();
	
	
	@And ("add product from prouct page")
	public void add_Product() {
		basket.addProduct();
		
	}

}
