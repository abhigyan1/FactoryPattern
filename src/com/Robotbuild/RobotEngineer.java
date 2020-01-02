package com.Robotbuild;

public class RobotEngineer {
	private RobotBuilder robotBuilders;
	public RobotEngineer(RobotBuilder robotBuilder ) {
        robotBuilders = robotBuilder;
    }
	// Execute the methods specific to the RobotBuilder
	// that implements RobotBuilder (OldRobotBuilder)
     public void makeRobot() {
		      robotBuilders.buildRobotHead();
		      robotBuilders.buildRobotTorso();
		      robotBuilders.buildRobotArms();
	          robotBuilders.buildRobotLegs();
	
		    }
  // Return the Robot made from the OldRobotBuilder spec
 	public Robot getRobot(){
 	    return this.robotBuilders.getRobot();
 	  }
}
