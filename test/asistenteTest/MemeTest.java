package asistenteTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import asistente.Asistente;

public class MemeTest {

	public final static String USUARIO = "delucas";

	Asistente jenkins;

	@Before
	public void setup() {
		jenkins = new Asistente("jenkins");
	}

	@Test
	public void meme() {
		Assert.assertEquals("memes/takemymoney.jpg", jenkins.escuchar("@jenkins TAKE MY MONEY"));
		Assert.assertEquals("memes/itsatrap.jpg" ,jenkins.escuchar("@jenkins meme its a trap"));
		Assert.assertEquals("memes/higuain.jpg" ,jenkins.escuchar("@jenkins quiero ver el meme de higuaín"));
		Assert.assertEquals("memes/facultad.jpg" ,jenkins.escuchar("@jenkins mostrame un meme sobre la facultad para reirme un rato"));
	}

	@Test
	public void memeConRutaInexistente() {
	Assert.assertEquals("Disculpa... no entiendo el pedido, @delucas ¿podrías repetirlo?", jenkins.escuchar("@jenkins cocina"));
	}
}
