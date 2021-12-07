package com.guardian.hackathon.controller;

import com.guardian.hackathon.service.CallingStatusService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class MainControllerJUnitTest {

    public static final String ACCOUNT_NUMBER = "12345";

    private MainController mainController;

    @Mock
    CallingStatusService mockCallingStatusService;

    @BeforeEach
    public void setup(){
        mainController = new MainController();
        mainController.setCallingStatusService(mockCallingStatusService);
    }

    @Test
    public void shouldCallCallStatusService() throws Exception {
        mainController.checkIfAccountIsCalling(ACCOUNT_NUMBER);

        verify(mockCallingStatusService, times(1)).checkCallStatus(ACCOUNT_NUMBER);
    }


}
