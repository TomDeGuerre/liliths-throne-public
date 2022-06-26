package com.lilithsthrone.game.dialogue.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lilithsthrone.game.character.GameCharacter;
import com.lilithsthrone.game.character.npc.NPC;
import com.lilithsthrone.game.character.npc.dominion.Amber;
import com.lilithsthrone.game.character.npc.dominion.Angel;
import com.lilithsthrone.game.character.npc.dominion.Arthur;
import com.lilithsthrone.game.character.npc.dominion.Ashley;
import com.lilithsthrone.game.character.npc.dominion.Brax;
import com.lilithsthrone.game.character.npc.dominion.Bunny;
import com.lilithsthrone.game.character.npc.dominion.Callie;
import com.lilithsthrone.game.character.npc.dominion.CandiReceptionist;
import com.lilithsthrone.game.character.npc.dominion.Daddy;
import com.lilithsthrone.game.character.npc.dominion.Elle;
import com.lilithsthrone.game.character.npc.dominion.Felicia;
import com.lilithsthrone.game.character.npc.dominion.Finch;
import com.lilithsthrone.game.character.npc.dominion.HarpyBimbo;
import com.lilithsthrone.game.character.npc.dominion.HarpyBimboCompanion;
import com.lilithsthrone.game.character.npc.dominion.HarpyDominant;
import com.lilithsthrone.game.character.npc.dominion.HarpyDominantCompanion;
import com.lilithsthrone.game.character.npc.dominion.HarpyNympho;
import com.lilithsthrone.game.character.npc.dominion.HarpyNymphoCompanion;
import com.lilithsthrone.game.character.npc.dominion.Helena;
import com.lilithsthrone.game.character.npc.dominion.Jules;
import com.lilithsthrone.game.character.npc.dominion.Kalahari;
import com.lilithsthrone.game.character.npc.dominion.Kate;
import com.lilithsthrone.game.character.npc.dominion.Kay;
import com.lilithsthrone.game.character.npc.dominion.Kruger;
import com.lilithsthrone.game.character.npc.dominion.Lilaya;
import com.lilithsthrone.game.character.npc.dominion.Loppy;
import com.lilithsthrone.game.character.npc.dominion.Lumi;
import com.lilithsthrone.game.character.npc.dominion.Natalya;
import com.lilithsthrone.game.character.npc.dominion.Nyan;
import com.lilithsthrone.game.character.npc.dominion.NyanMum;
import com.lilithsthrone.game.character.npc.dominion.Pazu;
import com.lilithsthrone.game.character.npc.dominion.Pix;
import com.lilithsthrone.game.character.npc.dominion.Ralph;
import com.lilithsthrone.game.character.npc.dominion.RentalMommy;
import com.lilithsthrone.game.character.npc.dominion.Rose;
import com.lilithsthrone.game.character.npc.dominion.Scarlett;
import com.lilithsthrone.game.character.npc.dominion.Sean;
import com.lilithsthrone.game.character.npc.dominion.SupplierLeader;
import com.lilithsthrone.game.character.npc.dominion.SupplierPartner;
import com.lilithsthrone.game.character.npc.dominion.TestNPC;
import com.lilithsthrone.game.character.npc.dominion.Vanessa;
import com.lilithsthrone.game.character.npc.dominion.Vicky;
import com.lilithsthrone.game.character.npc.dominion.Wes;
import com.lilithsthrone.game.character.npc.dominion.Zaranix;
import com.lilithsthrone.game.character.npc.dominion.ZaranixMaidKatherine;
import com.lilithsthrone.game.character.npc.dominion.ZaranixMaidKelly;
import com.lilithsthrone.game.character.npc.fields.Arion;
import com.lilithsthrone.game.character.npc.fields.Astrapi;
import com.lilithsthrone.game.character.npc.fields.Belle;
import com.lilithsthrone.game.character.npc.fields.Ceridwen;
import com.lilithsthrone.game.character.npc.fields.Dale;
import com.lilithsthrone.game.character.npc.fields.Daphne;
import com.lilithsthrone.game.character.npc.fields.Evelyx;
import com.lilithsthrone.game.character.npc.fields.Fae;
import com.lilithsthrone.game.character.npc.fields.Farah;
import com.lilithsthrone.game.character.npc.fields.Flash;
import com.lilithsthrone.game.character.npc.fields.Hale;
import com.lilithsthrone.game.character.npc.fields.HeadlessHorseman;
import com.lilithsthrone.game.character.npc.fields.Heather;
import com.lilithsthrone.game.character.npc.fields.Imsu;
import com.lilithsthrone.game.character.npc.fields.Jess;
import com.lilithsthrone.game.character.npc.fields.Kazik;
import com.lilithsthrone.game.character.npc.fields.Kheiron;
import com.lilithsthrone.game.character.npc.fields.Minotallys;
import com.lilithsthrone.game.character.npc.fields.Monica;
import com.lilithsthrone.game.character.npc.fields.Moreno;
import com.lilithsthrone.game.character.npc.fields.Nizhoni;
import com.lilithsthrone.game.character.npc.fields.Oglix;
import com.lilithsthrone.game.character.npc.fields.Penelope;
import com.lilithsthrone.game.character.npc.fields.Silvia;
import com.lilithsthrone.game.character.npc.fields.Vronti;
import com.lilithsthrone.game.character.npc.fields.Wynter;
import com.lilithsthrone.game.character.npc.fields.Yui;
import com.lilithsthrone.game.character.npc.fields.Ziva;
import com.lilithsthrone.game.character.npc.misc.GenericAndrogynousNPC;
import com.lilithsthrone.game.character.npc.misc.GenericFemaleNPC;
import com.lilithsthrone.game.character.npc.misc.GenericMaleNPC;
import com.lilithsthrone.game.character.npc.misc.GenericTrader;
import com.lilithsthrone.game.character.npc.misc.PrologueFemale;
import com.lilithsthrone.game.character.npc.misc.PrologueMale;
import com.lilithsthrone.game.character.npc.submission.Axel;
import com.lilithsthrone.game.character.npc.submission.Claire;
import com.lilithsthrone.game.character.npc.submission.DarkSiren;
import com.lilithsthrone.game.character.npc.submission.Elizabeth;
import com.lilithsthrone.game.character.npc.submission.Epona;
import com.lilithsthrone.game.character.npc.submission.FortressAlphaLeader;
import com.lilithsthrone.game.character.npc.submission.FortressFemalesLeader;
import com.lilithsthrone.game.character.npc.submission.FortressMalesLeader;
import com.lilithsthrone.game.character.npc.submission.Lyssieth;
import com.lilithsthrone.game.character.npc.submission.Murk;
import com.lilithsthrone.game.character.npc.submission.Roxy;
import com.lilithsthrone.game.character.npc.submission.Shadow;
import com.lilithsthrone.game.character.npc.submission.Silence;
import com.lilithsthrone.game.character.npc.submission.SlimeGuardFire;
import com.lilithsthrone.game.character.npc.submission.SlimeGuardIce;
import com.lilithsthrone.game.character.npc.submission.SlimeQueen;
import com.lilithsthrone.game.character.npc.submission.SlimeRoyalGuard;
import com.lilithsthrone.game.character.npc.submission.Takahashi;
import com.lilithsthrone.game.character.npc.submission.Vengar;
import com.lilithsthrone.game.dialogue.DialogueNode;
import com.lilithsthrone.main.Main;
import com.lilithsthrone.utils.Util;

