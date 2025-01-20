import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
final String password = ("249");
String userPassword;
int userResponse=1;
int userAttempts=0;
//creates variables that will be used later on in the program
System.out.print("Welcome to program. Please enter the maximum number of books you store can contain: ");
int maxBooks = scan.nextInt();
scan.nextLine();
Book[] inventory = new Book[maxBooks];
//initializes the array according to user recorded response
while (userResponse<5 && userResponse>0 && userAttempts<12) {
    System.out.print("\nWhat do you want to do?\n\t1. Enter new books (password required)\n\t2. Change information of a book (password required)\n\t3. Display all books by a specific author\n\t4. Display all books under a certain price.\n\t5. Quit\nPlease enter your choice > ");
    userResponse = scan.nextInt();
    //records what user wants to do
    scan.nextLine();
    //needed to advance in program
    //
    if (userResponse == 1) {
        System.out.print("Please enter password: ");
        userPassword = scan.nextLine();
        //asks user for password if they selected 1
        for (int i = 0; i < 2; i++) {
            if (userPassword.equals(password)) {
                System.out.print("How many books do you want to enter? ");
                int userBookCount = scan.nextInt();
                //records how many books user wants to enter
                scan.nextLine();
                //needed to advance in program
                if (userBookCount <= maxBooks) //only runs if book count is valid {
                    for (int j = 0; j < userBookCount; j++) {
                        System.out.println("Enter info for book " + (j + 1));
                        System.out.print("Enter title: ");
                        String tit = scan.nextLine();
                        System.out.print("Enter author: ");
                        String aut = scan.nextLine();
                        System.out.print("Enter ISBN: ");
                        long isb = scan.nextLong();
                        System.out.print("Enter price: ");
                        double pri = scan.nextDouble();
                        //records book data
                        scan.nextLine();
                        //needed to advance in program
                        inventory[j] = new Book(tit, aut, isb, pri);
                        //creates book object and adds to the array
                        System.out.println("");
                        //print an empty line

                    }
                    break; //breaks when desired books are entered
                }
                else{
                    System.out.println("Invalid. Must be less than or equal to " + maxBooks); //tells user that their value is invalid
                }
            } //end of book entry
            else {
                userAttempts++; //increments the count of failed attempts
                if (userAttempts>=12){
                    System.out.println("Program detected suspicious activities and will terminate immediately!");
                    break;
                    //breaks when user enters incorrect password 12 times
                }
                else {
                    System.out.print("Wrong password, try again: ");
                    userPassword = scan.nextLine();
                    //gives user chance to try again
                }
            }
        }
    } //end of case 1
    else if (userResponse == 2) {
        System.out.print("Please enter password: ");
        userPassword = scan.nextLine();
        //prompts user for password
        for (int i = 0; i < 2; i++) {
            if (userPassword.equals(password)) {
                System.out.println("Which book do you want to update information for? (enter the associated number in the array index): ");
                int userBookUpdate = scan.nextInt();
                System.out.print("Book" + userBookUpdate + "\n" + inventory[userBookUpdate].toString());
                //prompts user for book number, and prints it
                System.out.print("\nWhich information would you like to change?\n\t1. author\n\t2. title\n\t3. isbn\n\t4. price\n\tQuit\nPlease enter your choice >");
                int userChangeChoice = scan.nextInt();
                //records which information user wants to change
                switch(userChangeChoice){
                    case 1:
                        scan.nextLine();
                        System.out.print("Enter new author: ");
                        String newUserAuthor = scan.nextLine();
                        inventory[userBookUpdate].setAuthor(newUserAuthor);
                        break;
                        //changes the author
                    case 2:
                        scan.nextLine();
                        System.out.print("Enter new title: ");
                        String newUserTitle = scan.nextLine();
                        inventory[userBookUpdate].setTitle(newUserTitle);
                        break;
                        //changes the title
                    case 3:
                        scan.nextLine();
                        System.out.print("Enter new ISBN: ");
                        int newUserISBN = scan.nextInt();
                        inventory[userBookUpdate].setISBN(newUserISBN);
                        break;
                        //changes the ISBN
                    case 4:
                        scan.nextLine();
                        System.out.print("Enter new price: ");
                        double newUserPrice = scan.nextDouble();
                        inventory[userBookUpdate].setPrice(newUserPrice);
                        break;
                        //changes the price
                    case 5:
                        scan.nextLine();
                        break;
                        //exits the switch case
                }
                System.out.println("Updated book data:\n" + inventory[userBookUpdate].toString());
                //prints the updated book data
            } else {
                System.out.print("Wrong password, try again: ");
                userPassword = scan.nextLine();
                //prompts user to try again with entering password
            }


        }
    }
    //end of case 2
    else if (userResponse==3){
      System.out.print("Enter the name of the author: ");
      String userAuthorChoice = scan.nextLine();
      //prompts user for name of author they want to search for
      for (int v = 0; v< inventory.length; v++){
          if (inventory[v].getAuthor().equalsIgnoreCase(userAuthorChoice)){
              System.out.println(inventory[v]);
              //goes through the array and searches for books for an author name that matches
          }
      }
    }//end of case 3

    else if(userResponse==4){
        System.out.print("Enter the price ceiling: ");
        double userPriceCeiling = scan.nextDouble();
        //prompts and records price ceiling
        for (int v = 0; v< inventory.length; v++){
            if (inventory[v].getPrice()<=userPriceCeiling){
                System.out.println(inventory[v]);
                //goes through the array and searches for books that are cheaper than or equal to the price ceiling
            }
        }
    }//end of case 4

    else if (userResponse==5){
        System.out.println("Okay, thank you. Quiting now");
        break;
        //exits the program
    }


} //end of user response loop
    }
}