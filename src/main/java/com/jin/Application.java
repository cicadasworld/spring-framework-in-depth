package com.jin;

import com.jin.service.GreetingService;
import com.jin.service.OutputService;
import com.jin.service.TimeService;

public class Application {

    public static void main(String[] args) throws Exception {
        GreetingService greetingService = new GreetingService("Hello");
        TimeService timeService = new TimeService(true);
        OutputService outputService = new OutputService(greetingService, timeService);

        for (int i = 0; i < 5; i++) {
            outputService.generateOutput("Jin");
            Thread.sleep(5000);
        }
    }
}
