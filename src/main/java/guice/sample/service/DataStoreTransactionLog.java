package guice.sample.service;

public class DataStoreTransactionLog implements TransactionLog {
	public void stamp( java.util.Date stampTime ) {
        System.out.println(stampTime.toString());
	}
}
