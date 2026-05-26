public class Libro {
 private String titulo;
 private String autor;
 private int numeroPaginas;
 private final String isbn;
 private static int contadorLibros = 0;
 public Libro() {
 this.titulo = "Desconocido";
 this.autor = "Desconocido";
 this.numeroPaginas = 0;
 this.isbn = "000-0000000000";
 contadorLibros++;
 }
 public Libro(String titulo, String autor, int numeroPaginas, String isbn) {
 this.titulo = titulo;
 this.autor = autor;
 this.numeroPaginas = numeroPaginas;
 this.isbn = isbn;contadorLibros++;
 }
 public String getTitulo() { return titulo; }
 public void setNumeroPaginas(int paginas) { this.numeroPaginas =
paginas; }
 public void mostrarInfo() {
 System.out.println("'" + titulo + "' por " + autor + " (" + numeroPaginas + "páginas). ISBN: " + isbn);
 }
 public static int getTotalLibros() { return contadorLibros; }
}