package exercises4;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while (! StdDraw.mousePressed()) {
			StdDraw.pause(1000);
		}
		// here, the mouse has been pressed
		System.out.println("Mouse has been pressed.");
		while (StdDraw.mousePressed()) {
			StdDraw.pause(1000);
		}
		// here the mouse is released
		System.out.println("Mouse has been released.");

		// draw a point at the spot where the mouse was released
		StdDraw.setPenRadius(0.03);
		StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());

		// here, a q has been typed (Waits until the user has typed a q (all other keys are ignored))
		char typed = ' ';
		while(typed != 'q') {
			while (!StdDraw.hasNextKeyTyped()) {
				StdDraw.pause(1000);
			}
			typed = StdDraw.nextKeyTyped();
		}
		StdDraw.text(0.5, 0.5, "Farewell!");

	}

}
