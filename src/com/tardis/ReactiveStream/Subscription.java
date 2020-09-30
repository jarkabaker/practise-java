package com.tardis.ReactiveStream;

public interface Subscription {
  public void request(long n);
  public void cancel();
}