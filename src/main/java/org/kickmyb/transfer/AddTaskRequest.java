package org.kickmyb.transfer;

import java.util.Date;

// Ajoute une nouvelle tâche pour l'utilisateur courant
public class AddTaskRequest {

    // Le nom, non vide doit être unique
    public String name;
    // La date limite pour la tâche
    public Date deadline;
}
