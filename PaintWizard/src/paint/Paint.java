package paint;

public class Paint {

	private String name;

	private int volume;

	private float price;

	private int coverage;

	private int maxCoverage;

	public Paint(String name, int volume, float price, int coverage) {
		super();
		this.name = name;
		this.volume = volume;
		this.price = price;
		this.coverage = coverage;
		this.maxCoverage = volume + coverage;
	}

	public int calcWaste(int roomSize) {
		int tins = 1;
		while (roomSize > maxCoverage) {
			roomSize -= maxCoverage;
			tins++;
		}
		return maxCoverage - roomSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

}
