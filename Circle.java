
public class Circle {
	
	double radius;
	//no arg constructor
	Circle(){
		this.radius = 1;
		
	}
	//Construct a Circle Object
	Circle(double newRadius){
		radius = newRadius;
	}
	//Return the area of this Circle
	double getArea() {
		return radius*radius*Math.PI;
	}
	//Retrun the perimeter of this circle
	double getPerimeter() {
		return 2*radius*Math.PI;
		
	}
	
	//set new radius for this circle
	void setRadius(double newRadius) {
		radius = newRadius;
	}

}
