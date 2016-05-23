package Java1.el222ja_lab4.data_samlingar;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	@Override
	public void push(int n) {
		if(size==values.length) {
			super.resize();
			values[size]=n;
			size++;
			} 
		else {
			values[size]=n;
			size++;
		}
	}

	@Override
	public int pop() {
		int i = values[size-1];
		size--;
		return i;
	}

	@Override
	public int peek() {
		int i = values[size-1];
		return i;
	}

}
