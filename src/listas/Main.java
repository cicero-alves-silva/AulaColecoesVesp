void main() {
    String s1 = "Ana";
    String s2 = "Cosme";
    String s3 = "Maria";
    List<String> lista = new LinkedList<>();
    lista.add(s1);
    lista.add(s2);
    lista.add(s3);
    IO.println("Lista inicial: " + lista);

    IO.println("=".repeat(30));
    String s4 = "José";
    lista.add(0, s4);
    IO.println("Lista após add José: " + lista);

    IO.println("=".repeat(30));
    String recuperado = lista.get(3);
    IO.println("Nome recuperado: " + recuperado);

    IO.println("=".repeat(30));
    String removido = lista.remove(2);
    IO.println("Nome removido: " + removido);
    IO.println("Lista após remove: " + lista);
}