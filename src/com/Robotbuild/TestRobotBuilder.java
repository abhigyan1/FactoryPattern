package com.Robotbuild;

public class TestRobotBuilder {
		public static void main(String[] args) {
			// Get a RobotBuilder of type OldRobotBuilder
		   RobotBuilder oldStyleRobot = new OldRobotBuilder();		
		// Pass the OldRobotBuilder specification to the engineer
	       RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
	    // Tell the engineer to make the Robot using the specifications
        // of the OldRobotBuilder class
	       robotEngineer.makeRobot();
	       // The engineer returns the right robot based off of the spec
	       	       
	       	        Robot firstRobot = robotEngineer.getRobot();

	       	        System.out.println("Robot Built");
	       	        System.out.println("Robot Head Type: " + firstRobot.getHead());
	       	        System.out.println("Robot Torso Type: " + firstRobot.getTorso());
	       	        System.out.println("Robot Arm Type: " + firstRobot.getArms());
	       	        System.out.println("Robot Leg Type: " + firstRobot.getLegs());   
		}
	}


