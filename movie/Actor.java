package movie;

public class Actor {

	private String actorName;
	private String actorRoleName;

	public Actor() {
	}

	public Actor(String actorName, String actorRoleName) {
		this.actorName = actorName;
		this.actorRoleName = actorRoleName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActorRoleName() {
		return actorRoleName;
	}

	public void setActorRoleName(String actorRoleName) {
		this.actorRoleName = actorRoleName;
	}
	
	public void displayActor() {
		System.out.println("Actor Name: " + getActorName());
		System.out.println("Actor Role Name in Movie: " + getActorRoleName());
	}

}