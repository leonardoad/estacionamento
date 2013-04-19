package classes;

/**
 * Classe para os usuários do sistema
 * 
 * @author Ricardo Lohmann
 *
 */
public class Usuario {

	private String nome;
	private String telefoneResidencial;
	private String telefoneCelular;
	private String endereco;
	private String username;
	private String senha;
	
	/**
	 * Usuário sem telefones
	 * Se precisarmos dos outros valores usaremos os sets
	 * após instanciar um usuário 
	 * 
	 * @param nome
	 * @param username
	 * @param senha
	 */
	public Usuario(String nome, String username, String senha) {
		this.nome = nome;
		this.username = username;
		this.senha = senha;
	}

	/* Gets e Sets */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
