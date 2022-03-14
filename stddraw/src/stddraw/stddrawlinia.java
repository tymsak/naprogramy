package stddraw;

public class stddrawlinia {
	
	public static void main (String[] args) {
		StdDraw.show();

		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDraw.RED);

		StdDraw.line(0.9, 0.9, 0.8, 0.8);
		StdDraw.line(0.9, 0.9,0.5,0.5);
	}
}
