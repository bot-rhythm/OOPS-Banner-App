public class OOPSBannerAppUC7 {

    // Inner Static Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create mappings
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[]{

            new CharacterPatternMap('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                    "**** ",
                    "*   *",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    ",
                    "*    "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ****",
                    "*    ",
                    "*    ",
                    " *** ",
                    "    *",
                    "    *",
                    "**** "
            }),

            new CharacterPatternMap(' ', new String[]{
                    "     ",
                    "     ",
                    "     ",
                    "     ",
                    "     ",
                    "     ",
                    "     "
            })
        };
    }

    // Get pattern for character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap m : maps) {
            if (m.getCharacter() == ch) {
                return m.getPattern();
            }
        }
        return new String[]{"", "", "", "", "", "", ""};
    }

    // Print message
    public static void printMessage(String message, CharacterPatternMap[] maps) {
        int height = 7;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {
        CharacterPatternMap[] maps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, maps);
    }
}
