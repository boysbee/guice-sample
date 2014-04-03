package guice.sample.service.test

import org.scalatest._
import guice.sample.service.{ TransactionLog , DataStoreTransactionLog }

class TransactionLogTest extends FunSpec {

    it("should stamp date time to store") {
        var transactionLog : TransactionLog = new DataStoreTransactionLog
        transactionLog.stamp(new java.util.Date())
    }
}