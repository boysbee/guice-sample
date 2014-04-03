package guice.sample.service.test

import org.scalatest._
import guice.sample.service.{ BillService , DataStoreTransactionLog }
import com.google.inject.Guice;
import com.google.inject.Injector;
import guice.sample.module.BillModule


class BillServiceTest extends FunSpec with BeforeAndAfter {
    var injector : Injector = _
    var billServiceWithGuice : BillService = _
    var billServiceNormal : BillService = _
    
	before {
        injector = Guice.createInjector(new BillModule)
        billServiceNormal = new BillService(new DataStoreTransactionLog )
        billServiceWithGuice = injector.getInstance(classOf[BillService])
	}

	it("should stamp time to data storage") {
        billServiceNormal.stampTransactionLog
	}
	
	it("should stamp time to data storage by use Guice") {
	    billServiceWithGuice.stampTransactionLog
	}
}