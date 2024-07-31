import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import model.*;
import java.util.*;

@Path("/suppliers")
public class SupplierController {
	@GET
	@Path("/sample")
	public Response saveExample() {
		SupplierDAO dao = new SupplierDAO();
		boolean f = dao.saveExample();
		if (f)
			return Response.ok().build();
		else
			return Response.status(Status.NO_CONTENT).build();
	}
}
