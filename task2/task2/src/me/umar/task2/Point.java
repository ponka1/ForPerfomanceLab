package me.umar.task2;

public class Point {
	float x;
	float y;
	
	Point(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	public float getY() {
		return this.y;
	}
	
	public float getDistanceToCentre(Point center) {
		float distance = (float) Math.sqrt(Math.pow(this.x - center.getX(), 2)+Math.pow(this.y - center.getY(), 2));
		return distance;
	}
}
