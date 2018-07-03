// in Java it is better to define the data type with the short abbreviation 
--
float floatValue = 5f;

// the f in the end indicates Java that the value is a float
// thus we don't need to cast it 
--
float floatValue1 = 5.0f;
// the example above shows a casting of a double 5.0 into a float
// if the f wast there in the end of the value then it would show as a error
// the original way would be float floatValue1 = (float) 5.0;

// the short cut for system.out.println() is 
// sout + tab
// in intelliJ it is sout + tab
// in sublime text it would be pl 
--

--float vs double vs int memmory bandwidth--

int and float holds about 32bit = 4 bytes 

double holds about 2x which is 64bit(8 bytes)

//all modern computers use double now because it is more precise 
// double has a max digit range of 15 
// max digit range for float is just 7

---CHAR--

char can be used a unicode data type place holder 
ex 

char copyRight = '\u00A9';

// unicode table 

--

organizing the code by using
 ctrl + alt + L 
 will automatically reformate the code 
 ------------------------------------------------------------------------------------------OOP part 1-------------------------------------------------------------

---------------------------------------------classes : fields method names---------------------------------
create your class
create your fields 
create your set/get methods

car.Java

private String engine;

private void setEngine(String engine){
	this.egine = engine;
}
private String getEngine(){
	return this.engine;
}

look out for the set/get method names the fields have to be capital ex setEngine; getEngine;
--------------------------------------------------------------------------------------------------------
Main.Java
go into your main.java class

there create an object 
car.java object = new car (); 
car Nissan = new car();
// for now the car object has a empty param later there will be parameters inside your object with constructor 

call set
Nissan.setEngine("3.7L VRDETT");
call get
System.out.println("Engine type for the Nissan is " + Nissan.getEngine());

calls are always object.set/get
call set = object.setField("output2");
call get = System.out.println("output 1" + Object.get()); //empty params for now 

----class public - private - protected ---
public = anyone can access the code
private = only the class can access it 
protected = only the classes in the package can access the class


---------------------------------------------------inheritance--------------------------------------------------------
------------fields---------
 = fields are also called member varibles 


-----------extends--------

when using the extends keyword you are using the field that is inside another class thus class b extends from class a 
You are inherriting from another class, you are accessing the state/field of that class
extends and an default constructor is required and IntelliJ will indicate that you will need to create an default constructor

Thus when creating an field in the Animal class we need to create an full constructor as an requirement 
Animal class 
Dog class

Animal class has the field and the full constructor
Dog class calls the constructor and additional field can be added and they will need to be included inside the where the constructor
below the super code of the constructor you need to apply the this.field = param codes for your additional fields

inside the constructor we can remove params that are obvious like brain and body because all animals has 1 brain and 1 body
also inside the super we also need to remove the words brain and body with just 1 so it would look like 
super(name,1,1,size,weight); ///Animal fields 


-------------super-----------
super class lives inisde the constructor of the class that the class is exteding from so dog class
super calls the constructor from the animal class thats why inside super there is all fields of the animal class



-------------override----------------------------

when creating a new override method it is used from another method created in a different calss like Animal class
The override method is created inside the Dog.java class


----------------------------------------------------------------------------Reference vs Object vs Instance vs Class-----------------------------------------

Class = a class is basically a blueprint for a house, using the blueprint(plans) we can build as many houses as we like based pn those plans. 

Object and Instance = each house you build (in other words instantiate using the new operator) is an object also known as an instance 

Reference = each house you build has an address(a physical location). In other words if you want to tell someone where you live, you give them your address(prehaps written on a piece of paper)

You can copy that Reference as many times as yuu like but there is still just one house, in other words we are copying the paper that has address on it not the house itself.

We can pass references as parameters to constructors and methods 

---------------------------------------------------------------example----------------------------

public class Main{
	public static void main(String[] args){
		// creates an instance/object of the House class, remember the house is a blue print and we are assigning it to the blue house variable, 
		// in other words its an reference to the object in memory, blue house is the variable we're creating a new instance of the house class and assigning it the color blue
		House blueHouse = new House("blue");

		// this creates another reference to the same object in memory, now we got 2 references pointing to the same object in memory, still one house but now with 2 references and one object 
		// In other words we got 2 pieces of paper with the physical address of where the house is built, written down.
		House anotherHouse = blueHouse;

		// 2 references to the same object(House) thus they print out the same result
		System.out.println(blueHouse.getColor()); //prints blue
		System.out.println(anotherHouse.getColor()); //blue

		anotherHouse.setColor("red"); //calling the method set color and setting the color to yellow 

		// like before the 2 references are pointing to the same object 
		System.out.println(blueHouse.getColor()); //red
		System.out.println(anotherHouse.getColor()); // red

		// now we have 3 references blueHouse, anotherHouse, greenHouse
		House greenHouse = new House("green"); //creating a new instance(object) of the House class ,
		 // greenHouse points now to a different object in memory vs blueH and anotherH point to the same object in memory 

		// assigning greenHouse to anotherHouse, we are dereferencing anotherHouse and now it will point to a different object in memory 
		// previously it was pointing to a house that had the red color but now it is pointing that is got the green color 
		anotherHouse = greenHouse;
		// now we still have 3 references and 2 objects in memory but blue house points to one object while anotherHouse and greenHouse point in the same object memory 

		System.out.println(blueHouse.getColor()); //red 
		System.out.println(greenHouse.getColor()); //green
		System.out.println(anotherHouse.getColo()); //green 

	}
}
---

summary=
House = Object
bH & aH & gH= References

House1(bH = "blue")
H1 aH = H1 bH
bH >>"blue" & aH >>"blue"

H1 aH.setColor("red")
bcuz H1 aH = H1 bH >> now aH = "red" & bH = "red"

House2(gH = "green")
H2 aH = H2 gH 

H1(bH) = "red"
H2(gH,aH) = "green"

--

class House{
	private String color;

	public House(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
}