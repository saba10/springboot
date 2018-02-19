package com.capgemini.config;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.core.ApplicationFilterChain;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.mock.web.MockFilterConfig;
import org.springframework.web.client.RestTemplate;
import com.capgemini.login.social.providers.LinkedInProvider;

/**
 * The class <code>ClickStreamWebFilterTest</code> contains tests for the class <code>{@link ClickStreamWebFilter}</code>.
 *
 * @author vamshkri
 * @version $Revision: 1.0 $
 */
public class ClickStreamWebFilterTest {

	@Test
	public void testClickStreamWebFilter_1() throws Exception {
		ClickStreamWebFilter result = new ClickStreamWebFilter();
		assertNotNull(result);
		// add additional test code here
	}

	@Test
	public void testDestroy_1() throws Exception {
		ClickStreamWebFilter fixture = new ClickStreamWebFilter();
		fixture.linkedInProvider1 = new LinkedInProvider();
		fixture.count = 1L;
		fixture.restTemplate = new RestTemplate();

		fixture.destroy();

		// add additional test code here
	}

	@Test
	public void testDoFilter_1() throws Exception {
		ClickStreamWebFilter fixture = new ClickStreamWebFilter();
		fixture.linkedInProvider1 = new LinkedInProvider();
		fixture.count = 1L;
		fixture.restTemplate = new RestTemplate();
		ServletRequest servletRequest = new ServletRequestWrapper(new HttpServletRequestWrapper(new Request()));
		ServletResponse servletResponse = new ServletResponseWrapper(new HttpServletResponseWrapper(new Response()));
		FilterChain filterChain = new ApplicationFilterChain();

		fixture.doFilter(servletRequest, servletResponse, filterChain);

		// add additional test code here
	}

	@Test
	public void testInit_1() throws Exception {
		ClickStreamWebFilter fixture = new ClickStreamWebFilter();
		fixture.linkedInProvider1 = new LinkedInProvider();
		fixture.count = 1L;
		fixture.restTemplate = new RestTemplate();
		FilterConfig filterConfig = new MockFilterConfig();

		fixture.init(filterConfig);

		// add additional test code here
	}

	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}
}