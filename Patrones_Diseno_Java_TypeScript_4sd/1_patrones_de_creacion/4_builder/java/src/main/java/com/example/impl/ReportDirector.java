package com.example.impl;

import com.example.api.ReportBuilder;

public class ReportDirector {

	private ReportBuilder builder;

	public ReportDirector(ReportBuilder builder) {
		this.builder = builder;
	}

	public void build() {
		builder.buildHeader("Report Header");
		builder.buildBody("Report Body");
		builder.buildFooter("Report Footer");
	}

}
