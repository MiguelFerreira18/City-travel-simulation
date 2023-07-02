/**
 * 
 */
package org.example;

import java.util.Arrays;
import java.util.concurrent.BlockingQueue;

/**
 * @author Miguel
 *
 */
public class Autocarro extends Veiculo implements Runnable {

	
	public Autocarro(BlockingQueue<Passageiro> queue,int limite)
	{
		super(queue,limite);
		setLimite(30);
	}

	@Override
	public void run() 
	{
		while(true)
		{
			try {
				int i =0;
				while (i != getLimite()) {
					queuePass[i]=queue.take();
					i++;
				}
				setnPassageiros(getLimite());
				for (Passageiro p : queuePass) {
					System.out.println(Arrays.toString(queuePass) + "autocarro");
					System.out.println(Thread.currentThread().getName()+" o passageiro-" + p.getId() + " irá parar em " + p.getParagemDoPassageiro().getLocal());

					System.out.println("o autocarro irá ficar parado durante: " + p.getParagemDoPassageiro().getTempo());

					Thread.sleep(p.getParagemDoPassageiro().getTempo()+1 * 1000);
				}
				System.out.println(queue);
				System.out.println("acabaram as paragens de volta ao inicio");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
