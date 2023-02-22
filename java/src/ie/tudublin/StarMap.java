package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;



public class Star
{

	Table table;

	void setup() {

  		table = new Table();
  
  		table.addColumn("number", Table.INT);
  		table.addColumn("mass", Table.FLOAT);
  		table.addColumn("name", Table.STRING);
  
  		TableRow row = table.addRow();
  		row.setInt("number", 8);
 		row.setFloat("mass", 15.9994);
  		row.setString("name", "Oxygen");
  
  		println(row.getInt("number"));   // Prints 8
  		println(row.getFloat("mass"));   // Prints 15.9994
  		println(row.getString("name"));  // Prints "Oxygen"
	}

	void loadStars()
	{
		Table table = loadTable("HabHYG15ly.csv", "header");
		for(TableRow r:table.rows())
		{
			Star s = new Star(r);
			stars.add(s);
		}
	}

}


public class StarMap extends PApplet
{
	public void settings()
	{
		size(800, 800);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		
		smooth();
		


	}


	public void drawGrid()
	{
		stroke(255);
		float border = 50.0f;

		int count = 10;
		float gap = (width - (border * 2.0f)) / (float) count;
		for(int i = -5 ; i <= 5 ; i ++)
		{
			float x = border + (gap * (i + 5));
			line(x, border, x, height - border);
			line(border, x, width - border, x);
		}
		
	}
		
	public void draw()
	{	
		strokeWeight(2);		

		drawGrid();
	}
}
