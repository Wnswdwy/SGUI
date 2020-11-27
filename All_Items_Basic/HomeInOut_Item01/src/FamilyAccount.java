/**
 * @author yycstart
 * @create 2020-07-26 21:34
 *-----------------家庭收支记账软件-----------------
 *
 *                    1 收支明细
 *                    2 登记收入
 *                    3 登记支出
 *                    4 退    出
 *
 *                    请选择(1-4)：2
 *
 */
public class FamilyAccount {
    public static void main(String[] args) {
        int balance = 10000;
        String details = "收支\t\t账户金额\t\t收支金额\t\t说    明\n";
        boolean isFinal = true;
        while(isFinal) {
            System.out.println("-----------------家庭收支记账软件-----------------\n");
            System.out.println("\t\t\t 1 收支明细");
            System.out.println("\t\t\t 2 登记收入");
            System.out.println("\t\t\t 3 登记支出");
            System.out.println("\t\t\t 4 退出\n\n");
            System.out.print("\t\t\t 请选择(1-4)：");
            char selection = Utility.readMenuSelection();

            switch (selection){

                case '1':
                    System.out.print("-----------------当前收支明细记录-----------------\n");
                    System.out.println(details);
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int InMoney = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String InExplain = Utility.readString();
                    balance += InMoney;
                    details += ("收入\t\t" + balance + "\t\t\t" + InMoney + "\t\t\t\t" + InExplain +"\n");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int OutMoney = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String OutExplain = Utility.readString();
                    balance -= OutMoney;
                    details += ("支出\t" + balance + "\t\t\t" + OutMoney + "\t\t\t\t" + OutExplain +"\n");
                    break;
                case '4':
                    System.out.print("是否确认退出(Y/N):");
                    char isEnd =  Utility.readConfirmSelection();
                    if(isEnd == 'Y' || isEnd == 'y'){
                        isFinal = false;
                    }
                    break;
            }
        }
    }
}
