package testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Comparators;

public class TestMethodsAndSolutions implements Comparator<String> {

	public static void main(String[] args) {
		scrollHorizontally();
	}

	public static boolean isSorted(List<String> listOfStrings) {
		return Comparators.isInOrder(listOfStrings, Comparator.<String>naturalOrder());
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	static void scrollHorizontally()
	{
		try {
			Robot robot = new Robot();
			int offsetX = 900;
			int source_x = 700;
			int source_y = 290;
			int target_x = 1000;

			robot.mouseMove(source_x, source_y);
			robot.delay(2000);
			robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
			robot.mouseWheel(target_x);
			/*for(int i = 1; i<=offsetX; i++)
			{
				robot.mouseMove(1, 0);
				robot.delay(500);
			}*/
			for (int i = 0; i < 100; i++) {
				int mov_x = ((target_x * i) / 100) + (source_x * (100 - i) / 100);
				robot.mouseMove(mov_x, source_y);
				robot.delay(50);
			}
			robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		} catch (AWTException e) {
			System.out.println("Could not complete this action");
			e.printStackTrace();
		}
	}
}
