import java.util.*;

public class ArrayEnum {
    enum Command{ADD, LIST, SUM, MAX, MIN, QUIT, INVALID};
    private static Command getCommand(Scanner scanner){
        final String command = scanner.next();
        Command cmd;
        try{
            cmd = Command.valueOf(command.toUpperCase());
        }
        catch (IllegalArgumentException e) {cmd = Command.INVALID;}
        return cmd;
    }
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        int index = 0;
        ArrayList<Integer> values = new ArrayList<>();
        while(true){
            final Command command = getCommand(scanner);
            if(command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch (command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values.add(newValue);
//                    values[index] = newValue;
//                    index++;
                    break;
                case LIST:
                    for(int ele : values)
                        System.out.printf("%d ", ele);
                    System.out.print("\n");
                    break;
                case SUM:
                    int sum = 0;
                    for(int ele : values)
                        sum += ele;
                    System.out.println(sum);
                    break;
                case MAX:
                    Collections.sort(values);
                    int maxNum = values.get(values.size()-1);
                    System.out.println(maxNum);
                    break;
                case MIN:
                    Collections.sort(values);
                    int minNum = values.get(0);
                    System.out.println(minNum);
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
//                default:
//                    System.out.println("Invalid Command");
            }
        }
        scanner.close();
    }

    private static int getValue(Scanner scanner){
        int ele = scanner.nextInt();
        return ele;
    }
}
