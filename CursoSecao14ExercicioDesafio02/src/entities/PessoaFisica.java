package entities;

public class PessoaFisica extends Pessoa{

	private double gastoComSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public Double imposto() {
		
		double impostoPago;
		
		if(rendaAnual < 20000.0) {
			impostoPago = rendaAnual * 0.15 - gastoComSaude * 0.5;
		}else {
			impostoPago = rendaAnual * 0.25 - gastoComSaude * 0.5;
		}
		
		return impostoPago;
	}

}

