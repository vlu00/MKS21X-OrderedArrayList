import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    int index = 0;
    for (int i = 0; i < this.size(); i++) {
      if (i+1 == this.size() &&  element.compareTo(this.get(i)) > -1) {
        index = i+1;
      }
      else if (i+1 == this.size() &&  element.compareTo(this.get(i)) < 0) {
        index = i;
      }
      else if (element.compareTo(this.get(i)) > -1 &&  element.compareTo(this.get(i+1)) < 1 ) {
        index = i;
      }
    }
    super.add(index, element);
    return true;
  }

  /*public void add(int index, T element) {
    add(element);
  }

  public T set(int index, T element) {
    add(element);
  }

*/

}
