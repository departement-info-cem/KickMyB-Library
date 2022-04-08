package org.kickmyb.transfer;

import java.util.Date;

/**
 * Résumé d'une tâche. Prévu pour l'affichage dans une liste d'accueil
 */
public class HomeItemResponse {

    public Long id;
    public String name;
    public int percentageDone;
    public double percentageTimeSpent;
    public Date deadline;
}
