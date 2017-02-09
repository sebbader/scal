package net.fekepp.ldfu.server.mediatype;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import jersey.repackaged.com.google.common.collect.Sets;

public class Notation3FormatGroup implements FormatGroup {

	private static String NAME = "Notation3";

	private static Format DEFAULT_FORMAT = Notation3Format.getInstance();

	private static Set<Format> FORMATS = Sets.newHashSet(DEFAULT_FORMAT);

	private static class InstanceHolder {
		static final Notation3FormatGroup INSTANCE = new Notation3FormatGroup();
	}

	private Notation3FormatGroup() {
	}

	public static Notation3FormatGroup getInstance() {
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
		return contentTypesMap;
	}

	@Override
	public Map<String, Format> getFileExtensionsMap() {
		Map<String, Format> fileExtensionsMap = new HashMap<String, Format>();
		for (Format format : FORMATS) {
			for (String fileExtensions : format.getFileExtensions()) {
				fileExtensionsMap.put(fileExtensions, format);
			}
		}
		return fileExtensionsMap;
	}

}