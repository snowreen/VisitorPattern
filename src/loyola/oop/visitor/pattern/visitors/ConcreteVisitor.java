package loyola.oop.visitor.pattern.visitors;

import java.util.List;

import loyola.oop.visitor.pattern.elements.ClothingStore;
import loyola.oop.visitor.pattern.elements.ElectronicStore;
import loyola.oop.visitor.pattern.elements.GroceryStore;
import loyola.oop.visitor.pattern.elements.Store;

public class ConcreteVisitor implements Visitor {

	@Override
	public void buyGroceries(GroceryStore groceryStore) {
		System.out.println("Buying Groceries From " + groceryStore.getName());
	}

	@Override
	public void buyClothes(ClothingStore clothingStore) {
		System.out.println("Buying Clothes From " + clothingStore.getName());
		
	}

	@Override
	public void buyElectronics(ElectronicStore electronicStore) {
		System.out.println("Buying Electronics From " + electronicStore.getName());
		
	}
	
	@Override
	public void doShopping(List<Store> stores) {
		for (Store store : stores) {
			store.accept(this);
		}
		
	}

}
