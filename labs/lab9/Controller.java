package lab9;

import lab9.implementations.ConsolePrintingHistoryReceiver;
import lab9.implementations.HonestFeedback;
import lab9.providers.ProvidesFeedback;
import lab9.providers.ProvidesGuess;

public class Controller {

	private final GameProperties game;
	private final ProvidesGuess codeMaker, codeBreaker;
	private final History history;
	
	public Controller(GameProperties g, ProvidesGuess codeMaker, ProvidesGuess codeBreaker) {
		this.game        = g;
		this.codeMaker   = codeMaker;
		this.codeBreaker = codeBreaker;
		this.history     = new History(game);
	}
	
	public void run() {
		ConsolePrintingHistoryReceiver console = new ConsolePrintingHistoryReceiver(game.getName());
		console.message(" ");
		console.message("Game starts");
		history.addObserver(console);
		boolean won = false;
		boolean okMove = true;
		do {
			Guess code  = codeMaker.getGuess();
			Guess guess = codeBreaker.getGuess(this.history);
			
			ProvidesFeedback pf = new HonestFeedback(code);
			
			okMove = history.registerGuess(guess);
			
//			console.output(code);
//			console.message(" number exactly right position " + pf.numSamePosition(guess));
//			console.message(" number of pegs in common color " + pf.numIntersection(guess));

//			above were in the video, but this will put the information out on one line:

			history.registerFeedback(guess, pf.numSamePosition(guess), pf.numIntersection(guess));
			if (pf.isSolution(guess)) {
				//I change the message to display the number of guesses used
				console.message("Winner!" + " Number of guesses: " + history.getHistory().size());
				won = true;
			}
			if (!okMove) {
				console.message("You lose!" + " Number of guesses: " + history.getHistory().size());
				break;
			}		
			console.output(code, pf.numSamePosition(guess), pf.numIntersection(guess));
			//method provide the smart guess provider the guess history
		} while (okMove && !won);
		console.message("Game ends");
		console.message(" ");

	}
	
	public History getHistory() {
		return this.history;
	}
	
	public GameProperties getGameProperties() {
		return this.game;
	}
	
}