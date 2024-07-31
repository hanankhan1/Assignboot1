import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. ENTER THE APP ");
            System.out.println("2. EXIT THE APP ");
            System.out.println("3. EXIT THE APP ");
            System.out.println("4. EXIT THE APP ");
            System.out.println("5. EXIT THE APP ");
            System.out.println("6. EXIT THE APP ");
            System.out.println("7. EXIT THE APP ");
            System.out.println("8. EXIT THE APP ");
            System.out.println("9. EXIT THE APP ");
            System.out.println("10. EXIT THE APP ");
            System.out.println("0. EXIT THE APP ");
            int choice1 = input.nextInt();
            input.nextLine();  // Consume

            switch (choice1) {
                case 1: {
                    double basSalary = 105000;
                    double dearAllowance = 0.4 * basSalary;
                    System.out.println("DEARNESS ALLOWANCE -> " + dearAllowance);
                    System.out.println("-------------");
                    double houRentAllow = 0.2 * basSalary;
                    System.out.println("HOUSE RENT ALLOWANCE -> " + houRentAllow);
                    System.out.println("-------------");
                    double groSalary = basSalary + dearAllowance + houRentAllow;
                    System.out.println("Groos Salary-> " + groSalary);
                }
                break;
                case 2: {
                    double distance = 2614;
                    //one km =1000 miles
                    double miles = 2614 * 1000;
                    System.out.println("Distance in miles->" + miles);
                    System.out.println("-----------------");
                    //one km = 3280.84 feet
                    double feet = Math.floor(distance * 3280.84);
                    System.out.println("Distance in feet->" + feet);
                    System.out.println("----------------");
                    //one km=39370.1 inch
                    double inches = Math.floor(distance * 39370.1);
                    System.out.println("Distance in inches->" + inches);
                    System.out.println("----------------");
                    //one km= 100000 cm
                    double centimeter = Math.floor(distance * 100000);
                    System.out.println("Distance in inches->" + centimeter);
                    System.out.println("----------------");

                }
                break;
                case 3: {
                    double s1 = 80;
                    double s2 = 90;
                    double s3 = 75;
                    double s4 = 60;
                    double s5 = 100;
                    double aggMarks = s1 + s2 + s3 + s4 + s5;
                    System.out.println("Aggregate Marks->" + aggMarks);
                    System.out.println("--------------------");
                    double totalSMarks = 5 * 100;
                    double per = (aggMarks / totalSMarks) * 100;
                    System.out.println("Percentage Marks Obtained-> " + per + "%");
                }
                break;
                case 4: {
                    double farn = 108;
                    double cen = (farn - 32) * 5 / 9;
                    System.out.println("temperature in Centigrade degrees -> " + cen);

                }
                break;
                case 5: {
                    int lengthRec = 36;
                    int breadthRec = 36;
                    double radiousCir = 36;
                    int areaRec = Math.multiplyExact(lengthRec, breadthRec);
                    System.out.println("Area of a Rectangle->" + areaRec);
                    System.out.println("-------------------");
                    double periRec = 2 * Math.addExact(lengthRec, breadthRec);
                    System.out.println("Perimeter of Rectangle->" + periRec);
                    System.out.println("----------------------------");
                    double circmCir = 2 * (Math.PI * radiousCir);
                    System.out.println("circumference of the circle->" + circmCir);

                }
                break;
                case 6: {
                    double n1 = 12;
                    double n2 = 8;
                    double p1 = Math.pow(n1, n2);
                    System.out.println("power one arrgument->" + p1);
                    System.out.println("-----------------------");
                    double p2 = Math.pow(n2, n1);
                    System.out.println("power one arrgument->" + p2);
                    System.out.println("-----------------------");

                }
                break;
                case 7: {
                    int digit = 12345;
                    int sum = 0;
                    while (digit > 0) {
                        sum += Math.floorMod(digit, 10);
                        digit = Math.floorDivExact(digit, 10);

                    }
                    System.out.println("Sum of number ->" + sum);

                }
                break;
                case 8: {


                    double totalLitPop = 0.48 * 80000;
                    System.out.println(" total literacy->" + totalLitPop);
                    double totalMen = 0.52 * 80000;
                    System.out.println("----------------------");
                    System.out.println("Total men in town->" + totalMen);
                    double totalWomen = totalMen - 80000;
                    System.out.println("------------------------");
                    System.out.println("Total women in town" + totalWomen);
                    double totalLitMen = 0.35 * 80000;
                    System.out.println("-------------------");
                    System.out.println("Total litrate men->" + totalLitMen);
                    double totalLitWomen = totalLitPop - totalLitMen;
                    System.out.println("-----------------------");
                    System.out.println("Total litarte Women in town->" + totalLitWomen);

                }
                break;
                case 9: {
                    int notet = 0;
                    int notef = 0;
                    int noteh = 0;
                    int cashierInp = 430;
                    noteh = cashierInp / 100;
                    cashierInp %= 100;
                    System.out.println("Hundered rpuee notes->" + noteh);
                    System.out.println("-----------------------");
                    notef = cashierInp / 50;
                    cashierInp %= 50;
                    System.out.println("Fufty rpuee notes->" + notef);
                    System.out.println("-----------------------");
                    notet = cashierInp / 10;
                    cashierInp %= 10;
                    System.out.println("Ten rpuee notes->" + notet);
                    System.out.println("-----------------------");
                    System.out.println("remaing money->" + cashierInp);
                }
                break;
                case 10: {
                    double noOfItems = 15;
                    double totelSelPriceWPro = 11500;
                    System.out.println("total amount->" + totelSelPriceWPro);
                    System.out.println("-------------------------");
                    double profitPrice = 0.2 * totelSelPriceWPro;
                    System.out.println("profit earned amoununt->" + profitPrice);
                    System.out.println("--------------------------");
                    double selAmount = totelSelPriceWPro - profitPrice;
                    System.out.println("selling amount->" + selAmount);
                    System.out.println("---------------------------");
                    double onePiecePrice = selAmount / noOfItems;
                    Math.round(onePiecePrice);
                    System.out.println("cost price of one item->" + onePiecePrice);


                }
                break;


                case 0:
                    System.out.println("EXITING APP...");
                    System.exit(0);
                    break;

                    default:
                        System.out.println("Invalid choice. Please try again.");


            }

        }
    }
}