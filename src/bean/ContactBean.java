package bean;

import java.io.Serializable;

public class ContactBean implements Serializable {

	private String name;
	private String company;
	private String mail;
	private String kansou;
	private String[] mailmagazine;
	private String documentrequest;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getKansou() {
		return kansou;
	}
	public void setKansou(String kansou) {
		this.kansou = kansou;
	}
	public String[] getMailmagazine() {
		return mailmagazine;
	}
	public void setMailmagazine(String[] mailmagazine) {
		this.mailmagazine = mailmagazine;
	}
	public String getDocumentrequest() {
		return documentrequest;
	}
	public void setDocumentrequest(String documentrequest) {
		this.documentrequest = documentrequest;
	}

}