import javax.swing.JOptionPane;

class Cancion {
    private int idCancion;
    private String titulo;
    private String autor;
    private double duracion;
    private int anoCreacion;

    public Cancion(int idCancion, String titulo, String autor, double duracion, int anoCreacion) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anoCreacion = anoCreacion;
    }

    // Getters y seters (metodos de acceso)
    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }
    
    // Metodo para mostrar informacion de la cancion
    public String toString() {
        return "ID: " + idCancion + ", Título: " + titulo + ", Autor: " + autor + ", Duración: " + duracion + ", Año: " + anoCreacion;
    }
}

public class PracticaColegiada2 {
    public static void main(String[] args) {
        // Creación de objetos Cancion
        Cancion[] top10 = new Cancion[10];
        
        // Aqui se agregarían las canciones al top 10
        
        // Ejemplo de uso de JOptionPane para mostrar información de una canción
        JOptionPane.showMessageDialog(null, top10[0].toString());
        
        // Ejemplo de llamada a metodos para obtener informacion especifica
        // ... (llamadas a metodos para obtener canciones de distintos años, duración, etc.)
    }
}
