package ic.doc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class RecentlyUsedListTest {

  RecentlyUsedList list = new RecentlyUsedList();

  @Test
  public void isListEmpty() {
    assertThat(new RecentlyUsedList().isEmpty(), is(true));
  }

  @Test
  public void addAndRetrieveElementToList() {
    list.add("Hello");

    assertThat(list.size(), is(1));
    assertThat(list.get(0), is("Hello"));
  }

  @Test
  public void mostRecentItemFirst() {
    list.add("Hello");
    list.add("My name is");
    list.add("Kostas");

    assertThat(list.get(0), is("Kostas"));
  }

  @Test
  public void duplicatesInList() {
    list.add("Hello");
    list.add("My name is");
    list.add("Hello");
    list.add("Kostas");

    assertThat(list.size(), is(3));
  }

  @Test
  public void duplicateInBeginningOfList() {
    list.add("Hello World");
    list.add("My name");
    list.add("is Kostas");
    list.add("Hello World");

    assertThat(list.get(0), is("Hello World"));
  }

  @Test
  public void testDifferentObjectsInList() {
    list.add("Hello");
    list.add(1);
    list.add(true);

    assertThat(list.size(), is(3));
    assertThat(list.get(0), is(true));
    assertThat(list.get(1), is(1));
  }

}
