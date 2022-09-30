package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Prime_checkTest {
	@Test
    public void evaluatesExpression() {
			{
			Prime_check n= new Prime_check();
			boolean s = n.isPrime(5);
			assertEquals("A prime number",s);
 }}}

