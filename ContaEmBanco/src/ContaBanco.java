
public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public void estadoAtual(){
		System.out.println("#####################################");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");

	}

	public void fecharConta() {
		if (this.getSaldo() == 0) {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		} else {
			System.out.println("Você não pode fechar uma conta se o saldo não estiver em 0!");
		}

	}

	public void depositar(float v) {
		if (this.getStatus() == true) {
			this.setSaldo(getSaldo() + v);
			System.out.println("Depósito realizado com sucesso na conta de: " + this.getDono());
		} else {
			System.out.println("Não é Possível depositar!");
		}

	}

	public void sacar(float v) {
		if (this.getStatus() == true) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado com sucesso na conta de: " + this.getDono());
			} else {
				System.out.println("Você não tem saldo suficiente");
			}
		} else {
			System.out.println("Não é posivel sacar!");
		}

	}

	public void pagarMensal() {
		float v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus() == true) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso!");
			} else {
				System.out.println("Saldo inuficiente!");
			}
		} else {
			System.out.println("Impossivel Pagar!");
		}

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
