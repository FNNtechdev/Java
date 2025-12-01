import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {

    // Task class to store task name and completion status
    static class Task {
        String name;
        boolean isDone;

        Task(String name) {
            this.name = name;
            this.isDone = false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n===== TO-DO LIST MENU =====");
            System.out.println("1. Add a task");
            System.out.println("2. Mark task as complete");
            System.out.println("3. View tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();  // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = input.nextLine();
                    tasks.add(new Task(taskName));
                    System.out.println("Task added!");
                    break;

                case 2:
                    System.out.println("\nWhich task have you completed?");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i).name);
                    }
                    System.out.print("Enter task number: ");
                    int taskNumber = input.nextInt();
                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        tasks.get(taskNumber - 1).isDone = true;
                        System.out.println("✔ Task marked as completed!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;

                case 3:
                    System.out.println("\n===== YOUR TO-DO LIST =====");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks added yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            Task t = tasks.get(i);
                            String status = t.isDone ? "✓" : "✗";
                            System.out.println((i + 1) + ". " + t.name + " [" + status + "]");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid option, try again!");
            }
        }
    }
}
