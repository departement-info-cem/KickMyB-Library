package org.kickmyb;

import org.junit.Test;
import org.kickmyb.transfer.RequeteAjoutTache;

import java.util.Date;

public class TestGsonPersonnalise {

    @Test
    public void testDate(){
        RequeteAjoutTache atr = new RequeteAjoutTache();
        atr.dateLimite = new Date();
        atr.nom = "gna gna";
        String s = GsonPersonnalise.gsonPerso().toJson(atr);

        RequeteAjoutTache recov = GsonPersonnalise.gsonPerso().fromJson(s, RequeteAjoutTache.class);
        System.out.println(recov);
    }
}
