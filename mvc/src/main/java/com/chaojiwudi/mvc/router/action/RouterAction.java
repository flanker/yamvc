package com.chaojiwudi.mvc.router.action;

public interface RouterAction<T> {
    void run(T controller) throws Exception;
}
