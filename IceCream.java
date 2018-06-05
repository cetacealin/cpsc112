public class IceCream
{
  enum Flavor {vanilla, chocolate, strawberry, fudgeApple, coffee, rockyRoad, mintChocolateChip, coolieDough}

  public static void main(String[] args)
  {
    Flavor cone1, cone2, cone3;

    cone1 = Flavor.rockyRoad;
    cone2 = Flavor.chocolate;

    System.out.println ("cone1 value: " + cone1);
    System.out.println ("cone1 ordinal: " + cone1.ordinal());
    //ordinal(only gives you an integer from 0 up to the number in which the total number in Flavor)(the position)
    System.out.println ("cone1 name: " + cone1.name());

    System.out.println ("cone2 value: " + cone2);
    System.out.println ("cone2 ordinal: " + cone2.ordinal());
    System.out.println ("cone2 name: " + cone2.name()); 

    cone3 = cone1;

    System.out.println ("cone3 value: " + cone3);
    System.out.println ("cone3 ordinal: " + cone3.ordinal());
    System.out.println ("cone3 name: " + cone3.name());
  }
}
