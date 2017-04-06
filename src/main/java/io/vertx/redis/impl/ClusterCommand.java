package io.vertx.redis.impl;


import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * Created by caijt on 2017/1/24.
 */
public class ClusterCommand<T> {

    private int slot;
    private Command<T> command;
    private Handler<AsyncResult<T>> resultHandler;

    public ClusterCommand() {}

    public ClusterCommand(int slot, Command<T> command, Handler<AsyncResult<T>> resultHandler) {
        this.slot = slot;
        this.command = command;
        this.resultHandler = resultHandler;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Command<T> getCommand() {
        return command;
    }

    public void setCommand(Command<T> command) {
        this.command = command;
    }

    public Handler<AsyncResult<T>> getResultHandler() {
        return resultHandler;
    }

    public void setResultHandler(Handler<AsyncResult<T>> resultHandler) {
        this.resultHandler = resultHandler;
    }
}
