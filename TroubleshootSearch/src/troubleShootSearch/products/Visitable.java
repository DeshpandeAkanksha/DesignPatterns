package troubleShootSearch.products;

import java.util.List;

import troubleShootSearch.engine.Visitor;

public interface Visitable {
	
	public List<String> accept(Visitor visitor, String search);
}
