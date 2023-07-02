
package org.example;
/**
 * @author Miguel
 *
 */
public class Passageiro
{
	private Local paragemDoPassageiro;
	private int id;
	/**
	 * @param paragemDoPassageiro
	 */
	public Passageiro(Local paragemDoPassageiro, int id) {
		this.paragemDoPassageiro = paragemDoPassageiro;
		this.id=id;
	}
	/**
	 * @return the paragemDoPassageiro
	 */
	public Local getParagemDoPassageiro() {
		return paragemDoPassageiro;
	}
	/**
	 * @param paragemDoPassageiro the paragemDoPassageiro to set
	 */
	public void setParagemDoPassageiro(Local paragemDoPassageiro) {
		this.paragemDoPassageiro = paragemDoPassageiro;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Passageiro{" + " id=" + id + '}';
	}
}
