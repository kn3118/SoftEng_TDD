package ic.doc;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {

  private List<Object> list;

  public RecentlyUsedList() {
    list = new ArrayList<>();
  }

  public boolean isEmpty() {
    if (list.isEmpty()) {
      return true;
    }
    return false;
  }

  public void add(Object o) {
    list.remove(o);
    list.add(0, o);
  }

  public Object get(int index) { return list.get(index); }

  public int size() { return list.size(); }
}
