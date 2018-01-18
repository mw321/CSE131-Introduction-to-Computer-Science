package imagetransforms;

import java.awt.Color;

import sedgewick.Picture;


public class Transforms {

	/**
	 * This one is solved for you.
	 * @param source
	 * @param target
	 */
	public static void flipHoriz(Picture source, Picture target) { 
		for (int x = 0; x < source.width(); x++) {
			for (int y = 0; y < source.height(); y++) {
				//
				// Convince yourself that otherX is the x coordinate flipped,
				//     on the other side of the image by doing the following:
				// Check that this is true when x == 0
				//      then otherX = source.width() - 1
				//      which is indeed the rightmost pixel
				// Check that this is true when x == source.width()-1
				//      then otherX = 0
				//      which is indeed the leftmost pixel
				//
				int otherX = source.width() - 1 - x;  // otherX is the mirror of x
				Color c = source.get(otherX, y);      // get the Color at the mirror point of the source
				target.set(x, y, c);                  // and set it at x,y in the target
			}
		}
	}
	/**
	 * flip the source picture vertically to form the target picture
	 * @param source
	 * @param target
	 */
	public static void flipVert(Picture source, Picture target) {
		for (int x = 0; x < source.width(); x++) {
			for (int y = 0; y < source.height(); y++) {
				int otherY = source.height() - 1 - y;
				Color c = source.get(x, otherY);
				target.set(x, y, c);
			}
		}
	}
	/**
	 * flip horizontally the left half of the source picture to form the target picture
	 * @param source
	 * @param target
	 */
	public static void flipHorizLeftHalf(Picture source, Picture target) {
		for (int x = 0; x < source.width(); x++) {
			for (int y = 0; y < source.height(); y++) {
				int otherX;
				if (x > source.width() / 2) {
					otherX = source.width() - 1 - x;
				}
				else {
					otherX = x;
				}
				Color c = source.get(otherX, y);
				target.set(x, y, c);
			}
		}
	}
	
	/**
	 * flip vertically the bottom half of the source picture to form the target pic
	 * @param source
	 * @param target
	 */
	public static void flipVertBotHalf(Picture source, Picture target) {
		for (int x = 0; x < source.width(); x++) {
			for (int y = 0; y < source.height(); y++){
				int otherY;
				if (y > source.height() / 2) {
					otherY = source.height() - 1 - y;
				}
				else {
					otherY = y;
				}
				Color c = source.get(x, otherY);
				target.set(x, y, c);
			}
		}
	}
	/**
	 * form the color gradient of the picture
	 * @param target
	 */
	public static void gradient(Picture target) {
		double amountRed = 0;
		for (int x = 0; x < target.width(); x++) {
			amountRed += 255.0 / target.width();
			double amountGreen = 0;
			for (int y = 0; y < target.height(); y++) {
				amountGreen += 255.0 / target.height();
				target.set(x, y, new Color((int) amountRed, (int)amountGreen, 128));
			}
		}
	}

	
	// Beginning of another extension
	public static void edgeDetect(Picture source, Picture target) {
		// FIXME
	}

	public static void digitalFilter(Picture source, Picture target) {
		// FIXME	
	}



}
