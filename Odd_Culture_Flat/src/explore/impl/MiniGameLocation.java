package explore.impl;

import inventory.battleitems.BattleItem;
import inventory.healthitems.Philter;

import java.util.List;

import vereo.Vereo;
import explore.Location;

public class MiniGameLocation implements Location 
{
	private Boolean isMiniGame = Boolean.TRUE;
	
	@Override
	public void setMiniGame() {
		isMiniGame = Boolean.TRUE;
	}

	@Override
	public Boolean getMiniGame() {
		return this.isMiniGame;
	}

	@Override
	public void setPointAndClick() {
		//stub for JAXB
	}

	@Override
	public Boolean getPointAndClick() {
		return Boolean.FALSE;
	}

	@Override
	public void setVereos(List<Vereo> vereos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vereo> getVereos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBattleItems(List<BattleItem> battleItems) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BattleItem> getBattleItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhilters(List<Philter> philters) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Philter> getPhilters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

}
