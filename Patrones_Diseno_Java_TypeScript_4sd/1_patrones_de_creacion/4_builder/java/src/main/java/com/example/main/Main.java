package com.example.main;

import com.example.api.ReportBuilder;
import com.example.impl.ConcreteReportBuilder;
import com.example.impl.Report;
import com.example.impl.ReportDirector;

public class Main {

	public static void main(String[] args) {
		ReportBuilder builder = new ConcreteReportBuilder();

		ReportDirector director = new ReportDirector(builder);

		director.build();
		Report report = builder.getResult();

		System.out.println(report.getResult());
	}

}
