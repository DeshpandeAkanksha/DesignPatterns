package troubleShootSearch.products;
import java.util.ArrayList;
import java.util.List;

import troubleShootSearch.engine.Visitor;
import troubleShootSearch.util.Constants;
import troubleShootSearch.util.Util;

public class SurveillanceManager implements Visitable{
	
	private List<String> phrases = new ArrayList<>();
	
	public List<String> getPhrases() {
		return phrases;
	}


	public void setPhrases(List<String> phrases) {
		this.phrases = phrases;
	}


	public SurveillanceManager() {
		this.phrases = Util.loadList(Constants.surveillanceManager);
		this.phrases.addAll(Util.loadList(Constants.common));
	}

	@Override
	public List<String> accept(Visitor visitor, String search) {
		return visitor.search(this, search);
	}

}
