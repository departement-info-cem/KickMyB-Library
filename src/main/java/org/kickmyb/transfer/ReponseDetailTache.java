package org.kickmyb.transfer;

import java.util.Date;
import java.util.List;

public class ReponseDetailTache {
    public Long id;
    
    public String nom;
    public Date dateLimite;

    // Liste de tous les événements de progression pour affichage dans l'ordre chrono inverse
    public List<ChangementAvancement> changements;

    // valeurs calculées sur le serveur à afficher au détail
    public int pourcentageAvancement;
    public double pourcentageTemps;
}
