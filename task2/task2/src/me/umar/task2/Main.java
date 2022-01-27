package me.umar.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static File file1; //cyrcle
	private static File file2; //points
	
	private static ArrayList<Point>points = new ArrayList<>();
	
	public static void main(String... args) throws IOException {
		file1 = new File(args[0]);
		file2 = new File(args[1]);
		
		Cyrcle cyrcle = new Cyrcle(file1);
		downloadPoints(file2);
		for (Point p: points) {
			float distance = p.getDistanceToCentre(cyrcle.getCentre());
			int res = -1;
			if (distance==cyrcle.getRadius()) {res=0;}
			if (distance<cyrcle.getRadius()) {res=1;}
			if (distance>cyrcle.getRadius()) {res=2;}
			System.out.println(res);
		}
	}
	
	private static void downloadPoints(File file) throws IOException {
		points = new ArrayList<>();
		InputStream is = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		while ((line = br.readLine())!=null) {
			int sep = line.indexOf(32);
			Float x = Float.parseFloat(line.substring(0, sep));
			Float y = Float.parseFloat(line.substring(sep+1));
			points.add(new Point(x, y));
		}
		br.close();
	}
	
}
