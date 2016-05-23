package Java1.el222ja_lab4.stack;

import java.util.Iterator;

public class StackMain implements Stack {
	private static Object[] arr = new Object[10];
	private int index = 0;

	@Override
	public int size() {
		return index;
	}

	@Override
	public boolean isEmpty() {
		return index==0;
	}

	@Override
	public void push(Object element) {
		if(index==arr.length)
			expand();
		arr[index]=element;
		index++;
	}

	public void expand() {
		Object[] newarray = new Object[index*2];
		for(int i=0; i<index; i++) {
			newarray[i]=arr[i]; }
		arr = newarray;		
	}

	@Override
	public Object pop() {
		Object o = arr[index-1];
		arr[index]=null;
		index--;
		return o;
	}

	@Override
	public Object peek() {
		Object p = arr[index-1];
		return p;
	}
	private class StackIterator implements Iterator {
		private int i=0;

		@Override
		public boolean hasNext() {
			return arr[i]!=null;
		}

		@Override
		public Object next() {
			return arr[i++];
		}

		@Override
		public void remove() {
		}
	}

	@Override
	public Iterator iterator() {
		return new StackIterator();
	}

	public static void main(String[] args) {
		Stack st = new StackMain();
		int a = 6;
		int b = 9;
		int c = 7;
		int d= 1;
		int e=2;
		int f=4;
		int p=0;
		int t = 13;
		int h= 45;
		int y = 34;
		int k= 12;
		int re= 133;
		st.push(a);
		st.push(c);
		st.push(b);
		st.push(d);
		st.push(e);
		st.push(f);
		st.push(p);
		st.push(t);
		st.push(h);
		st.push(y);
		st.push(k);
		st.push(re);
		System.out.println("Size: "+st.size());
		System.out.println("Pop: "+st.pop());
		System.out.println("Peek: "+st.peek());
		System.out.println("Empty: "+st.isEmpty());
		Iterator g = st.iterator();
		while(g.hasNext()) {
			System.out.println("Iterator: "+g.next()); }


	}
}
