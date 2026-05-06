package com.amanda.cursojava.aula24;

/*Por que usei extends Mamifero
 * Significa que: Cavalo É UM Mamifero > Ou seja, Cavalo herda tudo que existe em Mamifero.
 * 
 * 2. Por que usei implements AnimalDomesticado
 * implements AnimalDomesticado > Porque AnimalDomesticado é uma interface.
 * Interface funciona como um “contrato”.
 * 
 * */
public class Cavalo  extends Mamifero implements AnimalDomesticado{

	public Cavalo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String emitirSom() {
        return "Relinchando!";
    }

    @Override
    public String amamentar() {
        return "Cavalo amamentando.";
    }

    @Override
    public void alimentar() {
        System.out.println("Cavalo sendo alimentado.");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Levando cavalo ao veterinário.");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Chamando veterinário para o cavalo.");
    }

}
