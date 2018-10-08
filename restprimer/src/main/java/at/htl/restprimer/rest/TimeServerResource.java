package at.htl.restprimer.rest;


import javax.ws.rs.Path;
import javax.ws.rs.GET;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Results in:
// http://localhost:8080/restprimer/rs/time
@Path("time")
public class TimeServerResource {
    @GET
    public String time() {
        return "Time: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
