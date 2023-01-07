package Ejercicio_llave1;

    public class PartidoFutbolLigaEspanola implements PartidoDeFutbol{

        private String EquipoLocal;
        private String EquipoVisitante;
        private int GolesEquipoLocal;
        private int GolesEquipoVisitante;

    public String getEquipoLocal() {
        return EquipoLocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public int getGolesEquipoLocal() {
        return GolesEquipoLocal;
    }

    public int getGolesEquipoVisitante() {
        return GolesEquipoVisitante;
    }

        @Override
    public void setEquipoLocal(String EquipoLocal) {
        this.EquipoLocal = EquipoLocal;
    }

        @Override
    public void setEquipoVisitante(String EquipoVisitante) {
        this.EquipoVisitante = EquipoVisitante;
    }

        @Override
    public void setGolesEquipoLocal(int GolesEquipoLocal) {
        this.GolesEquipoLocal = GolesEquipoLocal;
    }

        @Override
    public void setGolesEquipoVisitante(int GolesEquipoVisitante) {
        this.GolesEquipoVisitante = GolesEquipoVisitante;
    }

    public String ImprimirMarcador(){
        return "( "+" Goles del Equipo Local: "+GolesEquipoLocal+" Goles del Equipo Visitante: "+GolesEquipoVisitante+" )";
    }
}
