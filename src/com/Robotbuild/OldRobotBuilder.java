package com.Robotbuild;
/*
 * Implementation logic of building an object
 * Can be some validation check / appending data/ building new attributes
 */
public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;
    
	/**
	 * Create RobotBuilder implementation constructor
	 */
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		 robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("BlowTorch arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Rollar Skates");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
