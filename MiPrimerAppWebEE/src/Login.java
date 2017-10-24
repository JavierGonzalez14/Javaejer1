public class Login {

	String correo;
	String password;
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Login(){
		
	}
	public boolean verificarPassword(String password){
		if(this.password.equals(password)){
			return true;
		}
		else
			return false;
	}
}