package GestionLivre;


/**
* GestionLivre/Genre.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Mouad/Desktop/System-design-project/GestionLivre/idl/GestionLivre.idl
* samedi 19 avril 2025 12 h 05 WET
*/

public class Genre implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 5;
  private static GestionLivre.Genre[] __array = new GestionLivre.Genre [__size];

  public static final int _ManuelScolaire = 0;
  public static final GestionLivre.Genre ManuelScolaire = new GestionLivre.Genre(_ManuelScolaire);
  public static final int _bd = 1;
  public static final GestionLivre.Genre bd = new GestionLivre.Genre(_bd);
  public static final int _roman = 2;
  public static final GestionLivre.Genre roman = new GestionLivre.Genre(_roman);
  public static final int _periodique = 3;
  public static final GestionLivre.Genre periodique = new GestionLivre.Genre(_periodique);
  public static final int _encyclopedie = 4;
  public static final GestionLivre.Genre encyclopedie = new GestionLivre.Genre(_encyclopedie);

  public int value ()
  {
    return __value;
  }

  public static GestionLivre.Genre from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected Genre (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class Genre
