import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {
	
	public static void main(String[] args) {
		try {
			Screen screen = new Screen();
			Pattern pattern = new Pattern("/img/Lingo.PNG");
			screen.type("d", KeyModifier.WIN);
			screen.wait(pattern, 2000);
			screen.doubleClick();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
