import java.util.ArrayList;
public class MyDriver{
  public static void main(String[] args) {
  OrderedArrayList<Integer> list = new OrderedArrayList<>();
  list.add(2);
  list.add(1);
  list.add(3);
  list.add(5);
  System.out.println(list);

  OrderedArrayList<Integer> A = new OrderedArrayList<>();
  A.add(1,2);
  A.add(1,1);
  A.add(1,3);
  A.add(1,5);
  System.out.println(A);
}
}
