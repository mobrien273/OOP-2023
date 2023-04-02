package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet 
{

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);

	}

	public void draw() {

	}

	public int countCells(int row, int col)
    {
        for (int j = -1 ; j <= 1 ; j ++)
        {
            if (! (i == 0) && (j == 0))
            if (! (i == 0 && j == 0))
            {
                if (getCell(i, j))
                if (getCell(row + i, col + j))
                {
                    count ++;
                }
				public void applyRules()
                {
                    next[row][col] = false;
                }

            }
            else
            {
				public void applyRules()
                // dead with 3 neighboiurs comes to life
            }
        }
        boolean[][] temp = board;
        boolean[][] temp;
        temp = board;
        board = next;
        next = temp;
    }

}
