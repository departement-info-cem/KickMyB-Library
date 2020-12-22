package org.kickmyb.transfer;

import java.util.Date;

public class Event {

    public enum Type {Nap30m, Nap1h, Poop, Pee, Drink, Eat}

    public Type type;
    public Date timestamp;

}
