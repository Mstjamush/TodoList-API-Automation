package payloads;

public class FieldPayloads {

    public static String addToDo()
    {
        return "{\n" +
                "        \"id\": 3,\n" +
                "        \"todo\": \"add redit\",\n" +
                "        \"status\": \"inprogress\"\n" +
                "    }";
    }


    public static String deleteTodo()
    {
        return "{\n" +
                "        \"id\": 1\n" +
                "    }";
    }
    public static String editToDo()
    {
        return "{\n" +
                "        \"id\": 2,\n" +
                "        \"todo\": \"Write up for QA assessment\",\n" +
                "        \"status\": \"in progress\"\n" +
                "    }";
    }
    public static String editWrongToDo()
    {
        return "{\n" +
                "        \"id\": 1,\n" +
                "        \"todo\": \"Write up for QA assessment\",\n" +
                "        \"status\": \"in progress\"\n" +
                "    }";
    }
}


