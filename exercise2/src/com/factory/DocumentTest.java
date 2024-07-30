package com.factory;

public class DocumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory word = new WordDocumentFactory();
		Document w = word.createDocument();
		w.open();
		w.close();

		DocumentFactory pdf = new PdfDocumentFactory();
		Document p = pdf.createDocument();
		p.open();
		p.close();

		DocumentFactory excel = new ExcelDocumentFactory();
		Document e = excel.createDocument();
		e.open();
		e.close();
	}

}
