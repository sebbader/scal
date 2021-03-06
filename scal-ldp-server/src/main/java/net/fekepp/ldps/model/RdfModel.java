package net.fekepp.ldps.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import jersey.repackaged.com.google.common.collect.Sets;
import net.fekepp.ldps.Format;
import net.fekepp.ldps.FormatConverter;
import net.fekepp.ldps.Model;
import net.fekepp.ldps.ModelConverter;
import net.fekepp.ldps.converter.RdfConverter;
import net.fekepp.ldps.format.NtriplesFormat;
import net.fekepp.ldps.format.RdfXmlFormat;
import net.fekepp.ldps.format.TurtleFormat;

public class RdfModel implements Model {

	private static String NAME = "RDF";

	private static Format DEFAULT_FORMAT = TurtleFormat.getInstance();

	private static Set<Format> FORMATS = Sets.newHashSet(DEFAULT_FORMAT, NtriplesFormat.getInstance(),
			RdfXmlFormat.getInstance());

	private static class InstanceHolder {
		static final RdfModel INSTANCE = new RdfModel();
	}

	private RdfModel() {
	}

	public static RdfModel getInstance() {
		return InstanceHolder.INSTANCE;
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public Format getDefaultFormat() {
		return DEFAULT_FORMAT;
	}

	@Override
	public Set<Format> getFormats() {
		return Collections.unmodifiableSet(FORMATS);
	}

	@Override
	public Map<String, Format> getMediaTypesMap() {
		Map<String, Format> contentTypesMap = new HashMap<String, Format>();
		for (Format format : FORMATS) {
			for (String mediaType : format.getMediaTypes()) {
				contentTypesMap.put(mediaType, format);
			}
		}
		return Collections.unmodifiableMap(contentTypesMap);
	}

	@Override
	public Map<String, Format> getFileExtensionsMap() {
		Map<String, Format> fileExtensionsMap = new HashMap<String, Format>();
		for (Format format : FORMATS) {
			for (String fileExtensions : format.getFileExtensions()) {
				fileExtensionsMap.put(fileExtensions, format);
			}
		}
		return Collections.unmodifiableMap(fileExtensionsMap);
	}

	@Override
	public ModelConverter buildModelConverter(Model sinkFormatGroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FormatConverter buildFormatConverter(Format sourceFormat, Format sinkFormat) {
		if (FORMATS.contains(sourceFormat) && FORMATS.contains(sinkFormat)) {
			return new RdfConverter(sourceFormat, sinkFormat);
		}
		// TODO Add support for conversion between format groups
		return null;
	}
}