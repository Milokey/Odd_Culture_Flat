package vereo.enumerations;

/**
 * Abilities that only certain Vereos
 * are allowed to have. The following
 * MagicAbilities have special effects:
 * 
 * Sync -- sets this Vereo's stats to the
 * 		   opponent's for the duration of
 * 		   battle or for three turns, whichever
 * 		   is shorter.
 * Mr. Vain -- increase speed and defense but
 * 			   decrease strength by 10% for the
 * 			   duration of battle or for three
 * 			   turns, whichever is shorter.
 * Catafalque -- stop the opponent from attacking
 * 				 for one turn.
 * Chernobyl -- decrease opponent's strength and
 * 			    defense by 5% for three turns.
 * Enervation -- decrease opponent's hp by an
 * 				 additional 50 points if player's
 * 				 monster's speed is higher.
 * Osiris -- restore a fainted Vereo. The current
 * 			 Vereo is KO'd. 25% chance of failure.
 * 			 Failure KO's the player's Vereo.
 * White Noise -- decrease opponent's hp, strength,
 * 				  speed, and defense by 10% for the
 * 				  duration of the battle, but decrease
 * 				  player's hp by 500.
 * Shiva -- KO an opponent's Vereo and lower other Vereos' stats by 5%, 
 * 			but decrease player's hp by 750, strength by 15%, defense by 5%,
 * 			and speed by 3% for the duration of the battle.
 * 			Cannot use this ability if -750 hp would result
 * 			in the Vereo fainting. 50% chance of failure.
 * 			Failure will KO the player's monster. (Note: 0%
 * 			failure rate for bosses.)
 * 
 * @author tblount
 */
public enum MagicAbility 
{
	FIRE(5),
	ICE(5),
	AIR(5),
	EARTH(5),
	DREAMDROP(6),
	SYNC(15),
	MASQUERADE(17),
	CHANNEL(18),
	TRANQUILIZE(22),
	MRVAIN(25),
	FOREVER(25),
	WILDWATER(30),
	CATAFALQUE(30), //counterpart of Fire
	AERO(30),
	GAIASCREAMS(30),
	CHERNOBYL(45),
	CONTRAIL(47),
	ENERVATION(52),
	SCINTILLATE(60),
	SARASWATI(65),
	BASTET(65),
	OSIRIS(75),
	CROWELL(80),
	NEGATIVEHALO(86),
	WHITENOISE(100),
	MICHAEL(120),
	ERGO(130),
	NULLPOINTER(130),
	SHIVA(150);
	
	private int value;
	
	private MagicAbility(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
