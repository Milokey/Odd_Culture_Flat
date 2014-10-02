package explore.impl;

import inventory.battleitems.BattleItem;
import inventory.healthitems.Philter;

import java.util.List;

import vereo.Vereo;
import explore.Location;

public class PointAndClickLocation implements Location 
{
	private Boolean isPointAndClick = Boolean.TRUE;

	@Override
	public void setMiniGame() {
		// stub for JAXB
	}

	@Override
	public Boolean getMiniGame() {
		return Boolean.FALSE;
	}

	@Override
	public void setPointAndClick() {
		this.isPointAndClick = Boolean.TRUE;
	}

	@Override
	public Boolean getPointAndClick() {
		return this.isPointAndClick;
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
