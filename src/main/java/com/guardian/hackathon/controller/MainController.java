package com.guardian.hackathon.controller;

import com.guardian.hackathon.pojo.CallingStatus;
import com.guardian.hackathon.service.CallingStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {



    @Autowired
    CallingStatusService callingStatusService;

    @GetMapping("/checkIfAccount/{accountNumber}/isCalling")
    @ResponseBody
    public CallingStatus checkIfAccountIsCalling(@PathVariable("accountNumber") String accountNumber){

        System.out.println("Checking status for Account : " + accountNumber);

        CallingStatus callingStatus = getCallingStatusService().checkCallStatus(accountNumber);

        System.out.println("Account Number : " + callingStatus.getAccountNumber());
        System.out.println("Number Called by Bank : " + callingStatus.getNumberCalled());
        System.out.println("Status Message : " + callingStatus.getStatusMessage());

        return callingStatus;
    }

    public CallingStatusService getCallingStatusService() {
        return callingStatusService;
    }

    public void setCallingStatusService(CallingStatusService callingStatusService) {
        this.callingStatusService = callingStatusService;
    }

}
