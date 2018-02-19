package com.capgemini.login.social.providers;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.linkedin.api.LinkedIn;

/**
 * The class <code>BaseProviderTest</code> contains tests for the class <code>{@link BaseProvider}</code>.
 *
 * @author vamshkri
 * @version $Revision: 1.0 $
 */
public class BaseProviderTest {
	
	@InjectMocks
	BaseProvider baseProvider;
	
	@Mock
	private LinkedIn linkedIn;
	
	@Mock
	private ConnectionRepository connectionRepository;
	
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}
	
	@Test(expected = NullPointerException.class)
	public void testGetConnectionRepository() throws Exception {
		Mockito.when(baseProvider.getConnectionRepository()).thenReturn(connectionRepository);
		baseProvider.getConnectionRepository();
		
	}

	@Test(expected = NullPointerException.class)
	public void testGetLinkedIn() throws Exception {
		Mockito.when(baseProvider.getLinkedIn()).thenReturn(linkedIn);
		baseProvider.getLinkedIn();
	}

	@Test(expected = NullPointerException.class)
	public void testSetConnectionRepository_1() throws Exception {
		baseProvider.setConnectionRepository(connectionRepository);
	}

	@Test(expected = NullPointerException.class)
	public void testSetLinkedIn_1() throws Exception {
		baseProvider.setLinkedIn(linkedIn);
	}

	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}
}