package org.kickmyb.transfer;

import java.util.Date;
import java.util.List;

public class TaskDetailPhotoResponse {
    public Long id;

    // données
    public String name;
    public Date deadline;

    // Liste de tous les événements de progression pour affichage dans l'ordre chrono inverse
    public List<ProgressEvent> events;

    public Long photoId;

    // valeurs calculées sur le serveur à afficher au détail
    public int percentageDone;
    public int percentageTimeSpent;
}
