package guice.sample.service.test;

import static org.junit.Assert.*;
import guice.sample.module.BillModule;
import guice.sample.service.BillService;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BillModuleTest {
	private Injector injector;
	@Before
	public void setUp(){
		injector = Guice.createInjector(new BillModule());
		
	}
	@Test
	public void billService() {
        BillService billService = injector.getInstance(BillService.class);
        
        billService.stampTransactionLog();
	}

}
