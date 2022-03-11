package collections;

public class Stapel extends Collection {

	/**
	 * Returns and removes the most recently added element.
	 */
	@Override
	public int take() {
		return takeNth(getElements().length - 1);
	}

}
