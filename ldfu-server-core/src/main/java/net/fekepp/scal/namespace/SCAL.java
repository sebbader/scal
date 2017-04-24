package net.fekepp.scal.namespace;

import org.semanticweb.yars.nx.Resource;

public final class SCAL {

	// SCAL

	public static final String NS = "http://scal#";

	// Run

	public static final Resource Run = new Resource(NS + "Run");

	public static final Resource program = new Resource(NS + "program");

	public static final Resource query = new Resource(NS + "query");

	public static final Resource resource = new Resource(NS + "resource");

	public static final Resource trigger = new Resource(NS + "trigger");

	// Program

	public static final Resource Program = new Resource(NS + "Program");

	// Query

	public static final Resource Query = new Resource(NS + "Query");

	// Resource

	public static final Resource Resource = new Resource(NS + "Resource");

	public static final Resource FileResource = new Resource(NS + "FileResource");

	public static final Resource HttpResource = new Resource(NS + "HttpResource");

	public static final Resource FtpResource = new Resource(NS + "FtpResource");

	public static final Resource SshResource = new Resource(NS + "SshResource");

	// Trigger

	public static final Resource Trigger = new Resource(NS + "Trigger");

	public static final Resource EventTrigger = new Resource(NS + "EventTrigger");

	public static final Resource TimeTrigger = new Resource(NS + "TimeTrigger");

	public static final Resource ResourceRequestedTrigger = new Resource(NS + "ResourceRequestedTrigger");

	public static final Resource ResourceChangedTrigger = new Resource(NS + "ResourceChangedTrigger");

	public static final Resource FrequencyTrigger = new Resource(NS + "FrequencyTrigger");

	public static final Resource DelayTrigger = new Resource(NS + "DelayTrigger");

	// Cross-concept

	public static final Resource declaration = new Resource(NS + "declaration");

	public static final Resource sink = new Resource(NS + "sink");

	public static final Resource state = new Resource(NS + "state");

}