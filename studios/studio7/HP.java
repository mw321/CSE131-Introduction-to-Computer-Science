package studio7;

public class HP {
	/**
	 * instance variables
	 */
	private String name;
	private int jnum, goals, assists, points, games;
	private boolean lHanded, rHanded, lShoot, rShoot;
	/**
	 * getters and setters
	 * @return
	 */
	public int getJnum() {
		return this.jnum;
	}
	public void setJnum(int jnum) {
		this.jnum = jnum;
	}
	public String getName() {
		return this.name;
	}
	public int getGoals() {
		return this.goals;
	}
	public int getAssists() {
		return this.assists;
	}
	public int getPoints() {
		return this.points;
	}
	public int getGames() {
		return this.games;
	}
	public boolean islHanded() {
		return this.lHanded;
	}
	public boolean isrHanded() {
		return this.rHanded;
	}
	public boolean islShoot() {
		return this.lShoot;
	}
	public boolean isrShoot() {
		return this.rShoot;
	}
	/**
	 * constructor
	 * @param name
	 * @param jnum
	 * @param lHanded
	 * @param rHanded
	 * @param lShoot
	 * @param rShoot
	 */
	public HP(String name, int jnum, boolean lHanded, boolean rHanded, boolean lShoot, boolean rShoot) {
		this.name = name;
		this.jnum = jnum;
		this.lHanded = lHanded;
		this.rHanded = rHanded;
		this.lShoot = lShoot;
		this.rShoot = rShoot;
	}
	/**
	 * record the statistics after a game has played
	 * @param goals
	 * @param assists
	 */
	public void game(int goals, int assists) {
		this.goals += goals;
		this.assists += assists;
		this.points += goals + assists;
		this.games += 1;
	}
}
