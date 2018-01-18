package lab4;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numBall = ap.nextInt("How many balls will be simulated?");
		int numIteration = ap.nextInt("How many iterations for the simulation?");
		int pause = ap.nextInt("Pause time:");
		StdDraw.setXscale(-1.25, 1.25);
		StdDraw.setYscale(-1.25, 1.25);
		// setting initial locations, velocities and radius of balls
		int sign = 1;
		double ballLocation[][] = new double[numBall][2];
		double ballVelocity [][] = new double[numBall][2];
		double ballRadius[] = new double[numBall];
		for (int i = 0; i < numBall; i++) {
			for (int j = 0; j < 2; j++) {
				ballLocation[i][j] = Math.random() * 2 - 1;
				if (Math.random() > 0.5) {
					sign = -1;
				}
				ballVelocity[i][j] = sign * 0.01 * (Math.random() + 1);
				ballRadius[i] = 0.05;
			}
		}
		//iterate the specified number of times, each time recomputing each balls' location
		for (int n = 0; n < numIteration; n++) {
			// bounce off wall according to law of elastic collision
			for (int i = 0; i < numBall; i++) {
				for (int j = 0; j < 2; j++) {
					if (Math.abs(ballLocation[i][j] + ballVelocity[i][j]) > 1.25 - ballRadius[i]) {
						ballVelocity[i][j] *= -1;
					}
					//update positions
					ballLocation[i][j] += ballVelocity[i][j];
				}
			}
			double dist = 0;
			// collision between balls
			for (int i = 0; i < numBall; i++) {
				for (int k = 0; i + k + 1 < numBall; k++) {
					dist = Math.sqrt(Math.pow(ballLocation[i][0] - ballLocation[i + k + 1][0], 2) + Math.pow(ballLocation[i][1] - ballLocation[i + k + 1][1], 2));
					for (int j = 0; j < 2; j++) {
						if (dist <= 0.25) {
							ballVelocity[i][j] *= -1;
							ballVelocity[i + k + 1][j] *= -1;
						}
						ballLocation[i][j] += ballVelocity[i][j];
						ballLocation[i + k + 1][j] += ballVelocity[i + k + 1 ][j];
					}
				}
			}
			StdDraw.clear();
			for (int i = 0; i < numBall; i++) {
				StdDraw.picture(ballLocation[i][0], ballLocation[i][1], "images/smileyface.gif");
			}
			// display and pause for 20 ms
			StdDraw.show(pause); 
		}
	}
}