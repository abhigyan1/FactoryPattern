package com.Robotbuild;

public class Robot  {
    private String head;
    private String torso;
    private String arms;
    private String legs;
	
	public void setRobotHead(String head) {
     this.head=head;
	}

	
	public void setRobotTorso(String torso) {
      this.torso=torso;
	}

	
	public void setRobotArms(String arms) {
      this.arms=arms;
	}


	public void setRobotLegs(String legs) {
      this.legs=legs;
	}

	public String getHead() {
		return head;
	}

	public String getTorso() {
		return torso;
	}

	public String getArms() {
		return arms;
	}

	public String getLegs() {
		return legs;
	}
	

}
