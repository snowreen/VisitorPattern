package loyola.oop.visitor.pattern.elements;

import loyola.oop.visitor.pattern.visitors.Visitor;

public class ElectronicStore implements Store {
	
	private String name;
	
	public ElectronicStore(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.buyElectronics(this);
	}

}
