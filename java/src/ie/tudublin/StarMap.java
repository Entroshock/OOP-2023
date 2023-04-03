package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import processing.data.*;

public class StarMap extends PApplet {

    ArrayList<Star> stars = new ArrayList<Star>();
    
    public float border;

    void drawGrid()
    {
        stroke(255, 0, 255);
        textAlign(CENTER, CENTER);
        textSize(20);
        for(int i = -5; i <=5; i ++)
        {
            float x = map(i, -5, 5, border, width - border);
            line(x, border, x, height - border);
            line(border, x, width - border, x);
            fill(255);
            text(i, x, border * 0.5f);
            text(i, border * 0.5f, x);
        }
    }

    void printStars()
    {
        for(Star s:stars)
        {
            System.out.println(s);
        }
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

    public void settings() {
        size(800, 800);
    }

    Star first = null;
    Star second = null;



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