package classSamples.polymorphism.SearchingAndSorting;

public class Sports implements Comparable<Sports>{
	private final  String name;
	private final int players;
	
	public Sports(String name, int players) {
		this.name = name;
		this.players = players;
	}
	
	@Override
	public int compareTo(Sports other) {
		return this.name.compareTo(other.getName());
	}

	public boolean equals(Object other) {
		return this.name.equals(((Sports) other).getName());
		
	}
	
	public String getName() {
		return this.name;
	}

	public int getPlayers() {
		return players;
	}
	
	public String toString() {
		return this.name + " " + this.players + "\n";
	}
	
	public static void main(String[] args) {
		Sports[] extremeSports = new Sports[3];
		extremeSports[0] = new Sports("bungee jumping", 1);
		extremeSports[1] = new Sports("ziplinging", 1);
		extremeSports[2] = new Sports("skydiving", 2);
		
		Sorting<Sports> sorts = new Sorting<Sports>();
		sorts.selectionSort(extremeSports);

		for (Sports sport : extremeSports)
			System.out.println(sport);
	}

}
