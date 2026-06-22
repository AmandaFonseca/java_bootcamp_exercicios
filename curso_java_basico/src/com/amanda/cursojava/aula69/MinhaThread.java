package com.amanda.cursoJava.aula69;

public class MinhaThread implements Runnable {

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;
        this.foiTerminada = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada.");

        try {
            int i = 0;
            // Só continua rodando se não foi terminada
            while (!foiTerminada) {
                System.out.println(this.nome + " contador: " + i++);
                Thread.sleep(300);

                // Jeito certo de SUSPENDER (Pausar)
                synchronized (this) {
                    while (estaSuspensa) {
                        wait(); // Dorme com segurança liberando o lock!
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(this.nome + " foi interrompida.");
        }
        
        System.out.println(this.nome + " finalizada com segurança.");
    }

    // Substitui o antigo 'suspend()'
    public synchronized void pausar() {
        this.estaSuspensa = true;
        System.out.println(">> Linha de produção PAUSADA para " + this.nome);
    }

    // Substitui o antigo 'resume()'
    public synchronized void retomar() {
        this.estaSuspensa = false;
        notify(); // Acorda a thread com segurança
        System.out.println(">> Linha de produção RETOMADA para " + this.nome);
    }

    // Substitui o antigo 'stop()'
    public synchronized void parar() {
        this.foiTerminada = true;
        this.estaSuspensa = false; // Garante que ela saia do wait se estiver pausada
        notify();
        System.out.println(">> Linha de produção DESLIGADA para " + this.nome);
    }
}