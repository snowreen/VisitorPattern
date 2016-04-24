package loyola.oop.visitor.pattern.elements;

import loyola.oop.visitor.pattern.visitors.Visitor;

public interface Store {
	
	public void accept(Visitor visitor);

}
