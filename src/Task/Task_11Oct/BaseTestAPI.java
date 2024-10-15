package Task.Task_11Oct;

public class BaseTestAPI {
    // Encpsulation
    private String name;

    private int id;

    BaseTestAPI()
    {
        System.out.println(" DC of base Class");
    }
    public void performGet()
    {
        System.out.println(" GEt-fetch the data");
    }
    public void performPost()
    {
        System.out.println(" Post-create new   data");
    }
    public void performPatch()
    {
        System.out.println(" Patch-edit the existing  data");
    }  public void performPut()
    {
        System.out.println(" PUT-update the existing  data");
    }
    public void performDelete()
    {
        System.out.println(" DElete-Delete the data");
    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean auth) {
        if (auth == true) {
            this.name=name;
        }
        else {
            System.out.println(" not allowed");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
