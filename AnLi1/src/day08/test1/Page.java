package day08.test1;

import org.jsoup.nodes.Document;



public class Page {
	private Document document;
	private String downPage;
	private boolean idDownPage;
	public void set(Document document, String downPage, boolean idDownPage) {
		this.document = document;
		this.downPage = downPage;
		this.idDownPage = idDownPage;
	}
	@Override
	public String toString() {
		return "Page [document=" + document + ", downPage=" + downPage
				+ ", idDownPage=" + idDownPage + "]";
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public String getDownPage() {
		return downPage;
	}
	public void setDownPage(String downPage) {
		this.downPage = downPage;
	}
	public boolean getIdDownPage() {
		return idDownPage;
	}
	public void setIdDownPage(boolean idDownPage) {
		this.idDownPage = idDownPage;
	}
	
}
