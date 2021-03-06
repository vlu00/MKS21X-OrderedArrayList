public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    add(0, element);
    return true;
  }

  public void add(int index, T element) {
    int x = 0;
    for (int i = 0; i < this.size(); i++) {
      if (i == 0 && element.compareTo(this.get(i)) < 1) {
        x = 0;
        i = this.size();
      }
      else if (i+1 == this.size() &&  element.compareTo(this.get(i)) > -1) {
        x = i+1;
      }
      else if (i+1 == this.size() &&  element.compareTo(this.get(i)) < 0) {
        x = i;
      }
      else if (element.compareTo(this.get(i)) > -1 &&  element.compareTo(this.get(i+1)) < 1 ) {
        x = i+1;
        i = this.size();
      }
    }
    super.add(x, element);
  }

  public T set(int index, T element) {
    T x = this.get(index);
    super.remove(index);
    add(element);
    return x;
  }
}
