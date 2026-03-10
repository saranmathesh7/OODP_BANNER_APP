import java.util.HashMap;

/**
 * OOPSBannerApp – Use Map for Character Patterns and Render via Function
 * This version enhances modularity and performance using the Collections Framework.
 */
public class OOPSBannerApp8 {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     * @return a HashMap where keys are characters and values are String arrays.
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            "  *** ", " ** ** ", "** **", "** **", "** **", " ** ** ", "  *** "
        });
        charMap.put('P', new String[] {
            " ***** ", " ** **", " ** **", " ***** ", " ** ", " ** ", " ** "
        });
        charMap.put('S', new String[] {
            "  **** ", " ** ", "  *** ", "    ** ", " **** ", "       ", "       "
        });
        // Space character pattern
        charMap.put(' ', new String[] {
            "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     * Renders the input message horizontally line by line.
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Assume all patterns have the same height; using 'O' as the reference
        int patternHeight = charMap.get('O').length;

        // Loop through each line of the pattern height
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            for (char ch : message.toUpperCase().toCharArray()) {
                // Get pattern for character, default to space if not found
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append("  "); // Spacing between characters
            }
            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point of the application.
     */
    public static void main(String[] args) {
        // 1. Initialize the character map
        HashMap<Character, String[]> charMap = createCharacterMap();

        // 2. Define the message
        String message = "OOPS";

        // 3. Print the banner
        displayBanner(message, charMap);
    }
}