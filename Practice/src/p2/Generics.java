package p2;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		List<Integer> values=new ArrayList<Integer>();
//		
//		values.add(7);
//		//values.add("vasu");
//		
//		int i=Integer.parseInt(values.get(1).toString());
//		System.out.println(i);
	Container<Integer> obj=new Container<>();
	obj.value=6;
	obj.show();
	obj.demo(new ArrayList<Number>());
	
	}

}
class Container<T>
{		
	T value;
	
	public T getValue() {
		return value;
	}

	

	public void setValue(T value) {
		this.value = value;
	}

	public void show()
	{
		System.out.println(value.getClass(). getName());
	}
	public void demo(ArrayList<? super T> obj)
	{
		System.out.println(value);
	}
}
