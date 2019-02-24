package com.devlabs.samples.rest;

import java.util.stream.Stream;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("numbers")
@Consumes({"application/json"})
@Produces({"application/json"})
public class Numbers {

  @GET
  public JsonArray randomNumbers() {

    JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
    Stream<String> stream = Stream.generate(System::currentTimeMillis).map(String::valueOf)
        .limit(10);

    stream.forEach(arrayBuilder::add);

    return arrayBuilder.build();

  }


}
