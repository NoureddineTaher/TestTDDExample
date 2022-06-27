/**
 * 
 */
package com.nouri.tdd.services;

import com.nouri.tdd.exceptions.InvalidListException;

/**
 * @author M-info
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
 */

public class BiggestElement {

	// Maintenant nous �crivons notre fonction dirig�e par le test

	int biggestNumber(int[] liste) {

		if (liste == null)
			throw new InvalidListException("Cette liste de nombres n'est pas valide");

		int index;
		int max = Integer.MIN_VALUE;

		for (index = 0; index < liste.length; index++) {

			if (liste[index] > max) {
				max = liste[index];
			}
		}

		return max;
	}
	
	
}
