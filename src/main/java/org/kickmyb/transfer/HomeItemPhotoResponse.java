package org.kickmyb.transfer;

import java.util.Date;

/**
 * Résumé d'une tâche. Prévu pour l'affichage dans une liste d'accueil utilisant une photo
 */
public class HomeItemPhotoResponse {

    public Long id;
    public String name;
    public int percentageDone;
    public int percentageTimeSpent;
    public Date deadline;
    public Long photoId;

}