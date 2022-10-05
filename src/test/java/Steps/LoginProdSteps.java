package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;
import java.util.Map;

public class LoginProdSteps {
    @And("user {string} successfully logged in")
    public void user_successfully_logged_in(String string) {
        System.out.println("@And(\"user {string} successfully logged in\")");

    }
    @And("user validates captcha image")
    public void userValidatesCaptchaImage() {
        System.out.println("@And(\"user validates captcha image\")");
    }

    @And("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
//        List
//        List<List<String>> data = dataTable.asLists();
//        System.out.printf("Name 1:" + data.get(0).get(0) + " " + data.get(0).get(1) + "\n");
//        System.out.printf("Name 2:" + data.get(1).get(0) + " " + data.get(1).get(1) + "\n");
//        MAP
//        List<Map<String, String>> map = dataTable.asMaps();
//        System.out.println(map.get(0).get("Fname") + "---Lastname is " + map.get(0).get("Lname"));
//        System.out.println(map.get(1).get("Fname") + "---Lastname is " + map.get(1).get("Lname"));
        for(Map<String,String> data: dataTable.asMaps(String.class, String.class)){
            System.out.printf("First name is: "+data.get("Fname")+"  Second name is "+data.get("Lname")+"\n");
        }
    }

    @And("user selects age")
    public void userSelectsAge(DataTable table) {
        List<Map<String,String>> data=table.asMaps(String.class, String.class);
        System.out.println("\n selcted category : "+data.get(0).get("category")+"\n selected country : "+data.get(0).get("country"));
        System.out.println("\n selcted category : "+data.get(1).get("category")+"\n selected country : "+data.get(1).get("country"));
    }
}