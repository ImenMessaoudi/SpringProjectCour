package com.example.firstprojectspring2.Scheduled;

import com.example.firstprojectspring2.Services.IContratService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ContratScheduler {

    @Autowired
    IContratService ics;
    @Scheduled(cron = "* 1 * * * *")
    void verifContrats(){
        String msg = ics.retrieveAndUpdateStatusContrat();
        log.warn(msg);
    }


}
