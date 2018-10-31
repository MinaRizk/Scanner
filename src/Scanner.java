import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Scanner
{
    static String data ;
    static int location = 0 ;

    public  void execute () throws Exception {
        // create the empty list of tokens
        List<Token_Type> List_of_Tokens = new ArrayList<Token_Type>();

        // read the program from file and remove the newlines

        // over here you need to put the file path to read from

        data = readFileAsString("E:\\4400\\scanner project\\src\\program.txt");
        data = data.replaceAll("\r", "").replaceAll("\n", "");
        //data.replaceAll("\\r\\n", " ");
        //System.out.println(data);

        //start here cutting it to tokens
        while ( location < data.length()) {
            Start(   List_of_Tokens);
        }

        // print the token list to file
        Token_Type.Print_List_Token_Type(List_of_Tokens );
        System.out.println("done ");
    }
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    private  static  void Start(  List<Token_Type> List_of_Tokens    )
    {
        location++;
        return ;
    }
    private  static  void InNum( char id ,  List<Token_Type> List_of_Tokens  )
    {
        return ;
    }
    private  static  void InId( char num , List<Token_Type> List_of_Tokens )

    {
        return ;
    }
    private  static  void InAssign(  char symbol   , List<Token_Type> List_of_Tokens  )
    {
            return ;

    }
    private  static  void SpecialSymbols( char symbol   , List<Token_Type> List_of_Tokens  )
    {
        // Token_Type temp = new Token_Type( "" ,":=" );
        // List_of_Tokens.add(temp);
        return ;
    }

}
