package guice.sample.module;

import guice.sample.service.DataStoreTransactionLog;
import guice.sample.service.TransactionLog;

import com.google.inject.AbstractModule;

public class BillModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(TransactionLog.class).to(DataStoreTransactionLog.class);
	}
	
}