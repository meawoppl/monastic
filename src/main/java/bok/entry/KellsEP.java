package bok.entry;

import bok.PureFuncs;
import bok.pagination.Kells;

public class KellsEP {
  public static void main(String[] args) {
    PureFuncs.downloadPages("bok_downloaded", new Kells().pages());
  }
}
