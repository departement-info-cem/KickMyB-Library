package org.kickmyb.transfer;

public class UpdateProgressRequest {

    // La tâche dont on veut mettre à jour l'avancement
    public Long taskID;

    // La nouvelle valeur en pourcent
    public int newValue;
}
