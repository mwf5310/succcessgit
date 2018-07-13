package demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
public class Test83 {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("This is test9 @beforeClass"); 
	}
	
	@Before
	public void before(){
		System.out.println("This is test9 @before");
	}
	@Test
	public void fun1(){
		System.out.println("This is test9 @Test fun1 ");
	}
	

	
	@Test
	public void fun2(){
		System.out.println("This is test9 @Test fun2 ");
}
	
	
	@After
	public void after(){
		System.out.println("This is test9 @After ");
	}
	
	@AfterClass
	public  static  void afterClass(){
		System.out.println("This is test9 @afterClass ");
	}
	
	

}



