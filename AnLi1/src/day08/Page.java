package day08;

import org.jsoup.nodes.Document;

public class Page {
	private Document document;
	private String pageUpUrl;
	private boolean ispageUpUrl;
	public Page(Document document, String pageUpUrl, boolean ispageUpUrl) {
		super();
		this.document = document;
		this.pageUpUrl = pageUpUrl;
		this.ispageUpUrl = ispageUpUrl;
	}
	public Page() {
		super();
	}
	@Override
	public String toString() {
		return "Page [document=" + document + ", pageUpUrl=" + pageUpUrl
				+ ", ispageUpUrl=" + ispageUpUrl + "]";
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public String getPageUpUrl() {
		return pageUpUrl;
	}
	public void setPageUpUrl(String pageUpUrl) {
		this.pageUpUrl = pageUpUrl;
	}
	public boolean isIspageUpUrl() {
		return ispageUpUrl;
	}
	public void setIspageUpUrl(boolean ispageUpUrl) {
		this.ispageUpUrl = ispageUpUrl;
	}
	
}
