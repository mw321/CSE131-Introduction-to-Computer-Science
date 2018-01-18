package lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import lab9.implementations.HonestFeedback;
import lab9.providers.ProvidesFeedback;
import lab9.providers.ReceivesHistory;

/**
 * History has a list of Guesses
 *    A Guess is accepted into the history if
 *    there is still room -- if the number of
 *    allowable attempts would not been exceeded
 *    by accepting the Guess.
 *    Also we accept the Guess only if it is novel
 *    and does not already appear in the history.
 * @author roncytron
 *
 */
public class History {

	final private GameProperties        gp;
	final private List<Guess>           history;
	final private List<ReceivesHistory> observers;
	final private Map<Guess,ArrayList<Integer>> feedbackHis;
	final private Stack<Guess> lastGuess;

	public List<Guess> getHistory() {
		return history;
	}

	public Map<Guess, ArrayList<Integer>> getFeedbackHis() {
		return feedbackHis;
	}

	/**
	 * Maintain and broadcast the history of the game in play
	 * @param gp
	 */
	public History(GameProperties gp) {
		this.gp = gp;
		this.history   = new ArrayList<Guess>(gp.getMaxNumGuesses());
		this.observers = new LinkedList<ReceivesHistory>();	
		this.feedbackHis = new HashMap<>();
		this.lastGuess = new Stack<>();
	}

	public Stack<Guess> getLastGuess() {
		return lastGuess;
	}

	public void registerFeedback(Guess g, int i, int j) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(i); 
		a.add(j);
		feedbackHis.put(g, a);
		lastGuess.push(g);
	}
	
	/**
	 * Accept the specified guess only if
	 *     The guess has not been previously submitted
	 *     Accepting the guess would not exceed the game's allowed number of guesses
	 *     
	 * Also notify all observers that the guess has been accepted
	 * 
	 * @param g the Guess to be submitted
	 * @return true iff the Guess is accepted
	 */
	public boolean registerGuess(Guess g) {
		//I commented out these conditions because I want to see how many guesses my smart guesser would take even though they might exceed 12
		//if (history.size() >= gp.getMaxNumGuesses())
		//	return false;
		if (history.contains(g))
			return false;

		history.add(g);
		
		//
		// Notify all observers of the change
		//
		for (ReceivesHistory observer : observers) {
			observer.sendHistory(this);
		}
		return true;
	}
	
	/**
	 * Add the specified observer to the notifications list
	 * @param rh
	 */
	public void addObserver(ReceivesHistory rh) {
		this.observers.add(rh);
	}
	
	/**
	 * How many entries are in the history?
	 * @return the number of entries in the history
	 */
	public int size() {
		return history.size();
	}

	/**
	 * Return a particular element of the history
	 * @param where the index of the entry to be returned
	 * @return the Guess at the specified index
	 */
	public Guess getHistoryAt(int where) {
		return history.get(where);
	}
	
}