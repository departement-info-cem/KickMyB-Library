package org.kickmyb;

import org.junit.Test;
import org.kickmyb.transfer.AddTaskRequest;

import java.util.Currency;
import java.util.Date;

public class TestCustomGson {

    @Test
    public void testDate(){
        AddTaskRequest atr = new AddTaskRequest();
        atr.deadline = new Date();
        atr.name = "gna gna";
        String s = CustomGson.getIt().toJson(atr);

        AddTaskRequest recov = CustomGson.getIt().fromJson(s, AddTaskRequest.class);
        System.out.println(recov);
    }
}
