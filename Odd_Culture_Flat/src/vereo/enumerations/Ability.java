package vereo.enumerations;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * This is the Ability enumeration. All
 * Vereo's can have these abilities. A 
 * small subclass can have other abilities
 * as well.
 * 
 * @author tblount
 *
 */
public enum Ability 
{
		FLEE(0),
		LOUDNOISE(1),
		SLIDE(1),
		LITTLEBLANK(5),
		PORT(5),
		PLINK(5),
		MINK(6),
		POLICE(6),
		ROAR(10),
		NANO(11),
		DECA(22),
		HEXA(23),
		SEPTA(25),
		VEENA(25),
		TOURNIQUET(25),
		UNDISCLOSEDDESIRES(25),
		UPRISING(25),
		BELLTOLLS(27),
		LOKABRENNA(28),
		CROWN(28),
		ROYALE(29),
		FALLOUT(30),
		SHIMMER(30),
		GRAVITYWELL(30),
		DARKMATTERWELL(30),
		SPANGLE(33),
		TIMEWILLTELL(40),
		WILDCHASE(40),
		POCKETFULLOFSTARS(40),
		SEEKER(40),
		JASMINE(60),
		ROCKET(60),
		STEREOGRAPH(60),
		SHINERAY(60),
		SEDITION(75),
		VENDETTA(75),
		MOZART(80),
		CALLIGRAPHY(90),
		QUETZAL(90),
		TEMPOROSPATIALCOLLAPSE(95),
		CRISISCAVALRY(100),
		PLANETARYFAULT(150),
		KALKISCHARGE(250);
		
		private int value;
		
		private Ability(int value)
		{
			this.value = value;
		}
		
		public int getValue()
		{
			return this.value;
		}
}
