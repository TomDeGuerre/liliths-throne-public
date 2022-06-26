package com.lilithsthrone.game.dialogue.utils;

import javax.script.ScriptEngine;

/**
 * @since 0.4.4.1
 * @version 0.4.4.1
 * @author Tom de Guerre
 */
public abstract class AbstractParserEngineWrapper {
	
	ScriptEngine engine;
	
	public AbstractParserEngineWrapper() {}
	
	public abstract void put(String key, Object value);
	
	public abstract Object get(String key);
	
	public abstract Object eval(String command);
}
