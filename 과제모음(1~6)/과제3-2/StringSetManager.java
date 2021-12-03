import java.util.*;

enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID};
public class StringSetManager {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        //String[] stringSet = new String[100];
        ArrayList<String> stringSet = new ArrayList<>();
        while(true){
            final StringCommand command = getCommand(scanner);
            if(command == StringCommand.QUIT){
                System.out.println("BYE!"); break;
            }
            switch (command){
                case ADD:
                    final String str = getString(scanner);
                    add(stringSet, str);
                    break;
                case REMOVE:
                    final String str2 = getString(scanner);
                    remove(stringSet, str2);
                    break;
                case CLEAN:
                    clear(stringSet);
                    break;
                default:
                    System.out.println("Unknown Command!");
            }
            print(stringSet);
        }
    }
    private static StringCommand getCommand(Scanner scanner){
        final String command = scanner.next();
        StringCommand cmd;
        try{
            cmd = StringCommand.valueOf(command.toUpperCase());
        }
        catch (IllegalArgumentException e){cmd = StringCommand.INVALID;}
        return cmd;
    }
    private static String getString(Scanner scanner){
        String inputStr = scanner.next();
        return inputStr;
    }
    private static void add(ArrayList<String> stringSet, String str){
        if(stringSet.contains(str) == false){
            stringSet.add(str);
        }}
    private static void print(ArrayList<String> stringSet){
        System.out.printf("Element Size: %d, Values = [", stringSet.size());
        int cnt = 1;
        for(String ele : stringSet){
            if(cnt == stringSet.size()){
                System.out.print(ele);
            }
            else{
                System.out.printf("%s,\t", ele);
            }
            cnt++;
        }
        System.out.println("]");
    }
    private static void clear(ArrayList<String> stringSet){
        stringSet.clear();
    }
    private static void remove(ArrayList<String> stringSet, String str2){
        stringSet.remove(str2);
    }
}
