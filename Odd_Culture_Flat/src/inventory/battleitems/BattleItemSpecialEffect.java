package inventory.battleitems;

public class BattleItemSpecialEffect extends BattleItem 
{

	public BattleItemSpecialEffect(String name, Double cost, int recovery,
			int strengthReduction, int defenseReduction, int speedReduction,
			int hpReduction, int mpReduction, int strengthIncrease,
			int defenseIncrease, int speedIncrease, int hpIncrease,
			int mpIncrease, int duration) {
		super(name, cost, recovery, strengthReduction, defenseReduction,
				speedReduction, hpReduction, mpReduction, strengthIncrease,
				defenseIncrease, speedIncrease, hpIncrease, mpIncrease, duration);
		// TODO Auto-generated constructor stub
	}

	public BattleItemSpecialEffect(String name, Double cost, int recovery,
			int strengthIncrease, int defenseIncrease, int speedIncrease,
			int hpIncrease, int mpIncrease, int duration) {
		super(name, cost, recovery, strengthIncrease, defenseIncrease, speedIncrease,
				hpIncrease, mpIncrease, duration);
		// TODO Auto-generated constructor stub
	}

	public BattleItemSpecialEffect(String name, Double cost,
			int strengthReduction, int defenseReduction, int speedReduction,
			int hpReduction, int mpReduction, int duration) {
		super(name, cost, strengthReduction, defenseReduction, speedReduction,
				hpReduction, mpReduction, duration);
		// TODO Auto-generated constructor stub
	}

}
