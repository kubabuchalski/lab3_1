package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;



public class issuanceBookKeeperTest 
{
	BookKeeper bk;
	InvoiceFactory invoiceFactory;
	@Before
	/**
	 * Create mock object before you use them
	 */
	public void create()
	{
		invoiceFactory = mock(InvoiceFactory.class); //Create mock Object
		//when(mathObj.add(1, 2)).thenReturn(4); // Configure it to return 3 when arguments passed are 1,2
		bk = new BookKeeper(invoiceFactory);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
		
	}

}