/**
 * @since 0.1.69.9
 * @version 0.4.2
 * @author Innoxia
 */
public class ParserTarget {
	
	public static AbstractParserTarget STYLE = new SpecificParserTarget(
			Util.newArrayListOfValues("style", "game", "util"),
			"Returns the same as 'pc', but should be used for style methods such as style.bold or style.italics or conditional methods such as game.isArcaneStorm.",
			Main.game.getPlayer());
	public static AbstractParserTarget UNIT = new SpecificParserTarget(
			Util.newArrayListOfValues("unit", "units", "game"),
			"Returns the same as 'pc', but should be used for unit methods such as unit.size.",
			Main.game.getPlayer());
	public static AbstractParserTarget PC;
	public static AbstractParserTarget NPC;
	public static AbstractParserTarget COMPANION;
	public static AbstractParserTarget NON_COMPANION;
	public static AbstractParserTarget ELEMENTAL;
	public static AbstractParserTarget PROLOGUE_MALE;
	public static AbstractParserTarget PROLOGUE_FEMALE;
	public static AbstractParserTarget NPC_MALE;
	public static AbstractParserTarget NPC_FEMALE;
	public static AbstractParserTarget NPC_ANDROGYNOUS;
	public static AbstractParserTarget NPC_TRADER;
	public static AbstractParserTarget TEST_NPC;
	public static AbstractParserTarget LILAYA;
	public static AbstractParserTarget ROSE;
	public static AbstractParserTarget KATE;
	public static AbstractParserTarget RALPH;
	public static AbstractParserTarget NYAN;	
	public static AbstractParserTarget NYAN_MUM;
	public static AbstractParserTarget VICKY;	
	public static AbstractParserTarget PIX;	
	public static AbstractParserTarget BRAX;	
	public static AbstractParserTarget CANDI;	
	public static AbstractParserTarget VANESSA;	
	public static AbstractParserTarget SCARLETT;	
	public static AbstractParserTarget HELENA;	
	public static AbstractParserTarget HARPY_BIMBO;	
	public static AbstractParserTarget HARPY_BIMBO_COMPANION;	
	public static AbstractParserTarget HARPY_DOMINANT;	
	public static AbstractParserTarget HARPY_DOMINANT_COMPANION;	
	public static AbstractParserTarget HARPY_NYMPHO;	
	public static AbstractParserTarget HARPY_NYMPHO_COMPANION;	
	public static AbstractParserTarget PAZU;	
	public static AbstractParserTarget FINCH;	
	public static AbstractParserTarget ZARANIX;	
	public static AbstractParserTarget AMBER;	
	public static AbstractParserTarget FELICIA;	
	public static AbstractParserTarget ARTHUR;	
	public static AbstractParserTarget KELLY;	
	public static AbstractParserTarget KATHERINE;	
	public static AbstractParserTarget ASHLEY;	
	public static AbstractParserTarget WOLFGANG;	
	public static AbstractParserTarget KARL;	
	public static AbstractParserTarget ANGEL;	
	public static AbstractParserTarget BUNNY;	
	public static AbstractParserTarget LOPPY;	
	public static AbstractParserTarget LUMI;	
	public static AbstractParserTarget CLAIRE;	
	public static AbstractParserTarget SLIME_QUEEN;	
	public static AbstractParserTarget SLIME_GUARD_ICE;	
	public static AbstractParserTarget SLIME_GUARD_FIRE;	
	public static AbstractParserTarget SLIME_ROYAL_GUARD;	
	public static AbstractParserTarget ROXY;	
	public static AbstractParserTarget AXEL;	
	public static AbstractParserTarget EPONA;	
	public static AbstractParserTarget JULES;	
	public static AbstractParserTarget KRUGER;	
	public static AbstractParserTarget KALAHARI;
	public static AbstractParserTarget RENTAL_MOMMY;	
	public static AbstractParserTarget DADDY;
	
