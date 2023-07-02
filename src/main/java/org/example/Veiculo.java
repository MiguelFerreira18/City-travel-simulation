/**
 * 
 */
package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Miguel
 *
 */
public class Veiculo 
{
	private int nPassageiros;
	private int limite;
	//BlockingQueue<Passageiro> queuePass = new ArrayBlockingQueue<Passageiro>(limite);
	protected Passageiro[] queuePass;
	BlockingQueue<Passageiro> queue;
	public Veiculo(BlockingQueue<Passageiro> queue,int limite)
	{
		this.queuePass= new Passageiro[limite];
		this.queue=queue;
		this.nPassageiros=queuePass.length;
	}
	/**
	 * @return the nPassageiros
	 */
	public int getnPassageiros() {
		return nPassageiros;
	}
	/**
	 * @param nPassageiros the nPassageiros to set
	 */
	public void setnPassageiros(int nPassageiros) {
		this.nPassageiros = nPassageiros;
	}
	/**
	 * @return the limite
	 */
	public int getLimite() {
		return limite;
	}
	/**
	 * @param limite the limite to set
	 */
	public void setLimite(int limite) {
		this.limite = limite;
	}

	public Passageiro[] getQueuePass() {
		return queuePass;
	}
	public void setQueuePass(Passageiro[] queuePass) {
		this.queuePass = queuePass;
	}
	/**
	 *
	 * @return
	 */
	public BlockingQueue<Passageiro> getQueue() {
		return queue;
	}

	/**
	 *
	 * @param queue
	 */
	public void setQueue(BlockingQueue<Passageiro> queue) {
		this.queue = queue;
	}
}
