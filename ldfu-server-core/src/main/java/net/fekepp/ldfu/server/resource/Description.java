package net.fekepp.ldfu.server.resource;

import java.net.URI;

import net.fekepp.ldfu.server.data.Format;

public interface Description {

	public URI getBaseUri();

	public String getIdentifier();

	public Format getFormat();

}