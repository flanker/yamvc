package com.chaojiwudi.mvc.router.resource;

public enum Action {
    Index("/{resource}"),
    Add("/{resource}/new"),
    Create("/{resource}"),
    Show("/{resource}/:id"),
    Edit("/{resource}/:id/edit"),
    Update("/{resource}/:id"),
    Destroy("/{resource}/:id");

    private String template;

    private Action(String template) {
        this.template = template;
    }

    public String path(String name) {
        return this.template.replace("{resource}", name);
    }
}
