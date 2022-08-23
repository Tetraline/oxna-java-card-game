package org.example;

import java.io.*;
import java.util.concurrent.Callable;

// Modified code from
// https://www.javaspecialists.eu/archive/Issue153-Timeout-on-Console-Input.html
public class ConsoleInputReadTask implements Callable<String> {
  @Override
  public String call() throws IOException{
    BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
    String input;
      try {
        while (!br.ready()) {
          Thread.sleep(200);
        }
        input = br.readLine();
      } catch (InterruptedException e) {
        return null;
      }
    return input;
  }
}