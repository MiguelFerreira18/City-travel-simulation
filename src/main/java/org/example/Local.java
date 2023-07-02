
package org.example;
/**
 * @author Miguel
 *
 */
public class Local
{
	private int tempo;
	private String local;
	/**
	 * @param tempo
	 * @param local
	 */
	public Local(int tempo, String local) {
		this.tempo = tempo;
		this.local = local;
	}
	/**
	 * @return the tempo
	 */
	public int getTempo() {
		return tempo;
	}
	/**
	 * @param tempo the tempo to set
	 */
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	/**
	 * @return the local
	 */
	public String getLocal() {
		return local;
	}
	/**
	 * @param local the local to set
	 */
	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Local{" +
				"tempo=" + tempo +
				", local='" + local + '\'' +
				'}';
	}
}
