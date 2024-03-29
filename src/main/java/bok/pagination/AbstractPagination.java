package bok.pagination;

import bok.geometry.Page;
import java.util.List;

public abstract class AbstractPagination {
  public String getBookName() {
    return "BookOf" + this.getClass().getSimpleName();
  }

  public abstract String getUrlBase();

  public abstract List<Page> pages();

  protected String templateForIdentifier(String identifier) {
    // TODO(meawoppl) dirty
    return getUrlBase().replace("%s", identifier);
  }
}
