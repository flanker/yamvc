package com.chaojiwudi.mvc.router.action;

import com.chaojiwudi.mvc.router.action.actionResult.ActionResult;

public interface RouterAction<T> {
    ActionResult run(T controller) throws Exception;
}
