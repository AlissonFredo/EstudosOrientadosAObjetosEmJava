package entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer numeroDeFuncionario;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionario) {
		super(nome, rendaAnual);
		this.numeroDeFuncionario = numeroDeFuncionario;
	}
	
	public Integer getNumeroDeFuncionario() {
		return numeroDeFuncionario;
	}

	public void setNumeroDeFuncionario(Integer numeroDeFuncionario) {
		this.numeroDeFuncionario = numeroDeFuncionario;
	}

	@Override
	public Double imposto() {
		
		double impostoPago;
		
		if(numeroDeFuncionario <= 10) {
			impostoPago = rendaAnual * 0.16;
		}else {
			impostoPago = rendaAnual * 0.14;
		}
		
		return impostoPago;
	}

}
