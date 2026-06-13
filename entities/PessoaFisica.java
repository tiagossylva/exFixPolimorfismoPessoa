package entities;

public class PessoaFisica extends Pessoa{
	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double totalTaxes() {
		double imposto = 0;
		if( rendaAnual <= 20000.00) {
			imposto = (rendaAnual * 0.15) - (gastosSaude * 0.50);
		}
		else {
				imposto = (rendaAnual * 0.25) - (gastosSaude * 0.50);
		}
		return imposto;
	}


	@Override
	public String toString() {
		return name + ": " +  String.format(" $ %.2f", totalTaxes());
	}
	

}
