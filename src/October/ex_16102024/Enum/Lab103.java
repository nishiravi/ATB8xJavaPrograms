package October.ex_16102024.Enum;

public class Lab103 {
    public static void main(String[] args) {
  System.out.println(Colour.RED.getHexCode());

  if(Colour.GREEN.getHexCode()=="#61FF33")
  {
      System.out.println(Colour.GREEN.getHexCode());
  }
    }
}

enum Colour {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");

    private String hexCode;

    private Colour(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return this.hexCode;
    }
}
