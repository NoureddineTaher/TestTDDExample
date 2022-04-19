package com.aboubakar.tdd.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.aboubakar.tdd.exceptions.InvalidListException;

/**
 * @author M-info
 * 
 * 
 *         Dans ce programme nous avons voulu mettre en pratique le Test Driven
 *         Development (TDD) On a utilis� une fonctoin simple qui prend en
 *         entr�e une liste d'entiers et retourne la plus grande valeur de la
 *         liste.
 * 
 *         Nous avons d'abord �crit un test (qui a echou�) avant d'�crire le
 *         code � tester Puis on a �crit la fonction de la class NumberService
 *         On a ensuite test� la fonction avec les tests �crits au pr�alableOn a
 *         am�lior� petit � petit le code de la fonction 'biggestNumber' afin
 *         qu'il reussisse le test
 *
 * 
 */

public class TestNumberService {

	// Nous �crivons le test d'abord avant d'�crire la fonction principale (feature)
	@Test
	public void testBiggestNumber() {

		int[] liste = new int[] { 7, 12, 19 };

		NumberService numberService = new NumberService();

		int biggest1 = numberService.biggestNumber(liste);
		assertEquals(19, biggest1);

		// fail("Not yet implemented");
	}

	@Test
	public void testBiggestNumberWithMixtDesorderedNumbers() {

		int[] liste = { -8, 3, 7, -2, 0, 4, 24, -17, -3 };

		NumberService numberService = new NumberService();

		int biggest = numberService.biggestNumber(liste);
		assertEquals(24, biggest);
	}

	@Test
	public void testBiggestNumberWithNegative() {

		int[] liste = { -8, -14, -27, -35 };

		NumberService numberService = new NumberService();

		int biggest = numberService.biggestNumber(liste);
		assertEquals(-8, biggest);
	}

	@Test
	public void testBiggestNumberWithBuplicatedValues() {

		int[] liste = { 10, 2, -8, 5, 2, -8, 10, 11, 10, 2, -8, 4, 0, 14, 11 };

		NumberService numberService = new NumberService();

		int biggest = numberService.biggestNumber(liste);
		assertEquals(14, biggest);
	}

	@Test
	public void testBiggestNumberWithSymeticList() {

		int[] liste = { -9, -8, -7, -1, 0, 1, 7, 8, 9 };

		NumberService numberService = new NumberService();

		int biggest = numberService.biggestNumber(liste);
		assertEquals(9, biggest);
	}

	@Test
	public void testBiggestNumberWithOneNumber() {

		int[] liste = { 5 };

		NumberService numberService = new NumberService();

		int biggest = numberService.biggestNumber(liste);
		assertEquals(5, biggest);
	}

	// On sp�cifie � JUnit que le test doit passer si la fonction renvoie
	// l'exception cr��e.

	@Test(expected = InvalidListException.class)
	public void testBiggestNumberWithNullValue() {

		NumberService numberService = new NumberService();

		numberService.biggestNumber(null);
	}
}
