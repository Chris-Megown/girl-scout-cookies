
import java.util.ArrayList;

import shopping.Item;

public class MasterOrder {

	ArrayList<CookieOrder> order = new ArrayList<>();

	// public MasterOrder() {

	public void addOrder(CookieOrder theOrder) {
		order.addCookieOrder("Tagalongs", 2);
	}

	public int getTotalBoxexs() {
		int totalBoxes = 0;
		for (CookieOrder theOrder : order) {
			totalBoxes += theOrder.getNumBoxes();
		}
		return totalBoxes;
	}

	public ArrayList<CookieOrder> getItems() {
		return order;
	}
}
