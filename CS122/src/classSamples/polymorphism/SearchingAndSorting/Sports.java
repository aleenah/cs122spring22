package classSamples.polymorphism.SearchingAndSorting;

public class Sports implements Comparable<Sports>{
	private final  String name;
	private final int players;
	
	public Sports(String eName, int numPlayers) {
		name = eName;
		players = numPlayers;
	}
	
	@Override
	public int compareTo(Sports o) {
		int result = 0;
		if (name.equals(o.getName()))
			result = name.compareTo(o.getName());
		return result;
	}

	public boolean equal(Object other) {
		return name.equals(((Sports) other).getName());
		
	}
	
	public String getName() {
		return name;
	}

	public int getPlayers() {
		return players;
	}
	
	public String toString() {
		return name + " " + players + "\n";
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
