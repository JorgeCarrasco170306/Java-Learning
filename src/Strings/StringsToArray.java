void main() {
    String trabalenguas = "trabalenguas";

    char[] caracteres = trabalenguas.toCharArray();
    String[] separadoPorA = trabalenguas.split("a");

    for (char character : caracteres) {
        IO.print(character);
    }

    IO.println();

    for (String word : separadoPorA) {
        IO.print(word);
    }
}