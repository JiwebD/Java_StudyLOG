package Ch16;

class Animal{
	String name;
}

class Panda extends Animal{
	//생성자
	public Panda(String name) {
		super();
		this.name = name;
	}

	//toString
	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}
	
}

class Tiger extends Animal{
	//생성자
	public Tiger(String name) {
		super();
		this.name = name;
	}
	
	//toString
	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
	
}
public class C04GenericMain {
	
	//GENERIC
	public static <T> void PrintByGeneric(T [] arr) {
		for(T el : arr)
			System.out.println(el);
	}
	
	//OBJECT
	public static void PrintByObject(Object [] animal) {
		for(Object el : animal) {
			System.out.println(el);
		}
		
	}

	public static void main(String[] args) {
//		
//		Tiger arr1 [] = {new Tiger("시베리안호랭이"),new Tiger("신사동호랭이"), new Tiger("86호랭이띠")};
//		PrintByGeneric(arr1);
//		
//		Panda arr2 [] = {new Panda("중국팬더"),new Panda("래서팬더"), new Panda("란다")};
//		PrintByGeneric(arr2);
		
		Object arr3 [] = {new Tiger("시베리안호랭이"),new Panda("중국팬더"),new Panda("란다")};
		PrintByObject(arr3);

	}

}
