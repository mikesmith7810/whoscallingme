package com.guardian.hackathon.service;

import com.guardian.hackathon.pojo.CallingStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class CallingStatusServiceTest {

    public static final String ACCOUNT_NUMBER = "123";

    private CallingStatusService callingStatusService;

    @BeforeEach
    public void setup(){
        callingStatusService = new CallingStatusService();
    }

    @Test
    public void shouldGiveNoFraudMessageForAccount123() throws Exception {
        CallingStatus callingStatus = callingStatusService.checkCallStatus(ACCOUNT_NUMBER);

        assertThat(callingStatus.isFraud(),equalTo(false));
        assertThat(callingStatus.getNumberCalled(),equalTo("07123456789"));
        assertThat(callingStatus.getStatusMessage(),equalTo("Number Called Successfully"));
    }
}
