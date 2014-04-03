package guice.sample.service;

import javax.inject.Inject;

public class BillService {
	
    private  final TransactionLog transactionLog;
    @Inject
    public BillService ( TransactionLog transactionLog ) {
        this.transactionLog = transactionLog;
    }

    public void stampTransactionLog() {
    	java.util.Date stampTime = new java.util.Date();
    	this.transactionLog.stamp(stampTime);
    }
}