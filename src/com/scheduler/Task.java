package com.scheduler;

import java.util.Calendar;

public class Task implements Runnable {
  private int number;

  public Task(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    System.out.print("Thread:" + number + "->");
    System.out.print("Current Time:" + Calendar.getInstance().get(Calendar.HOUR) + ":");
    System.out.print(Calendar.getInstance().get(Calendar.MINUTE) + ":");
    System.out.println(Calendar.getInstance().get(Calendar.SECOND));
  }

}