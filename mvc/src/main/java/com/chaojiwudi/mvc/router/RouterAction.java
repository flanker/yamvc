package com.chaojiwudi.mvc.router;

public interface RouterAction<T> {
    void run(T controller) throws Exception;
}
