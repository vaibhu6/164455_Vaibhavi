package com.springboot.swagger.SwaggerExample;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserResource {

	@GetMapping
	public List<User> getUserd(){
		return Arrays.asList(
				new User("vaibhu",20000L),
				new User("vinit",18000L)
				);
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") final String username){
		 return new User(username,10000L);
	}
	
	public class User{
		private String username;
		private long salary;
		
		public User(String username, long salary) {
			super();
			this.username = username;
			this.salary = salary;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "User [username=" + username + ", salary=" + salary + "]";
		}
	}
}
