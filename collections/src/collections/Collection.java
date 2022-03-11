package collections;

import java.util.Arrays;

public abstract class Collection {

	private int[] elements;
	
	public Collection() {
		this.elements = new int[] {};
	}
	
	public int[] getElements() { return elements.clone(); }
	
	public void put(int value) {
		elements = Arrays.copyOf(elements, elements.length + 1);
		elements[elements.length - 1] = value;
	}
	
	public int takeNth(int index) {
		int result = elements[index];
		int[] newElements = new int[elements.length - 1];
		System.arraycopy(elements, 0, newElements, 0, index);
		System.arraycopy(elements, index + 1, newElements, index, elements.length - index - 1);
		return result;
	}
	
	/**
	 * Returns and removes some element of this collection.
	 */
	public abstract int take();

}
