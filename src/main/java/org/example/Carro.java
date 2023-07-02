package org.example;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;

/**
 * @author Miguel
 *
 */
public class Carro extends Veiculo implements Runnable {


	public Carro(BlockingQueue<Passageiro> queue,int limite) {
		super(queue,limite);
		setLimite(4);
	}

	@Override
	public void run()
	{
		while(true)
		{
			try {
				int i =0;
				while(i != getLimite()) {

					queuePass[i]=queue.take();
					//queuePass.put(queue.take());
					i++;
				}
				setnPassageiros(getLimite());
				for (Passageiro p : queuePass) {
					System.out.println(Arrays.toString(queuePass)+" carro");
					System.out.println(Thread.currentThread().getName()+" o passageiro-" + p.getId() + " irá parar em " + p.getParagemDoPassageiro().getLocal());
					System.out.println("o carro irá ficar parado durante: " + p.getParagemDoPassageiro().getTempo());
					Thread.sleep(p.getParagemDoPassageiro().getTempo());
				}
				System.out.println("acabaram as paragens de volta ao inicio");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
