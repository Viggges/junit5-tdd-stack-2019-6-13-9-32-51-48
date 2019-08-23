package com.thoughtworks.tdd;

import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldTest {

	@BeforeAll
	static void initTestEnv() {
		
	}

	@BeforeEach
	void initEveryMethod() {
		
	}

	@Test
	public void i_need_1() {
		// given
		int i = 1;
		HelloWorld helloWorld = new HelloWorld();
		// when
		String result = helloWorld.test(i);
		// then
		assertThat(result, is("1"));
	}
	@Test
	public void i_need_Fizz() {
		// given
		int i = 3;
		HelloWorld helloWorld = new HelloWorld();
		// when
		String result = helloWorld.test(i);
		// then
		assertThat(result, is("Fizz"));
	}
	@Test
	public void i_need_Buzz() {
		// given
		int i = 5;
		HelloWorld helloWorld = new HelloWorld();
		// when
		String result = helloWorld.test(i);
		// then
		assertThat(result, is("Buzz"));
	}
	@Test
	public void i_need_Whizz() {
		// given
		int i = 7;
		HelloWorld helloWorld = new HelloWorld();
		// when
		String result = helloWorld.test(i);
		// then
		assertThat(result, is("Whizz"));
	}
	@Test
	public void i_need_FizzWhizz() {
		// given
		int i = 21;
		HelloWorld helloWorld = new HelloWorld();
		// when
		String result = helloWorld.test(i);
		// then
		assertThat(result, is("FizzWhizz"));
	}
	@Test
	public void i_need_FizzBuzzWhizz() {
		// given
		int i = 105;
		HelloWorld helloWorld = new HelloWorld();
		// when
		String result = helloWorld.test(i);
		// then
		assertThat(result, is("FizzBuzzWhizz"));
	}

}
