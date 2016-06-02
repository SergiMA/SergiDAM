import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testNova_lletra() {
		String paraula[] = {"hola"};
		boolean trobada = false;
		char nova = 'o'; 				// Lletra introduïda per l'usuari
		
		for(int i=0; i<paraula.length; i++)
		{
			if(paraula[i] == nova);
			{
				trobada = true;
			}
		}
		
			assertTrue(true, trobada);
		
		
	}

}
