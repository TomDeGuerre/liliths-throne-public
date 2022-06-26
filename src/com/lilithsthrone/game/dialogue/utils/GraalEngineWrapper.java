package com.lilithsthrone.game.dialogue.utils;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.HostAccess;
import org.graalvm.polyglot.Value;

/**
 * @since 0.4.4.1
 * @version 0.4.4.1
 * @author Tom de Guerre
 */
public class GraalEngineWrapper extends AbstractParserEngineWrapper {
	
	Context context;
	Value jsBindings;
	
	public GraalEngineWrapper() {
		context = Context.newBuilder("js").allowHostAccess(HostAccess.ALL).allowHostClassLookup(className -> true).build();
		jsBindings = context.getBindings("js");
	}
	
	public void put(String key, Object value) {
		jsBindings.putMember(key, value);
	}
	
	public Object get(String key) {
		return jsBindings.getMember(key).as(Object.class);
	}
	
	public Object eval(String command) {
		return context.eval("js", command).as(Object.class);
	}
}
