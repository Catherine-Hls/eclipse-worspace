package hello;

public class Animal {
	// variables d'instance
		protected String name;
		protected int age;
		
		// getters & setters
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
		
		public void makeSound(){
			System.out.println("...");
		}
}
