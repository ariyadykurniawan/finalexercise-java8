package finalexercise.ariyady;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testFoundWord() throws IOException{
		List<String> answer = new ArrayList<>();
		
		answer.add("aba-aba (t.a.) aba-aba");
		answer.add("abab (t.a.) hawa mulut, hawa yang keluar dari mulut");
		answer.add("abang (t.s.) merah");
		answer.add("abar (t.k.) menguap (zat cair)");
		assertEquals(Main.foundWord("aba"),answer);
    }
	
}
