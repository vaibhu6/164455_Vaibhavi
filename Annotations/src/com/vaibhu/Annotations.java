package com.vaibhu;

import org.junit.*;

public class Annotations {

	
	@Before
	public void before(){
		System.out.println("Before method implemented");
	}
	@Before
	public void before1(){
		System.out.println("Before1 method implemented");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("BeforeClass method implemented");
	}
	@Test
	public void test() {
		System.out.println("Test method implemented");
	}
	@Test
	public void test1() {
		System.out.println("Test1 method implemented");
	}
	@After
	public void after() {
		System.out.println("After method implemented");
	}
	@After
	public void after1() {
		System.out.println("After1 method implemented");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass method implemented");
	}
}
