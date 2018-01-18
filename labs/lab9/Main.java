	package lab9;

import cse131.ArgsProcessor;
import lab9.implementations.RandomColorProvider;
import lab9.implementations.RandomGuessProvider;
import lab9.implementations.SmartGuessProvider;
import lab9.implementations.StaticGuessProvider;
import lab9.providers.ProvidesColor;
import lab9.providers.ProvidesGuess;
import lab9.viz.ColorChooser;

public class Main {

	public static void main(String[] args) {
		
//		ArgsProcessor ap = new ArgsProcessor(args);
		
		//My own version using the smart guess provider
		GameProperties game = new GameProperties("Smart guesses");
		
		ProvidesGuess puzzle = new StaticGuessProvider(game);
		
		ProvidesGuess smartSolver = new SmartGuessProvider(game);
		
		Controller solving = new Controller(game, puzzle, smartSolver);
		
		solving.run();
		
//		ap.nextString("Press enter to continue");
//		
//		//
//		// Always wins -- code maker and breaker are the same
//		//
//		GameProperties gameWins = new GameProperties("Always wins");
//
//		ProvidesGuess codeMaker = new StaticGuessProvider(gameWins);
//		
//		Controller cwins = new Controller(gameWins, codeMaker, codeMaker);
//		cwins.run();
//		
//		ap.nextString("Press enter to continue");
//		
//		//
//		// likely not to win, but should stop on the first repeated guess
//		//
//		
//		GameProperties gameAlwaysSameGuess = new GameProperties("Always same guess");
//		//
//		// A new static guesser for the code breaker
//		//
//		ProvidesGuess likelyDifferent = new StaticGuessProvider(gameAlwaysSameGuess);
//		//
//		// reuse the code maker from above, but now use the new static code breaker
//		//
//		Controller cprobnowin = new Controller(gameAlwaysSameGuess, codeMaker, likelyDifferent);
//		cprobnowin.run();
//		ap.nextString("Press enter to continue");
//		
//		//
//		// Random guessing version, likely not to win
//		//
//		GameProperties randomGame = new GameProperties("Random guesser");
//		ProvidesGuess codeMaker2 = new StaticGuessProvider(randomGame);
//		ProvidesGuess randCodeBreaker = new RandomGuessProvider(randomGame);
//		Controller rcontroller = new Controller(randomGame, codeMaker2, randCodeBreaker);
//		rcontroller.run();
//		ap.nextString("Press enter to continue");
				
//		
//		//
//		// Interactive version
//		//
//		
//		GameProperties interactive = new GameProperties("Interactive");
//		ProvidesGuess codeMaker3 = new StaticGuessProvider(interactive);
//		//
//		// interactive breaker needs color provider
//		//
//		ProvidesColor pc      = new RandomColorProvider(interactive);
//		ProvidesGuess interactiveBreaker = ColorChooser.launchChooser(interactive, pc);
//		Controller c = new Controller(interactive, codeMaker3, interactiveBreaker);
//		c.run();
//		ap.nextString("Press enter to continue");

	}

}
