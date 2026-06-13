package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	

	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	@Override
	public Double totalTaxes() {
		double imposto = 0;
		if( numeroFuncionarios <= 10) {
			imposto = rendaAnual * 0.16;
		}
		else {
				imposto = rendaAnual * 0.14;
		}
		return imposto;
	}

	@Override
	public String toString() {
		return super.name + ": " +  String.format(" $ %.2f", totalTaxes());
	}
	

}
