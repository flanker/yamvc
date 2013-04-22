package com.chaojiwudi.mvc.router.resource;

import com.chaojiwudi.mvc.router.url.HttpMethod;

import java.util.ArrayList;
import java.util.List;

public class Resource<T> {

    private List<Convention<T>> conventions = new ArrayList<>();

    public <T> Resource(String name, Class<T> clazz) {
//        conventions.add(new Convention(HttpMethod.Get, "/" + name));                // GET      /users
//        conventions.add(new Convention(HttpMethod.Get, "/" + name + "/new"));       // GET      /users/new
//        conventions.add(new Convention(HttpMethod.Post, "/" + name));               // POST     /users
//        conventions.add(new Convention(HttpMethod.Get, "/" + name + "/:id"));       // GET      /users/28
//        conventions.add(new Convention(HttpMethod.Get, "/" + name + "/:id/edit"));  // GEt      /users/28/edit
//        conventions.add(new Convention(HttpMethod.Put, "/" + name + "/:id"));       // PUT      /users/28
//        conventions.add(new Convention(HttpMethod.Delete, "/" + name + "/:id"));    // DELETE   /users/28
        conventions.add(new Convention(name, clazz, HttpMethod.Get, Action.Index));
        conventions.add(new Convention(name, clazz, HttpMethod.Get, Action.Add));
        conventions.add(new Convention(name, clazz, HttpMethod.Post, Action.Create));
        conventions.add(new Convention(name, clazz, HttpMethod.Get, Action.Show));
        conventions.add(new Convention(name, clazz, HttpMethod.Get, Action.Edit));
        conventions.add(new Convention(name, clazz, HttpMethod.Put, Action.Update));
        conventions.add(new Convention(name, clazz, HttpMethod.Delete, Action.Destroy));
    }

    public List<Convention<T>> getConventions() {
        return conventions;
    }
}
