package com.example.impl;

public class Report {
	private String header;
	private String body;
	private String footer;

	public void setHeader(String header) {
		this.header = header;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getResult() {
		return header + "\n" + body + "\n" + footer;
	}
}
