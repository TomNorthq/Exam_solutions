package collections;

import java.util.Arrays;

public class Wachtrij extends Collection {
	
	/**
	 * Returns and removes the least recently added element.
	 */
	public int take() {
		return takeNth(0);
	}

}
