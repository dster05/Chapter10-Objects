
import java.util.*;
public class Triangle extends GeometricObject{
	
	double side1;
	double side2;
	double side3;
	
	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	

	public double getSide1() {
		return this.side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea(){
		double x,y,z;
		x = this.side1;
		y = this.side2;
		z = this.side3;
		double area, base, height;
		if(x == y && y == z) {// equalateral triangle
			area = Math.sqrt(3.0)/4 * Math.pow(x, 2);
			return area;
		}
		else if(x >= y && x >=z) {//makes x the base
			base = x/2;
			height = Math.sqrt(Math.pow(y,2) + Math.pow(base, 2));
			area = (2*base)*height;
			return area;
		}
		
		else if(y > x && y > z) {//makes y the base
			base = y/2;
			height= Math.sqrt(Math.pow(x,2) + Math.pow(base, 2));
			area = (2*base)*height;
			return area;
			
		}
		
		else {//makes z the base
			base =  z/2;
			height = Math.sqrt(Math.pow(y,2) + Math.pow(base, 2));
			area = (2*base)*height;
			return area;
		}
			
		
	
	}
	
	public double getPerimeter() {
		double x = this.side1;
		double y = this.side2;
		double z = this.side3;
		double perimeter;
		perimeter = x + y + z;
		
		return perimeter;
	}
	
	public String toString() {
		
		return "Triangle ; side1= " +this.side1+" side 2 "+ this.side2+" side3 "+ this.side3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double side1, side2, side3;
		String color;
		boolean flag = false;
		int w;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter side 1: ");
		side1 = input.nextDouble();
		System.out.println("Please enter side 2: ");
		side2 = input.nextDouble();
		System.out.println("Please enter side 3: ");
		side3 = input.nextDouble();
		System.out.println("Please enter a color: ");
		color = input.next();
		System.out.println("Please enter 1 for true  or  0 for false to state if filled:" );
		w = input.nextInt();
		if(w ==1)
			flag = true;
		
		GeometricObject triangle = new Triangle(side1, side2, side3);
		
		triangle.setColor(color);
		triangle.setFilled(flag);
		
		System.out.println("The area is: " + ((Triangle) triangle).getArea() +", The perimeter is: " +((Triangle) triangle).getPerimeter() + ", The color is:  " + triangle.getColor() + ", The Triangel is filled: " + triangle.isFilled());

	}

}