	// Submission:	
	public static AbstractParserTarget IMP_FORTRESS_ALPHA_LEADER;	
	public static AbstractParserTarget IMP_FORTRESS_FEMALES_LEADER;	
	public static AbstractParserTarget IMP_FORTRESS_MALES_LEADER;	
	public static AbstractParserTarget DARK_SIREN;	
	public static AbstractParserTarget CITADEL_ARCANIST;	
	public static AbstractParserTarget LYSSIETH;	
	public static AbstractParserTarget ELIZABETH;	
	public static AbstractParserTarget VENGAR;	
	public static AbstractParserTarget SHADOW;	
	public static AbstractParserTarget SILENCE;	
	public static AbstractParserTarget MURK;	
	public static AbstractParserTarget SEAN;	
	public static AbstractParserTarget NATALYA;	
	public static AbstractParserTarget WES;	
	public static AbstractParserTarget ELLE;	
	public static AbstractParserTarget KAY;	
	public static AbstractParserTarget FLASH;	
	public static AbstractParserTarget JESS;	
	public static AbstractParserTarget ASTRAPI;	
	public static AbstractParserTarget VRONTI;	
	public static AbstractParserTarget ARION;	
	public static AbstractParserTarget MINOTALLYS;	
	public static AbstractParserTarget FAE;	
	public static AbstractParserTarget SILVIA;	
	public static AbstractParserTarget KHEIRON;	
	public static AbstractParserTarget KAZIK;	
	public static AbstractParserTarget YUI;	
	public static AbstractParserTarget NIZHONI;	
	public static AbstractParserTarget MORENO;	
	public static AbstractParserTarget HEATHER;	
	public static AbstractParserTarget ZIVA;	
	public static AbstractParserTarget MONICA;
	public static AbstractParserTarget EVELYX;
	public static AbstractParserTarget DALE;
	public static AbstractParserTarget HEADLESS_HORSEMAN;
	public static AbstractParserTarget CERIDWEN;
	public static AbstractParserTarget IMSU;
	public static AbstractParserTarget HALE;
	public static AbstractParserTarget PENELOPE;
	public static AbstractParserTarget BELLE;
	public static AbstractParserTarget DAPHNE;
	public static AbstractParserTarget FARAH;
	public static AbstractParserTarget CALLIE;
	public static AbstractParserTarget WYNTER;
	public static AbstractParserTarget OGLIX;
	
