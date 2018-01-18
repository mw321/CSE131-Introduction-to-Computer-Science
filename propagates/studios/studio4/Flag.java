package studio4;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {


	public static void main(String[] args) throws FileNotFoundException  {
		
		//
		//  Add code for your studio below here.
		//
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.05);
		StdDraw.line(0, 0, 0, 1);
		StdDraw.line(0, 0, 1, 0);
		StdDraw.line(1, 0, 1, 1);
		StdDraw.line(1, 1, 0, 1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.25, 0.5, 0.25);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.75 , 0.5, 0.25);
		StdDraw.setPenColor(Color.YELLOW);
		double [] x= {0, 0.5, 0};
		double [] y= {0, 0.5, 1};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.circle(0.5, 0.5, 0.15);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.05);
		StdDraw.text(0.1, 0.95, "Lymbodia");
		StdDraw.pause(1000);
		StdDraw.text(0.3, 0.75, "Lymbodia");
		StdDraw.pause(1000);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.text(0.5, 0.5, "Lymbodia");
		StdDraw.pause(1000);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(0.7, 0.3, "Lymbodia");
		StdDraw.pause(1000);
		StdDraw.text(0.9, 0.1, "Lymbodia");
	
			System.setIn(new FileInputStream("music/StairwayToHeaven.txt"));

			// repeat as long as there are more integers to read in
			
			while (!StdIn.isEmpty()) {

				// read in the pitch, where 0 = Concert A (A4)
				int pitch = StdIn.readInt();

				// read in duration in seconds
				double duration = StdIn.readDouble();

				// build sine wave with desired frequency
				double hz = 440 * Math.pow(2, pitch / 12.0);
				int N = (int) (StdAudio.SAMPLE_RATE * duration);
				double[] a = new double[N+1];
				for (int i = 0; i <= N; i++) {
					a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
				}

				// play it using standard audio
				StdAudio.play(a);
			}
			}

	
	}







