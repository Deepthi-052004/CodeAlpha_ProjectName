import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodeAlpha_ProjectName3 {

    private static final Map<String, String> knowledgeBase = new HashMap<>();

    // Initialize rules
    static {
        knowledgeBase.put("hi", "Hello! How can I assist you today?");
        knowledgeBase.put("hello", "Hi there! How may I help you?");
        knowledgeBase.put("how are you", "I'm just a bot, but I'm functioning as expected!");
        knowledgeBase.put("what is your name", "I am your virtual assistant chatbot.");
        knowledgeBase.put("bye", "Goodbye! Have a great day!");
        knowledgeBase.put("help", "You can ask me questions like 'What is your name?', 'How are you?', or say 'bye' to exit.");
        knowledgeBase.put("what is java", "Java is a high-level, object-oriented programming language.");
        knowledgeBase.put("who created java", "Java was developed by James Gosling at Sun Microsystems.");
    }

    // Process input using rule-based logic
    private static String getResponse(String input) {
        input = input.toLowerCase().trim();
        for (String key : knowledgeBase.keySet()) {
            if (input.contains(key)) {
                return knowledgeBase.get(key);
            }
        }
        return "I'm sorry, I don't understand that. Please ask something else.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🤖 Welcome to AI Chatbot! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            String response = getResponse(userInput);
            System.out.println("Bot: " + response);

            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }

        scanner.close();
    }
}
