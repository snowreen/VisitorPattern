package loyola.oop.visitor.pattern.elements;

import loyola.oop.visitor.pattern.visitors.Visitor;

public class ClothingStore implements Store {
	
	private String name;
	
	public ClothingStore(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.buyClothes(this);
	}

}
