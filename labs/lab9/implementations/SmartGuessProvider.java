package lab9.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lab9.GameProperties;
import lab9.Guess;
import lab9.History;
import lab9.providers.ProvidesGuess;


public class SmartGuessProvider implements ProvidesGuess {
	/**
	 * instance variables
	 */
	private int colorTries = 0;
	private int n = 0;
	private Set<Integer> colorSet;
	private History history;
	final private int numPegs;
	private Map<Integer, Set<Integer>> map;
	public SmartGuessProvider(GameProperties gp) {
		colorSet = new HashSet<>();
		this.numPegs = gp.getNumHoles();
		map = new HashMap<>();
	}
	/**
	 * helper method to get the number of intersection of last guess
	 * @return
	 */
	public int getSameColor() {
		return history.getFeedbackHis().get(history.getLastGuess().peek()).get(1);
	}
	/**
	 * helper method to find the guess history
	 * @return
	 */
	public Set<Integer> guessHistoryColor() {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < history.getLastGuess().peek().size(); i++) {
			set.add(history.getLastGuess().peek().getChoice(i));
		}
		return set;
	}
	/**
	 * method to receive history
	 */
	@Override
	public Guess getGuess(History history) {
		this.history = history;
		return getGuess();
	}
	/**
	 * main method to figure out the guess
	 */
	@Override
	public Guess getGuess() {
		if (colorSet.size() < 4) {
			return findColor();
		} else {
			return guessPosition();
		}
	}
	//first figure out the 4 correct colors
	/**
	 * this method is able to figure out which four are the correct colors although not written in a very clever way
	 * @return a guess to find color
	 */
	public Guess findColor() {
		Guess guess;
		if (colorTries == 0) {
			guess = new Guess(new int[]{0,0,1,1});
			colorTries++; n++;
			return guess;
		} else {
			int i = getSameColor();
			Set<Integer> set = guessHistoryColor();
			if (i == 0) {
				for (int j = 0; j < 6; j++) {
					if (!set.contains(j)) colorSet.add(j);
				}
				return getGuess();
			}
			if (i == 2) {
				colorSet.addAll(set);
				if (colorSet.size() < 4 && colorTries == 1) {
					guess = new Guess(new int[] {2,2,3,3});
					colorTries++; n++;
					return guess;
				} else if (colorSet.size() < 4 && colorTries > 1) {
					guess = new Guess(new int[] {3,3,4,4});
					colorTries++; n++;
					return guess;
				} else if (colorSet.size() > 4){
					return getGuess();
				}
			}
			if (i == 1) {
				if (colorTries == 1) {
					guess = new Guess(new int[] {0,0,2,2});
					colorTries++; n++;
					return guess;
				} else if (colorTries == 2 && colorSet.size() < 2) {
					guess = new Guess(new int[] {1,1,2,2});
					colorTries++; n++;
					return guess;
				} else if (colorTries == 2 && colorSet.size() == 2) {
					guess = new Guess(new int[] {2,2,4,4});
					colorTries++; n++;
					return guess;
				} else if (colorTries == 3) {					
					guess = new Guess(new int[] {3,3,4,4});
					colorTries++; n++;
					if (history.getLastGuess().peek().equals(guess)) {n--;
					return getGuess(); 
					}
					return guess;
				} else if (colorTries == 4) {					
					guess = new Guess(new int[] {3,3,5,5});
					colorTries++;n++;
					return guess;
				} else if (colorTries == 5) {
					guess = new Guess(new int[] {4,4,5,5});
					colorTries++; n++;
					return guess;
				}
			}
		}
		return getGuess();
	}
	//randomly guess the positions
	//and my method ends up using about 20 guesses.
	/**
	 * 
	 * @return a guess to find correct positions
	 */
		public Guess guessPosition() {
			List<Integer> list = new ArrayList<>();
			for (Integer i : colorSet) {
				list.add(i);
			}
			Guess g;
			//eliminate repeated guesses
			while (true) {
				Collections.shuffle(list);
				int[]a = toArray(list);
				g = new Guess(a);
				if (!history.getHistory().contains(g)) {
					break;
				}
			}
			return g;
		}

	/**
	 * to array method
	 * @param list
	 * @return array
	 */
	private int[] toArray(List<Integer> list) {
		int[] ans = new int[this.numPegs];
		for (int i = 0; i < this.numPegs; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}
//  below are unsuccessful attempts to eliminate the number of possible guesses
//	public Guess guessPosition() {
//		List<List<Integer>> list = position();
//		Guess g;
//		while (true) {
//			List<Integer> result = list.get((int)Math.random() * list.size());
//			int[]a = toArray(result);
//			g = new Guess(a);
//			if (!history.getHistory().contains(g)) {
//				break;
//			}
//		}
//		return g;
//	}
//	public List<List<Integer>> position() {
//		int[]nums = new int[4]; int j = 0;
//		for (int i : colorSet) {
//			nums[j] = i; j++;
//		} 
//		List<List<Integer>> result = permute(nums);
//		for (int k = history.size() - 1; k < -1; k--) {
//			Guess g = history.getHistoryAt(k);
//			int[]b = g.getGuess();
//			for (j = 0; j < result.size(); j++) {
//				List<Integer> list = result.get(j);
//				for (int n = 0; n < 4; n++) {
//					if (history.getFeedbackHis().get(g).get(0) == 0) {
//						if(b[n] == list.get(n)){
//							result.remove(list);
//						}
//					}
//				}
//			}
//		}
//		return result;
//	}
//
//	I learnt this algorithm from a leetcode question
//
//	public List<List<Integer>> permute(int[] nums) {
//		List<Integer> numList = new ArrayList<Integer>();
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length; i++){
//			numList.add(nums[i]);
//		}
//		return permute(new ArrayList<Integer>(), numList);
//	}
//	public List<List<Integer>> permute(List<Integer> cur, List<Integer> num){
//		List<List<Integer>> results = new ArrayList<>();
//		if (num.size() == 0){
//			results.add(cur);
//			return results;
//		}
//		for (int i = 0; i < num.size(); i++){
//			ArrayList<Integer> newCur = new ArrayList<Integer>(cur);
//			newCur.add(num.get(i));
//			ArrayList<Integer> newNum = new ArrayList<Integer>(num);
//			newNum.remove(i);
//			results.addAll(permute(newCur, newNum));
//		}
//		return results;
//	}
}
