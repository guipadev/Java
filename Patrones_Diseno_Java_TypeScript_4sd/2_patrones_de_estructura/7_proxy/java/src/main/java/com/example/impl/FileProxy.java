package com.example.impl;

import com.example.api.File;

public class FileProxy implements File {

	private RealFile realFile;
	private String filename;

	public FileProxy(String filename) {
		this.filename = filename;
	}

	@Override
	public void download() {
		if (realFile == null) {
			realFile = new RealFile(filename);
		}
		
		realFile.download();
	}

}
