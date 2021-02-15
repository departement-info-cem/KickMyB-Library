package org.kickmyb.transfer;

import java.util.Date;

// décrit un événment existant de mise à jour d'une tâche
public class ProgressEvent {

    public int value;           // nouvelle valeur d'avancement de la tâche
    public Date timestamp;      // date de l'envoi de la nouvelle valeur

}
