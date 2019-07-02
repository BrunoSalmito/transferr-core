package br.com.transferr.core.responses;

import br.com.transferr.core.util.HelperJSON;

public class ResponseContactUs {
	
	private String name;
	private String email;
	private String phone;
	private String message;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public static void main(String[] args) {
		ResponseContactUs contactUs = new ResponseContactUs();
		contactUs.setEmail("marcodacasco@gmail.com");
		contactUs.setMessage("Mensagem");
		contactUs.setName("Marcos da casco");
		contactUs.setPhone("8548984849849");
		System.out.println(HelperJSON.toJSON(contactUs));
	}
}
