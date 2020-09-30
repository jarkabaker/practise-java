package com.tardis.ReactiveStream;

import java.util.concurrent.Flow.Subscription;

public interface Subscriber<T> {
  public void onSubscribe(Subscription subscription);
  public void onNext(T item);
  public void onError(Throwable throwable);
  public void onComplete();
}