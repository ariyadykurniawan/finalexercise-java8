package finalexercise.ariyady;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testFoundWord() throws Exception {
		List<String> answer = new ArrayList<>();
		
		answer.add("aba-aba (t.a.) aba-aba");
		answer.add("abab (t.a.) hawa mulut, hawa yang keluar dari mulut");
		answer.add("abang (t.s.) merah");
		answer.add("abar (t.k.) menguap (zat cair)");
		assertEquals(Main.foundWord("aba"),answer);
    }
	
	@Test
	public void testAddWord() throws Exception{
		String outputFile = "kamus-jawa.txt";
		String inputString = "wedus";
		String inputString2 = "kambing";
		Main.addWord(inputString, inputString2);
		
		assertNotNull(Paths.get(outputFile));
	}
	
}
