package loyola.oop.visitor.pattern.client;

import java.util.ArrayList;
import java.util.List;

import loyola.oop.visitor.pattern.elements.ClothingStore;
import loyola.oop.visitor.pattern.elements.ElectronicStore;
import loyola.oop.visitor.pattern.elements.GroceryStore;
import loyola.oop.visitor.pattern.elements.Store;
import loyola.oop.visitor.pattern.visitors.ConcreteVisitor;
import loyola.oop.visitor.pattern.visitors.Visitor;

public class VisitorPatternTestClient {

	public static void main(String[] args) {
		
		Visitor visitor = new ConcreteVisitor();
		
		List<Store> storesNeedToVisit = new ArrayList<Store>();
		storesNeedToVisit.add(new GroceryStore("Walmart"));
		storesNeedToVisit.add(new ElectronicStore("Best Buy"));
		storesNeedToVisit.add(new ClothingStore("H&M"));
		
		visitor.doShopping(storesNeedToVisit);
		
	}

}
