package mum.edu.cs545;

public class Player {
	private String Id;
	private String Name;
	private int age;
	private String role;
	
	public Player() {
		super();
	}
	
	public String getId() {
		return Id;
	}
	
	public void setId(String id) {
		Id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getRole() {
		return role;
	}
	
	@Override
	public String toString() {
		return "Player [Id=" + Id + ", Name=" + Name + ", age=" + age + ", role=" + role + "]";
	}

	public Player(String id, String name, int age, String role) {
		super();
		Id = id;
		Name = name;
		this.age = age;
		this.role = role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
