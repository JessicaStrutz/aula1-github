package entities;

public class Quarto {

	private String m_sNome;
	private String m_sEmail;
	
	public Quarto(String m_sNome, String m_sEmail) {
		this.m_sNome = m_sNome;
		this.m_sEmail = m_sEmail;
	}
	
	public String getM_sNome() {
		return m_sNome;
	}
	
	public String getM_sEmail() {
		return m_sEmail;
	}

}
