void main(String[] args) {
        String name = "Jorge";

        IO.println("name.length() = " + name.length());
        IO.println("name.toUpperCase() = " + name.toUpperCase());
        IO.println("name.toLowerCase() = " + name.toLowerCase());
        IO.println("name.equals(\"Jorge\") = " + name.equals("Jorge"));
        IO.println("name.equalsIgnoreCase(\"Jorge\") = " + name.equalsIgnoreCase("Jorge"));
        IO.println("name.compareTo(\"Kiara\") = " + name.compareTo("Kiara"));
        IO.println("name.compareToIgnoreCase(\"Kiara\") = " + name.compareToIgnoreCase("Kiara"));
        IO.println("name.charAt(0) = " + name.charAt(0));
        IO.println("name.charAt(1) = " + name.charAt(1));
        IO.println("name.charAt(2) = " + name.charAt(2));
        IO.println("name.charAt(name.length() - 1) = " + name.charAt(name.length() - 1)); // último carácter
        IO.println("name.charAt(name.length() - 2) = " + name.charAt(name.length() - 2)); // penúltimo carácter
        IO.println("name.substring(1) = " + name.substring(1));
        IO.println("name.substring(1, name.length() - 1) = " + name.substring(1, name.length() - 1));

        String trabalenguas = "trabalenguas";

        IO.println("trabalenguas.replace(\"a\", \"pene\") = " + trabalenguas.replace("a", "pene"));
        IO.println("trabalenguas.replaceAll(\"a\", \"pene\") = " + trabalenguas.replaceAll("a", "pene"));
        IO.println("trabalenguas.replaceFirst(\"a\", \"pene\") = " + trabalenguas.replaceFirst("a", "pene"));
        IO.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        IO.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        IO.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.startsWith(\"a\") = " + trabalenguas.startsWith("a"));
        System.out.println("trabalenguas.startsWith(\"a\") = " + trabalenguas.endsWith("a"));
        System.out.println("trabalenguas.trim() = " + trabalenguas.trim());

}
