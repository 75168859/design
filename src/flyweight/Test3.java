package flyweight;

import java.util.HashSet;

public class Test3 {
	public static void main(String[] args) {
		HashSet<User1> hs = new HashSet<User1>();
	   User1 u1 = new User1("aa",30);
	   User1 u2 = new User1("bb",40);
	   hs.add(u1);
	   hs.add(u2);
	   System.out.println(hs.size());
	   u1.setName("xx");
	   hs.remove(u1);
	   System.out.println(hs.size());
	}

}
class User1{
	private String name;
	private int age;
	public User1(){}
	public User1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User1 other = (User1) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
