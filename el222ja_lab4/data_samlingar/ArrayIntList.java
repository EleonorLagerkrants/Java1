package Java1.el222ja_lab4.data_samlingar;

public class ArrayIntList extends AbstractIntCollection implements IntList {

	@Override
	public void add(int n) {
		values[size++]=n;
	}

	@Override
	public void addAt(int n, int index) {
		if(super.checkIndex(index, size)) {
			if(size==values.length) {
				super.resize(); }
			if(index==size) {
				add(n);
				return;
			}
			System.arraycopy(values, index, values, index+1, size-index);
			values[index]=n;
			size++;
		}
	}

	@Override
	public void remove(int index) {
		if(super.checkIndex(index, size))
			System.arraycopy(values, index+1, values, index, size-index-1);
		size--;
	}

	@Override
	public int get(int index) {
		int n = 0;
		n = values[index];
		return n;
	}

	@Override
	public int indexOf(int n) {
		for(int i=0; i<values.length; i++) {
			if(values[i]==n) 
				return i; }
		return -1;
	}

} 

