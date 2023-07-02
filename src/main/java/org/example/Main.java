
package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Miguel
 *
 */
public class Main {

BlockingQueue<Passageiro> queue =new LinkedBlockingQueue<>();
public Main() 
{
	CriaPassageiro cp = new CriaPassageiro(queue);
	Carro c =new Carro(queue,4);
	Autocarro a = new Autocarro(queue,30);
	Metro m = new Metro(queue,60);

	Thread criaPass = new Thread(cp);
	Thread usaCarro = new Thread(c);
	Thread usaAutocarro = new Thread(a);
	Thread usaMetro = new Thread(m);
	criaPass.start();
	usaCarro.start();
	usaAutocarro.start();
	usaMetro.start();

}

	public static void main(String[] args)
	{
		new Main();
	}

	
	
	
	
	
	

}
