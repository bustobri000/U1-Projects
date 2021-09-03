import javax.swing.JOptionPane;
public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
    public static void main(String[] args) {

        double price;
        double discount;
        int quantity;
        double tax;
        double total;

        price = Double.parseDouble(JOptionPane.showInputDialog("Enter all values without any symbols such as '$' or '%' \n What is the price of the item you are buying?"));
        discount = Double.parseDouble(JOptionPane.showInputDialog("What is the discount?"));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("How many objects are you purchasing?"));
        tax = Double.parseDouble(JOptionPane.showInputDialog("What is the sales tax?"));
        double subTotal = (quantity * price);
        double discountTotal  = subTotal * (1 - (discount/100));
        double taxTotal = discountTotal * (tax/100.00);
        total = discountTotal + taxTotal;

        JOptionPane.showMessageDialog(null, "Subtotal: " + Math.round((discountTotal)*100.0)/100.0 + "\nTaxes: " + Math.round(taxTotal*100.0)/100.0 + "\nTotal cost: " + Math.round(total*100.0)/100.0);
        System.exit(0);
    }
}

