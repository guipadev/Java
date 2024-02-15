package com.example.impl;

import com.example.api.ReportBuilder;

public class ConcreteReportBuilder implements ReportBuilder {

	private Report report = new Report();

	public void buildHeader(String header) {
		report.setHeader(header);
	}

	public void buildBody(String body) {
		report.setBody(body);
	}

	public void buildFooter(String footer) {
		report.setFooter(footer);
	}

	public Report getResult() {
		return report;
	}

}
