Java Code for CRUD Operations
// Import necessary Java SQL classes for database operations
import java.sql.*;
import java.util.Scanner; // Import Scanner to take user input

// Main class for the Book Management System
public class MySQLConnection {
  // Database connection details
    private static final String URL =  // Database URL
 private static final String USER = "root"; // MySQL username
 private static final String PASSWORD = "Aish@96786"; // MySQL password
// Main function (Entry point of the program)
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); 
// Scanner object to take user input
// Infinite loop to keep showing menu options until user chooses to exit
        while (true) {
            // Display menu options
            System.out.println("\n Book Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt(); // Read user choice
            scanner.nextLine(); // Consume the newline left after  entering the choice
            // Execute the appropriate function based on user choice
            switch (choice) {
               case 1:
                  addBook(scanner); // Call function to add a book
                    break;
                case 2:
                    showAllBooks(); // Call function to display books
                    break;
                case 3:
                    borrowBook(scanner); // Call function to borrow a book
                    break;
                case 4:
                    returnBook(scanner); // Call function to return a book
                    break;
                case 5:
                    System.out.println("Exiting..."); // Exit the program
                    System.exit(0);
                default:
                System.out.println("Invalid choice! Try again."); // Handle invalid inputs
            }
        }
    }

    //  Function to Add a Book to the Database
    public static void addBook(Scanner scanner) {
        // Ask user for book details
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        System.out.print("Enter Publish Year: ");
        int publishYear = scanner.nextInt();
 // Try to insert book details into the database
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO books (title, author, publish_year) VALUES (?, ?, ?)")) {
            // Set values in the SQL query
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setInt(3, publishYear);
            stmt.executeUpdate(); // Execute the query
	System.out.println("✅ Book Added Successfully!"); // Success message	} catch (SQLException e) {System.out.println("❌ Error: " + e.getMessage()); // Print error if something goes wrong
 }
	 }
    //  Function to Show All Books
    public static void showAllBooks() {
        // Try to fetch all books from the database
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM books")) {
            // Print table header
            System.out.println("\n📖 List of Books:");
            System.out.printf("%-5s %-25s %-20s %-10s %-10s%n", "ID", "Title", "Author", "Year", "Status");
            System.out.println("------------------------------------------------------------");
// Loop through each book record and print details
      		 while (rs.next()) {
                System.out.printf("%-5d %-25s %-20s %-10d %-10s%n",
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("status"));
            }
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage()); // Print error if something goes wrong
        }
    }
    //  Function to Borrow a Book
    public static void borrowBook(Scanner scanner) {
     // Ask user for the book ID to borrow
        System.out.print("Enter Book ID to Borrow: ");
        int bookId = scanner.nextInt();
        // Try to update the book's status to 'Borrowed'
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("UPDATE books SET status = 'Borrowed' WHERE id = ? AND status = 'Available'")) {

        stmt.setInt(1, bookId);
        int rowsAffected = stmt.executeUpdate(); // Execute the update query
            // Check if the book was successfully borrowed
            if (rowsAffected > 0) {
                System.out.println("📘 Book Borrowed Successfully!");
            } else {
                System.out.println("❌ Book Not Available or Invalid ID!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage()); // Print error if something goes wrong
        }
    }

    // 📌 Function to Return a Book
    public static void returnBook(Scanner scanner) {
  // Ask user for the book ID to return
        System.out.print("Enter Book ID to Return: ");
        int bookId = scanner.nextInt();
        
// Try to update the book's status back to 'Available'
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
PreparedStatement stmt = conn.prepareStatement("UPDATE books SET status = 'Available' WHERE id = ? AND status = 'Borrowed'")) {
        stmt.setInt(1, bookId);
        int rowsAffected = stmt.executeUpdate(); // Execute the update query
            // Check if the book was successfully returned
            if (rowsAffected > 0) {
                System.out.println("📗 Book Returned Successfully!");
            } else {
                System.out.println("❌ Book Not Borrowed or Invalid ID!");
            }
        } catch (SQLException e) {
         System.out.println("❌ Error: " + e.getMessage()); // Print error if something goes wrong
        }
    }