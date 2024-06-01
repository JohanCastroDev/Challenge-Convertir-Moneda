import java.time.LocalDateTime;

public class Conversion {
    private String monedaBase;
    private String monedaObjetivo;
    private Double cantidadACambiar;
    private Double cantidadEnMonedaObjetivo;

    public Conversion(String monedaBase, String monedaObjetivo, double cantidadACambiar, double cantidadEnMonedaObjetivo) {
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.cantidadACambiar = cantidadACambiar;
        this.cantidadEnMonedaObjetivo = cantidadEnMonedaObjetivo;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public void setMonedaObjetivo(String monedaObjetivo) {
        this.monedaObjetivo = monedaObjetivo;
    }

    public Double getCantidadACambiar() {
        return cantidadACambiar;
    }

    public void setCantidadACambiar(Double cantidadACambiar) {
        this.cantidadACambiar = cantidadACambiar;
    }

    public Double getCantidadEnMonedaObjetivo() {
        return cantidadEnMonedaObjetivo;
    }

    public void setCantidadEnMonedaObjetivo(Double cantidadEnMonedaObjetivo) {
        this.cantidadEnMonedaObjetivo = cantidadEnMonedaObjetivo;
    }

}
