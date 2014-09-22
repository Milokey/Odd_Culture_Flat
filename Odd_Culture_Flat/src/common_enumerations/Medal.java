package common_enumerations;

public enum Medal 
{
	SIGNUP(10),
	FIRSTADOPT(25),
	FIRSTABANDON(0),
	FIRSTBATTLEWON(100),
	FIRSTBATTLELOST(10),
	FIRSTFORUMPOST(5),
	FIRSTEVOLUTION(25),
	STAFF(40),
	MODERATOR(40),
	ADMIN(40),
	PLAYEDFORYEAR(500),
	PLAYEDFORTWOYEARS(750),
	PLAYEDFORTHREEPLUS(1500),
	LIKEDONFACEBOOK(5),
	LIKEDONTWITTER(5);
	
	private int value;
	
	private Medal(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
