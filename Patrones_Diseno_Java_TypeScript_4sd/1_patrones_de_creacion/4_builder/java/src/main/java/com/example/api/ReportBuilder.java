package com.example.api;

import com.example.impl.Report;

public interface ReportBuilder {
	
	void buildHeader(String header);

    void buildBody(String body);

    void buildFooter(String footer);

    Report getResult();

}
