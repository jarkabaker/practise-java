package com.tardis.ReactiveStream;

public interface Publisher<T> {
  public void subscribe(Subscriber<? super T> subscriber);
}