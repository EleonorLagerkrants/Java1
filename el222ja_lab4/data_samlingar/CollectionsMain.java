package Java1.el222ja_lab4.data_samlingar;

public class CollectionsMain {

	public static void main(String[] args) {
		ArrayIntList arr = new ArrayIntList(); 
		arr.add(5);
		arr.add(6);
		arr.add(8);
		arr.addAt(9, 0);
		arr.remove(1);
		System.out.println(arr);
		System.out.println("Empty: "+arr.isEmpty());
		System.out.println("Size: "+arr.size());
		System.out.println("Indexof: "+arr.indexOf(8));
		System.out.println("Get: "+arr.get(1)+"\n");

		ArrayIntStack array = new ArrayIntStack();
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(6);
		array.push(5);
		array.push(7);
		array.push(8);
		array.push(9);
		System.out.println("Pop: "+array.pop());
		System.out.println(array);
		System.out.println("Peek:" +array.peek());
		System.out.println("Size: "+array.size());
		System.out.println("Empty: "+array.isEmpty());

	}

}
