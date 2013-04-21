package com.chaojiwudi.mvc.router;

interface RouterAction<T> {
    void run(T controller);
}
