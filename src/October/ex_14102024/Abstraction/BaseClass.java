package October.ex_14102024.Abstraction;

  public class BaseClass extends GrandBaseClass{

     void  openBrower(String browser)
      {

      }
     void  closeBrower(String browser){

     }

      @Override
      void takeScreenShots() {
          System.out.println(" taking screenshot");
      }
  }
