package iptv.cbor.rest;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.fasterxml.jackson.jaxrs.cbor.CBORMediaTypes;

/**
 * 
 * @author bhawani.singh
 *
 */
@Path("cbor")
public class CborREST {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger(CborREST.class.getName());

	@GET
	@Path("hi")
	//@Produces({"application/json"})	
	@Produces({CBORMediaTypes.APPLICATION_JACKSON_CBOR})
	public User hi() {
		LOGGER.info("CborREST.hi()");
		//@JsonIgnoreProperties(ignoreUnknown = true)
		User user = new User();
		user.setName("Bhawani");
		//user.setAge("38");
		user.setSalary(2983748);
		return user;
	}

}