package org.kickmyb.transfer;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Résumé d'une tâche. Prévu pour l'affichage dans une liste d'accueil
 */
public class HomeItemResponse {

    public Long id;
    public String name;
    public int percentageDone;
    public int percentageTimeSpent;
    public Date deadline;
}
