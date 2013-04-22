package com.chaojiwudi.mvc.router.resource;

import com.chaojiwudi.mvc.router.url.HttpMethod;

import java.util.ArrayList;
import java.util.List;

public class Resource<T> {

    private List<Convention<T>> conventions = new ArrayList<>();

    public <T> Resource(String name, Class<T> clazz) {
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
