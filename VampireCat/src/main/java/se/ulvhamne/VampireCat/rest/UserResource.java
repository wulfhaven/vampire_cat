package se.ulvhamne.VampireCat.rest;

import se.ulvhamne.VampireCat.data.CatUser;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("user")
public class UserResource {
    @GET
    public CatUser getUser() {
        return new CatUser();
    }
}
