package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How much history?");
		// keep a history of where the mouse has been
		double[] hisX = new double[N];
		double[] hisY = new double[N];
		int current = 0;
		while (true) {
			StdDraw.clear();
			// Render one frame of your animation below here
			StdDraw.setPenColor(Color.blue);
			// current is where the current values go
			hisX[current] = StdDraw.mouseX();
			hisY[current] = StdDraw.mouseY();
			current += 1;
			// reset to 0 if we have used up the whole array
			if (current >= hisX.length) {
				current = 0;
			}
			int oldest = current;
			StdDraw.filledCircle(hisX[oldest], hisY[oldest], 0.01);
			// End of your frame
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(10);
		}
	}
}