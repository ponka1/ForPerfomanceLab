package me.umar.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Cyrcle {
	private Point centre;
	private float radius;
	private File file1;
	
	public Cyrcle(File file1) {
		this.file1 = file1;
		try {readfromfile();} catch (IOException e) {e.printStackTrace();}
	}
	
	public void readfromfile() throws IOException {
		InputStream is = new FileInputStream(file1);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line = br.readLine();
		int sep = line.indexOf(32);
		Float x = Float.parseFloat(line.substring(0, sep));
		Float y = Float.parseFloat(line.substring(sep+1));
		centre = new Point(x, y);
		line = br.readLine();
		radius = Float.parseFloat(line);
		br.close();
	}
	
	public Point getCentre() {
		return this.centre;
	}
	public float getRadius() {
		return this.radius;
	}
}
