public class Overload1 {

  public static void out(String str)  {
    System.out.println(str);
  }
  public static void out(int i) {
    System.out.println(i);
  }
  public static void out(boolean b)  {
    System.out.println(b);
  }
  public static void out(Integer ii)  {
    out(ii.equals("17"));
    System.out.println(ii);
  }

  public static void main(String[] args) {
//    System.out.println("Hej");

    out("Hejjj");
    out(2);
    Integer i1 = Integer.valueOf(17);
    i1++;
    out(i1);

    Integer iii = 1;
    int n = 1;
    while (n<1000)  {
      try {
        iii = iii * 1000;
        int y = iii / 0;
      } catch (Exception e) {
        out("Fejl e=" + e.getMessage());
      }
      out(iii);
      n++;

    }

    out('a');


    for (int i = 97; i < 122; i++)
    out((char)i + " har ascii " + i);

//    String jord = ;الأرض
//        out(ا);
  }
}
