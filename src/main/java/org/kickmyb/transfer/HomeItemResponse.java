package org.kickmyb.transfer;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by joris on 15-09-15.
 */
public class HomeItemResponse {

    public Long id;
    public String name;
    public List<String> tags = new ArrayList<>();
    public int percentageDone;
    public Date dueDate;
}
