import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList() {
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot add null to array");
    }
    else {
      return super.add(element);
    }
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot add null to array");
    }
    else {
      super.add(index, element);
    }
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot set element to null");
    }
    else {
      return super.set(index, element);
    }
  }

}
