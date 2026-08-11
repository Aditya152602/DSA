class VarArgs {

    public static void main(String[] args) {
        System.out.println(concatenate("Aditya"));

        System.out.println(concatenate("Aditya", "Dwivedi"));

        System.out.println(concatenate(" ", " ", " "));
    }
    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}