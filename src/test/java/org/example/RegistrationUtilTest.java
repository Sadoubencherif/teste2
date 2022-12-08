package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegistrationUtilTest {
    RegistrationUtil utilusateur;

    @BeforeEach
    void setUp() {
        utilusateur = new RegistrationUtil();
    }

    @Test
    void si_le_nom_user_est_vide() {
        boolean actual = utilusateur.validateUserInput("", "test", "text");
        assertFalse(actual);
    }

    @Test
    void test_mot_de_passe_different() {
        boolean actual = utilusateur.validateUserInput(" sadoubah", "sad", "sadd");
        assertFalse(actual);
    }

    @Test
    void si_tout_est_vide() {
        boolean actual = utilusateur.validateUserInput("", "", "");
        assertFalse(actual);
    }

    @Test
    void si_tout_est_bien_remplis() {
        boolean actual = utilusateur.validateUserInput("sadoubah", "sad23", "sad23");
        assertTrue(actual);
    }

}