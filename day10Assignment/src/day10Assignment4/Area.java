package day10Assignment4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		return 1*(22/7)*radius*radius;
	}

	
	
}
