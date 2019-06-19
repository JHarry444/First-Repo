package paint;

import java.util.Arrays;
import java.util.List;

public class PaintWizard {

	private List<Paint> paints;

	public PaintWizard(Paint... paints) {
		this.paints = Arrays.asList(paints);
	}

	public void leastWaste(int roomSize) {
		Paint minPaint = null;
		int minWaste = Integer.MAX_VALUE;
		for (Paint p : this.paints) {
			int _waste = p.calcWaste(roomSize);
			if (_waste < minWaste) {
				minPaint = p;
				minWaste = _waste;
			}
		}
		System.out.println(
				"The most efficient paint was " + minPaint.getName() + ", it wasted " + minWaste + "msq of paint.");
	}

	public Paint cheapest(int roomSize) {

	}

}
