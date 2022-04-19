/**
 * 
 */
package com.aboubakar.tdd.services;

import com.aboubakar.tdd.exceptions.InvalidListException;

/**
 * @author M-info
 * 
 *         Dans ce programme nous avons voulu mettre en pratique le Test Driven
 *         Development (TDD) On a utilisé une fonctoin simple qui prend en
 *         entrée une liste d'entiers et retourne la plus grande valeur de la
 *         liste.
 * 
 *         Nous avons d'abord écrit un test (qui a echoué) avant d'écrire le
 *         code à tester Puis on a écrit la fonction de la class NumberService
 *         On a ensuite testé la fonction avec les tests écrits au préalableOn a
 *         amélioré petit à petit le code de la fonction 'biggestNumber' afin
 *         qu'il reussisse le test
 *
 */

public class NumberService {

	// Maintenant nous écrivons notre fonction dirigée par le test

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
