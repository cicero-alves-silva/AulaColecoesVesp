void main() {
    Queue<String> fila = new ArrayDeque<>();
    String s1 = "Ana";
    String s2 = "Maria";
    String s3 = "José";
    fila.add(s1);
    fila.add(s2);
    fila.add(s3);
    IO.println("Fila inicial: " + fila);

    IO.println("=".repeat(30));
    String recuperado = fila.peek();
    IO.println("Recuperado: " + recuperado);

    IO.println("=".repeat(30));
    String removido = fila.poll();
    IO.println("Removido: " + removido);
    IO.println("Fila após remoção: " + fila);
}