package com.rewiewsuper;

public class ShapeTest {
	public static void main(String[] args) {
		Shape2D shape1 = new Circle(3, "red");
		double d = shape1.calculateArea();
		System.out.println(d);

		d = shape1.calculatePerimeter();
		System.out.println(d);

		Shape2D shape2 = new Rectangle(2, 3, "blue");

		d = shape2.calculateArea();
		System.out.println(d);
		d = shape2.calculatePerimeter();
		System.out.println(d);

		System.out.println("---Shape array---");
		Shape2D[] shapes = new Shape2D[6];
		shapes[0] = shape1;
		shapes[1] = shape2;
		shapes[2] = new Rectangle(3, 4, "yellow");
		shapes[3] = new Circle(2, "brown");
		shapes[4] = new Rectangle(4, 2, "green");
		shapes[5] = new Square(3, "black");

		double totalArea = 0;
		for (Shape2D shape : shapes) {
			totalArea += shape.calculateArea();
		}
		System.out.println("Total area is " + totalArea);

		double totalPerimeter = 0;
		for (int i = 0; i < shapes.length; i++) {
			Shape2D shape = shapes[i];
			totalPerimeter += shape.calculatePerimeter();
		}
		System.out.println("Total perimeter is " + totalPerimeter);
		
		System.out.println("******************************");
		Shape3D cube1=new Cube(9,"blue");
		Shape3D sphere1=new Sphere(3,"red");
        Shape3D cube2=new Cube(4,"black");
		Shape3D sphere2=new Sphere(5,"green");
         Shape3D[] shape3d=new Shape3D[4];
         shape3d[0]=cube1;
         shape3d[1]=cube2;
         shape3d[2]=sphere1;
         shape3d[3]=sphere2;
         
 		
 		int sumOfPerimeter=0;
 		double sumOfArea=0;
 		double sumOfVolume=0;
 		for (int i = 0; i < shape3d.length; i++) {
 			
 			System.out.println(shape3d[i]+" has the perimeter "+shape3d[i].calculatePerimeter3D());
 			sumOfPerimeter+=shape3d[i].calculatePerimeter3D();
 			System.out.println(shape3d[i]+" has area "+shape3d[i].calculateArea3D());
 			sumOfArea+=shape3d[i].calculateArea3D();
 			System.out.println(shape3d[i]+"has the volume "+shape3d[i].calculateVolume3D());
 			sumOfVolume+=shape3d[i].calculateVolume3D();
 		}
 		
 		System.out.println("total perimeter of of "+sumOfPerimeter);
 		System.out.println("total area of of "+sumOfArea);
 		System.out.println("total volume of of "+sumOfVolume);

	}


}

