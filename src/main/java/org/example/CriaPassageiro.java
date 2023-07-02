
package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * @author Miguel
 */
public class CriaPassageiro implements Runnable {
    private static int id;
    private BlockingQueue<Passageiro> queue;

    public CriaPassageiro(BlockingQueue<Passageiro> queue) {
        this.queue = queue;
        id = 0;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                String[] locais = {"Aeroporto porto", " Aliados", "Alto de Pega", " Ara�jo", "�rvore", "Azurara", "Baguim", "Bolh�o", "Botica", "Brito Capelo", "C�mara de Gaia", "C�mara de Matosinhos", " Campainha", "Campanh�"};
                Random r = new Random();
                int tempo = (1 + r.nextInt(5) * 1000);
                String local = locais[r.nextInt(locais.length)];
                Local l = new Local(tempo, local);
                Passageiro p = new Passageiro(l, id);
                queue.put(p);
                id++;
                //System.out.println("Nome da thread: "+ Thread.currentThread().getName() +" passageiro-" + p.getId() + " vai para -" + p.getParagemDoPassageiro().getLocal() + " e vai ficar parado por- " + p.getParagemDoPassageiro().getTempo()/1000+" seg");
                //System.out.println(queue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
