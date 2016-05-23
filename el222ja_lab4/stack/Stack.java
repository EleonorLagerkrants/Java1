package Java1.el222ja_lab4.stack;

import java.util.Iterator;

public interface Stack {
	int size();
	boolean isEmpty();
	void push(Object element);
	Object pop();
	Object peek();
	Iterator iterator();

}
