package com.tardis.ReactiveStream;

public interface Processor<T,R> extends Subscriber<T>, Publisher<R> {
}
