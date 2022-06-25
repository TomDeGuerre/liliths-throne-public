package com.lilithsthrone.game.dialogue.utils;

import java.util.List;

import com.lilithsthrone.game.character.GameCharacter;

/**
 * @since 0.4.4.1
 * @version 0.4.4.1
 * @author Tom de Guerre
 */
public class SpecificParserTarget extends AbstractParserTarget {
	
	private String description;
	private GameCharacter target;
	private boolean deferDescription = true;
	
	public SpecificParserTarget(List<String> tags, String description) {
		super(tags, description);
	}
	
	public SpecificParserTarget(List<String> tags, String description, GameCharacter target) {
		super(tags, description);
		this.target = target;
	}
	
	public SpecificParserTarget(List<String> tags, String description, GameCharacter target, boolean deferDesc) {
		super(tags, description);
		this.target = target;
		this.deferDescription = deferDesc;
	}
	
	public String getDescription() {
		if (description == null && deferDescription) return target.getDescription();
		return description;
	}
	
	public GameCharacter getCharacter(String tag, List<GameCharacter> specialNPCList) {
		return this.target;
	}
}
