package br.com.transferr.core.responses;

public class ResponseLocation {
	private Long id;
	private String  name = "";
	private String  urlMainPicture = "";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrlMainPicture() {
		return urlMainPicture;
	}
	public void setUrlMainPicture(String urlMainPicture) {
		this.urlMainPicture = urlMainPicture;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
