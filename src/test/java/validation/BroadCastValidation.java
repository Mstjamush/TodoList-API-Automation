package validation;

import general.ReusableFunctions;
import org.junit.Assert;
import stepdefs.Hooks;

public class BroadCastValidation {
    public static final String LABEL = "label";
    public static final String KEY = "id";
    public static final String VALUE_TYPE = "status";


    public static void validateAddToDoResponse() {
        Assert.assertEquals(ReusableFunctions.getResponseLength(), 3);
        Assert.assertTrue(ReusableFunctions.checkIfItemExists(3));
    }
    public static void validateDuplicates() {
        Assert.assertTrue(ReusableFunctions.checkForDuplicates(3));
    }
    public static void validateEdit() {
        Assert.assertEquals(ReusableFunctions.checkIfItemStatus(2), "in progress");
    }
    public static void validateEditWrongToDo() {
        ReusableFunctions.thenFunction(Hooks.HTTP_INTERNAL_SERVER_ERROR);
    }
    public static void validateDelete() {
        Assert.assertEquals(ReusableFunctions.getResponseLength(), 3);
        Assert.assertFalse(ReusableFunctions.checkIfItemExists(1));
    }
}





