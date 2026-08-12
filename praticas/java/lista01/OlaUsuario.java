void main() {
    String nome = IO.readln("Qual o seu nome? ");
    int idade = Integer.parseInt(
        IO.readln("Qual a sua idade? "));
    IO.println("Ola " + nome + "!");
    IO.println("Vcoê nasceu em " + (2026 - idade));
}
