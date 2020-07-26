package com.pratmodi.junit.first;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.pratmodi.junit.helper.StringHelper;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testtruncateAInFirstTwoPositions_AinfirsttwoPositions() {
		//AACD
		assertEquals("CD", helper.truncateAInFirstTwoPositions("AACD"));
	}
	
	@Test
	public void testtruncateAInFirstTwoPositions_BBCD() {
		//AACD
		assertEquals("BBCD", helper.truncateAInFirstTwoPositions("BBCD"));
	}
	
	@Test
	public void testareFirstTwoCharactersSame_AABA() {
		assertFalse(helper.areFirstTwoCharactersSame("ABAA"));
	}

	@Test
	public void testareFirstTwoCharactersSame_BCBD() {
		assertFalse(helper.areFirstTwoCharactersSame("BCBD"));
	}
	
	@Test
	public void testareFirstTwoAndLastTwoCharactersSame_AAAA() {
		assertFalse(helper.areFirstTwoAndLastTwoCharactersSame("BAAA"));
	}
	
	
}
