package sv.edu.udb.service;

import org.junit.jupiter.api.Test;
import sv.edu.udb.repository.AccountRepository;
import sv.edu.udb.repository.implementation.JdbcAccountRepository;
import sv.edu.udb.service.implementation.TransferServiceImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import sv.edu.udb.configuration.TestInfrastructureConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AccountServiceTest {

    @Test
    void findAccountNumber_ReturnsValidAccountNumber() {

        AccountRepository mockAccountRepository = mock(AccountRepository.class);
        when(mockAccountRepository.findAccountNumber(1)).thenReturn("1234567890");
        TransferServiceImpl transferService = new TransferServiceImpl(mockAccountRepository);
        String accountNumber = transferService.findAccountNumber(1);
        assertEquals("1234567890", accountNumber);
    }
}
