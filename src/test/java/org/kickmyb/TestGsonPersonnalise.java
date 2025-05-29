package org.kickmyb;

import org.junit.Test;
import org.kickmyb.transfer.RequeteAjoutTache;

import java.util.Date;

public class TestGsonPersonnalise {

    @Test
    public void testDate(){
        RequeteAjoutTache rat = new RequeteAjoutTache();
        rat.dateLimite = new Date();
        rat.nom = "gna gna";
        String s = GsonPersonnalise.gsonPerso().toJson(rat);
        System.out.println(rat.nom + " " + rat.dateLimite);
        RequeteAjoutTache recov = GsonPersonnalise.gsonPerso().fromJson(s, RequeteAjoutTache.class);
        System.out.println(recov.nom + " " + recov.dateLimite);
    }
}