	public static void initializeTargets() {
		/*STYLE = new SpecificParserTarget(
				Util.newArrayListOfValues("style", "game", "util"),
				"Returns the same as 'pc', but should be used for style methods such as style.bold or style.italics or conditional methods such as game.isArcaneStorm.",
				Main.game.getPlayer());

		UNIT = new SpecificParserTarget(
				Util.newArrayListOfValues("unit", "units", "game"),
				"Returns the same as 'pc', but should be used for unit methods such as unit.size.",
				Main.game.getPlayer());*/
		
		PC = new SpecificParserTarget(
				Util.newArrayListOfValues("pc", "player"),
				"The player character.",
				Main.game.getPlayer());
		
		/**
		 * The main parser tag for getting a hook on npcs when using UtilText's {@code parseFromXMLFile()} methods.
		 * <br/><b>Important note:</b> When trying to access npcs for parsing in external files, this method is likely to be unreliable and return npcs which you did not want.
		 * You should instead use the 'ncom' (standing for Non-COMpanion) parser tags to access npcs which are not members of the player's party, and 'com' (standing for COMpanion) tags for npcs which are members of the player's party.
		 * These parser tags will always return characters in the same order, so they are far safer to use than this 'npc' tag, which should only be used in the context of UtilText's {@code parseFromXMLFile()} method.
		 */
		NPC = new AbstractParserTarget(Util.newArrayListOfValues(
				"npc",
				"npc1",
				"npc2",
				"npc3",
				"npc4",
				"npc5",
				"npc6"),
				"The currently 'active' NPC.<br/>"
				+"<b>The tag 'npc' can be extended with a number, starting at 1, to signify which npc in the scene it is referring to!</b> e.g. 'npc1' is the first npc, 'npc2' is the second, etc.<br/>"
				+ "If in <b>combat</b>, it returns your opponent.<br/>"
				+ "If in <b>sex</b>, it returns your partner.<br/>"
				+ "<b>Otherwise</b>, it returns the most important NPC in the scene.") {
					@Override
					public GameCharacter getCharacter(String tag, List<GameCharacter> specialNPCList) throws NullPointerException {
						DialogueNode currDialogueNode = Main.game.getCurrentDialogueNode();
						if(specialNPCList!=null && !specialNPCList.isEmpty()) {
							if(tag.equalsIgnoreCase("npc")) {
								return specialNPCList.get(0);
							} else {
								return specialNPCList.get(Math.max(0, Integer.parseInt(tag.substring(3))-1));
							}
							
						} else if(Main.game.isInCombat()) {
							return Main.combat.getActiveNPC();
							
						} else if (Main.game.isInSex()) {
							return Main.sex.getTargetedPartner(Main.game.getPlayer());
							
						} else if (currDialogueNode!=null) {
							if(currDialogueNode==CharactersPresentDialogue.MENU
									 || currDialogueNode==PhoneDialogue.CONTACTS
									 || currDialogueNode==PhoneDialogue.CONTACTS_CHARACTER) {
								return CharactersPresentDialogue.characterViewed;
								
							} else if(Main.game.getActiveNPC()!=null) {
								return Main.game.getActiveNPC();
								
							} else if (!Main.game.getCharactersPresent().isEmpty()) {
								List<NPC> charactersPresent = Main.game.getCharactersPresent();
								if(tag.equalsIgnoreCase("npc")) {
									return charactersPresent.get(0);
								} else {
									return charactersPresent.get(Math.min(charactersPresent.size()-1, Math.max(0, Integer.parseInt(tag.substring(3))-1)));
								}
								
							} else {
								throw new NullPointerException();
							}
							
						} else {
							throw new NullPointerException();
						}
					}
				};
		
		/**
		 * Returns npcs which are members of the player's party.
		 * Ordering is based on the order in which companions were added to the party.
		 */
		COMPANION = new AbstractParserTarget(Util.newArrayListOfValues(
				"com",
				"com1",
				"com2",
				"com3",
				"com4",
				"com5",
				"com6"),
				"The companions of the player.<br/>"
				+"<b>The tag 'com' can be extended with a number, starting at 1, to signify which companion it is referring to!</b> e.g. 'com1' is the first companion, 'com2' is the second, etc.") {
					@Override
					public GameCharacter getCharacter(String tag, List<GameCharacter> specialNPCList) throws NullPointerException {
						if(Main.game.getPlayer().getCompanions().size()>=1) {
							if(tag.equalsIgnoreCase("com")) {
								return Main.game.getPlayer().getCompanions().get(0);
								
							} else {
								int index = Integer.parseInt(tag.substring(tag.length()-1));
								if(Main.game.getPlayer().getCompanions().size()>=index) {
									return Main.game.getPlayer().getCompanions().get(Math.max(0, index-1));
								}
							}
						}
						throw new NullPointerException();
					}
				};

		/**
		 * Returns npcs which are not members of the player's party and which are present in the player's cell.
		 * Ordering is based on the npcs' id, so ordering will remain consistent across multiple parsing calls.
		 */
		NON_COMPANION = new AbstractParserTarget(Util.newArrayListOfValues(
				"ncom",
				"ncom1",
				"ncom2",
				"ncom3",
				"ncom4",
				"ncom5",
				"ncom6"),
				"The non-unique npcs who are in the player's cell and who are not members of the player's party.<br/>"
				+"<b>The tag 'ncom' can be extended with a number, starting at 1, to signify which npc it is referring to!</b> e.g. 'ncom1' is the first npc, 'ncom2' is the second, etc.") {
					@Override
					public GameCharacter getCharacter(String tag, List<GameCharacter> specialNPCList) throws NullPointerException {
						if(!Main.game.getNonCompanionCharactersPresent().isEmpty()) {
							List<NPC> npcs = new ArrayList<>(Main.game.getNonCompanionCharactersPresent());
							npcs.removeIf(npc->npc.isUnique());
							Collections.sort(npcs, (n1, n2)->n1.getId().compareTo(n2.getId()));
							if(tag.equalsIgnoreCase("ncom")) {
								return npcs.get(0);
								
							} else {
								int index = Integer.parseInt(tag.substring(tag.length()-1));
								if(npcs.size()>=index) {
									return npcs.get(Math.max(0, index-1));
								}
							}
						}
						throw new NullPointerException();
					}
				};

		ELEMENTAL = new AbstractParserTarget(Util.newArrayListOfValues(
				"el",
				"elemental"),
				"The player's elemental. <b>Should only ever be used when you know for certain that the player's elemental has been created!</b>") {
			@Override
			public GameCharacter getCharacter(String tag, List<GameCharacter> specialNPCList) {
				if(!Main.game.getPlayer().hasDiscoveredElemental()) {
//					System.err.println("Warning: Player's elemental not found when accessing ParserTarget.ELEMENTAL!");
					return Main.game.getNpc(GenericAndrogynousNPC.class);
				}
				return Main.game.getPlayer().getElemental();
			}
		};
		
		PROLOGUE_MALE = new SpecificParserTarget(Util.newArrayListOfValues("prologueMale"), null, Main.game.getNpc(PrologueMale.class));
		
		PROLOGUE_FEMALE = new SpecificParserTarget(Util.newArrayListOfValues("prologueFemale"), null, Main.game.getNpc(PrologueFemale.class));
		
		NPC_MALE = new SpecificParserTarget(
				Util.newArrayListOfValues("NPCmale", "maleNPC", "genericMale", "maleGeneric"),
				null,
				Main.game.getNpc(GenericMaleNPC.class));
		
		NPC_FEMALE = new SpecificParserTarget(
				Util.newArrayListOfValues("NPCfemale", "femaleNPC", "genericFemale", "femaleGeneric"),
				null,
				Main.game.getNpc(GenericFemaleNPC.class));
		
		NPC_ANDROGYNOUS = new SpecificParserTarget(
				Util.newArrayListOfValues("NPCandrogynous", "androgynousNPC", "NPCambiguous", "ambiguousNPC"),
				null,
				Main.game.getNpc(GenericAndrogynousNPC.class));
		
		NPC_TRADER = new SpecificParserTarget(
				Util.newArrayListOfValues("trader", "genericTrader"),
				null,
				Main.game.getNpc(GenericTrader.class));
		
		TEST_NPC = new SpecificParserTarget(
				Util.newArrayListOfValues("testNPC", "test"),
				null,
				Main.game.getNpc(TestNPC.class));
		
		LILAYA = new SpecificParserTarget(
				Util.newArrayListOfValues("lilaya", "aunt"),
				null,
				Main.game.getNpc(Lilaya.class));
		
		ROSE = new SpecificParserTarget(Util.newArrayListOfValues("rose"), null, Main.game.getNpc(Rose.class));
		
		KATE = new SpecificParserTarget(Util.newArrayListOfValues("kate"), null, Main.game.getNpc(Kate.class));
		
		RALPH = new SpecificParserTarget(Util.newArrayListOfValues("ralph"), null, Main.game.getNpc(Ralph.class));
		
		NYAN = new SpecificParserTarget(Util.newArrayListOfValues("nyan"), null, Main.game.getNpc(Nyan.class));
		
		NYAN_MUM = new SpecificParserTarget(
				Util.newArrayListOfValues("nyanmum", "nyanmom", "leotie"),
				null,
				Main.game.getNpc(NyanMum.class));
		
		VICKY = new SpecificParserTarget(Util.newArrayListOfValues("vicky"), null, Main.game.getNpc(Vicky.class));
		
		PIX = new SpecificParserTarget(Util.newArrayListOfValues("pix"), null, Main.game.getNpc(Pix.class));
		
		BRAX = new SpecificParserTarget(Util.newArrayListOfValues("brax"), null, Main.game.getNpc(Brax.class));
		
		CANDI = new SpecificParserTarget(Util.newArrayListOfValues("candi"), null, Main.game.getNpc(CandiReceptionist.class));
		
		VANESSA = new SpecificParserTarget(Util.newArrayListOfValues("vanessa"), null, Main.game.getNpc(Vanessa.class));
		
		SCARLETT = new SpecificParserTarget(Util.newArrayListOfValues("scarlett"), null, Main.game.getNpc(Scarlett.class));
		
		HELENA = new SpecificParserTarget(Util.newArrayListOfValues("helena"), null, Main.game.getNpc(Helena.class));
		
		HARPY_BIMBO = new SpecificParserTarget(
				Util.newArrayListOfValues("brittany", "bimboHarpy", "harpyBimbo"),
				null,
				Main.game.getNpc(HarpyBimbo.class));
		
		HARPY_BIMBO_COMPANION = new SpecificParserTarget(
				Util.newArrayListOfValues("lauren", "bimboHarpyCompanion", "harpyBimboCompanion"),
				null,
				Main.game.getNpc(HarpyBimboCompanion.class));
		
		HARPY_DOMINANT = new SpecificParserTarget(
				Util.newArrayListOfValues("diana", "dominantHarpy", "harpyDominant"),
				null,
				Main.game.getNpc(HarpyDominant.class));
		
		HARPY_DOMINANT_COMPANION = new SpecificParserTarget(
				Util.newArrayListOfValues("harley", "dominantHarpyCompanion", "harpyDominantCompanion"),
				null,
				Main.game.getNpc(HarpyDominantCompanion.class));
		
		HARPY_NYMPHO = new SpecificParserTarget(
				Util.newArrayListOfValues("lexi", "nymphoHarpy", "harpyNympho"),
				null,
				Main.game.getNpc(HarpyNympho.class));
		
		HARPY_NYMPHO_COMPANION = new SpecificParserTarget(
				Util.newArrayListOfValues("max", "nymphoHarpyCompanion", "harpyNymphoCompanion"),
				null,
				Main.game.getNpc(HarpyNymphoCompanion.class));
		
		PAZU = new SpecificParserTarget(Util.newArrayListOfValues("pazu"), null, Main.game.getNpc(Pazu.class));
		
		FINCH = new SpecificParserTarget(Util.newArrayListOfValues("finch"), null, Main.game.getNpc(Finch.class));
		
		ZARANIX = new SpecificParserTarget(Util.newArrayListOfValues("zaranix"), null, Main.game.getNpc(Zaranix.class));
		
		AMBER = new SpecificParserTarget(Util.newArrayListOfValues("amber"), null, Main.game.getNpc(Amber.class));
		
		FELICIA = new SpecificParserTarget(Util.newArrayListOfValues("felicia"), null, Main.game.getNpc(Felicia.class));
		
		ARTHUR = new SpecificParserTarget(Util.newArrayListOfValues("arthur"), null, Main.game.getNpc(Arthur.class));
		
		KELLY = new SpecificParserTarget(Util.newArrayListOfValues("kelly"), null, Main.game.getNpc(ZaranixMaidKelly.class));
		
		KATHERINE = new SpecificParserTarget(Util.newArrayListOfValues("katherine"), null, Main.game.getNpc(ZaranixMaidKatherine.class));
		
		ASHLEY = new SpecificParserTarget(Util.newArrayListOfValues("ashley"), null, Main.game.getNpc(Ashley.class));
		
		WOLFGANG = new SpecificParserTarget(
				Util.newArrayListOfValues("wolfgang", "supplierLeader"),
				null,
				Main.game.getNpc(SupplierLeader.class));
		
		KARL = new SpecificParserTarget(Util.newArrayListOfValues(
				"karl", "supplierPartner"),
				null,
				Main.game.getNpc(SupplierPartner.class));
		
		ANGEL = new SpecificParserTarget(Util.newArrayListOfValues("angel"), null, Main.game.getNpc(Angel.class));
		
		BUNNY = new SpecificParserTarget(Util.newArrayListOfValues("bunny"), null, Main.game.getNpc(Bunny.class));
		
		LOPPY = new SpecificParserTarget(Util.newArrayListOfValues("loppy"), null, Main.game.getNpc(Loppy.class));
		
		LUMI = new SpecificParserTarget(Util.newArrayListOfValues("lumi"), null, Main.game.getNpc(Lumi.class));
		
		CLAIRE = new SpecificParserTarget(Util.newArrayListOfValues("claire"), null, Main.game.getNpc(Claire.class));
		
		SLIME_QUEEN = new SpecificParserTarget(Util.newArrayListOfValues("slimeQueen"), null, Main.game.getNpc(SlimeQueen.class));
		
		SLIME_GUARD_ICE = new SpecificParserTarget(
				Util.newArrayListOfValues("slimeGuardIce", "slimeIce", "crystal"),
				null,
				Main.game.getNpc(SlimeGuardIce.class));
		
		SLIME_GUARD_FIRE = new SpecificParserTarget(
				Util.newArrayListOfValues("slimeGuardFire", "slimeFire", "blaze"),
				null,
				Main.game.getNpc(SlimeGuardFire.class));
		
		SLIME_ROYAL_GUARD = new SpecificParserTarget(
				Util.newArrayListOfValues("slimeRoyalGuard", "royalGuardSlime"),
				null,
				Main.game.getNpc(SlimeRoyalGuard.class));
		
		ROXY = new SpecificParserTarget(Util.newArrayListOfValues("roxy"), null, Main.game.getNpc(Roxy.class));
		
		AXEL = new SpecificParserTarget(
				Util.newArrayListOfValues("axel", "lexa"),
				null,
				Main.game.getNpc(Axel.class));
		
		EPONA = new SpecificParserTarget(Util.newArrayListOfValues("epona"), null, Main.game.getNpc(Epona.class));
		
		JULES = new SpecificParserTarget(Util.newArrayListOfValues("jules"), null, Main.game.getNpc(Jules.class));
		
		KRUGER = new SpecificParserTarget(Util.newArrayListOfValues("kruger"), null, Main.game.getNpc(Kruger.class));
		
		KALAHARI = new SpecificParserTarget(Util.newArrayListOfValues("kalahari"), null, Main.game.getNpc(Kalahari.class));

		RENTAL_MOMMY = new SpecificParserTarget(Util.newArrayListOfValues("rentalMommy"), null, Main.game.getNpc(RentalMommy.class));
		
		DADDY = new SpecificParserTarget(
				Util.newArrayListOfValues("daddy", "desryth"),
				null,
				Main.game.getNpc(Daddy.class));
		
		
		// Submission:
		
		IMP_FORTRESS_ALPHA_LEADER = new SpecificParserTarget(Util.newArrayListOfValues("impAlphaLeader"), null, Main.game.getNpc(FortressAlphaLeader.class));
		
		IMP_FORTRESS_FEMALES_LEADER = new SpecificParserTarget(
				Util.newArrayListOfValues("impFemalesLeader", "impFemaleLeader"),
				null,
				Main.game.getNpc(FortressFemalesLeader.class));
		
		IMP_FORTRESS_MALES_LEADER = new SpecificParserTarget(
				Util.newArrayListOfValues("impMalesLeader", "impMaleLeader"),
				null,
				Main.game.getNpc(FortressMalesLeader.class));
		
		DARK_SIREN = new SpecificParserTarget(
				Util.newArrayListOfValues("darkSiren", "siren", "meraxis"),
				null,
				Main.game.getNpc(DarkSiren.class));
		
		CITADEL_ARCANIST = new SpecificParserTarget(
				Util.newArrayListOfValues("citadelArcanist", "youkoGuide", "hitomi", "takahashi"),
				null,
				Main.game.getNpc(Takahashi.class));
		
		LYSSIETH = new SpecificParserTarget(Util.newArrayListOfValues("lyssieth"), null, Main.game.getNpc(Lyssieth.class));
		
		ELIZABETH = new SpecificParserTarget(Util.newArrayListOfValues("elizabeth"), null, Main.game.getNpc(Elizabeth.class));
		
		VENGAR = new SpecificParserTarget(Util.newArrayListOfValues("vengar"), null, Main.game.getNpc(Vengar.class));
		
		SHADOW = new SpecificParserTarget(Util.newArrayListOfValues("shadow"), null, Main.game.getNpc(Shadow.class));
		
		SILENCE = new SpecificParserTarget(Util.newArrayListOfValues("silence"), null, Main.game.getNpc(Silence.class));
		
		MURK = new SpecificParserTarget(Util.newArrayListOfValues("murk"), null, Main.game.getNpc(Murk.class));
		
		SEAN = new SpecificParserTarget(Util.newArrayListOfValues("sean"), null, Main.game.getNpc(Sean.class));
		
		NATALYA = new SpecificParserTarget(Util.newArrayListOfValues("natalya"), null, Main.game.getNpc(Natalya.class));
		
		WES = new SpecificParserTarget(
				Util.newArrayListOfValues("wes", "wesley"),
				null,
				Main.game.getNpc(Wes.class));
		
		ELLE = new SpecificParserTarget(
				Util.newArrayListOfValues("elle", "aellasys"),
				null,
				Main.game.getNpc(Elle.class));
		
		KAY = new SpecificParserTarget(Util.newArrayListOfValues("kay"), null, Main.game.getNpc(Kay.class));
		
		FLASH = new SpecificParserTarget(Util.newArrayListOfValues("flash"), null, Main.game.getNpc(Flash.class));
		
		JESS = new SpecificParserTarget(Util.newArrayListOfValues("jess"), null, Main.game.getNpc(Jess.class));
		
		ASTRAPI = new SpecificParserTarget(Util.newArrayListOfValues("astrapi"), null, Main.game.getNpc(Astrapi.class));
		
		VRONTI = new SpecificParserTarget(Util.newArrayListOfValues("vronti"), null, Main.game.getNpc(Vronti.class));
		
		ARION = new SpecificParserTarget(Util.newArrayListOfValues("arion"), null, Main.game.getNpc(Arion.class));
		
		MINOTALLYS = new SpecificParserTarget(Util.newArrayListOfValues("minotallys"), null, Main.game.getNpc(Minotallys.class));
		
		FAE = new SpecificParserTarget(Util.newArrayListOfValues("fae"), null, Main.game.getNpc(Fae.class));
		
		SILVIA = new SpecificParserTarget(Util.newArrayListOfValues("silvia"), null, Main.game.getNpc(Silvia.class));
		
		KHEIRON = new SpecificParserTarget(Util.newArrayListOfValues("kheiron"), null, Main.game.getNpc(Kheiron.class));
		
		KAZIK = new SpecificParserTarget(Util.newArrayListOfValues("kazik"), null, Main.game.getNpc(Kazik.class));
		
		YUI = new SpecificParserTarget(Util.newArrayListOfValues("yui"), null, Main.game.getNpc(Yui.class));
		
		NIZHONI = new SpecificParserTarget(Util.newArrayListOfValues("nizhoni"), null, Main.game.getNpc(Nizhoni.class));
		
		MORENO = new SpecificParserTarget(Util.newArrayListOfValues("moreno"), null, Main.game.getNpc(Moreno.class));
		
		HEATHER = new SpecificParserTarget(Util.newArrayListOfValues("heather"), null, Main.game.getNpc(Heather.class));
		
		ZIVA = new SpecificParserTarget(Util.newArrayListOfValues("ziva"), null, Main.game.getNpc(Ziva.class));
		
		MONICA = new SpecificParserTarget(Util.newArrayListOfValues("monica"), null, Main.game.getNpc(Monica.class));

		EVELYX = new SpecificParserTarget(Util.newArrayListOfValues("evelyx"), null, Main.game.getNpc(Evelyx.class));

		DALE = new SpecificParserTarget(Util.newArrayListOfValues("dale"), null, Main.game.getNpc(Dale.class));

		HEADLESS_HORSEMAN = new SpecificParserTarget(
				Util.newArrayListOfValues("headlessHorseman", "headHorse"),
				null,
				Main.game.getNpc(HeadlessHorseman.class));

		CERIDWEN = new SpecificParserTarget(Util.newArrayListOfValues("ceridwen"), null, Main.game.getNpc(Ceridwen.class));

		IMSU = new SpecificParserTarget(Util.newArrayListOfValues("imsu"), null, Main.game.getNpc(Imsu.class));

		HALE = new SpecificParserTarget(Util.newArrayListOfValues("hale"), null, Main.game.getNpc(Hale.class));

		PENELOPE = new SpecificParserTarget(Util.newArrayListOfValues("penelope"), null, Main.game.getNpc(Penelope.class));

		BELLE = new SpecificParserTarget(Util.newArrayListOfValues("belle"), null, Main.game.getNpc(Belle.class));

		DAPHNE = new SpecificParserTarget(Util.newArrayListOfValues("daphne"), null, Main.game.getNpc(Daphne.class));

		FARAH = new SpecificParserTarget(Util.newArrayListOfValues("farah"), null, Main.game.getNpc(Farah.class));

		CALLIE = new SpecificParserTarget(Util.newArrayListOfValues("callie"), null, Main.game.getNpc(Callie.class));

		WYNTER = new SpecificParserTarget(Util.newArrayListOfValues("wynter"), null, Main.game.getNpc(Wynter.class));

		OGLIX = new SpecificParserTarget(Util.newArrayListOfValues("oglix"), null, Main.game.getNpc(Oglix.class));
		
		// Hard-coded parserTarget types (all those up above):
		Field[] fields = ParserTarget.class.getFields();
		for(Field f : fields) {
			if(AbstractParserTarget.class.isAssignableFrom(f.getType())) {
				AbstractParserTarget parserTarget;
				try {
					parserTarget = ((AbstractParserTarget) f.get(null));

					parserTargetToIdMap.put(parserTarget, f.getName());
					idToParserTargetMap.put(f.getName(), parserTarget);
					allParserTargets.add(parserTarget);
					coreParserTargets.add(parserTarget);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	/** A list of the hard-coded parser targets above. */
	private static List<AbstractParserTarget> coreParserTargets = new ArrayList<>();
	
	private static List<AbstractParserTarget> allParserTargets = new ArrayList<>();
	private static Map<AbstractParserTarget, String> parserTargetToIdMap = new HashMap<>();
	private static Map<String, AbstractParserTarget> idToParserTargetMap = new HashMap<>();

	public static List<AbstractParserTarget> getAllParserTargets() {
		return allParserTargets;
	}
	
	public static AbstractParserTarget getParserTargetFromId(String id) {
		id = Util.getClosestStringMatch(id, idToParserTargetMap.keySet());
		return idToParserTargetMap.get(id);
	}

	public static String getIdFromParserTarget(AbstractParserTarget parserTarget) {
		return parserTargetToIdMap.get(parserTarget);
	}

	/**
	 * Adds an associated between the tag and the target for parsing.
	 */
	public static void addAdditionalParserTarget(String tag, NPC target) {
		AbstractParserTarget newParserTarget = new AbstractParserTarget(Util.newArrayListOfValues(tag), "") {
			public String getDescription() {
				return target.getDescription();
			}
			@Override
			public GameCharacter getCharacter(String tag, List<GameCharacter> specialNPCList) {
				return target;
			}
		};
		if(idToParserTargetMap.containsKey(tag)) {
//			System.err.println("Warning: Parser target of '"+tag+"' has been replaced!");
			removeAdditionalParserTarget((NPC) idToParserTargetMap.get(tag).getCharacter(null, null));
		}
		
		parserTargetToIdMap.put(newParserTarget, tag);
		idToParserTargetMap.put(tag, newParserTarget);
		allParserTargets.add(newParserTarget);

		UtilText.addNewParserTarget(tag, target); // Add this parser target to the scripting engine
	}
	
	/**
	 * Removes map references to the specified NPC.
	 */
	public static void removeAdditionalParserTarget(NPC target) {
		AbstractParserTarget targetToRemove = null;
		
		for(AbstractParserTarget parserTarget : allParserTargets) {
			if(!coreParserTargets.contains(parserTarget)) { // Do not remove core parser targets
				GameCharacter targetFound = parserTarget.getCharacter("", new ArrayList<>());
				if(targetFound!=null && targetFound.equals(target)) {
					targetToRemove = parserTarget;
					break;
				}
			}
		}
		
		if(targetToRemove!=null) {
			String idToRemove = parserTargetToIdMap.remove(targetToRemove);
			idToParserTargetMap.remove(idToRemove);
			allParserTargets.remove(targetToRemove);
			UtilText.removeParserTarget(idToRemove); // Remove this parser target from the scripting engine
		}
	}
	
	static {
		// Hard-coded parserTarget types (all those up above):
		String[] onLoadTagNames = {"STYLE", "UNIT"};
		for (String fieldName : onLoadTagNames) {
			Field f;
			try {
				f = ParserTarget.class.getField(fieldName);
				AbstractParserTarget target = (AbstractParserTarget) f.get(null);
				parserTargetToIdMap.put(target, f.getName());
				idToParserTargetMap.put(f.getName(), target);
				allParserTargets.add(target);
				coreParserTargets.add(target);
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
