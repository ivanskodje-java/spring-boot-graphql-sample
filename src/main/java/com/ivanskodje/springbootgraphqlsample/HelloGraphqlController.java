package com.ivanskodje.springbootgraphqlsample;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloGraphqlController {

  @QueryMapping
  public String hello() {
    return "hello";
  }

  @MutationMapping
  public String world(@Argument String name) {
    return "hello, %s".formatted(name);
  }

}
