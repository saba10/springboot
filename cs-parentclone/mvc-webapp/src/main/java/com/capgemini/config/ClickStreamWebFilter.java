package com.capgemini.config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.capgemini.constant.URLConstants;
import com.capgemini.login.social.providers.LinkedInProvider;

/**
 * @author dimehta
 *
 */
@WebFilter(urlPatterns = "/*")
public class ClickStreamWebFilter implements Filter {

	  private static final Logger logger = LoggerFactory.getLogger(ClickStreamWebFilter.class);
	  @Autowired
	  LinkedInProvider linkedInProvider1;
	  long count=0;
	  /*@Autowired
		RestTemplate restTemplate;
	*/
		RestTemplate restTemplate=new RestTemplate();
	  
	  @Override
	    public void init(FilterConfig filterConfig) throws ServletException {

	    }

	    @Override
	    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
	    	/* logger.info("filter:"+ ((HttpServletRequest)servletRequest).getRequestURL());
	        HttpServletRequest ServletRequest= (HttpServletRequest)servletRequest;
	        filterChain.doFilter(servletRequest, servletResponse);
	        count++;
	       if(ServletRequest.getRequestURI().contains("/connect/linkedin") ||ServletRequest.getRequestURI().contains("/adminlogin")||count>=1) {
	    	   UserBean userBean = new UserBean();
	    	   String name= linkedInProvider1.populateUserDetailsFromLinkedIn(userBean).getFirstName();
	    	   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+name);
	    	   String url= ServletRequest.getRequestURI();
		        Map<String, String> params = new HashMap<String, String>();
				params.put("userId", name);
				params.put("userUrl", url);
				restTemplate.postForObject(URLConstants.PUT_STREAM, String.class, String.class, params);
				count=0;
				
	       }*/
	       
	    }

	    @Override
	    public void destroy() {

	    }

}
