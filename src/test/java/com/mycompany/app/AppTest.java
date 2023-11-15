package com.mycompany.app;

import org.hibernate.service.ServiceRegistry;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testRegistryMock()
    {
        ServiceRegistry serviceRegistry = Mockito.mock(ServiceRegistry.class);
        Mockito.verifyNoInteractions(serviceRegistry);
    }
}
