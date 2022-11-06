package cso.loja.virtual.enums;

public enum StatusContaPagar {

	COBRANCA("Pagar"), 	
	VENCIDA("Vencida"), 
	QUITADA("Quitada"), 
	ABERTA("Aberta"),
	NEGOCIADA("Renegociada");

	private String descricao;

	private StatusContaPagar(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.descricao;
	}

}
