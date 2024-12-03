import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше выражение: ");
        String input = in.nextLine();
        String[] splitInput = input.split(" ");
        if (input.contains("/")){
            Double num1 = Double.parseDouble(splitInput[0]);
            Double num2 = Double.parseDouble(splitInput[2]);
            calc<Double> math1 = new calc<Double>(num1,num2);
            System.out.println(math1.getDel());
        }
        else{
            Integer num1 = Integer.parseInt(splitInput[0]);
            Integer num2 = Integer.parseInt(splitInput[2]);
            calc<Integer> math2 = new calc<Integer>(num1,num2);


            switch(input.charAt(input.indexOf(splitInput[1]))){
                case '+':
                    System.out.println(math2.getPlus());
                    break;
                case '-':
                    System.out.println(math2.getMinus());
                    break;
                case '*':
                    System.out.println(math2.getUmn());
                    break;
                default:
                    System.out.println("Ошибка: Некорректное действие!");
                    return;
            }
        }
    }
}
class calc <O extends Number>{
    private O temp1;
    private O temp2;

    calc(O temp1, O temp2){
        this.temp1 = temp1;
        this.temp2 = temp2;
    }

    public int getPlus(){return (int)temp1 + (int) temp2;}
    public int getMinus(){return (int)temp1 - (int) temp2;}
    public int getUmn(){return (int)temp1 * (int) temp2;}
    public double getDel(){return (double)temp1 / (double) temp2;}
}
