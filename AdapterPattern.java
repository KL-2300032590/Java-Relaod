	package LLM;
	//Legacy interface
	interface Shape {
	int calculateArea();
	}
	
	//Legacy class with incompatible interface
	class Square implements Shape {
			private int sideLength;
			
			public Square(int sideLength) {
			 this.sideLength = sideLength;
			}
			
			@Override
			public int calculateArea() {
			 return sideLength * sideLength;
			}
	}
	
	//Target interface expected by new code
	interface AreaCalculator {
	    double computeArea();
	}
	
	//Adapter class (Object Adapter approach)
	class SquareAdapter implements AreaCalculator {
			private Square square;
			
			public SquareAdapter(Square square) {
			 this.square = square;
			}
			
			@Override
			public double computeArea() {
			 return square.calculateArea(); // Delegate to legacy method
			}
	}
	
	
	public class AdapterPattern  {
			public static void main(String[] args) {
			 Square square = new Square(5);
			 AreaCalculator adapter = new SquareAdapter(square);
			 double area = adapter.computeArea();
			 System.out.println("Area of square: " + area);
			}
	}
	
