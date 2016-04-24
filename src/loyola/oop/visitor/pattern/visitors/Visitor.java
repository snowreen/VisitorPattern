package loyola.oop.visitor.pattern.visitors;

import java.util.List;

import loyola.oop.visitor.pattern.elements.ClothingStore;
import loyola.oop.visitor.pattern.elements.ElectronicStore;
import loyola.oop.visitor.pattern.elements.GroceryStore;
import loyola.oop.visitor.pattern.elements.Store;

public interface Visitor {
	
	public void buyGroceries(GroceryStore groceryStore);
	public void buyClothes(ClothingStore clothingStore);
	public void buyElectronics(ElectronicStore electronicStore);
	public void doShopping(List<Store> stores);

}
