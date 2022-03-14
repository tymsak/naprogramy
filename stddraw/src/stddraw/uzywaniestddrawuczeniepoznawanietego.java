package stddraw;

import java.util.Random;

public class uzywaniestddrawuczeniepoznawanietego {
	public static void main (String[] args) {
		Random rnd = new Random();
		int r, g, b;
		StdDraw.setPenRadius(0.1);
		for (int i
				=
				0
				;
				i
				<
				40
				;
				i++){
		r = rnd.nextInt(256);
		g = rnd.nextInt(256);
		b = rnd.nextInt(256);
		StdDraw.setPenColor(r, g, b);
		StdDraw.point(Math.random(), Math.random());
	
}
}
}