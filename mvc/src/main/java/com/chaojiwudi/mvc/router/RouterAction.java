package com.chaojiwudi.mvc.router;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

interface RouterAction<T> {
    void run(T controller, HttpServletRequest request, HttpServletResponse response);
}
