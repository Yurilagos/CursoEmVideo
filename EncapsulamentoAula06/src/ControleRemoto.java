
public class ControleRemoto implements Controlador {
	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// Métodos especiais

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;

	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		setLigado(true);

	}

	@Override
	public void desligar() {
		this.setLigado(false);
		this.setTocando(false);

	}

	@Override
	public void abrirMenu() {
		System.out.println("======== MENU ========");
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está tocando? " + this.isTocando());
		System.out.print("Volume: " + this.getVolume()+ " ");
		for (int i = 0; i < this.getVolume(); i += 10) {
			System.out.print("|");
		}
		System.out.println("");

	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu.");

	}

	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 10);
		} else {
			System.out.println("Não é possivel aumentar Volume com o aparelho desligado.");
		}

	}

	@Override
	public void menosVOlume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 10);
		} else {
			System.out.println("Não é Possivel aumentar VOlume com o aparelho desligado.");
		}

	}
	
	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0); 
			System.out.println("MUDO LIGADO.");
		}
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0 ){
			this.setVolume(50);			
			System.out.println("MUDO DESLIGADO.");
		}

	}

	@Override
	public void play() {
		if(this.isLigado() && !(this.isTocando())){
			this.setTocando(true);
		}

	}

	@Override
	public void pause() {
		if(this.isLigado() && this.isTocando()){
			this.setTocando(false);
		}

	}

}
