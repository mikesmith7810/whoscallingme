package com.guardian.hackathon.service;

import com.guardian.hackathon.pojo.CallingStatus;
import org.springframework.stereotype.Service;

@Service
public class CallingStatusService {

    public CallingStatus checkCallStatus(String accountNumber) {

        CallingStatus callingStatus = new CallingStatus();
        callingStatus.setAccountNumber(accountNumber);

        switch (accountNumber) {
            case "123":
                callingStatus.setFraud(false);
                callingStatus.setNumberCalled("07123456789");
                callingStatus.setStatusMessage("Number Called Successfully");
                break;
            case "456":
                callingStatus.setFraud(true);
                callingStatus.setNumberCalled("07888899933");
                callingStatus.setStatusMessage("Number Called Successfully");
                break;
            case "789":
                callingStatus.setFraud(true);
                callingStatus.setNumberCalled("07123456789");
                callingStatus.setStatusMessage("Number not called");
                break;
            default:
                callingStatus.setFraud(true);
                callingStatus.setNumberCalled("07123456789");
                callingStatus.setStatusMessage("Account does not exist");
                break;
        }

        return callingStatus;
    }


}
