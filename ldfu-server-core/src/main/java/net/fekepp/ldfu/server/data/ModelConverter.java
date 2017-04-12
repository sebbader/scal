package net.fekepp.ldfu.server.data;

public interface ModelConverter {

	public void convert();

	public Model getSourceFormatGroup();

	public Model getSinkFormatGroup();

}